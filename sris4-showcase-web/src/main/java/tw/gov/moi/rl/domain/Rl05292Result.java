package tw.gov.moi.rl.domain;

import java.io.Serializable;

public class Rl05292Result implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** 登入日期 */
    private String loginDate;
    /** 登入時間 */
    private String loginTime;
    private String personId;
    /** 出生日期 */
    private String yyymmdd;
    /** 姓名 */
    private String personName;
    /** 登入人員 */
    private String applyPlayer;
    /** 回復狀況 */
    private String reportStatus;
    /** 被保險人員 */
    private String insurancePerson;
    /** 通訊地址 */
    private String communicationAdress;
    /*** 登記地址 */
    private String recordAress;
    /** 通訊電話號碼 */
    private String phone;
    /** 回報狀況 */
    private String reportSatus;

    public String getYyymmdd() {
        return yyymmdd;
    }

    public void setYyymmdd(String yyymmdd) {
        this.yyymmdd = yyymmdd;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getApplyPlayer() {
        return applyPlayer;
    }

    public void setApplyPlayer(String applyPlayer) {
        this.applyPlayer = applyPlayer;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getInsurancePerson() {
        return insurancePerson;
    }

    public void setInsurancePerson(String insurancePerson) {
        this.insurancePerson = insurancePerson;
    }

    public String getCommunicationAdress() {
        return communicationAdress;
    }

    public void setCommunicationAdress(String communicationAdress) {
        this.communicationAdress = communicationAdress;
    }

    public String getRecordAress() {
        return recordAress;
    }

    public void setRecordAress(String recordAress) {
        this.recordAress = recordAress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReportSatus() {
        return reportSatus;
    }

    public void setReportSatus(String reportSatus) {
        this.reportSatus = reportSatus;
    }

    @Override
    public String toString() {
        return "Rl05292Result [loginDate=" + loginDate + ", loginTime=" + loginTime + ", personId=" + personId + ", yyymmdd=" + yyymmdd + ", personName=" + personName + ", applyPlayer=" + applyPlayer + ", reportStatus=" + reportStatus + ", insurancePerson=" + insurancePerson + ", communicationAdress=" + communicationAdress + ", recordAress=" + recordAress + ", phone=" + phone + ", reportSatus=" + reportSatus + "]";
    }

}
