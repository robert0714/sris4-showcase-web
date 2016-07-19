/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf022dType;

/**
 * 空白國民身分證及膠膜作廢狀況登錄 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d150DTO", propOrder = { "type", "no", "personId", "useYyymmdd", "useCardNoFlag", "resultShowList",
        "notUseFlag", "use2dFlag", "use22dFlag", "rldf002dList", "rldf012dList", "rldf022dList", "isNotEnter" })
@XmlRootElement(name = "Rl0d150DTO")
public class Rl0d150DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 號碼 */
    @XmlElement(name = "No", required = true)
    @FieldName("號碼")
    private String no;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 使用日期 */
    @XmlElement(name = "UseYyymmdd", required = true)
    @FieldName("使用日期")
    private String useYyymmdd;

    /** 是否已處理空白證註記 */
    @XmlElement(name = "UseCardNoFlag", required = true)
    @FieldName("是否已處理空白證註記")
    private String useCardNoFlag;

    /** 是否已處理膠膜註記 */
    @XmlElement(name = "UseCellophaneNoFlag", required = true)
    @FieldName("是否已處理膠膜註記")
    private String useCellophaneNoFlag;

    /** 是否已處理膠膜註記 */
    @XmlElement(name = "NotUseFlag", required = true)
    @FieldName("是否已處理膠膜註記")
    private String notUseFlag;

    /** 是否處理2D註記 */
    @XmlElement(name = "Use2dFlag", required = true)
    @FieldName("是否已處理膠膜註記")
    private String use2dFlag;

    /** 是否已處理膠膜註記 */
    @XmlElement(name = "Use22dFlag", required = true)
    @FieldName("是否處理22D註記")
    private String use22dFlag;

    /** 查詢結果顯示清單 */
    @XmlElement(name = "ResultShowList", required = true)
    @FieldName("查詢結果顯示清單")
    private List<Rl0d150ResultDTO> resultShowList;

    /** rldf002dList */
    @XmlElement(name = "Rldf002dList", required = true)
    @FieldName("rldf002dList")
    private List<Rldf002dType> rldf002dList;
    /** rldf012dList */
    @XmlElement(name = "Rldf012dList", required = true)
    @FieldName("rldf012dList")
    private List<Rldf012dType> rldf012dList;
    /** rldf022dList */
    @XmlElement(name = "Rldf022dList", required = true)
    @FieldName("rldf022dList")
    private List<Rldf022dType> rldf022dList;

    /** isNotEnter */
    @XmlElement(name = "isNotEnter")
    @FieldName("isNotEnter")
    private Boolean isNotEnter = false;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     *            the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the useYyymmdd
     */
    public String getUseYyymmdd() {
        return useYyymmdd;
    }

    /**
     * @param useYyymmdd
     *            the useYyymmdd to set
     */
    public void setUseYyymmdd(String useYyymmdd) {
        this.useYyymmdd = useYyymmdd;
    }

    /**
     * @category 是否已處理空白證註記
     * @return the useCardNoFlag
     */
    public String getUseCardNoFlag() {
        return useCardNoFlag;
    }

    /**
     * @category 是否已處理空白證註記
     * @param useCardNoFlag
     *            the useCardNoFlag to set
     */
    public void setUseCardNoFlag(String useCardNoFlag) {
        this.useCardNoFlag = useCardNoFlag;
    }

    /**
     * @return the useCellophaneNoFlag
     */
    public String getUseCellophaneNoFlag() {
        return useCellophaneNoFlag;
    }

    /**
     * @param useCellophaneNoFlag
     *            the useCellophaneNoFlag to set
     */
    public void setUseCellophaneNoFlag(String useCellophaneNoFlag) {
        this.useCellophaneNoFlag = useCellophaneNoFlag;
    }

    /**
     * @return the notUseFlag
     */
    public String getNotUseFlag() {
        return notUseFlag;
    }

    /**
     * @param notUseFlag
     *            the notUseFlag to set
     */
    public void setNotUseFlag(String notUseFlag) {
        this.notUseFlag = notUseFlag;
    }

    /**
     * @category 是否已處理膠膜註記
     * @return the use2dFlag
     */
    public String getUse2dFlag() {
        return use2dFlag;
    }

    /**
     * @category 是否已處理膠膜註記
     * @param use2dFlag
     *            the use2dFlag to set
     */
    public void setUse2dFlag(String use2dFlag) {
        this.use2dFlag = use2dFlag;
    }

    /**
     * @return the use22dFlag
     */
    public String getUse22dFlag() {
        return use22dFlag;
    }

    /**
     * @param use22dFlag
     *            the use22dFlag to set
     */
    public void setUse22dFlag(String use22dFlag) {
        this.use22dFlag = use22dFlag;
    }

    /**
     * @return the resultShowList
     */
    public List<Rl0d150ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0d150ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
    }

    /**
     * @return the rldf002dList
     */
    public List<Rldf002dType> getRldf002dList() {
        return rldf002dList;
    }

    /**
     * @param rldf002dList
     *            the rldf002dList to set
     */
    public void setRldf002dList(List<Rldf002dType> rldf002dList) {
        this.rldf002dList = rldf002dList;
    }

    /**
     * @return the rldf012dList
     */
    public List<Rldf012dType> getRldf012dList() {
        return rldf012dList;
    }

    /**
     * @param rldf012dList
     *            the rldf012dList to set
     */
    public void setRldf012dList(List<Rldf012dType> rldf012dList) {
        this.rldf012dList = rldf012dList;
    }

    /**
     * @return the rldf022dList
     */
    public List<Rldf022dType> getRldf022dList() {
        return rldf022dList;
    }

    /**
     * @param rldf022dList
     *            the rldf022dList to set
     */
    public void setRldf022dList(List<Rldf022dType> rldf022dList) {
        this.rldf022dList = rldf022dList;
    }

    public Boolean getIsNotEnter() {
        return isNotEnter;
    }

    public void setIsNotEnter(Boolean isNotEnter) {
        this.isNotEnter = isNotEnter;
    }

}
