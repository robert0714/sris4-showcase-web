package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04920DTO", propOrder = {"printType", "oldAreaCode", "oldVillage", "oldNeighor", "newAreaCode", "newVillage", "newNeighor", "printOrderBy", "reportType", "reportURL"})
@XmlRootElement(name = "Rl04920DTO")
public class Rl04920DTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(name = "PrintType")
    @FieldName("列印選擇")
    private String printType = RlConstant.STRING_ONE;
    
    @XmlElement(name = "OldAreaCode")
    @FieldName("調整前行政區域代碼")
    private String oldAreaCode;
    
    @XmlElement(name = "OldVillage")
    @FieldName("調整前村里")
    private String oldVillage;
    
    @XmlElement(name = "OldNeighor")
    @FieldName("調整前鄰")
    private String oldNeighor;
    
    @XmlElement(name = "NewAreaCode")
    @FieldName("調整後行政區域代碼")
    private String newAreaCode;
    
    @XmlElement(name = "NewVillage")
    @FieldName("調整後村里")
    private String newVillage;

    @XmlElement(name = "NewNeighor")
    @FieldName("調整後鄰")
    private String newNeighor;
    
    @XmlElement(name = "PrintOrderBy")
    @FieldName("列印排序")
    private String printOrderBy = RlConstant.STRING_ONE;
    
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

	public String getOldAreaCode() {
		return oldAreaCode;
	}

	public void setOldAreaCode(String oldAreaCode) {
		this.oldAreaCode = oldAreaCode;
	}

	public String getOldVillage() {
		return oldVillage;
	}

	public void setOldVillage(String oldVillage) {
		this.oldVillage = oldVillage;
	}

	public String getOldNeighor() {
		return oldNeighor;
	}

	public void setOldNeighor(String oldNeighor) {
		this.oldNeighor = oldNeighor;
	}

	public String getNewAreaCode() {
		return newAreaCode;
	}

	public void setNewAreaCode(String newAreaCode) {
		this.newAreaCode = newAreaCode;
	}

	public String getNewVillage() {
		return newVillage;
	}

	public void setNewVillage(String newVillage) {
		this.newVillage = newVillage;
	}

	public String getNewNeighor() {
		return newNeighor;
	}

	public void setNewNeighor(String newNeighor) {
		this.newNeighor = newNeighor;
	}

	public String getPrintOrderBy() {
		return printOrderBy;
	}

	public void setPrintOrderBy(String printOrderBy) {
		this.printOrderBy = printOrderBy;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportURL() {
		return reportURL;
	}

	public void setReportURL(String reportURL) {
		this.reportURL = reportURL;
	}
}
