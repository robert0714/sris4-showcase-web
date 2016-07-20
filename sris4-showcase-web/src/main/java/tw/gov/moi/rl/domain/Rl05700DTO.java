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

import org.apache.commons.lang3.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.domain.DateBean;
import tw.gov.moi.rs.domain.DateBean.Chronology;

/**
 * 列印他所辦理申請書DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05700DTO", propOrder = { "begin", "end" })
@XmlRootElement(name = "rl05700DTO")
public class Rl05700DTO implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 登記日期時間(起). */
    @XmlElement(name = "Begin", required = true)
    @FieldName("登記日期時間(起)")
    private DateBean begin = new DateBean(StringUtils.EMPTY, "000000", false, Chronology.TW);

    /** 登記日期時間(迄). */
    @XmlElement(name = "End", required = true)
    @FieldName("登記日期時間(迄)")
    private DateBean end = new DateBean(StringUtils.EMPTY, "235959", false, Chronology.TW);

    /**
     * 取得登記日期時間(起).
     * 
     * @return 登記日期時間(起)
     */
    public DateBean getBegin() {
        return begin;
    }

    /**
     * 取得登記日期時間(迄).
     * 
     * @return 登記日期時間(迄)
     */
    public DateBean getEnd() {
        return end;
    }

    /**
     * 設定登記日期時間(起).
     * 
     * @param begin
     */
    public void setBegin(final DateBean begin) {
        this.begin = begin;
    }

    /**
     * 設定登記日期時間(終止).
     * 
     * @param end
     *            登記日期時間(終止)
     */
    public void setEnd(final DateBean end) {
        this.end = end;
    }

}
