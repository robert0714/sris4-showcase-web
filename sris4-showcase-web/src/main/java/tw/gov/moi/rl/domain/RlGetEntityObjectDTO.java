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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class RlGetEntityObjectDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetEntityObjectDTO", propOrder = { "entity" })
@XmlRootElement(name = "RlGetEntityObjectDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetEntityObjectDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2221188600602952191L;

    /** The entity. */
    @XmlElement(name = "Entity")
    @FieldName("表格")
    private String entity;

    /**
     * Gets the entity.
     * 
     * @return the entity
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the entity.
     * 
     * @param entity
     *            the new entity
     */
    public void setEntity(final String entity) {
        this.entity = entity;
    }
}
