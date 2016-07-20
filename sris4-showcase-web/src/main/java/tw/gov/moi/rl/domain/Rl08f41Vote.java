package tw.gov.moi.rl.domain;

public class Rl08f41Vote {
    private boolean isRequired = false;
    private String titleName1 = "";
    private String value1 = "";
    private String titleName2 = "";
    private String value2 = "";

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getTitleName1() {
        return titleName1;
    }

    public void setTitleName1(String titleName1) {
        this.titleName1 = titleName1;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getTitleName2() {
        return titleName2;
    }

    public void setTitleName2(String titleName2) {
        this.titleName2 = titleName2;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

}
