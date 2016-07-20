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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 重送異動中央、市縣戶籍資料通報DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05400DTO", propOrder = { "acceptSiteId", "confirmMessage", "dataKey", "editMode", "initTime",
        "noticeTable", "obnfDTOList", "saveList", "tmpTransactionId", "transactionId", "userId" })
@XmlRootElement(name = "Rl05400DTO")
public class Rl05400DTO implements Serializable {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 操作詢問訊息. */
    @XmlElement(name = "ConfirmMessage", required = true)
    @FieldName("操作詢問訊息")
    private String confirmMessage;

    /** 資料鍵值. */
    @XmlElement(name = "DataKey", required = true)
    @FieldName("資料鍵值")
    private String dataKey;

    /** 異動模式. */
    @XmlElement(name = "EditMode", required = true)
    @FieldName("異動模式")
    private String editMode;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 通報資料檔名. */
    @XmlElement(name = "NoticeTable", required = true)
    @FieldName("通報資料檔名")
    private String noticeTable;

    /** 通報List. */
    @XmlElement(name = "ObnfDTOList", required = true)
    @FieldName("通報List")
    private List<ObnfDTO> obnfDTOList;

    /** 外來通報狀況. */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("外來通報狀況")
    private List<Rl05400SaveDTO> saveList;

    /** 存檔交易序號. */
    @XmlElement(name = "TmpTransactionId", required = true)
    @FieldName("存檔交易序號")
    private String tmpTransactionId;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public String getConfirmMessage() {
        return confirmMessage;
    }

    public String getDataKey() {
        return dataKey;
    }

    public String getEditMode() {
        return editMode;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getNoticeTable() {
        return noticeTable;
    }

    public List<ObnfDTO> getObnfDTOList() {
        return obnfDTOList;
    }

    public List<Rl05400SaveDTO> getSaveList() {
        return saveList;
    }

    public String getTmpTransactionId() {
        return tmpTransactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public void setNoticeTable(String noticeTable) {
        this.noticeTable = noticeTable;
    }

    public void setObnfDTOList(List<ObnfDTO> obnfDTOList) {
        this.obnfDTOList = obnfDTOList;
    }

    public void setSaveList(List<Rl05400SaveDTO> saveList) {
        this.saveList = saveList;
    }

    public void setTmpTransactionId(String tmpTransactionId) {
        this.tmpTransactionId = tmpTransactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}