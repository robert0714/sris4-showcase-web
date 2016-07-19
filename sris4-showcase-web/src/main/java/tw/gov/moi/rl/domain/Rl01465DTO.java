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

/**
 * The Class Rl01465DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01465DTO", propOrder = { "selectedArray", "rl01465List", "confirmMessage" })
@XmlRootElement(name = "Rl01465DTO")
public class Rl01465DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 勾選新增逕遷戶政事務所人口清單. */
    @XmlElement(name = "SelectedArray")
    @FieldName("勾選新增逕遷戶政事務所人口清單")
    private Rl01465QueryDTO[] selectedArray;

    /** 新增逕遷戶政事務所人口清單. */
    @XmlElement(name = "Rl01465List")
    @FieldName("新增逕遷戶政事務所人口清單")
    private List<Rl01465QueryDTO> rl01465List;

    /** 通報詢問訊息. */
    @XmlElement(name = "ConfirmMessage")
    @FieldName("通報詢問訊息")
    private String confirmMessage;

    /**
     * Gets the rl01465 list.
     * 
     * @return the rl01465 list
     */
    public List<Rl01465QueryDTO> getRl01465List() {
        if (rl01465List == null) {
            rl01465List = new ArrayList<Rl01465QueryDTO>();
        }
        return rl01465List;
    }

    /**
     * Sets the rl01465 list.
     * 
     * @param rl01465List
     *            the new rl01465 list
     */
    public void setRl01465List(List<Rl01465QueryDTO> rl01465List) {
        this.rl01465List = rl01465List;
    }

    /**
     * Gets the selected array.
     * 
     * @return the selected array
     */
    public Rl01465QueryDTO[] getSelectedArray() {
        return selectedArray;
    }

    /**
     * Sets the selected array.
     * 
     * @param selectedArray
     *            the new selected array
     */
    public void setSelectedArray(Rl01465QueryDTO[] selectedArray) {
        this.selectedArray = selectedArray;
    }

    /**
     * Gets the confirm message.
     * 
     * @return the confirm message
     */
    public String getConfirmMessage() {
        return confirmMessage;
    }

    /**
     * Sets the confirm message.
     * 
     * @param confirmMessage
     *            the new confirm message
     */
    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

}
