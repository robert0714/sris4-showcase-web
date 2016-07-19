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
 * The Class Rl0f120DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0f120DTO", propOrder = { "Type", "ConfirmMessage", "SaveList" })
@XmlRootElement(name = "Rl0f120DTO")
public class Rl0f120DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    // ㄥivate String confirmMessage;

    /** 存檔訊息 */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("存檔清單")
    private List<Rl0f120SaveDTO> saveList;

    // public String getConfirmMessage() {
    // return confirmMessage;
    // }

    // public void setConfirmMessage(final String confirmMessage) {
    // this.confirmMessage = confirmMessage;
    // }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public List<Rl0f120SaveDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(final List<Rl0f120SaveDTO> saveList) {
        this.saveList = saveList;
    }

}
