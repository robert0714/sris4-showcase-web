/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf2FileQryDTO", propOrder = { "table", "sql", "clzPath" })
@XmlRootElement(name = "rldf2FileQryDTO")
public class Rldf2FileQryDTO {
    /** The table. */
    @XmlElement(name = "Table", required = false)
    @FieldName("表格名稱")
    private String table;

    /** The SQL語法. */
    @XmlElement(name = "Sql", required = false)
    @FieldName("SQL語法")
    private String sql;
    /** The clzPath. */
    @XmlElement(name = "ClzPath", required = false)
    @FieldName("Type路徑")
    private String clzPath;

    public Rldf2FileQryDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Rldf2FileQryDTO(String table, String sql, String clzPath) {
        super();
        this.table = table;
        this.sql = sql;
        this.clzPath = clzPath;
    }

    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }

    /**
     * @param table
     *            the table to set
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql
     *            the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * @return the clzPath
     */
    public String getClzPath() {
        return clzPath;
    }

    /**
     * @param clzPath
     *            the clzPath to set
     */
    public void setClzPath(String clzPath) {
        this.clzPath = clzPath;
    }

}
