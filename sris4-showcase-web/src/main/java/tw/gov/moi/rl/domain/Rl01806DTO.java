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
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;

/**
 * 父姓名更正撤銷登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01806DTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl01806AppDataDTO",
        "m10mList", "viewM10m", "viewPostiveApplication", "selectedM10m", "selectedPostiveApplication" })
@XmlRootElement(name = "Rl01806DTO")
public class Rl01806DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6149081884247896370L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 父姓名更正撤銷登記AppDataDTO. */
    @XmlElement(name = "Rl01806AppDataDTO")
    @FieldName("父姓名更正撤銷登記AppDataDTO")
    private Rl01806AppDataDTO rl01806AppDataDTO = new Rl01806AppDataDTO();

    /** 擬撤銷之原登記申請書紀錄清單. */
    @XmlElement(name = "M10mList", required = true)
    @FieldName("擬撤銷之原登記申請書紀錄清單")
    private List<XLDFM10M> m10mList = new ArrayList<XLDFM10M>();

    /** 檢視的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "ViewM10m", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書紀錄")
    private XLDFM10M viewM10m;

    /** 檢視的擬撤銷之原登記申請書. */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 選取的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "SelectedM10m", required = true)
    @FieldName("選取的擬撤銷之原登記申請書紀錄")
    private XLDFM10M selectedM10m;

    /** 選取的擬撤銷之原登記申請書. */
    @XmlElement(name = "SelectedPostiveApplication", required = true)
    @FieldName("選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedPostiveApplication;

    /**
     * Gets the household operation dto.
     * 
     * @return the household operation dto
     */
    public HouseholdOperationDTO getHouseholdOperationDTO() {
        return householdOperationDTO;
    }

    /**
     * Sets the household operation dto.
     * 
     * @param householdOperationDTO
     *            the new household operation dto
     */
    public void setHouseholdOperationDTO(final HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

    /**
     * Gets the household app data dto.
     * 
     * @return the household app data dto
     */
    public HouseholdAppDataDTO getHouseholdAppDataDTO() {
        return householdAppDataDTO;
    }

    /**
     * Sets the household app data dto.
     * 
     * @param householdAppDataDTO
     *            the new household app data dto
     */
    public void setHouseholdAppDataDTO(final HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }

    /**
     * Gets the rl01806 app data dto.
     * 
     * @return the rl01806 app data dto
     */
    public Rl01806AppDataDTO getRl01806AppDataDTO() {
        return rl01806AppDataDTO;
    }

    /**
     * Sets the rl01806 app data dto.
     * 
     * @param rl01806AppDataDTO
     *            the new rl01806 app data dto
     */
    public void setRl01806AppDataDTO(final Rl01806AppDataDTO rl01806AppDataDTO) {
        this.rl01806AppDataDTO = rl01806AppDataDTO;
    }

    /**
     * Gets the m10m list.
     * 
     * @return the m10m list
     */
    public List<XLDFM10M> getM10mList() {
        return m10mList;
    }

    /**
     * Sets the m10m list.
     * 
     * @param m10mList
     *            the new m10m list
     */
    public void setM10mList(final List<XLDFM10M> m10mList) {
        this.m10mList = m10mList;
    }

    /**
     * Gets the view m10m.
     * 
     * @return the view m10m
     */
    public XLDFM10M getViewM10m() {
        return viewM10m;
    }

    /**
     * Sets the view m10m.
     * 
     * @param viewM10m
     *            the new view m10m
     */
    public void setViewM10m(final XLDFM10M viewM10m) {
        this.viewM10m = viewM10m;
    }

    /**
     * Gets the view postive application.
     * 
     * @return the view postive application
     */
    public XLDFDomainObject getViewPostiveApplication() {
        return viewPostiveApplication;
    }

    /**
     * Sets the view postive application.
     * 
     * @param viewPostiveApplication
     *            the new view postive application
     */
    public void setViewPostiveApplication(final XLDFDomainObject viewPostiveApplication) {
        this.viewPostiveApplication = viewPostiveApplication;
    }

    /**
     * Gets the selected m10m.
     * 
     * @return the selected m10m
     */
    public XLDFM10M getSelectedM10m() {
        return selectedM10m;
    }

    /**
     * Sets the selected m10m.
     * 
     * @param selectedM10m
     *            the new selected m10m
     */
    public void setSelectedM10m(final XLDFM10M selectedM10m) {
        this.selectedM10m = selectedM10m;
    }

    /**
     * Gets the selected postive application.
     * 
     * @return the selected postive application
     */
    public XLDFDomainObject getSelectedPostiveApplication() {
        return selectedPostiveApplication;
    }

    /**
     * Sets the selected postive application.
     * 
     * @param selectedPostiveApplication
     *            the new selected postive application
     */
    public void setSelectedPostiveApplication(final XLDFDomainObject selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
    }
}
