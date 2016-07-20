package tw.gov.moi.rl.domain;

public class Rl0x002CheckDTO {
    private String funCode;
    private String tableName;
    private boolean isChecked = false;

    public String getFunCode() {
        return funCode;
    }

    public void setFunCode(String funCode) {
        this.funCode = funCode;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "Rl0x002CheckDTO [funCode=" + funCode + ", tableName=" + tableName + ", isChecked=" + isChecked + "]";
    }

}
