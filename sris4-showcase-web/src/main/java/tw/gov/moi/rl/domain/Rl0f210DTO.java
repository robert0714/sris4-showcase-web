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
import tw.gov.moi.domain.Rldf013dType;

/**
 * 空白國民身分證(膠膜)配賦資料查詢 DTO -Rl0f210DTO-
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f210DTO", propOrder = { "type", "assignYyymmddStart", "assignYyymmddEnd", "launchOption",
        "resultList" })
@XmlRootElement(name = "Rl0f210DTO")
public class Rl0f210DTO implements Serializable {
    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別項目 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別項目")
    private String type;

    /** 配賦日期 起 */
    @XmlElement(name = "assignYyymmddStart", required = true)
    @FieldName("配賦日期 起")
    private String assignYyymmddStart;

    /** 配賦日期 迄 */
    @XmlElement(name = "assignYyymmddEnd", required = true)
    @FieldName(" 配賦日期 迄")
    private String assignYyymmddEnd;

    /** 是否展開 */
    @XmlElement(name = "launchOption", required = true)
    @FieldName(" 是否展開 ")
    private boolean launchOption;

    /** 查詢結果 */
    @XmlElement(name = "resultList", required = true)
    @FieldName(" 查詢結果")
    private List<Rldf013dType> resultList;

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
     * @return the assignYyymmddStart
     */
    public String getAssignYyymmddStart() {
        return assignYyymmddStart;
    }

    /**
     * @param assignYyymmddStart
     *            the assignYyymmddStart to set
     */
    public void setAssignYyymmddStart(String assignYyymmddStart) {
        this.assignYyymmddStart = assignYyymmddStart;
    }

    /**
     * @return the assignYyymmddEnd
     */
    public String getAssignYyymmddEnd() {
        return assignYyymmddEnd;
    }

    /**
     * @param assignYyymmddEnd
     *            the assignYyymmddEnd to set
     */
    public void setAssignYyymmddEnd(String assignYyymmddEnd) {
        this.assignYyymmddEnd = assignYyymmddEnd;
    }

    /**
     * @return the launchOption
     */
    public boolean isLaunchOption() {
        return launchOption;
    }

    /**
     * @param launchOption
     *            the launchOption to set
     */
    public void setLaunchOption(boolean launchOption) {
        this.launchOption = launchOption;
    }

    /**
     * @return the resultList
     */
    public List<Rldf013dType> getResultList() {
        return resultList;
    }

    /**
     * @param resultList
     *            the resultList to set
     */
    public void setResultList(List<Rldf013dType> resultList) {
        this.resultList = resultList;
    }

}
