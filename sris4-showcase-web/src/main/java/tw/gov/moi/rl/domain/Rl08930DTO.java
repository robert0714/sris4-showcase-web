package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 製作各鄰住戶人口統計表.
 * 
 * @author 劉嘉煒
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08930DTO", propOrder = { "DataKind", "PrintKind", "neighborStart", "neighborEnd", "IdColNumber",
		"PersonId", "InsertList", "ReportFormat", "ReportURL", "ShowVillage" })
@XmlRootElement(name = "Rl08930DTO")
public class Rl08930DTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8431788095599023197L;

	/** 製表方式 */
	@XmlElement(name = "DataKind")
	@FieldName("製表方式")
	private String dataKind;

	/** 是否全所統計 */
	@XmlElement(name = "PrintKind")
	@FieldName("是否全所統計")
	private String printKind;

	/** 村里 */
	@XmlElement(name = "CorrectVillage", required = true)
	@FieldName("村里")
	private String correctVillage;

	/** 鄰別(起) */
	@XmlElement(name = "NeighborStart")
	@FieldName("鄰別 (起)")
	private String neighborStart;

	/** 鄰別(迄) */
	@XmlElement(name = "NeighborEnd")
	@FieldName("鄰別(迄)")
	private String neighborEnd;

	/** 欄位編號 */
	@XmlElement(name = "IdColNumber")
	@FieldName("欄位編號")
	private String idColNumber;

	/** 當事人統號 */
	@XmlElement(name = "PersonId")
	@FieldName("當事人統號")
	private String personId;

	/** 新增List */
	@XmlElement(name = "InsertList")
	@FieldName("新增List")
	private List<Rl08930DTO> insertList = new ArrayList<Rl08930DTO>();

	/** 檔案格式 */
	@XmlElement(name = "ReportFormat")
	@FieldName("檔案格式")
	private String reportFormat;

	/** 報表URL */
	@XmlElement(name = "ReportURL")
	@FieldName("報表URL")
	private String reportURL;

	/** ShowVillage */
	@XmlElement(name = "ShowVillage")
	@FieldName("ShowVillage")
	private boolean showVillage = false;
	
	@XmlElement(name = "Url", required = true)
	@FieldName("URL")
	private String url = "";
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isShowVillage() {
		return showVillage;
	}

	public void setShowVillage(boolean showVillage) {
		this.showVillage = showVillage;
	}

	public String getDataKind() {
		return dataKind;
	}

	public void setDataKind(String dataKind) {
		this.dataKind = dataKind;
	}

	public String getPrintKind() {
		return printKind;
	}

	public void setPrintKind(String printKind) {
		this.printKind = printKind;
	}

	public String getCorrectVillage() {
		return correctVillage;
	}

	public void setCorrectVillage(String correctVillage) {
		this.correctVillage = correctVillage;
	}

	public String getNeighborStart() {
		return neighborStart;
	}

	public void setNeighborStart(String neighborStart) {
		this.neighborStart = neighborStart;
	}

	public String getNeighborEnd() {
		return neighborEnd;
	}

	public void setNeighborEnd(String neighborEnd) {
		this.neighborEnd = neighborEnd;
	}

	public String getIdColNumber() {
		return idColNumber;
	}

	public void setIdColNumber(String idColNumber) {
		this.idColNumber = idColNumber;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public List<Rl08930DTO> getInsertList() {
		return insertList;
	}

	public void setInsertList(List<Rl08930DTO> insertList) {
		this.insertList = insertList;
	}

	public String getReportFormat() {
		return reportFormat;
	}

	public void setReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
	}

	public String getReportURL() {
		return reportURL;
	}

	public void setReportURL(String reportURL) {
		this.reportURL = reportURL;
	}

}
