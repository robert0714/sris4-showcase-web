/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * @author marcus
 * 
 */
public class MassMoveCommonParamDTO {

    // rlde490w
    private String oldSiteId;

    private String newSiteId;

    private String oldVillage;

    private String newVillage;

    private String newAdminOfficeCode;

    private String newAreaCode;

    private String oldNeighbor;

    private String newNeighbor;

    private String removeYyymmdd;

    private String oldAreaCode;
    
    private String removeTime;

    private String registerYyymmdd;

    private String registerTime;

    public MassMoveCommonParamDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the newAdminOfficeCode
     */
    public String getNewAdminOfficeCode() {
        return newAdminOfficeCode;
    }

    /**
     * @param newAdminOfficeCode
     *            the newAdminOfficeCode to set
     */
    public void setNewAdminOfficeCode(String newAdminOfficeCode) {
        this.newAdminOfficeCode = newAdminOfficeCode;
    }

    /**
     * @return the newAreaCode
     */
    public String getNewAreaCode() {
        return newAreaCode;
    }

    /**
     * @param newAreaCode
     *            the newAreaCode to set
     */
    public void setNewAreaCode(String newAreaCode) {
        this.newAreaCode = newAreaCode;
    }

    /**
     * @return the oldSiteId
     */
    public String getOldSiteId() {
        return oldSiteId;
    }

    /**
     * @param oldSiteId
     *            the oldSiteId to set
     */
    public void setOldSiteId(String oldSiteId) {
        this.oldSiteId = oldSiteId;
    }

    /**
     * @return the newSiteId
     */
    public String getNewSiteId() {
        return newSiteId;
    }

    /**
     * @param newSiteId
     *            the newSiteId to set
     */
    public void setNewSiteId(String newSiteId) {
        this.newSiteId = newSiteId;
    }

    /**
     * @return the oldVillage
     */
    public String getOldVillage() {
        return oldVillage;
    }

    /**
     * @param oldVillage
     *            the oldVillage to set
     */
    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    /**
     * @return the newVillageO
     */
    public String getNewVillage() {
        return newVillage;
    }

    /**
     * @param newVillage
     *            the newVillage to set
     */
    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    /**
     * @return the oldNeighbor
     */
    public String getOldNeighbor() {
        return oldNeighbor;
    }

    /**
     * @param oldNeighbor
     *            the oldNeighbor to set
     */
    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    /**
     * @return the newNeighbor
     */
    public String getNewNeighbor() {
        return newNeighbor;
    }

    /**
     * @param newNeighbor
     *            the newNeighbor to set
     */
    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
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
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * @return the registerYyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * @param registerYyymmdd
     *            the registerYyymmdd to set
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * @return the registerTime
     */
    public String getRegisterTime() {
        return registerTime;
    }

    public String getOldAreaCode() {
        return oldAreaCode;
    }

    public void setOldAreaCode(String oldAreaCode) {
        this.oldAreaCode = oldAreaCode;
    }

    /**
     * @param registerTime
     *            the registerTime to set
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

}
