/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf100mType;

/**
 * The Class Rl089d2DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089d2DTO", propOrder = { "person_id", "result_mark", "result_content_1", "result_content_2",
        "resident_code", "remark", "resultMarkBoolean", "residentCodeBoolean", "rl089d2Result", "disabledResidentCode",
        "tranYyy" })
@XmlRootElement(name = "Rl089d2DTO")
public class Rl089d2DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String person_id = "";

    /** 查對成果. */
    @XmlElement(name = "ResultMark")
    @FieldName("查對成果")
    private String result_mark = "";

    /** 查對內容1. */
    @XmlElement(name = "ResultContent1")
    @FieldName("查對內容1")
    private String result_content_1 = "";

    /** 查對內容2. */
    @XmlElement(name = "ResultContent2")
    @FieldName("查對內容2")
    private String result_content_2 = "";

    /** 居住現址原因. */
    @XmlElement(name = "ResidentCode")
    @FieldName("居住現址原因")
    private String resident_code = "";

    /** 備註. */
    @XmlElement(name = "Remark")
    @FieldName("備註")
    private String remark = "";

    /** The result mark boolean. */
    @XmlElement(name = "ResultMarkBoolean")
    @FieldName("resultMarkBoolean")
    private String resultMarkBoolean = "";

    /** The resident code boolean. */
    @XmlElement(name = "ResidentCodeBoolean")
    @FieldName("residentCodeBoolean")
    private String residentCodeBoolean = "";

    // /** The rl089d2 result. */
    // @XmlElement(name = "Rl089d2Result")
    // @FieldName("查詢結果")
    // private Rl089d2ResultDTO rl089d2Result;

    /** 動作模式 0:查詢、1：編輯 */
    @XmlElement(name = "ActionMode")
    @FieldName("動作模式")
    private String actionMode;

    @XmlElement(name = "Rldf100mObj")
    @FieldName("查詢結果")
    private Rldf100mType rldf100mObj;

    // /** 禁用居住現址原因選項 Default:true. */
    // @XmlElement(name = "DisabledResidentCode")
    // @FieldName("禁用居住現址原因選項")
    // private boolean disabledResidentCode = true;

    /** 清查年份. */
    @XmlElement(name = "TranYyy")
    @FieldName("清查年份")
    private String tranYyy = "";

    /**
     * Gets the person_id.
     * 
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * Sets the person_id.
     * 
     * @param person_id
     *            the new person_id
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * Gets the result_mark.
     * 
     * @return the result_mark
     */
    public String getResult_mark() {
        return result_mark;
    }

    /**
     * Sets the result_mark.
     * 
     * @param result_mark
     *            the new result_mark
     */
    public void setResult_mark(String result_mark) {
        this.result_mark = result_mark;
    }

    /**
     * Gets the result_content_1.
     * 
     * @return the result_content_1
     */
    public String getResult_content_1() {
        return result_content_1;
    }

    /**
     * Sets the result_content_1.
     * 
     * @param result_content_1
     *            the new result_content_1
     */
    public void setResult_content_1(String result_content_1) {
        this.result_content_1 = result_content_1;
    }

    /**
     * Gets the result_content_2.
     * 
     * @return the result_content_2
     */
    public String getResult_content_2() {
        return result_content_2;
    }

    /**
     * Sets the result_content_2.
     * 
     * @param result_content_2
     *            the new result_content_2
     */
    public void setResult_content_2(String result_content_2) {
        this.result_content_2 = result_content_2;
    }

    /**
     * Gets the resident_code.
     * 
     * @return the resident_code
     */
    public String getResident_code() {
        return resident_code;
    }

    /**
     * Sets the resident_code.
     * 
     * @param resident_code
     *            the new resident_code
     */
    public void setResident_code(String resident_code) {
        this.resident_code = resident_code;
    }

    /**
     * Gets the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the remark.
     * 
     * @param remark
     *            the new remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets the rl089d2 result.
     * 
     * @return the rl089d2 result
     */
    // public Rl089d2ResultDTO getRl089d2Result() {
    // if (rl089d2Result == null) {
    // rl089d2Result = new Rl089d2ResultDTO();
    // }
    // return rl089d2Result;
    // }

    /**
     * Sets the rl089d2 result.
     * 
     * @param rl089d2Result
     *            the new rl089d2 result
     */
    // public void setRl089d2Result(Rl089d2ResultDTO rl089d2Result) {
    // this.rl089d2Result = rl089d2Result;
    // }

    /**
     * Gets the result mark boolean.
     * 
     * @return the result mark boolean
     */
    public String getResultMarkBoolean() {
        return resultMarkBoolean;
    }

    /**
     * Sets the result mark boolean.
     * 
     * @param resultMarkBoolean
     *            the new result mark boolean
     */
    public void setResultMarkBoolean(String resultMarkBoolean) {
        this.resultMarkBoolean = resultMarkBoolean;
    }

    /**
     * Gets the resident code boolean.
     * 
     * @return the resident code boolean
     */
    public String getResidentCodeBoolean() {
        return residentCodeBoolean;
    }

    /**
     * Sets the resident code boolean.
     * 
     * @param residentCodeBoolean
     *            the new resident code boolean
     */
    public void setResidentCodeBoolean(String residentCodeBoolean) {
        this.residentCodeBoolean = residentCodeBoolean;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl089d2DTO [person_id=" + person_id + ", result_mark=" + result_mark + ", result_content_1="
                + result_content_1 + ", result_content_2=" + result_content_2 + ", resident_code=" + resident_code
                + ", remark=" + remark + ", resultMarkBoolean=" + resultMarkBoolean + ", residentCodeBoolean="
                + residentCodeBoolean + "]";
    }

    /**
     * Checks if is disabled resident code.
     * 
     * @return true, if is disabled resident code
     */
    // public boolean isDisabledResidentCode() {
    // return disabledResidentCode;
    // }

    /**
     * Sets the disabled resident code.
     * 
     * @param disabledResidentCode
     *            the new disabled resident code
     */
    // public void setDisabledResidentCode(boolean disabledResidentCode) {
    // this.disabledResidentCode = disabledResidentCode;
    // }

    /**
     * Gets the tran yyy.
     * 
     * @return the tran yyy
     */
    public String getTranYyy() {
        return tranYyy;
    }

    /**
     * Sets the tran yyy.
     * 
     * @param tranYyy
     *            the new tran yyy
     */
    public void setTranYyy(String tranYyy) {
        this.tranYyy = tranYyy;
    }

    public Rldf100mType getRldf100mObj() {
        return rldf100mObj;
    }

    public void setRldf100mObj(Rldf100mType rldf100mObj) {
        this.rldf100mObj = rldf100mObj;
    }

    public String getActionMode() {
        return actionMode;
    }

    public void setActionMode(String actionMode) {
        this.actionMode = actionMode;
    }

}
