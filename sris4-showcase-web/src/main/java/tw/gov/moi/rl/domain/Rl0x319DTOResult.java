package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfv002Type;

public class Rl0x319DTOResult {

    // 欄位結構
    private Rldfv002Type type = new Rldfv002Type();

    // 值
    private String value = "";

    // 是否顯示按鈕
    private Boolean showBtn = false;

    // 輸入一
    @XmlElement(name = "Field1")
    @FieldName("Field1")
    private String field1 = StringUtils.EMPTY;

    // 輸入一
    @XmlElement(name = "NewField1")
    @FieldName("輸入一")
    private String newField1 = StringUtils.EMPTY;

    // 輸入一
    @XmlElement(name = "Field2")
    @FieldName("輸入一")
    private String field2;

    // 輸入一
    @XmlElement(name = "NewField2")
    @FieldName("輸入一")
    private String newField2;

    // 輸入一
    @XmlElement(name = "Field3")
    @FieldName("輸入一")
    private String field3;

    // 輸入一
    @XmlElement(name = "NewField3")
    @FieldName("輸入一")
    private String newField3;

    // 輸入一
    @XmlElement(name = "Field4")
    @FieldName("輸入一")
    private String field4;

    // 輸入一
    @XmlElement(name = "NewField4")
    @FieldName("輸入一")
    private String newField4;

    // 輸入一
    @XmlElement(name = "Field5")
    @FieldName("輸入一")
    private String field5;

    // 輸入一
    @XmlElement(name = "NewField5")
    @FieldName("輸入一")
    private String newField5;

    // 輸入一
    @XmlElement(name = "Field6")
    @FieldName("輸入一")
    private String field6;

    // 輸入一
    @XmlElement(name = "NewField6")
    @FieldName("輸入一")
    private String newField6;

    // 輸入一
    @XmlElement(name = "Field7")
    @FieldName("輸入一")
    private String field7;

    // 輸入一
    @XmlElement(name = "NewField7")
    @FieldName("輸入一")
    private String newField7;

    // 輸入一
    @XmlElement(name = "Field8")
    @FieldName("輸入一")
    private String field8;

    // 輸入一
    @XmlElement(name = "NewField8")
    @FieldName("輸入一")
    private String newField8;

    // 輸入一
    @XmlElement(name = "Field9")
    @FieldName("輸入一")
    private String field9;

    // 輸入一
    @XmlElement(name = "NewField9")
    @FieldName("輸入一")
    private String newField9;

    @XmlElement(name = "CodeLabel")
    @FieldName("代碼檔內容")
    private String codeLabel = StringUtils.EMPTY;

    @XmlElement(name = "CodeLabel")
    @FieldName("代碼檔內容")
    private String newCodeLabel = StringUtils.EMPTY;
    // 真實結果
    private String fieldTrue = "";

    public Rldfv002Type getType() {
        return type;
    }

    public void setType(Rldfv002Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getShowBtn() {
        return showBtn;
    }

    public void setShowBtn(Boolean showBtn) {
        this.showBtn = showBtn;
    }

    public String getFieldTrue() {
        return fieldTrue;
    }

    public void setFieldTrue(String fieldTrue) {
        this.fieldTrue = fieldTrue;
    }

    @Override
    public String toString() {
        return "Rl0x319DTOResult [type=" + type + ", value=" + value + ", showBtn=" + showBtn + "]";
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getNewField1() {
        return newField1;
    }

    public void setNewField1(String newField1) {
        this.newField1 = newField1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getNewField2() {
        return newField2;
    }

    public void setNewField2(String newField2) {
        this.newField2 = newField2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getNewField3() {
        return newField3;
    }

    public void setNewField3(String newField3) {
        this.newField3 = newField3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getNewField4() {
        return newField4;
    }

    public void setNewField4(String newField4) {
        this.newField4 = newField4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getNewField5() {
        return newField5;
    }

    public void setNewField5(String newField5) {
        this.newField5 = newField5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getNewField6() {
        return newField6;
    }

    public void setNewField6(String newField6) {
        this.newField6 = newField6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getNewField7() {
        return newField7;
    }

    public void setNewField7(String newField7) {
        this.newField7 = newField7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getNewField8() {
        return newField8;
    }

    public void setNewField8(String newField8) {
        this.newField8 = newField8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getNewField9() {
        return newField9;
    }

    public void setNewField9(String newField9) {
        this.newField9 = newField9;
    }

    public String getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(String codeLabel) {
        this.codeLabel = codeLabel;
    }

    public String getNewCodeLabel() {
        return newCodeLabel;
    }

    public void setNewCodeLabel(String newCodeLabel) {
        this.newCodeLabel = newCodeLabel;
    }

}
