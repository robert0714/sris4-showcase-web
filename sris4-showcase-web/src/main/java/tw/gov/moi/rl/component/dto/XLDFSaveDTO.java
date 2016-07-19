/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * XLDFSaveDTO 存放要進行DB commit的物件
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLDFSaveDTO", propOrder = { "insertList", "deletedList", "deletedKeyObjList", "updateList",
        "updateKeyObjList" })
@XmlRootElement(name = "XLDFSaveDTO")
public class XLDFSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 新增的物件串列 */
    @XmlElement(name = "InsertList", required = true)
    @FieldName("新增的物件串列")
    private List<Object> insertList = new ArrayList<Object>();

    /** 刪除的物件串列 */
    @XmlElement(name = "DeletedList", required = true)
    @FieldName("刪除的物件串列")
    private List<Object> deletedList = new ArrayList<Object>();

    /** 刪除的物件的RldfKey值query物件串列 */
    @XmlElement(name = "DeletedKeyObjList", required = true)
    @FieldName("刪除的物件的RldfKey值query物件串列")
    private List<Object> deletedKeyObjList = new ArrayList<Object>();

    /** 修改的物件串列 */
    @XmlElement(name = "UpdateList", required = true)
    @FieldName("修改的物件串列")
    private List<Object> updateList = new ArrayList<Object>();

    /** 修改的物件的RldfKey值query物件串列 */
    @XmlElement(name = "UpdateKeyObjList", required = true)
    @FieldName("修改的物件的RldfKey值query物件串列")
    private List<Object> updateKeyObjList = new ArrayList<Object>();

    public XLDFSaveDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public XLDFSaveDTO(List<Object> insertList, List<Object> deletedList, List<Object> deletedKeyObjList,
            List<Object> updateList, List<Object> updateKeyObjList) {
        super();
        this.insertList = insertList;
        this.deletedList = deletedList;
        this.deletedKeyObjList = deletedKeyObjList;
        this.updateList = updateList;
        this.updateKeyObjList = updateKeyObjList;
    }

    /**
     * @return the deletedKeyObjList
     */
    public List<Object> getDeletedKeyObjList() {
        return deletedKeyObjList;
    }

    /**
     * @param deletedKeyObjList
     *            the deletedKeyObjList to set
     */
    public void setDeletedKeyObjList(List<Object> deletedKeyObjList) {
        this.deletedKeyObjList = deletedKeyObjList;
    }

    /**
     * @return the updateKeyObjList
     */
    public List<Object> getUpdateKeyObjList() {
        return updateKeyObjList;
    }

    /**
     * @param updateKeyObjList
     *            the updateKeyObjList to set
     */
    public void setUpdateKeyObjList(List<Object> updateKeyObjList) {
        this.updateKeyObjList = updateKeyObjList;
    }

    /**
     * @return the insertList
     */
    public List<Object> getInsertList() {
        return insertList;
    }

    /**
     * @param insertList
     *            the insertList to set
     */
    public void setInsertList(List<Object> insertList) {
        this.insertList = insertList;
    }

    /**
     * @return the deletedList
     */
    public List<Object> getDeletedList() {
        return deletedList;
    }

    /**
     * @param deletedList
     *            the deletedList to set
     */
    public void setDeletedList(List<Object> deletedList) {
        this.deletedList = deletedList;
    }

    /**
     * @return the updateList
     */
    public List<Object> getUpdateList() {
        return updateList;
    }

    /**
     * @param updateList
     *            the updateList to set
     */
    public void setUpdateList(List<Object> updateList) {
        this.updateList = updateList;
    }

}
