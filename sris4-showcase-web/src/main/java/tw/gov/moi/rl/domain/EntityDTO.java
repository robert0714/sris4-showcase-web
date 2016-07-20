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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class EntityDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityDTO", propOrder = { "entitys" })
@XmlRootElement(name = "EntityDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class EntityDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -320484218692485858L;

    /** The entitys. */
    @XmlElement(name = "Entitys", required = true)
    @FieldName("實體")
    private List<String> entitys = new ArrayList<String>();

    /**
     * Gets the entitys.
     * 
     * @return the entitys
     */
    public List<String> getEntitys() {
        return entitys;
    }

    /**
     * Sets the entitys.
     * 
     * @param entitys
     *            the new entitys
     */
    public void setEntitys(final List<String> entitys) {
        this.entitys = entitys;
    }
}
