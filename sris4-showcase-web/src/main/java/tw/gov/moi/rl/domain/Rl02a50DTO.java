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
 * The Class Rl02a50DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a50DTO", propOrder = { "changeType", "personId", "expireYyymmdd", "expireHhmmss", "checkResult",
        "rl02a50ProcessDataDTOs", "selectedData" })
@XmlRootElement(name = "Rl02a50DTO")
public class Rl02a50DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -9140927363846807736L;

    /** 異動類別. */
    @XmlElement(name = "ChangeType")
    @FieldName("異動類別")
    private String changeType = RlConstant.STRING_A;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 註銷日期. */
    @XmlElement(name = "ExpireYyymmdd")
    @FieldName("註銷日期")
    private String expireYyymmdd;

    /** 註銷時間. */
    @XmlElement(name = "ExpireHhmmss")
    @FieldName("註銷時間")
    private String expireHhmmss;

    /** 檢查結果. */
    @XmlElement(name = "CheckResult")
    @FieldName("檢查結果")
    private String checkResult;

    /** The rl02a50 process data dtos. */
    @XmlElement(name = "Rl02a50ProcessDataDTOs")
    @FieldName("processDataDTOs")
    private List<Rl02a50ProcessDataDTO> rl02a50ProcessDataDTOs = new ArrayList<Rl02a50ProcessDataDTO>();

    /** The selected data. */
    @XmlElement(name = "SelectedData")
    @FieldName("selectedData")
    private Rl02a50ProcessDataDTO[] selectedData = null;

    /**
     * Gets the change type.
     * 
     * @return the change type
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the change type.
     * 
     * @param changeType
     *            the new change type
     */
    public void setChangeType(final String changeType) {
        this.changeType = changeType;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the expire yyymmdd.
     * 
     * @return the expire yyymmdd
     */
    public String getExpireYyymmdd() {
        return expireYyymmdd;
    }

    /**
     * Sets the expire yyymmdd.
     * 
     * @param expireYyymmdd
     *            the new expire yyymmdd
     */
    public void setExpireYyymmdd(final String expireYyymmdd) {
        this.expireYyymmdd = expireYyymmdd;
    }

    /**
     * Gets the expire hhmmss.
     * 
     * @return the expire hhmmss
     */
    public String getExpireHhmmss() {
        return expireHhmmss;
    }

    /**
     * Sets the expire hhmmss.
     * 
     * @param expireHhmmss
     *            the new expire hhmmss
     */
    public void setExpireHhmmss(final String expireHhmmss) {
        this.expireHhmmss = expireHhmmss;
    }

    /**
     * Gets the check result.
     * 
     * @return the check result
     */
    public String getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the check result.
     * 
     * @param checkResult
     *            the new check result
     */
    public void setCheckResult(final String checkResult) {
        this.checkResult = checkResult;
    }

    /**
     * Gets the rl02a50 process data dt os.
     * 
     * @return the rl02a50 process data dt os
     */
    public List<Rl02a50ProcessDataDTO> getRl02a50ProcessDataDTOs() {
        return rl02a50ProcessDataDTOs;
    }

    /**
     * Sets the rl02a50 process data dt os.
     * 
     * @param rl02a50ProcessDataDTOs
     *            the new rl02a50 process data dt os
     */
    public void setRl02a50ProcessDataDTOs(final List<Rl02a50ProcessDataDTO> rl02a50ProcessDataDTOs) {
        this.rl02a50ProcessDataDTOs = rl02a50ProcessDataDTOs;
    }

    /**
     * Gets the selected data.
     * 
     * @return the selected data
     */
    public Rl02a50ProcessDataDTO[] getSelectedData() {
        return selectedData;
    }

    /**
     * Sets the selected data.
     * 
     * @param selectedData
     *            the new selected data
     */
    public void setSelectedData(final Rl02a50ProcessDataDTO[] selectedData) {
        this.selectedData = selectedData;
    }
}
