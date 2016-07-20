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

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.dto.PersonImageDTO;

/**
 * 歷史影像查詢DTO.
 * 
 * @author Viva-Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03800DTO", propOrder = {  "personId", "imageHistoryList" })
@XmlRootElement(name = "Rl03800DTO")
public class Rl03800DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 歷史影像清單. */
    @XmlElement(name = "ImageHistoryList")
    @FieldName("歷史影像清單")
    private List<PersonImageDTO> imageHistoryList = new ArrayList<PersonImageDTO>();

   

    public String getPersonId() {
        return personId;
    }



    public void setPersonId(String personId) {
        this.personId = personId;
    }



    public List<PersonImageDTO> getImageHistoryList() {
        return imageHistoryList;
    }



    public void setImageHistoryList(List<PersonImageDTO> imageHistoryList) {
        this.imageHistoryList = imageHistoryList;
    }



    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}