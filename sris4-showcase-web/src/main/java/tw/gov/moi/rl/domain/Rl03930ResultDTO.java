package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 全國個人概要資料查詢紀錄處理DTO
 * 
 * @author David Wu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03930DTO", propOrder = { "siteId", "queryPersonId", "queryPersonName", "userName", "applyDate",
        "applyTime", "queryDate", "queryTime", "applyReason" })
@XmlRootElement(name = "Rl03930DTO")
public class Rl03930ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8497353976784180116L;

    @XmlElement(name = "siteId")
    @FieldName("作業點代碼")
    private String siteId;

    @XmlElement(name = "queryPersonId")
    @FieldName("被查詢人統號")
    private String queryPersonId;
    
    @XmlElement(name = "queryPersonName")
    @FieldName("被查詢人姓名")
    private String queryPersonName;

    @XmlElement(name = "userName")
    @FieldName("查詢人姓名")
    private String userName;
    
    @XmlElement(name = "applyDate")
    @FieldName("申請日期")
    private String applyDate;

    @XmlElement(name = "applyTime")
    @FieldName("申請時間")
    private String applyTime;

    @XmlElement(name = "queryDate")
    @FieldName("查詢日期")
    private String queryDate;
    
    @XmlElement(name = "queryTime")
    @FieldName("查詢時間")
    private String queryTime;

    @XmlElement(name = "applyReason")
    @FieldName("申請事由")
    private String applyReason;
    
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getQueryPersonId() {
        return queryPersonId;
    }

    public void setQueryPersonId(String queryPersonId) {
        this.queryPersonId = queryPersonId;
    }

    public String getQueryPersonName() {
        return queryPersonName;
    }

    public void setQueryPersonName(String queryPersonName) {
        this.queryPersonName = queryPersonName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }
}
