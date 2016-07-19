/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl012f0AppDataDTO", propOrder = { "registerDate", "registerTime", "personId", "siteId",
        "acceptAdminOfficeCode", "registerContent", "enforcedFlag", "viewFine", "fineEventDate", "needFineFlag",
        "fineFreeFlag", "removeFeeReason", "orgEducationMark", "executorFId", "executorFSiteId",
        "executorFRelationship", "executorFOrgEducationMark", "executorMId", "executorMSiteId",
        "executorMRelationship", "executorMOrgEducationMark", "rightReasonCode", "rightDate", "preExecutorName",
        "certificateList", "otherCertificate", "changeExecutor", "executeWay", "durationStart", "durationEnd",
        "preExecutor", "cannontExecuteReason", "bookFlag", "personForeignFlag", "fatherBookFlag", "fatherRole",
        "fatherBookFlag", "motherRole", "receiptId", "outliveCaseFlag", "educationApplySeq" })
@XmlRootElement(name = "Rl012f0AppDataDTO")
public class Rl012f0AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 作業點代碼 */
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    /** 受理地作業點代碼 */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 申請書備註 */
    @FieldName("申請書備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 進行逾期申報之罰鍰檢視 */
    @FieldName("進行逾期申報之罰鍰檢視")
    @XmlElement(name = "ViewFine", required = false)
    private String viewFine;

    /** 判斷罰鍰之事件發生(確定)日期 */
    @FieldName("判斷罰鍰之事件發生(確定)日期")
    @XmlElement(name = "FineEventDate", required = false)
    private String fineEventDate;

    /** 判斷是否罰鍰旗標 */
    @FieldName("判斷是否罰鍰旗標")
    @XmlElement(name = "NeedFineFlag", required = false)
    private String needFineFlag;

    /** 免罰旗標 */
    @FieldName("免罰旗標")
    @XmlElement(name = "FineFreeFlag", required = false)
    private String fineFreeFlag;

    /** 免罰原因 */
    @FieldName("免罰原因")
    @XmlElement(name = "RemoveFeeReason", required = false)
    private String removeFeeReason;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 權義負擔人父統一編號 */
    @FieldName("權義負擔人父統一編號")
    @XmlElement(name = "ExecutorFId", required = false)
    private String executorFId;

    /** 權義負擔人父作業點代碼 */
    @FieldName("權義負擔人父作業點代碼")
    @XmlElement(name = "ExecutorFSiteId", required = false)
    private String executorFSiteId;

    /** 權義負擔人父與未成年子女之關係 */
    @FieldName("權義負擔人父與未成年子女之關係")
    @XmlElement(name = "ExecutorFRelationship", required = false)
    private String executorFRelationship;

    /** 權義負擔人父原教育程度註記 */
    @FieldName("權義負擔人父原教育程度註記")
    @XmlElement(name = "ExecutorFOrgEducationMark", required = false)
    private String executorFOrgEducationMark;

    /** 權義負擔人母統一編號 */
    @FieldName("權義負擔人母統一編號")
    @XmlElement(name = "ExecutorMId", required = false)
    private String executorMId;

    /** 權義負擔人母作業點代碼 */
    @FieldName("權義負擔人母作業點代碼")
    @XmlElement(name = "ExecutorMSiteId", required = false)
    private String executorMSiteId;

    /** 權義負擔人母與未成年子女之關係 */
    @FieldName("權義負擔人母與未成年子女之關係")
    @XmlElement(name = "ExecutorMRelationship", required = false)
    private String executorMRelationship;

    /** 權義負擔人母原教育程度註記 */
    @FieldName("權義負擔人母原教育程度註記")
    @XmlElement(name = "ExecutorMOrgEducationMark", required = false)
    private String executorMOrgEducationMark;

    /** 權利義務行使負擔原因代碼 */
    @FieldName("權利義務行使負擔原因代碼")
    @XmlElement(name = "RightReasonCode", required = false)
    private String rightReasonCode;

    /** 權利義務行使負擔日期 */
    @FieldName("權利義務行使負擔日期")
    @XmlElement(name = "RightDate", required = false)
    private String rightDate;

    /** 前監護人姓名 */
    @FieldName("前監護人姓名")
    @XmlElement(name = "PreExecutorName", required = false)
    private String preExecutorName;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OteherCertificate", required = false)
    private String otherCertificate;

    /** 權利義務行使負擔方式 */
    @FieldName("權利義務行使負擔方式")
    @XmlElement(name = "ExecuteWay", required = false)
    private String executeWay;

    /** 停止親權期間（起） */
    @FieldName("停止親權期間（起）")
    @XmlElement(name = "DurationStart", required = false)
    private String durationStart;

    /** 停止親權期間（迄） */
    @FieldName("停止親權期間（迄）")
    @XmlElement(name = "DurationEnd", required = false)
    private String durationEnd;

    /** 前權利義務行使負擔人 */
    @FieldName("前權利義務行使負擔人")
    @XmlElement(name = "PreExecutor", required = false)
    private String preExecutor;

    /** 無法行使負擔權利義務原因 */
    @FieldName("無法行使負擔權利義務原因")
    @XmlElement(name = "CannotExecuteReason", required = false)
    private String cannotExecuteReason;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "PersonForeignFlag", required = false)
    private String personForeignFlag;

    /** 權益負擔人父簿頁旗標 */
    @FieldName("權益負擔人父簿頁旗標")
    @XmlElement(name = "FatherBookFlag", required = false)
    private String fatherBookFlag;

    /** 權益負擔人父身分角色 */
    @FieldName("權益負擔人父身分角色")
    @XmlElement(name = "FatherRole", required = false)
    private String fatherRole;

    /** 權益負擔人母簿頁旗標 */
    @FieldName("權益負擔人母簿頁旗標")
    @XmlElement(name = "MotherBookFlag", required = false)
    private String motherBookFlag;

    /** 權益負擔人母身分角色 */
    @FieldName("權益負擔人母身分角色")
    @XmlElement(name = "MotherRole", required = false)
    private String motherRole;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "OutliveCaseFlag", required = false)
    private String outliveCaseFlag;

    /** 教育程度流水號 */
    @FieldName("教育程度流水號")
    @XmlElement(name = "EducationApplySeq", required = false)
    private Integer educationApplySeq = 0;

    public String getPreExecutorName() {
        return preExecutorName;
    }

    public void setPreExecutorName(String preExecutorName) {
        this.preExecutorName = preExecutorName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getViewFine() {
        return viewFine;
    }

    public void setViewFine(String viewFine) {
        this.viewFine = viewFine;
    }

    public String getFineEventDate() {
        return fineEventDate;
    }

    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getFineFreeFlag() {
        return fineFreeFlag;
    }

    public void setFineFreeFlag(String fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getExecutorFId() {
        return executorFId;
    }

    public void setExecutorFId(String executorFId) {
        this.executorFId = executorFId;
    }

    public String getExecutorFSiteId() {
        return executorFSiteId;
    }

    public void setExecutorFSiteId(String executorFSiteId) {
        this.executorFSiteId = executorFSiteId;
    }

    public String getExecutorFRelationship() {
        return executorFRelationship;
    }

    public void setExecutorFRelationship(String executorFRelationship) {
        this.executorFRelationship = executorFRelationship;
    }

    public String getExecutorFOrgEducationMark() {
        return executorFOrgEducationMark;
    }

    public void setExecutorFOrgEducationMark(String executorFOrgEducationMark) {
        this.executorFOrgEducationMark = executorFOrgEducationMark;
    }

    public String getExecutorMId() {
        return executorMId;
    }

    public void setExecutorMId(String executorMId) {
        this.executorMId = executorMId;
    }

    public String getExecutorMSiteId() {
        return executorMSiteId;
    }

    public void setExecutorMSiteId(String executorMSiteId) {
        this.executorMSiteId = executorMSiteId;
    }

    public String getExecutorMRelationship() {
        return executorMRelationship;
    }

    public void setExecutorMRelationship(String executorMRelationship) {
        this.executorMRelationship = executorMRelationship;
    }

    public String getExecutorMOrgEducationMark() {
        return executorMOrgEducationMark;
    }

    public void setExecutorMOrgEducationMark(String executorMOrgEducationMark) {
        this.executorMOrgEducationMark = executorMOrgEducationMark;
    }

    public String getRightReasonCode() {
        return rightReasonCode;
    }

    public void setRightReasonCode(String rightReasonCode) {
        this.rightReasonCode = rightReasonCode;
    }

    public String getRightDate() {
        return rightDate;
    }

    public void setRightDate(String rightDate) {
        this.rightDate = rightDate;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getExecuteWay() {
        return executeWay;
    }

    public void setExecuteWay(String executeWay) {
        this.executeWay = executeWay;
    }

    public String getDurationStart() {
        return durationStart;
    }

    public void setDurationStart(String durationStart) {
        this.durationStart = durationStart;
    }

    public String getDurationEnd() {
        return durationEnd;
    }

    public void setDurationEnd(String durationEnd) {
        this.durationEnd = durationEnd;
    }

    public String getPreExecutor() {
        return preExecutor;
    }

    public void setPreExecutor(String preExecutor) {
        this.preExecutor = preExecutor;
    }

    public String getCannotExecuteReason() {
        return cannotExecuteReason;
    }

    public void setCannotExecuteReason(String cannotExecuteReason) {
        this.cannotExecuteReason = cannotExecuteReason;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public String getPersonForeignFlag() {
        return personForeignFlag;
    }

    public void setPersonForeignFlag(String personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    public String getFatherBookFlag() {
        return fatherBookFlag;
    }

    public void setFatherBookFlag(String fatherBookFlag) {
        this.fatherBookFlag = fatherBookFlag;
    }

    public String getFatherRole() {
        return fatherRole;
    }

    public void setFatherRole(String fatherRole) {
        this.fatherRole = fatherRole;
    }

    public String getMotherBookFlag() {
        return motherBookFlag;
    }

    public void setMotherBookFlag(String motherBookFlag) {
        this.motherBookFlag = motherBookFlag;
    }

    public String getMotherRole() {
        return motherRole;
    }

    public void setMotherRole(String motherRole) {
        this.motherRole = motherRole;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    public Integer getEducationApplySeq() {
        return educationApplySeq += 1;
    }

    public void setEducationApplySeq(Integer educationApplySeq) {
        this.educationApplySeq = educationApplySeq;
    }

}
