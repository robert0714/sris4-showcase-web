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
import tw.gov.moi.domain.Redf023mType;

/**
 * The Class Rl03410DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03410DTO", propOrder = { "ProgramId", "RunDateBegin", "RunDateEnd", "Rl03400ResultList", "WkId" })
@XmlRootElement(name = "Rl03410DTO")
public class Rl03410DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 程式代號 */
    @FieldName("程式代號")
    @XmlElement(name = "ProgramId")
    private String programId;

    /** 執行日期(起) */
    @FieldName("執行日期(起)")
    @XmlElement(name = "RunDateBegin")
    private String runDateBegin;

    /** 執行日期(迄) */
    @FieldName("執行日期(迄)")
    @XmlElement(name = "RunDateEnd")
    private String runDateEnd;

    /** 批次作業處理狀況 */
    @FieldName("批次作業處理狀況 ")
    @XmlElement(name = "Rl03400ResultList")
    private List<Redf023mType> rl03410ResultList = new ArrayList<Redf023mType>();

    /** 工作站 */
    @FieldName("工作站")
    @XmlElement(name = "WkId")
    private String wkId;

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getRunDateBegin() {
        return runDateBegin;
    }

    public void setRunDateBegin(String runDateBegin) {
        this.runDateBegin = runDateBegin;
    }

    public String getRunDateEnd() {
        return runDateEnd;
    }

    public void setRunDateEnd(String runDateEnd) {
        this.runDateEnd = runDateEnd;
    }

    public String getWkId() {
        return wkId;
    }

    public void setWkId(String wkId) {
        this.wkId = wkId;
    }

    public List<Redf023mType> getRl03410ResultList() {
        return rl03410ResultList;
    }

    public void setRl03410ResultList(List<Redf023mType> rl03410ResultList) {
        this.rl03410ResultList = rl03410ResultList;
    }

}
