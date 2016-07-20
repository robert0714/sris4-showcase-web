package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

/**
 * 職權更正作業物件
 * 
 * @author Andy
 * 
 */
public class Rl0xV1Operation implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String funCode;// 功能編號
    private String tableName;// 表名稱
    private String recTable;// 記錄檔表格
    private String tableType;// 分類
    private String table;

    public String getFunCode() {
        return funCode;
    }

    public String getTableName() {
        return tableName;
    }

    public String getRecTable() {
        return recTable;
    }

    public String getTableType() {
        return tableType;
    }

    public String getTable() {
        return table;
    }

    public void setFunCode(String funCode) {
        this.funCode = funCode;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setRecTable(String recTable) {
        this.recTable = recTable;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public void setTable(String table) {
        this.table = table;
    }

}
