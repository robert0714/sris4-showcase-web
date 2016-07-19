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
 * The Class Rl01410DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01410DTO", propOrder = { "PersonId", "Rldf001mObj", "Rldf004mObj", "Rl01410EditDto", "DeleteArr",
        "EditList" })
@XmlRootElement(name = "Rl01410DTO")
public class Rl01410DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 編修項目 */
    @XmlElement(name = "Rl01410EditDto", required = true)
    @FieldName("編修項目")
    private Rl01410EditDTO rl01410EditDto;

    /** 刪除項目 */
    @XmlElement(name = "DeleteArr", required = true)
    @FieldName("刪除項目")
    private Rl01410EditDTO[] deleteArr;

    /** 新增清單 */
    @XmlElement(name = "EditList", required = true)
    @FieldName("新增清單")
    private List<Rl01410EditDTO> editList;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public Rl01410EditDTO getRl01410EditDto() {
        return rl01410EditDto;
    }

    public void setRl01410EditDto(final Rl01410EditDTO rl01410EditDto) {
        this.rl01410EditDto = rl01410EditDto;
    }

    public List<Rl01410EditDTO> getEditList() {
        return editList;
    }

    public void setEditList(final List<Rl01410EditDTO> editList) {
        this.editList = editList;
    }

    public Rl01410EditDTO[] getDeleteArr() {
        return deleteArr;
    }

    public void setDeleteArr(final Rl01410EditDTO[] deleteArr) {
        this.deleteArr = deleteArr;
    }

}
