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

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * @author marcus
 * 
 **         輸入欄位 (大戶)DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveQryInputDTO", propOrder = { "serailNo", "personId", "selected", "details" })
@XmlRootElement(name = "MoveQryInputDTO")
public class MoveQryInputDTO implements Serializable {
    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    /** 序號. */
    @XmlElement(name = "SerailNo", required = true)
    @FieldName("序號")
    private Integer serailNo = 0;

    /** 統號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 選擇. */
    @XmlElement(name = "Selected", required = true)
    @FieldName("選擇")
    private boolean selected;

    /** 資訊. */
    @XmlElement(name = "Details", required = true)
    @FieldName("資訊")
    private String details;

    public MoveQryInputDTO() {
        super();

    }

    public MoveQryInputDTO(Integer serailNo, String personId, boolean selected, String details) {
        super();
        this.serailNo = serailNo;
        this.personId = personId;
        this.selected = selected;
        this.details = details;
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
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details
     *            the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * @return the serailNo
     */
    public Integer getSerailNo() {
        return serailNo;
    }

    /**
     * @param serailNo
     *            the serailNo to set
     */
    public void setSerailNo(Integer serailNo) {
        this.serailNo = serailNo;
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected
     *            the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
