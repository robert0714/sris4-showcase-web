package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

public class Rl0xxxxxWhereDTO {
    private String where = "";
    private List<String> conditionValues = new ArrayList<String>();

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public List<String> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<String> conditionValues) {
        this.conditionValues = conditionValues;
    }

}
