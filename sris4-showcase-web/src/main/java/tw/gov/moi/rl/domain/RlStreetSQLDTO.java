package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

public class RlStreetSQLDTO {
    private String sql = "";// sql
    private List<String> fields = new ArrayList<String>();// 欄位
    private List<String> parsms = new ArrayList<String>();// 內容

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getParsms() {
        return parsms;
    }

    public void setParsms(List<String> parsms) {
        this.parsms = parsms;
    }

}
