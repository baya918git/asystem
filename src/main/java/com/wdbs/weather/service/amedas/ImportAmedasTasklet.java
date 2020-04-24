package com.wdbs.weather.service.amedas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import com.wdbs.weather.model.amedas.AmedasData;
import com.wdbs.weather.model.amedas.AmedasHeader;

/**
 * アメダスデータ取込タスクレット。
 */
public class ImportAmedasTasklet implements Tasklet {
	private String DATE_FORMAT = "yyyy/MM/dd hh";

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
			throws Exception {
		importAmedas();

		System.out.println(chunkContext.getStepContext().getJobParameters().get("time"));
		System.out.println("ImportAmedasTasklet");
		return RepeatStatus.FINISHED;
	}

	private void importAmedas() throws ParseException {
		String filePath = "/Users/aya/Documents/拡張アメダス/Osaka/JPN_56503333_OSAKA_EA_W0065.epw";
		File file = new File(filePath);

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			String line;
			int iRow = 0;
			AmedasHeader amedasHeader = new AmedasHeader();
			while ((line = reader.readLine()) != null) {
				iRow++;
				switch (iRow) {
				case 1:
					readHeader1(line, amedasHeader);
					break;
				case 2:
					//                    readHeader2(line,amedasHeader);
					//                  ・・・・
					//                  default:
					//                    readData(line,amedasHeader);
					break;
				case 3:
					//					readHeader3(line, amedasHeader);
					break;
				case 4:
					//					readHeader3(line, amedasHeader);
					break;
				case 5:
					//					readHeader3(line, amedasHeader);
					break;
				case 6:
					//					readHeader3(line, amedasHeader);
					break;
				case 7:
					//					readHeader3(line, amedasHeader);
					break;
				case 8:
					//					readHeader3(line, amedasHeader);
					break;
				default:
					readData(line, amedasHeader);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readHeader1(String line, AmedasHeader amedasHeader) {
		List<String> columns = Arrays.asList(line.split(","));
		amedasHeader.setCity(columns.get(1));
		amedasHeader.setPrefecture(columns.get(2));
		amedasHeader.setCountry(columns.get(3));
		//		System.out.println(columns.get(0));
		//		System.out.println(columns.get(1));
	}

	private void readData(String line, AmedasHeader amedasHeader) throws ParseException {
		List<String> columns = Arrays.asList(line.split(","));
		AmedasData amedasData = new AmedasData();
		//		String型をDateに変更する
		//		System.out.println(columns.get(0) + "/" + columns.get(1) + "/" + columns.get(2) + " " + columns.get(3) + ":"
		//				+ columns.get(4));
		Date dateTime = new SimpleDateFormat(DATE_FORMAT)
				.parse(columns.get(0) + "/" + columns.get(1) + "/" + columns.get(2) + " " + columns.get(3) + ":");
		//		Java.util.DateをJava.sql.Date型に変更するためにCalendarクラスに載せ変えて変更
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateTime);
		amedasData.setDateTime(new java.sql.Date(calendar.getTimeInMillis()));
		System.out.println(amedasData.getDateTime());
		amedasHeader.getAmedasDatas().add(amedasData);

	}
}
