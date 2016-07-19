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

/**
 * The Class Rl01471DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01471DTO", propOrder = { "personId", "rl01471EditDto", "deleteArr", "editList" })
@XmlRootElement(name = "Rl01471DTO")
public class Rl01471DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 編修項目 */
    @XmlElement(name = "Rl01471EditDto", required = true)
    @FieldName("編修項目")
    private Rl01471EditDTO rl01471EditDto;

    /** 刪除項目 */
    @XmlElement(name = "DeleteArr", required = true)
    @FieldName("刪除項目")
    private Rl01471EditDTO[] deleteArr;

    /** 新增清單 */
    @XmlElement(name = "EditList", required = true)
    @FieldName("新增清單")
    private List<Rl01471EditDTO> editList;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public Rl01471EditDTO getRl01471EditDto() {
        return rl01471EditDto;
    }

    public void setRl01471EditDto(final Rl01471EditDTO rl01471EditDto) {
        this.rl01471EditDto = rl01471EditDto;
    }

    public List<Rl01471EditDTO> getEditList() {
        return editList;
    }

    public void setEditList(final List<Rl01471EditDTO> editList) {
        this.editList = editList;
    }

    public Rl01471EditDTO[] getDeleteArr() {
        return deleteArr;
    }

    public void setDeleteArr(final Rl01471EditDTO[] deleteArr) {
        this.deleteArr = deleteArr;
    }
}
