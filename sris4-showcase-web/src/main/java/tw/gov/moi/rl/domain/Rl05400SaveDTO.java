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

/**
 * The Class Rl05400SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05400SaveDTO", propOrder = { "Serial", "NoticeTable", "DataKey", "EditMode" })
@XmlRootElement(name = "Rl05400SaveDTO")
public class Rl05400SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報資料檔名 */
    @XmlElement(name = "NoticeTable", required = true)
    @FieldName("通報資料檔名")
    private String noticeTable;

    /** 資料鍵值 */
    @XmlElement(name = "DataKey", required = true)
    @FieldName("資料鍵值")
    private String dataKey;

    /** 異動模式 */
    @XmlElement(name = "EditMode", required = true)
    @FieldName("異動模式")
    private String editMode;

    public String getNoticeTable() {
        return noticeTable;
    }

    public void setNoticeTable(final String noticeTable) {
        this.noticeTable = noticeTable;
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(final String dataKey) {
        this.dataKey = dataKey;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(final String editMode) {
        this.editMode = editMode;
    }

}
