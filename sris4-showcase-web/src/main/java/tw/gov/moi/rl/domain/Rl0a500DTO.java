/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Rldfu002Type;
import tw.gov.moi.domain.Rldfu003Type;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 規費查詢DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0a500DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime", "chargeDateStart",
        "chargeDateEnd", "registerId", "receuptId", "applyTransactionId", "feeCancelFlag", "groupFlag", "rldfu001List",
        "rldfu002TypeList", "showMap", "delShowMap", "mapKeyList", "feeRegistrarList", "clzSMap", "clzWMap",
        "haveApplyCntList", "havePersonNameList", "notCancelList", "editCopiesList", "obnfDTOList", "rldfu002Type",
        "tmpRldfu002", "rldfu003Type", "dataListEnable", "reportUrl", "feeCodeKey", "quantity", "price", "feeTotal",
        "newReceiptId", "applyCut", "applySheets", "isEdit", "mannualAddKey", "tableName" })
@XmlRootElement(name = "Rl0a500DTO")
public class Rl0a500DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 2290942245050190572L;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 收費日期起. */
    @XmlElement(name = "ChargeDateStart", required = true)
    @FieldName("收費日期起")
    private String chargeDateStart;

    /** 收費日期迄. */
    @XmlElement(name = "ChargeDateEnd", required = true)
    @FieldName("收費日期迄")
    private String chargeDateEnd;

    /** 收費人員. */
    @XmlElement(name = "RegisterId", required = true)
    @FieldName("收費人員")
    private String registerId;

    /** 收據號碼. */
    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("收據號碼")
    private String receuptId;

    /** 交易序號. */
    @XmlElement(name = "ReceuptId", required = true)
    @FieldName("交易序號")
    private String applyTransactionId;

    /** 規費作廢註記. */
    @XmlElement(name = "FeeCancelFlag", required = true)
    @FieldName("規費作廢註記 ")
    private String feeCancelFlag;

    /** 是否為大宗戶籍謄本. */
    @XmlElement(name = "GroupFlag", required = true)
    @FieldName("是否為大宗戶籍謄本 ")
    private String groupFlag = RlConstant.NO_CHAR;

    /** 規費項目清單. */
    @FieldName("規費項目清單")
    @XmlElement(name = "Rldfu001List", required = true)
    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    /** 規費主檔清單. */
    @XmlElement(name = "Rldfu002TypeList", required = true)
    @FieldName("規費主檔清單")
    private List<Rldfu002Type> rldfu002TypeList = new ArrayList<Rldfu002Type>();

    /** 規費明細清單. */
    @XmlElement(name = "ShowMap", required = false)
    @FieldName("規費明細清單")
    private Map<String, ShowFeeDTO> showMap = new HashMap<String, ShowFeeDTO>();

    /** 要刪除的規費明細清單. */
    @XmlElement(name = "DelShowMap", required = false)
    @FieldName("要刪除的規費明細清單")
    private Map<String, ShowFeeDTO> delShowMap = new HashMap<String, ShowFeeDTO>();

    /** 規費明細鍵值清單. */
    @XmlElement(name = "MapKeyList", required = false)
    @FieldName("規費明細鍵值清單")
    private List<String> mapKeyList = new ArrayList<String>();

    /** 罰款戶籍員清單. */
    @XmlElement(name = "FeeRegistrarList", required = true)
    @FieldName("罰款戶籍員清單")
    private List<FeeRegistrarDTO> feeRegistrarList = new ArrayList<FeeRegistrarDTO>();

    /** 作業編號對應S或T申請書清單. */
    @XmlElement(name = "ClzSMap", required = true)
    @FieldName("S或T申請書清單")
    private Map<String, List<Object>> clzSMap = new HashMap<String, List<Object>>();

    /** 作業編號對應W申請書清單. */
    @XmlElement(name = "ClzWMap", required = true)
    @FieldName("S或T申請書清單")
    private Map<String, List<Object>> clzWMap = new HashMap<String, List<Object>>();

    /** 有申請份數的申請書. */
    @XmlElement(name = "HaveApplyCntList", required = true)
    @FieldName("有申請份數的申請書")
    private List<String> haveApplyCntList = new ArrayList<String>();

    /** 規費名稱需顯示姓名的作業清單. */
    @XmlElement(name = "HavePersonNameList", required = true)
    @FieldName("規費名稱需顯示姓名的作業清單")
    private List<String> havePersonNameList = new ArrayList<String>();

    /** 不可作廢的作業清單. */
    @XmlElement(name = "NotCancelList", required = true)
    @FieldName("不可作廢的作業清單")
    private List<String> notCancelList = new ArrayList<String>();

    /** 須修改申請書copies欄位清單. */
    @XmlElement(name = "EditCopiesList", required = true)
    @FieldName("須修改申請書copies欄位清單")
    private List<String> editCopiesList = new ArrayList<String>();

    /** 通報清單. */
    @XmlElement(name = "ObnfDTOList", required = true)
    @FieldName("通報清單")
    private List<ObnfDTO> obnfDTOList = new ArrayList<ObnfDTO>();

    /** 規費主檔. */
    @XmlElement(name = "Rldfu002Type", required = true)
    @FieldName("規費主檔")
    private Rldfu002Type rldfu002Type = new Rldfu002Type();

    /** 新增收據號碼所產生的規費主檔. */
    @XmlElement(name = "TmpRldfu002", required = true)
    @FieldName("新增收據號碼所產生的規費主檔")
    private Rldfu002Type tmpRldfu002;

    /** 規費明細. */
    @XmlElement(name = "Rldfu003Type", required = true)
    @FieldName("規費明細")
    private Rldfu003Type rldfu003Type = new Rldfu003Type();

    /** 頁面dataTable顯示物件. */
    @XmlElement(name = "DataListEnable", required = true)
    @FieldName("頁面dataTable顯示物件")
    private boolean dataListEnable = false;

    /** 報表檔案URL. */
    @XmlElement(name = "ReportUrl", required = true)
    @FieldName("報表檔案URL")
    private String reportUrl;

    /** 規費項目健值. */
    @XmlElement(name = "FeeCodeKey", required = true)
    @FieldName("規費項目健值")
    private String feeCodeKey;

    /** 數量. */
    @XmlElement(name = "Quantity", required = true)
    @FieldName("數量")
    private String quantity;

    /** 金額. */
    @XmlElement(name = "Price", required = true)
    @FieldName("金額")
    private String price;

    /** 規費總金額. */
    @XmlElement(name = "FeeTotal", required = true)
    @FieldName("規費總金額")
    private int feeTotal = 0;

    /** 新收據號碼. */
    @XmlElement(name = "NewReceiptId", required = true)
    @FieldName("新收據號碼")
    private String newReceiptId;

    /** 修改申請書申請份數. */
    @XmlElement(name = "ApplyCut", required = true)
    @FieldName("修改申請書申請份數")
    private String applyCut;

    /** 修改申請書申請張數. */
    @XmlElement(name = "ApplySheets", required = true)
    @FieldName("修改申請書申請張數")
    private String applySheets;

    /** 是否編輯. */
    @XmlElement(name = "IsEdit", required = true)
    @FieldName("是否編輯")
    private boolean isEdit;

    /** 規費明細Map鍵植. */
    @XmlElement(name = "MannualAddKey", required = true)
    @FieldName("是否編輯")
    private int mannualAddKey = 0;

    /** S或T table名稱. */
    @XmlElement(name = "TableName", required = true)
    @FieldName("S或T table名稱")
    private String tableName;

    /**
     * Gets the charge date start.
     * 
     * @return the charge date start
     */
    public String getChargeDateStart() {
        return chargeDateStart;
    }

    /**
     * Sets the charge date start.
     * 
     * @param chargeDateStart
     *            the new charge date start
     */
    public void setChargeDateStart(final String chargeDateStart) {
        this.chargeDateStart = chargeDateStart;
    }

    /**
     * Gets the charge date end.
     * 
     * @return the charge date end
     */
    public String getChargeDateEnd() {
        return chargeDateEnd;
    }

    /**
     * Sets the charge date end.
     * 
     * @param chargeDateEnd
     *            the new charge date end
     */
    public void setChargeDateEnd(final String chargeDateEnd) {
        this.chargeDateEnd = chargeDateEnd;
    }

    /**
     * Gets the register id.
     * 
     * @return the register id
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * Sets the register id.
     * 
     * @param registerId
     *            the new register id
     */
    public void setRegisterId(final String registerId) {
        this.registerId = registerId;
    }

    /**
     * Gets the receupt id.
     * 
     * @return the receupt id
     */
    public String getReceuptId() {
        return receuptId;
    }

    /**
     * Sets the receupt id.
     * 
     * @param receuptId
     *            the new receupt id
     */
    public void setReceuptId(final String receuptId) {
        this.receuptId = receuptId;
    }

    /**
     * Gets the fee cancel flag.
     * 
     * @return the fee cancel flag
     */
    public String getFeeCancelFlag() {
        return feeCancelFlag;
    }

    /**
     * Sets the fee cancel flag.
     * 
     * @param feeCancelFlag
     *            the new fee cancel flag
     */
    public void setFeeCancelFlag(final String feeCancelFlag) {
        this.feeCancelFlag = feeCancelFlag;
    }

    /**
     * Gets the rldfu003 type.
     * 
     * @return the rldfu003 type
     */
    public Rldfu003Type getRldfu003Type() {
        return rldfu003Type;
    }

    /**
     * Sets the rldfu003 type.
     * 
     * @param rldfu003Type
     *            the new rldfu003 type
     */
    public void setRldfu003Type(final Rldfu003Type rldfu003Type) {
        this.rldfu003Type = rldfu003Type;
    }

    /**
     * Checks if is data list enable.
     * 
     * @return true, if is data list enable
     */
    public boolean isDataListEnable() {
        return dataListEnable;
    }

    /**
     * Sets the data list enable.
     * 
     * @param dataListEnable
     *            the new data list enable
     */
    public void setDataListEnable(final boolean dataListEnable) {
        this.dataListEnable = dataListEnable;
    }

    /**
     * Gets the rldfu002 type.
     * 
     * @return the rldfu002 type
     */
    public Rldfu002Type getRldfu002Type() {
        return rldfu002Type;
    }

    /**
     * Sets the rldfu002 type.
     * 
     * @param rldfu002Type
     *            the new rldfu002 type
     */
    public void setRldfu002Type(final Rldfu002Type rldfu002Type) {
        this.rldfu002Type = rldfu002Type;
    }

    /**
     * Gets the fee registrar list.
     * 
     * @return the fee registrar list
     */
    public List<FeeRegistrarDTO> getFeeRegistrarList() {
        return feeRegistrarList;
    }

    /**
     * Sets the fee registrar list.
     * 
     * @param feeRegistrarList
     *            the new fee registrar list
     */
    public void setFeeRegistrarList(final List<FeeRegistrarDTO> feeRegistrarList) {
        this.feeRegistrarList = feeRegistrarList;
    }

    /**
     * Gets the fee total.
     * 
     * @return the fee total
     */
    public int getFeeTotal() {
        return feeTotal;
    }

    /**
     * Sets the fee total.
     * 
     * @param feeTotal
     *            the new fee total
     */
    public void setFeeTotal(final int feeTotal) {
        this.feeTotal = feeTotal;
    }

    /**
     * Gets the rldfu002 type list.
     * 
     * @return the rldfu002 type list
     */
    public List<Rldfu002Type> getRldfu002TypeList() {
        return rldfu002TypeList;
    }

    /**
     * Sets the rldfu002 type list.
     * 
     * @param rldfu002TypeList
     *            the new rldfu002 type list
     */
    public void setRldfu002TypeList(final List<Rldfu002Type> rldfu002TypeList) {
        this.rldfu002TypeList = rldfu002TypeList;
    }

    /**
     * Gets the show map.
     * 
     * @return the show map
     */
    public Map<String, ShowFeeDTO> getShowMap() {
        return showMap;
    }

    /**
     * Sets the show map.
     * 
     * @param showMap
     *            the show map
     */
    public void setShowMap(final Map<String, ShowFeeDTO> showMap) {
        this.showMap = showMap;
    }

    /**
     * Gets the del show map.
     * 
     * @return the del show map
     */
    public Map<String, ShowFeeDTO> getDelShowMap() {
        return delShowMap;
    }

    /**
     * Sets the del show map.
     * 
     * @param delShowMap
     *            the del show map
     */
    public void setDelShowMap(final Map<String, ShowFeeDTO> delShowMap) {
        this.delShowMap = delShowMap;
    }

    /**
     * Gets the fee code key.
     * 
     * @return the fee code key
     */
    public String getFeeCodeKey() {
        return feeCodeKey;
    }

    /**
     * Sets the fee code key.
     * 
     * @param feeCodeKey
     *            the new fee code key
     */
    public void setFeeCodeKey(final String feeCodeKey) {
        this.feeCodeKey = feeCodeKey;
    }

    /**
     * Gets the quantity.
     * 
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param quantity
     *            the new quantity
     */
    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the price.
     * 
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the price.
     * 
     * @param price
     *            the new price
     */
    public void setPrice(final String price) {
        this.price = price;
    }

    /**
     * Gets the rldfu001 list.
     * 
     * @return the rldfu001 list
     */
    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    /**
     * Sets the rldfu001 list.
     * 
     * @param rldfu001List
     *            the new rldfu001 list
     */
    public void setRldfu001List(final List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
    }

    /**
     * Gets the map key list.
     * 
     * @return the map key list
     */
    public List<String> getMapKeyList() {
        return mapKeyList;
    }

    /**
     * Sets the map key list.
     * 
     * @param mapKeyList
     *            the new map key list
     */
    public void setMapKeyList(final List<String> mapKeyList) {
        this.mapKeyList = mapKeyList;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the accept site id.
     * 
     * @return the accept site id
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * Sets the accept site id.
     * 
     * @param acceptSiteId
     *            the new accept site id
     */
    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     * 
     * @param userId
     *            the new user id
     */
    public void setUserId(final String userId) {
        this.userId = userId;
    }

    /**
     * Gets the inits the time.
     * 
     * @return the inits the time
     */
    public String getInitTime() {
        return initTime;
    }

    /**
     * Sets the inits the time.
     * 
     * @param initTime
     *            the new inits the time
     */
    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    /**
     * Gets the new receipt id.
     * 
     * @return the new receipt id
     */
    public String getNewReceiptId() {
        return newReceiptId;
    }

    /**
     * Sets the new receipt id.
     * 
     * @param newReceiptId
     *            the new new receipt id
     */
    public void setNewReceiptId(final String newReceiptId) {
        this.newReceiptId = newReceiptId;
    }

    /**
     * Gets the clz s map.
     * 
     * @return the clz s map
     */
    public Map<String, List<Object>> getClzSMap() {
        return clzSMap;
    }

    /**
     * Sets the clz s map.
     * 
     * @param clzSMap
     *            the clz s map
     */
    public void setClzSMap(final Map<String, List<Object>> clzSMap) {
        this.clzSMap = clzSMap;
    }

    /**
     * Gets the clz w map.
     * 
     * @return the clz w map
     */
    public Map<String, List<Object>> getClzWMap() {
        return clzWMap;
    }

    /**
     * Sets the clz w map.
     * 
     * @param clzWMap
     *            the clz w map
     */
    public void setClzWMap(final Map<String, List<Object>> clzWMap) {
        this.clzWMap = clzWMap;
    }

    /**
     * Gets the have apply cnt list.
     * 
     * @return the have apply cnt list
     */
    public List<String> getHaveApplyCntList() {
        return haveApplyCntList;
    }

    /**
     * Sets the have apply cnt list.
     * 
     * @param haveApplyCntList
     *            the new have apply cnt list
     */
    public void setHaveApplyCntList(List<String> haveApplyCntList) {
        this.haveApplyCntList = haveApplyCntList;
    }

    /**
     * Gets the apply cut.
     * 
     * @return the apply cut
     */
    public String getApplyCut() {
        return applyCut;
    }

    /**
     * Sets the apply cut.
     * 
     * @param applyCut
     *            the new apply cut
     */
    public void setApplyCut(final String applyCut) {
        this.applyCut = applyCut;
    }

    /**
     * Gets the apply sheets.
     * 
     * @return the apply sheets
     */
    public String getApplySheets() {
        return applySheets;
    }

    /**
     * Sets the apply sheets.
     * 
     * @param applySheets
     *            the new apply sheets
     */
    public void setApplySheets(final String applySheets) {
        this.applySheets = applySheets;
    }

    /**
     * Checks if is edits the.
     * 
     * @return true, if is edits the
     */
    public boolean isEdit() {
        return isEdit;
    }

    /**
     * Sets the edits the.
     * 
     * @param isEdit
     *            the new edits the
     */
    public void setEdit(final boolean isEdit) {
        this.isEdit = isEdit;
    }

    /**
     * Gets the apply transaction id.
     * 
     * @return the apply transaction id
     */
    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    /**
     * Sets the apply transaction id.
     * 
     * @param applyTransactionId
     *            the new apply transaction id
     */
    public void setApplyTransactionId(final String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the edits the copies list.
     * 
     * @return the edits the copies list
     */
    public List<String> getEditCopiesList() {
        return editCopiesList;
    }

    /**
     * Sets the edits the copies list.
     * 
     * @param editCopiesList
     *            the new edits the copies list
     */
    public void setEditCopiesList(final List<String> editCopiesList) {
        this.editCopiesList = editCopiesList;
    }

    /**
     * Gets the not cancel list.
     * 
     * @return the not cancel list
     */
    public List<String> getNotCancelList() {
        return notCancelList;
    }

    /**
     * Sets the not cancel list.
     * 
     * @param notCancelList
     *            the new not cancel list
     */
    public void setNotCancelList(final List<String> notCancelList) {
        this.notCancelList = notCancelList;
    }

    /**
     * Gets the mannual add key.
     * 
     * @return the mannual add key
     */
    public int getMannualAddKey() {
        return mannualAddKey;
    }

    /**
     * Sets the mannual add key.
     * 
     * @param mannualAddKey
     *            the new mannual add key
     */
    public void setMannualAddKey(final int mannualAddKey) {
        this.mannualAddKey = mannualAddKey;
    }

    /**
     * Gets the obnf dto list.
     * 
     * @return the obnf dto list
     */
    public List<ObnfDTO> getObnfDTOList() {
        return obnfDTOList;
    }

    /**
     * Sets the obnf dto list.
     * 
     * @param obnfDTOList
     *            the new obnf dto list
     */
    public void setObnfDTOList(final List<ObnfDTO> obnfDTOList) {
        this.obnfDTOList = obnfDTOList;
    }

    /**
     * Gets the table name.
     * 
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the table name.
     * 
     * @param tableName
     *            the new table name
     */
    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }

    /**
     * Gets the tmp rldfu002.
     * 
     * @return the tmp rldfu002
     */
    public Rldfu002Type getTmpRldfu002() {
        return tmpRldfu002;
    }

    /**
     * Sets the tmp rldfu002.
     * 
     * @param tmpRldfu002
     *            the new tmp rldfu002
     */
    public void setTmpRldfu002(final Rldfu002Type tmpRldfu002) {
        this.tmpRldfu002 = tmpRldfu002;
    }

    /**
     * Gets the group flag.
     * 
     * @return the group flag
     */
    public String getGroupFlag() {
        return groupFlag;
    }

    /**
     * Sets the group flag.
     * 
     * @param groupFlag
     *            the new group flag
     */
    public void setGroupFlag(final String groupFlag) {
        this.groupFlag = groupFlag;
    }

    /**
     * Gets the have person name list.
     * 
     * @return the have person name list
     */
    public List<String> getHavePersonNameList() {
        return havePersonNameList;
    }

    /**
     * Sets the have person name list.
     * 
     * @param havePersonNameList
     *            the new have person name list
     */
    public void setHavePersonNameList(final List<String> havePersonNameList) {
        this.havePersonNameList = havePersonNameList;
    }

}
