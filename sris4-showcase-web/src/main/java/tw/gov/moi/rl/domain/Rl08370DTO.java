package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08370DTO", propOrder = { "Village1", "NeighorStart1", "NeighorEnd1", "Village2", "NeighorStart2",
        "NeighorEnd2", "Village3", "NeighorStart3", "NeighorEnd3", "Village4", "NeighorStart4", "NeighorEnd4",
        "HouseHoldPid", "HouseHoldId", "BirthDateStart", "BirthDateEnd", "Education1", "Education2", "Education3",
        "OrderType", "ReportFormat" })
@XmlRootElement(name = "Rl08370DTO")
public class Rl08370DTO {

    @XmlElement(name = "Village1", required = true)
    @FieldName("村里1")
    private String village1;

    @XmlElement(name = "NeighorStart1", required = true)
    @FieldName("鄰_起1")
    private String neighorStart1;

    @XmlElement(name = "NeighorEnd1", required = true)
    @FieldName("鄰_迄1")
    private String neighorEnd1;

    @XmlElement(name = "Village2", required = true)
    @FieldName("村里2")
    private String village2;

    @XmlElement(name = "NeighorStart2", required = true)
    @FieldName("鄰_起2")
    private String neighorStart2;

    @XmlElement(name = "NeighorEnd2", required = true)
    @FieldName("鄰_迄2")
    private String neighorEnd2;

    @XmlElement(name = "Village3", required = true)
    @FieldName("村里3")
    private String village3;

    @XmlElement(name = "NeighorStart3", required = true)
    @FieldName("鄰_起3")
    private String neighorStart3;

    @XmlElement(name = "NeighorEnd3", required = true)
    @FieldName("鄰_迄3")
    private String neighorEnd3;

    @XmlElement(name = "Village4", required = true)
    @FieldName("村里4")
    private String village4;

    @XmlElement(name = "NeighorStart4", required = true)
    @FieldName("鄰_起4")
    private String neighorStart4;

    @XmlElement(name = "NeighorEnd4", required = true)
    @FieldName("鄰_迄4")
    private String neighorEnd4;

    @XmlElement(name = "HouseHoldPid", required = true)
    @FieldName("戶長統號")
    private String houseHoldPid;

    @XmlElement(name = "HouseHoldId", required = true)
    @FieldName("戶號")
    private String houseHoldId;

    @XmlElement(name = "BirthDateStart", required = true)
    @FieldName("出生日期(起)")
    private String birthDateStart;

    @XmlElement(name = "BirthDateEnd", required = true)
    @FieldName("出生日期(迄)")
    private String birthDateEnd;

    @XmlElement(name = "Education1", required = true)
    @FieldName("教育程度1")
    private String education1;

    @XmlElement(name = "Education2", required = true)
    @FieldName("教育程度2")
    private String education2;

    @XmlElement(name = "Education3", required = true)
    @FieldName("教育程度3")
    private String education3;

    @XmlElement(name = "OrderType", required = true)
    @FieldName("排序方式")
    private String orderType;

    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("報表格式")
    private String reportFormat;

    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    public String getVillage1() {
        return village1;
    }

    public void setVillage1(final String village1) {
        this.village1 = village1;
    }

    public String getNeighorStart1() {
        return neighorStart1;
    }

    public void setNeighorStart1(final String neighorStart1) {
        this.neighorStart1 = neighorStart1;
    }

    public String getNeighorEnd1() {
        return neighorEnd1;
    }

    public void setNeighorEnd1(final String neighorEnd1) {
        this.neighorEnd1 = neighorEnd1;
    }

    public String getVillage2() {
        return village2;
    }

    public void setVillage2(final String village2) {
        this.village2 = village2;
    }

    public String getNeighorStart2() {
        return neighorStart2;
    }

    public void setNeighorStart2(final String neighorStart2) {
        this.neighorStart2 = neighorStart2;
    }

    public String getNeighorEnd2() {
        return neighorEnd2;
    }

    public void setNeighorEnd2(final String neighorEnd2) {
        this.neighorEnd2 = neighorEnd2;
    }

    public String getVillage3() {
        return village3;
    }

    public void setVillage3(final String village3) {
        this.village3 = village3;
    }

    public String getNeighorStart3() {
        return neighorStart3;
    }

    public void setNeighorStart3(final String neighorStart3) {
        this.neighorStart3 = neighorStart3;
    }

    public String getNeighorEnd3() {
        return neighorEnd3;
    }

    public void setNeighorEnd3(final String neighorEnd3) {
        this.neighorEnd3 = neighorEnd3;
    }

    public String getVillage4() {
        return village4;
    }

    public void setVillage4(final String village4) {
        this.village4 = village4;
    }

    public String getNeighorStart4() {
        return neighorStart4;
    }

    public void setNeighorStart4(final String neighorStart4) {
        this.neighorStart4 = neighorStart4;
    }

    public String getNeighorEnd4() {
        return neighorEnd4;
    }

    public void setNeighorEnd4(final String neighorEnd4) {
        this.neighorEnd4 = neighorEnd4;
    }

    public String getHouseHoldPid() {
        return houseHoldPid;
    }

    public void setHouseHoldPid(final String houseHoldPid) {
        this.houseHoldPid = houseHoldPid;
    }

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(final String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    public String getBirthDateStart() {
        return birthDateStart;
    }

    public void setBirthDateStart(final String birthDateStart) {
        this.birthDateStart = birthDateStart;
    }

    public String getBirthDateEnd() {
        return birthDateEnd;
    }

    public void setBirthDateEnd(final String birthDateEnd) {
        this.birthDateEnd = birthDateEnd;
    }

    public String getEducation1() {
        return education1;
    }

    public void setEducation1(final String education1) {
        this.education1 = education1;
    }

    public String getEducation2() {
        return education2;
    }

    public void setEducation2(final String education2) {
        this.education2 = education2;
    }

    public String getEducation3() {
        return education3;
    }

    public void setEducation3(final String education3) {
        this.education3 = education3;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(final String orderType) {
        this.orderType = orderType;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}
