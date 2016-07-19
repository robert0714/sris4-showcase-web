/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.gov.moi.domain.Rlde492wType;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * @author marcus
 * 
 */
public class MasMoveResultDTO {

    private List<Object> insertEntities;

    private Map<String, List<String>> deletedSql;

    private List<Rlde492wType> insertRecords;

    private List<Object> deleteRecords;

    private List<ObnfDTO> onbfDTOs;

    private String registerYyymmdd;

    private String registerTime;

    private String newSiteId;

    private String oriSiteId;

    private Integer maleCount = 0;

    private Integer femaleCount = 0;

    public MasMoveResultDTO(List<Object> insertEntities, List<Rlde492wType> insertRecords, List<Object> deleteRecords,
            List<ObnfDTO> onbfDTOs) {
        super();
        this.insertEntities = insertEntities;
        this.insertRecords = insertRecords;
        this.deleteRecords = deleteRecords;

        this.onbfDTOs = onbfDTOs;
    }

    public MasMoveResultDTO() {
        super();
        // TODO Auto-generated constructor stub
        this.insertEntities = new ArrayList<Object>();
        this.insertRecords = new ArrayList<Rlde492wType>();
        this.deleteRecords = new ArrayList<Object>();
        this.deletedSql = new HashMap<String, List<String>>();
        this.onbfDTOs = new ArrayList<ObnfDTO>();
    }

    /**
     * @return the insertEntities
     */
    public List<Object> getInsertEntities() {
        return insertEntities;
    }

    /**
     * @param insertEntities
     *            the insertEntities to set
     */
    public void setInsertEntities(List<Object> insertEntities) {
        this.insertEntities = insertEntities;
    }

    /**
     * @return the insertRecords
     */
    public List<Rlde492wType> getInsertRecords() {
        return insertRecords;
    }

    /**
     * @param insertRecords
     *            the insertRecords to set
     */
    public void setInsertRecords(List<Rlde492wType> insertRecords) {
        this.insertRecords = insertRecords;
    }

    /**
     * @return the deleteRecords
     */
    public List<Object> getDeleteRecords() {
        return deleteRecords;
    }

    /**
     * @param deleteRecords
     *            the deleteRecords to set
     */
    public void setDeleteRecords(List<Object> deleteRecords) {
        this.deleteRecords = deleteRecords;
    }

    /**
     * @return the onbfDTOs
     */
    public List<ObnfDTO> getOnbfDTOs() {
        return onbfDTOs;
    }

    /**
     * @param onbfDTOs
     *            the onbfDTOs to set
     */
    public void setOnbfDTOs(List<ObnfDTO> onbfDTOs) {
        this.onbfDTOs = onbfDTOs;
    }

    /**
     * @return the deletedSql
     */
    public Map<String, List<String>> getDeletedSql() {
        return deletedSql;
    }

    /**
     * @param deletedSql
     *            the deletedSql to set
     */
    public void setDeletedSql(Map<String, List<String>> deletedSql) {
        this.deletedSql = deletedSql;
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

    /**
     * @param registerTime
     *            the registerTime to set
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
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
     * @return the maleCount
     */
    public Integer getMaleCount() {
        return maleCount;
    }

    /**
     * @param maleCount
     *            the maleCount to set
     */
    public void setMaleCount(Integer maleCount) {
        this.maleCount = maleCount;
    }

    /**
     * @return the femaleCount
     */
    public Integer getFemaleCount() {
        return femaleCount;
    }

    /**
     * @param femaleCount
     *            the femaleCount to set
     */
    public void setFemaleCount(Integer femaleCount) {
        this.femaleCount = femaleCount;
    }

    public String getOriSiteId() {
        return oriSiteId;
    }

    public void setOriSiteId(String oriSiteId) {
        this.oriSiteId = oriSiteId;
    }

}
