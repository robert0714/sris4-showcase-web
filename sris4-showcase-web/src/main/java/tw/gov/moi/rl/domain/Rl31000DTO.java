/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfs067Type;
import tw.gov.moi.domain.Rldfs067bType;

/**
 * The Class Rl31000DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl31000DTO", propOrder = { "applyType", "originalCaseNo", "reprintCode", "reprintReason", "personId",
        "attachDocsOnPage", "otherCertificate", "showPrintBtn", "showSaveBtn", "applyDoc", "attachDocs", "selfData",
        "selfHouseHoldData", "applyData", "applyHouseHoldData", "commData", "commHouseHoldData", "hasSelfOrHouseHoldData",
        "reportURL" })
@XmlRootElement(name = "Rl31000DTO")
public class Rl31000DTO implements Serializable {
    /**
     * 
     */
    private static final Logger LOG = LoggerFactory.getLogger(Rl31000DTO.class);

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5638263601581515926L;

    /**
     * 頁面：申請類別
     */
    @XmlElement(name = "ApplyType")
    @FieldName("頁面：申請類別")
    private String applyType;

    /**
     * 頁面：原核發案號
     */
    @XmlElement(name = "OriginalCaseNo")
    @FieldName("頁面：原核發案號")
    private String originalCaseNo = "";

    /**
     * 頁面：重印原因
     */
    @XmlElement(name = "ReprintCode")
    @FieldName("頁面：重印原因")
    private String reprintCode = "";

    /**
     * 頁面：重印原因內容
     */
    @XmlElement(name = "ReprintReason")
    @FieldName("頁面：重印原因內容")
    private String reprintReason = "";

    /**
     * 頁面親等關係主體(己身)：統號
     */
    @XmlElement(name = "PersonId")
    @FieldName("頁面親等關係主體(己身)：統號")
    private String personId;

    /**
     * 頁面：附繳證件
     */
    @XmlElement(name = "AttachDocsOnPage")
    @FieldName("頁面：附繳證件")
    private List<String> attachDocsOnPage;

    /**
     * 頁面：附繳證件 (其他)
     */
    @XmlElement(name = "OtherCertificate")
    @FieldName("頁面：附繳證件 (其他)")
    private String otherCertificate;

    /**
     * 顯示申請書列印按鈕
     */
    @XmlElement(name = "ShowPrintBtn")
    @FieldName("顯示申請書列印按鈕")
    private boolean showPrintBtn;

    /**
     * 顯示申請書存檔按鈕
     */
    @XmlElement(name = "ShowSaveBtn")
    @FieldName("顯示申請書存檔按鈕")
    private boolean showSaveBtn;

    /**
     * 親等關聯資料申請書資料檔
     */
    @XmlElement(name = "Rldfs067Type")
    @FieldName("親等關聯資料申請書資料檔")
    private Rldfs067Type applyDoc;

    /**
     * 親等關聯資料申請書附矯證件
     */
    @XmlElement(name = "AttachDocs")
    @FieldName("親等關聯資料申請書附矯證件")
    private List<Rldfs067bType> attachDocs;

    /**
     * 己身個人基本資料檔
     */
    @XmlElement(name = "SelfData")
    @FieldName("己身個人基本資料檔")
    private Rldf004mType selfData = new Rldf004mType();

    /**
     * 己身全戶基本資料檔
     */
    @XmlElement(name = "SelfHouseHoldData")
    @FieldName("己身全戶基本資料檔")
    private Rldf001mType selfHouseHoldData;

    /**
     * 申請人個人基本資料檔
     */
    @XmlElement(name = "ApplyData")
    @FieldName("申請人個人基本資料檔")
    private Rldf004mType applyData = new Rldf004mType();

    /**
     * 申請人全戶基本資料檔
     */
    @XmlElement(name = "ApplyHouseHoldData")
    @FieldName("申請人全戶基本資料檔")
    private Rldf001mType applyHouseHoldData;

    /**
     * 受委託人個人基本資料檔
     */
    @XmlElement(name = "CommData")
    @FieldName("受委託人個人基本資料檔")
    private Rldf004mType commData = new Rldf004mType();

    /**
     * 受委託人全戶基本資料檔
     */
    @XmlElement(name = "CommHouseHoldData")
    @FieldName("受委託人全戶基本資料檔")
    private Rldf001mType commHouseHoldData;

    /**
     * 是否有RLDF004M或RLDF001M資料
     */
    @XmlElement(name = "HasSelfOrHouseHoldData")
    @FieldName("是否有RLDF004M或RLDF001M資料")
    private boolean hasSelfOrHouseHoldData;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<String> getAttachDocsOnPage() {
        return this.attachDocsOnPage;
    }

    public void setAttachDocsOnPage(List<String> attachDocsOnPage) {
        this.attachDocsOnPage = attachDocsOnPage;
    }

    public List<Rldfs067bType> getAttachDocs() {
        return this.attachDocs;
    }

    public void setAttachDocs(List<Rldfs067bType> attachDocs) {
        this.attachDocs = attachDocs;
    }

    public String getApplyType() {
        return this.applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getOriginalCaseNo() {
        return this.originalCaseNo;
    }

    public void setOriginalCaseNo(String originalCaseNo) {
        this.originalCaseNo = originalCaseNo;
    }

    public String getReprintCode() {
        return this.reprintCode;
    }

    public void setReprintCode(String reprintCode) {
        this.reprintCode = reprintCode;
    }

    public String getReprintReason() {
        return this.reprintReason;
    }

    public void setReprintReason(String reprintReason) {
        this.reprintReason = reprintReason;
    }

    public boolean isShowPrintBtn() {
        return this.showPrintBtn;
    }

    public void setShowPrintBtn(boolean showPrintBtn) {
        this.showPrintBtn = showPrintBtn;
    }

    public boolean isShowSaveBtn() {
        return this.showSaveBtn;
    }

    public void setShowSaveBtn(boolean showSaveBtn) {
        this.showSaveBtn = showSaveBtn;
    }

    /**
     * 
     * @return Rldfs067Type
     */
    public Rldfs067Type getApplyDoc() {
        if (this.applyDoc == null) {
            this.applyDoc = new Rldfs067Type();
        }
        return this.applyDoc;
    }

    /**
     * 
     * @param applyDoc Rldfs067Type
     */
    public void setApplyDoc(Rldfs067Type applyDoc) {
        if (applyDoc == null) {
            applyDoc = new Rldfs067Type();
        }
        this.applyDoc = applyDoc;
    }

    /**
     * 
     * @return Rldf004mType
     */
    public Rldf004mType getSelfData() {
        if (this.selfData == null) {
            this.selfData = new Rldf004mType();
        }
        return this.selfData;
    }

    /**
     * 
     * @param selfData Rldf004mType
     */
    public void setSelfData(Rldf004mType selfData) {
        if (selfData == null) {
            selfData = new Rldf004mType();
        }
        this.selfData = selfData;
    }

    /**
     * 
     * @return Rldf004mType
     */
    public Rldf004mType getApplyData() {
        if (this.applyData == null) {
            this.applyData = new Rldf004mType();
        }
        return this.applyData;
    }

    /**
     * 
     * @param applyData Rldf004mType
     */
    public void setApplyData(Rldf004mType applyData) {
        if (applyData == null) {
            applyData = new Rldf004mType();
        }
        this.applyData = applyData;
    }

    /**
     * 
     * @return Rldf004mType
     */
    public Rldf004mType getCommData() {
        if (this.commData == null) {
            this.commData = new Rldf004mType();
        }
        return this.commData;
    }

    /**
     * 
     * @param commData Rldf004mType
     */
    public void setCommData(Rldf004mType commData) {
        if (commData == null) {
            commData = new Rldf004mType();
        }
        this.commData = commData;
    }

    /**
     * 
     * @return Rldf001mType
     */
    public Rldf001mType getSelfHouseHoldData() {
        if (this.selfHouseHoldData == null) {
            this.selfHouseHoldData = new Rldf001mType();
        }
        return this.selfHouseHoldData;
    }

    public void setSelfHouseHoldData(Rldf001mType selfHouseHoldData) {
        this.selfHouseHoldData = selfHouseHoldData;
    }

    public Rldf001mType getApplyHouseHoldData() {
        return this.applyHouseHoldData;
    }

    public void setApplyHouseHoldData(Rldf001mType applyHouseHoldData) {
        this.applyHouseHoldData = applyHouseHoldData;
    }

    public Rldf001mType getCommHouseHoldData() {
        return this.commHouseHoldData;
    }

    public void setCommHouseHoldData(Rldf001mType commHouseHoldData) {
        this.commHouseHoldData = commHouseHoldData;
    }

    public String getReportURL() {
        return this.reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getOtherCertificate() {
        return this.otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public boolean isHasSelfOrHouseHoldData() {
        return this.hasSelfOrHouseHoldData;
    }

    public void setHasSelfOrHouseHoldData(boolean hasSelfOrHouseHoldData) {
        this.hasSelfOrHouseHoldData = hasSelfOrHouseHoldData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * 
     */
    public void clean() {
        final Field[] fields = this.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            final Field field = fields[i];
            try {
                final String type = field.getType().toString();
                //依照DTO中的欄位型態去將欄位清空
                if (StringUtils.indexOf(type, "String") > -1 || StringUtils.indexOf(type, "List") > -1) {
                    PropertyUtils.setProperty(this, field.getName(), null);
                } else if (StringUtils.indexOf(type, "boolean") > -1) {
                    PropertyUtils.setProperty(this, field.getName(), false);
                } else if (StringUtils.indexOf(type, "long") > -1 || StringUtils.indexOf(type, "Logger") > -1) {
                    //long跟Logger型態不去清空
                    LOG.info("long跟Logger型態不去清空");
                } else {
                    PropertyUtils.setProperty(this, field.getName(), null);
                }
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
                continue;
            }
        }

        this.attachDocsOnPage = new ArrayList<String>();
        this.attachDocs = new ArrayList<Rldfs067bType>();
    }
}
