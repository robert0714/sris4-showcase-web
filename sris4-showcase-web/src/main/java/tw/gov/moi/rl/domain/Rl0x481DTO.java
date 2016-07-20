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

/**
 * 輔助登記申請書職權更正 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x481DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "title",
        "reason", "commononType", "lockData", "verify", "checkCode", "unLockData" })
@XmlRootElement(name = "Rl0x481DTO")
public class Rl0x481DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4904475503980388417L;

    /** 主檔. */
    @XmlElement(name = "MainDTO")
    @FieldName("主檔")
    private Rl0x001DTO mainDTO;

    /** 編輯資料. */
    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    /** 查詢畫面. */
    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    /** 來源資料. */
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Object selectData = new Object();

    /** 查詢結果. */
    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Object> resutlts = new ArrayList<Object>();

    /** 標題. */
    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    /** 更正原因. */
    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = "";

    /** R檔預設值. */
    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Object commononType = null;

    /** 愈鎖定之資料. */
    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Object lockData = null;

    /** The verify. */
    @XmlElement(name = "verify")
    @FieldName("是否驗證過")
    private boolean verify = false;

    /** 檢查是否資料有變化. */
    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = "";

    /** 愈解鎖之鎖定之資料. */
    @XmlElement(name = "UnLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Object unLockData = null;

    /**
     * Gets the main dto.
     * 
     * @return the main dto
     */
    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    /**
     * Sets the main dto.
     * 
     * @param mainDTO
     *            the new main dto
     */
    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    /**
     * Gets the edits the result.
     * 
     * @return the edits the result
     */
    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    /**
     * Sets the edits the result.
     * 
     * @param editResult
     *            the new edits the result
     */
    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    /**
     * Gets the quert dto.
     * 
     * @return the quert dto
     */
    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    /**
     * Sets the quert dto.
     * 
     * @param quertDto
     *            the new quert dto
     */
    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    /**
     * Gets the select data.
     * 
     * @return the select data
     */
    public Object getSelectData() {
        return selectData;
    }

    /**
     * Sets the select data.
     * 
     * @param selectData
     *            the new select data
     */
    public void setSelectData(Object selectData) {
        this.selectData = selectData;
    }

    /**
     * Gets the resutlts.
     * 
     * @return the resutlts
     */
    public List<Object> getResutlts() {
        return resutlts;
    }

    /**
     * Sets the resutlts.
     * 
     * @param resutlts
     *            the new resutlts
     */
    public void setResutlts(List<Object> resutlts) {
        this.resutlts = resutlts;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param title
     *            the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the reason.
     * 
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the reason.
     * 
     * @param reason
     *            the new reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Gets the commonon type.
     * 
     * @return the commonon type
     */
    public Object getCommononType() {
        return commononType;
    }

    /**
     * Sets the commonon type.
     * 
     * @param commononType
     *            the new commonon type
     */
    public void setCommononType(Object commononType) {
        this.commononType = commononType;
    }

    /**
     * Gets the lock data.
     * 
     * @return the lock data
     */
    public Object getLockData() {
        return lockData;
    }

    /**
     * Sets the lock data.
     * 
     * @param lockData
     *            the new lock data
     */
    public void setLockData(Object lockData) {
        this.lockData = lockData;
    }

    /**
     * Checks if is verify.
     * 
     * @return true, if is verify
     */
    public boolean isVerify() {
        return verify;
    }

    /**
     * Sets the verify.
     * 
     * @param verify
     *            the new verify
     */
    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    /**
     * Gets the check code.
     * 
     * @return the check code
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * Sets the check code.
     * 
     * @param checkCode
     *            the new check code
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * Gets the un lock data.
     * 
     * @return the un lock data
     */
    public Object getUnLockData() {
        return unLockData;
    }

    /**
     * Sets the un lock data.
     * 
     * @param unLockData
     *            the new un lock data
     */
    public void setUnLockData(Object unLockData) {
        this.unLockData = unLockData;
    }

}
