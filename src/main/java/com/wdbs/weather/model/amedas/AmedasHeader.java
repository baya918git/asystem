package com.wdbs.weather.model.amedas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 拡張アメダスヘッダークラス。
 */
@Entity
@Data
public class AmedasHeader {

	/** ID */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "amedas_header_id_seq")
	@SequenceGenerator(name = "amedas_header_id_seq", sequenceName = "amedas_header_id_seq", allocationSize = 1)
	private Long id;

	/**　Header１ */

	/**　地点名 */
	@NotNull
	@Column(nullable = false)
	private String city;

	/**　都道府県名 */
	@NotNull
	@Column(nullable = false)
	private String prefecture;

	/**　国名 */
	@NotNull
	@Column(nullable = false)
	private String country;

	/**　EA種別 */
	@NotNull
	@Column(nullable = false)
	private String eaType;

	/**　EA地点番号 */
	@NotNull
	@Column(nullable = false)
	private int eaPoint;

	/**　緯度 */
	@NotNull
	@Column(nullable = false)
	private double latitude;

	/**　経度 */
	@NotNull
	@Column(nullable = false)
	private double longitude;

	/**　タイムゾーン */
	@NotNull
	@Column(nullable = false)
	private int timeZone;

	/**　標高 */
	@NotNull
	@Column(nullable = false)
	private int elavation;

	/**　Header３ */

	/**　夏季の厳しい期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date summerExtremeStart;

	/**　夏季の厳しい期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date summerExtremeEnd;

	/**　夏季の標準的な期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date summerTypicalStart;

	/**　夏季の標準的な期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date summerTypicalEnd;

	/**　冬季の厳しい期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date winterExtremeStart;

	/**　冬季の厳しい期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date winterExtremeEnd;

	/**　冬季の標準的な期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date winterTypicalStart;

	/**　冬季の標準的な期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date winterTypicalEnd;

	/**　秋季の標準的な期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date autumnTypicalStart;

	/**　秋季の標準的な期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date autumnTypicalEnd;

	/**　春季の標準的な期間の開始日 */
	@NotNull
	@Column(nullable = false)
	private Date springTypicalStart;

	/**　春季の標準的な期間の終了日 */
	@NotNull
	@Column(nullable = false)
	private Date springTypicalEnd;

	/**　Header４ */

	/**　地中温度の深さ1（0.5m） */
	@NotNull
	@Column(nullable = false)
	private double groundTemperatureDepth1;

	/**　土壌伝導率 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1SoilConductivity;

	/**　土壌密度 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth1SoilDensity;

	/**　土壌比熱 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth1SoilSpecificHeat;

	/**　１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1JanAverage;

	/**　２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1FebAverage;

	/**　３月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1MarAverage;

	/**　４月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1AprAverage;

	/**　５月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1MayAverage;

	/**　６月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1JunAverage;

	/**　７月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1JulAverage;

	/**　８月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1AugAverage;

	/**　９月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1SepAverage;

	/**　１０月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1OctAverage;

	/**　１１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1NovAverage;

	/**　１２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth1DecAverage;

	/**　地中温度の深さ2（2m） */
	@NotNull
	@Column(nullable = false)
	private double groundTemperatureDepth2;

	/**　土壌伝導率 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2SoilConductivity;

	/**　土壌密度 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth2SoilDensity;

	/**　土壌比熱 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth2SoilSpecificHeat;

	/**　１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2JanAverage;

	/**　２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2FebAverage;

	/**　３月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2MarAverage;

	/**　４月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2AprAverage;

	/**　５月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2MayAverage;

	/**　６月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2JunAverage;

	/**　７月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2JulAverage;

	/**　８月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2AugAverage;

	/**　９月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2SepAverage;

	/**　１０月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2OctAverage;

	/**　１１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2NovAverage;

	/**　１２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth2DecAverage;

	/**　地中温度の深さ3（4m） */
	@NotNull
	@Column(nullable = false)
	private double groundTemperatureDepth3;

	/**　土壌伝導率 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3SoilConductivity;

	/**　土壌密度 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth3SoilDensity;

	/**　土壌比熱 */
	@NotNull
	@Column(nullable = false)
	private int gtDepth3SoilSpecificHeat;

	/**　１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3JanAverage;

	/**　２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3FebAverage;

	/**　３月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3MarAverage;

	/**　４月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3AprAverage;

	/**　５月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3MayAverage;

	/**　６月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3JunAverage;

	/**　７月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3JulAverage;

	/**　８月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3AugAverage;

	/**　９月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3SepAverage;

	/**　１０月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3OctAverage;

	/**　１１月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3NovAverage;

	/**　１２月の平均地中温度 */
	@NotNull
	@Column(nullable = false)
	private double gtDepth3DecAverage;

	@OneToMany(mappedBy = "amedasHeader")
	private List<AmedasData> amedasDatas = new ArrayList<>();
}
