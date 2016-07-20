/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * 
 * @author marcus
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masMoveRemoveInfoDTO", propOrder = { "xldfName", "rldfName", "hName", "removeType", "specialNotice" })
@XmlRootElement(name = "MasMoveRemoveInfoDTO")
public class MasMoveRemoveInfoDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** xldf類別名稱 */
    @XmlElement(name = "XldfName", required = true)
    @FieldName("xldf類別名稱")
    private String xldfName;

    /** rldf類別名稱 */
    @XmlElement(name = "RldfName", required = true)
    @FieldName("rldf類別名稱")
    private String rldfName;

    /** 除戶類別名稱 */
    @XmlElement(name = "hName", required = true)
    @FieldName("除戶類別名稱")
    private String hName;

    /** 除戶種類 : L:light A: all */
    @XmlElement(name = "removeType", required = true)
    @FieldName("除戶種類")
    private String removeType;

    /** 通報類別 */
    @XmlElement(name = "noticeType", required = true)
    @FieldName("通報類別")
    private String noticeType;

    /** 處理類別 要不要做H 還是直接D M擋 0:做H 1:只刪除M檔 */
    @XmlElement(name = "removeProcessType", required = true)
    @FieldName("處理類別")
    private String removeProcessType;

    /** 特殊通報: */
    @XmlElement(name = "specialNotice", required = true)
    @FieldName("特殊通報")
    private SpecialNoticeParam specialNotice;

    public MasMoveRemoveInfoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MasMoveRemoveInfoDTO(String xldfName, String rldfName, String hName, String removeType, String noticeType,
            String removeProcessType, SpecialNoticeParam specialNotice) {
        super();
        this.xldfName = xldfName;
        this.rldfName = rldfName;
        this.hName = hName;
        this.removeType = removeType;
        this.noticeType = noticeType;
        this.removeProcessType = removeProcessType;
        this.specialNotice = specialNotice;
    }

    /**
     * @return the xldfName
     */
    public String getXldfName() {
        return xldfName;
    }

    /**
     * @param xldfName
     *            the xldfName to set
     */
    public void setXldfName(String xldfName) {
        this.xldfName = xldfName;
    }

    /**
     * @return the rldfName
     */
    public String getRldfName() {
        return rldfName;
    }

    /**
     * @param rldfName
     *            the rldfName to set
     */
    public void setRldfName(String rldfName) {
        this.rldfName = rldfName;
    }

    /**
     * @return the hName
     */
    public String gethName() {
        return hName;
    }

    /**
     * @param hName
     *            the hName to set
     */
    public void sethName(String hName) {
        this.hName = hName;
    }

    /**
     * @return the removeType
     */
    public String getRemoveType() {
        return removeType;
    }

    /**
     * @param removeType
     *            the removeType to set
     */
    public void setRemoveType(String removeType) {
        this.removeType = removeType;
    }

    /**
     * @return the specialNotice
     */
    public SpecialNoticeParam getSpecialNotice() {
        return specialNotice;
    }

    /**
     * @param specialNotice
     *            the specialNotice to set
     */
    public void setSpecialNotice(SpecialNoticeParam specialNotice) {
        this.specialNotice = specialNotice;
    }

    /**
     * @return the noticeType
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * @param noticeType
     *            the noticeType to set
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * @return the removeProcessType
     */
    public String getRemoveProcessType() {
        return removeProcessType;
    }

    /**
     * @param removeProcessType
     *            the removeProcessType to set
     */
    public void setRemoveProcessType(String removeProcessType) {
        this.removeProcessType = removeProcessType;
    }

}
