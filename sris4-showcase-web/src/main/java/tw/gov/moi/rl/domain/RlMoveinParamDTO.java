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

import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlMoveinParamDTO", propOrder = { "personIds", "removeYyymmdd", "removeHhmmss", "siteId" })
@XmlRootElement(name = "RlMoveinParamDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlMoveinParamDTO implements Serializable {

    private static final long serialVersionUID = -7056475897502797160L;

    /** The person id. */
    @XmlElement(name = "PersonIds", required = false)
    private List<String> personIds;
    /** The RemoveYyymmdd */
    @XmlElement(name = "RemoveYyymmdd", required = false)
    private String removeYyymmdd;
    /** The RemoveHhmmss . */
    @XmlElement(name = "RemoveHhmmss", required = false)
    private String removeHhmmss;
    /** The RemoveHhmmss . */
    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public RlMoveinParamDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the personIds
     */
    public List<String> getPersonIds() {
        return personIds;
    }

    /**
     * @param personIds
     *            the personIds to set
     */
    public void setPersonIds(List<String> personIds) {
        this.personIds = personIds;
    }

    /**
     * @return the removeYyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * @param removeYyymmdd
     *            the removeYyymmdd to set
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * @return the removeHhmmss
     */
    public String getRemoveHhmmss() {
        return removeHhmmss;
    }

    /**
     * @param removeHhmmss
     *            the removeHhmmss to set
     */
    public void setRemoveHhmmss(String removeHhmmss) {
        this.removeHhmmss = removeHhmmss;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
