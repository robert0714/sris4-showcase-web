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
 * The Class RlRevokeNameAppDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlChangeNameAppDataDTO", propOrder = { "rlChangeNameAppDataDTO", "m10mList", "viewM10m",
        "viewPostiveApplication", "selectedM10m", "selectedPostiveApplication" })
@XmlRootElement(name = "RlChangeNameAppDataDTO")
public class RlRevokeNameAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4884607390593096837L;

    /** 更改姓名申請資料DTO. */
    @XmlElement(name = "RlChangeNameAppDataDTO")
    @FieldName("更改姓名申請資料DTO")
    private RlChangeNameAppDataDTO rlChangeNameAppDataDTO = new RlChangeNameAppDataDTO();

    /** 擬撤銷之原登記申請書紀錄清單. */
    @XmlElement(name = "M10mList")
    @FieldName("擬撤銷之原登記申請書紀錄清單")
    private List<XLDFM10M> m10mList = new ArrayList<XLDFM10M>();

    /** 檢視的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "ViewM10m")
    @FieldName("檢視的擬撤銷之原登記申請書紀錄")
    private XLDFM10M viewM10m;

    /** 檢視的擬撤銷之原登記申請書. */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 選取的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "SelectedM10m")
    @FieldName("選取的擬撤銷之原登記申請書紀錄")
    private XLDFM10M selectedM10m;

    /** 選取的擬撤銷之原登記申請書. */
    @XmlElement(name = "SelectedPostiveApplication")
    @FieldName("選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedPostiveApplication;

    /**
     * Gets the rl change name app data dto.
     * 
     * @return the rl change name app data dto
     */
    public RlChangeNameAppDataDTO getRlChangeNameAppDataDTO() {
        return rlChangeNameAppDataDTO;
    }

    /**
     * Sets the rl change name app data dto.
     * 
     * @param rlChangeNameAppDataDTO
     *            the new rl change name app data dto
     */
    public void setRlChangeNameAppDataDTO(RlChangeNameAppDataDTO rlChangeNameAppDataDTO) {
        this.rlChangeNameAppDataDTO = rlChangeNameAppDataDTO;
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
    public void setM10mList(List<XLDFM10M> m10mList) {
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
    public void setViewM10m(XLDFM10M viewM10m) {
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
    public void setViewPostiveApplication(XLDFDomainObject viewPostiveApplication) {
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
    public void setSelectedM10m(XLDFM10M selectedM10m) {
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
    public void setSelectedPostiveApplication(XLDFDomainObject selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
    }
}
