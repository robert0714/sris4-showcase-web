package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08210UseDTO", propOrder = { "IsUsed", "Obj", "CopyObj" })
public class Rl08210UseDTO {

    @XmlElement(name = "IsUsed")
    @FieldName("未使用")
    private Boolean isUsed = false;

    @XmlElement(name = "Obj")
    @FieldName("物件")
    private Object obj;

    @XmlElement(name = "Code1")
    @FieldName("物件")
    private Object code1;

    @XmlElement(name = "Code2")
    @FieldName("物件")
    private Object code2;

    @XmlElement(name = "Code3")
    @FieldName("物件")
    private Object code3;

    @XmlElement(name = "FixName")
    @FieldName("修改欄位")
    private String fixName;

    @XmlElement(name = "CopyObj")
    @FieldName("複製物件")
    private Object copyObj;

    @XmlElement(name = "NewValue")
    @FieldName("新值")
    private String newValue;

    // public void setValue(String value) {
    // try {
    // BeanUtils.setProperty(obj, fixName, value);
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getCopyObj() {
        return copyObj;
    }

    public void setCopyObj(Object copyObj) {
        this.copyObj = copyObj;
    }

    public String getFixName() {
        return fixName;
    }

    public void setFixName(String fixName) {
        this.fixName = fixName;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.isUsed = true;
        this.newValue = newValue;
    }

    public Object getCode1() {
        return code1;
    }

    public void setCode1(Object code1) {
        this.code1 = code1;
    }

    public Object getCode2() {
        return code2;
    }

    public void setCode2(Object code2) {
        this.code2 = code2;
    }

    public Object getCode3() {
        return code3;
    }

    public void setCode3(Object code3) {
        this.code3 = code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    @Override
    public String toString() {
        return "Rl08210UseDTO [isUsed=" + isUsed + ", obj=" + obj + ", code1=" + code1 + ", code2=" + code2 + ", code3=" + code3 + ", fixName=" + fixName + ", copyObj=" + copyObj + ", newValue=" + newValue + "]";
    }

}
