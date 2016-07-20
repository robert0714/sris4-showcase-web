/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008mType;

/**
 * The Class Rl01450EditDTO.
 * 
 * @author 1119253
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01450EditDTO", propOrder = { "rldf004mType", "allRldf008mTypes", "removeRldf008mTypes", "sendNotice" })
@XmlRootElement(name = "Rl01450Edit")
public class Rl01450EditDTO implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Rldf004mType")
    @FieldName("個人基本資料")
    private Rldf004mType rldf004mType;

    @XmlElement(name = "AllRldf008mTypes")
    @FieldName("當事人特殊註記")
    private List<Rldf008mType> allRldf008mTypes;

    @XmlElement(name = "RemoveRldf008mTypes")
    @FieldName("移除的特殊註記")
    private List<Rldf008mType> removeRldf008mTypes = new ArrayList<Rldf008mType>();

    @XmlElement(name = "SendNotice")
    @FieldName("是否通報")
    private boolean sendNotice = Boolean.FALSE;

    public Rl01450EditDTO() {
        super();
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

    public List<Rldf008mType> getAllRldf008mTypes() {
        return allRldf008mTypes;
    }

    public void setAllRldf008mTypes(List<Rldf008mType> allRldf008mTypes) {
        this.allRldf008mTypes = allRldf008mTypes;
    }

    public List<Rldf008mType> getRemoveRldf008mTypes() {
        return removeRldf008mTypes;
    }

    public void setRemoveRldf008mTypes(List<Rldf008mType> removeRldf008mTypes) {
        this.removeRldf008mTypes = removeRldf008mTypes;
    }

    public boolean isSendNotice() {
        return sendNotice;
    }

    public void setSendNotice(boolean sendNotice) {
        this.sendNotice = sendNotice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("PersonId", rldf004mType.getPersonId())
                .append("SiteId", rldf004mType.getSiteId()).append("SpecialMark", rldf004mType.getSpecialMark())
                .append("SendNotice", sendNotice).toString();
    }

}
