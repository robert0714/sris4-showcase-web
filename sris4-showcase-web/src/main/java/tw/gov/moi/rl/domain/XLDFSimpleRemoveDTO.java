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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * 除戶簿頁DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFSimpleRemoveDTO", propOrder = { "removeYyymmdd", "removeTime" })
public class XLDFSimpleRemoveDTO implements Serializable, XLDFRemoveDTO {

    private static final long serialVersionUID = 1L;

    /** 除戶日期 */
    @XmlElement(name = "RemoveYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間 */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    public XLDFSimpleRemoveDTO(String removeYyymmdd, String removeTime) {
        super();
        this.removeYyymmdd = removeYyymmdd;
        this.removeTime = removeTime;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

}
