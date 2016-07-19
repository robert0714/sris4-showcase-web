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

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.dto.rl00001.XLDFSelectModeDomainDTO;

/**
 * MoveInRegisterDTO 個人記事與統號對應DTO(5/10)
 * 
 * @author Marcus Chen
 * 
 */

public class MoveInRegisterDTO implements Serializable {

    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "selectePersonId", required = true)
    @FieldName("國民身分證統一編號.")
    private String selectePersonId;

    /** 姓名. */
    @XmlElement(name = "selectePersonName", required = true)
    @FieldName("姓名.")
    private String selectePersonName;

    /** 挑選個人記事. */
    @XmlElement(name = "personRegisterList", required = true)
    @FieldName("挑選個人記事")
    private List<SelRegisterDTO> personRegisterList;

    /** 個人記事. */
    @XmlElement(name = "selPersonRegisterList", required = true)
    @FieldName("個人記事")
    private List<XLDFSelectModeDomainDTO<XLDFPersonNoteDTO>> selPersonRegisterList;

    /**
     * @return the selectePersonId
     */
    public String getSelectePersonId() {
        return selectePersonId;
    }

    /**
     * @param selectePersonId
     *            the selectePersonId to set
     */
    public void setSelectePersonId(String selectePersonId) {
        this.selectePersonId = selectePersonId;
    }

    /**
     * @return the selectePersonName
     */
    public String getSelectePersonName() {
        return selectePersonName;
    }

    /**
     * @param selectePersonName
     *            the selectePersonName to set
     */
    public void setSelectePersonName(String selectePersonName) {
        this.selectePersonName = selectePersonName;
    }

    /**
     * @return the personRegisterList
     */
    public List<SelRegisterDTO> getPersonRegisterList() {
        if (personRegisterList == null) {
            personRegisterList = new ArrayList<SelRegisterDTO>();
        }
        return personRegisterList;
    }

    /**
     * @param personRegisterList
     *            the personRegisterList to set
     */
    public void setPersonRegisterList(List<SelRegisterDTO> personRegisterList) {
        this.personRegisterList = personRegisterList;
    }

    /**
     * @return the selPersonRegisterList
     */
    public List<XLDFSelectModeDomainDTO<XLDFPersonNoteDTO>> getSelPersonRegisterList() {
        if (selPersonRegisterList == null) {
            selPersonRegisterList = new ArrayList<XLDFSelectModeDomainDTO<XLDFPersonNoteDTO>>();
        }
        return selPersonRegisterList;
    }

    /**
     * @param selPersonRegisterList
     *            the selPersonRegisterList to set
     */
    public void setSelPersonRegisterList(List<XLDFSelectModeDomainDTO<XLDFPersonNoteDTO>> selPersonRegisterList) {
        this.selPersonRegisterList = selPersonRegisterList;
    }

}
