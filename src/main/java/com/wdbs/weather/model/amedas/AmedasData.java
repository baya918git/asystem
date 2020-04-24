package com.wdbs.weather.model.amedas;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 拡張アメダスデータクラス。
 */
@Entity
@Data
public class AmedasData {

	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "amedas_data_id_seq")
	@SequenceGenerator(name = "amedas_data_id_seq", sequenceName = "amedas_data_id_seq", allocationSize = 1)
	private Long id;

	/** 年月日時分 */
	@NotNull
	@Column(nullable = false)
	private Date dateTime;

	/** 外気温度 */
	@NotNull
	@Column(nullable = false)
	private double dryBulbTemperature;

	/** 露点温度 */
	@NotNull
	@Column(nullable = false)
	private double dewPointTemperature;

	/** 相対湿度 */
	@NotNull
	@Column(nullable = false)
	private int relativeHumidity;

	/** 大気圧 */
	@NotNull
	@Column(nullable = false)
	private int atmosphericStationPressure;

	/** 大気圏外水平日射量 */
	@NotNull
	@Column(nullable = false)
	private int extraterrestrialHorizontalRadiation;

	/** 大気圏外法線直達日射量 */
	@NotNull
	@Column(nullable = false)
	private int extraterrestrialDirectNormalRadiation;

	/** 大気放射量 */
	@NotNull
	@Column(nullable = false)
	private int horizontalInfraredRadiationFromSky;

	/** 全天日射量 */
	@NotNull
	@Column(nullable = false)
	private int globalHorizontalRadiation;

	/** 法線面直達日射量 */
	@NotNull
	@Column(nullable = false)
	private int directNormalRadiation;

	/** 水平面天空日射量 */
	@NotNull
	@Column(nullable = false)
	private int diffuseHorizontalRadiation;

	/** グローバル照度 */
	@NotNull
	@Column(nullable = false)
	private int globalHorizontalIlluminance;

	/** 法線面直射照度 */
	@NotNull
	@Column(nullable = false)
	private int directNormalIlluminance;

	/** 天空照度 */
	@NotNull
	@Column(nullable = false)
	private int diffuseHorizontalIlliminance;

	/** 天頂輝度 */
	@NotNull
	@Column(nullable = false)
	private int zenithLuminance;

	/** 風向 */
	@NotNull
	@Column(nullable = false)
	private int windDirection;

	/** 風速 */
	@NotNull
	@Column(nullable = false)
	private int windSpeed;

	/** 雲量 */
	@NotNull
	@Column(nullable = false)
	private int totalSkyCover;

	/** 不透明雲量 */
	@NotNull
	@Column(nullable = false)
	private int opaqueSkyCover;

	/** 視程 */
	@NotNull
	@Column(nullable = false)
	private int visibility;

	/** 雲高 */
	@NotNull
	@Column(nullable = false)
	private int ceilingHeight;

	/** 気象状況 */
	@NotNull
	@Column(nullable = false)
	private int presentWeatherObservation;

	/** 気象コート */
	@NotNull
	@Column(nullable = false)
	private int presentWeatherCode;

	/** 可降水量 */
	@NotNull
	@Column(nullable = false)
	private double precipitableWater;

	/** 大気の光学的厚さ */
	@NotNull
	@Column(nullable = false)
	private double aerosolOpticalDepth;

	/** 積雪量 */
	@NotNull
	@Column(nullable = false)
	private int snowDepth;

	/** 最後の積雪からの日数 */
	@NotNull
	@Column(nullable = false)
	private int daysSinceLastSnowfall;

	/** アルベド */
	@NotNull
	@Column(nullable = false)
	private int albedo;

	/** 降水量 */
	@NotNull
	@Column(nullable = false)
	private int liquidPrecipitationDepth;

	/** 降水時間 */
	@NotNull
	@Column(nullable = false)
	private int liquidPrecipitationQuantity;

	@ManyToOne
	private AmedasHeader amedasHeader;

	public double getHumidityRatio() {
		return Double.valueOf(relativeHumidity);
	}
}
