package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.codetable.domain.RisCode;
import tw.gov.moi.domain.Rldfv002Type;

/**
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x001DTOResult", propOrder = { "Type", "Value", "NewValue", "ShowBtn", "Field1", "Field2", "Field3",
        "Field4", "Field5" })
@XmlRootElement(name = "Rl0x001DTOResult")
public class Rl0x001DTOResult implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private static Logger log = LoggerFactory.getLogger(Rl0x001DTOResult.class);

    // 欄位結構
    @XmlElement(name = "Type")
    @FieldName("欄位結構")
    private Rldfv002Type type;

    // 輸入一
    @XmlElement(name = "Field1")
    @FieldName("輸入一")
    private String field1;

    // 輸入一
    @XmlElement(name = "NewField1")
    @FieldName("輸入一")
    private String newField1;

    @XmlElement(name = "CodeLabel")
    @FieldName("代碼檔內容")
    private String codeLabel = StringUtils.EMPTY;

    @XmlElement(name = "CodeLabel")
    @FieldName("代碼檔內容")
    private String newCodeLabel = StringUtils.EMPTY;

    @XmlElement(name = "CheckBoxLabel")
    @FieldName("old標籤")
    private String checkBoxLabel = StringUtils.EMPTY;

    @XmlElement(name = "CheckBoxLabel")
    @FieldName("new標籤")
    private String checkBoxNewLabel = StringUtils.EMPTY;

    @XmlElement(name = "ModifyValue")
    @FieldName("修改狀況")
    private String modifyValue = "";

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private List<RisCode> risCodes = new ArrayList<RisCode>();

    @XmlElement(name = "IsCertification")
    @FieldName("是否附繳證件 ")
    private boolean isCertification = false;

    @XmlElement(name = "IsOtherFication")
    @FieldName("是否為其他附繳證件 ")
    private boolean isOtherFication = false;

    public Rldfv002Type getType() {
        return type;
    }

    public static class Rl0x001DTOResultModifyCol {
        private Rl0x001DTOResult rl0x001DTOResult;
        private String columnName;
        private boolean modifyStatue;

        public Rl0x001DTOResult getRl0x001DTOResult() {
            return rl0x001DTOResult;
        }

        public void setRl0x001DTOResult(Rl0x001DTOResult rl0x001dtoResult) {
            rl0x001DTOResult = rl0x001dtoResult;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public boolean isModifyStatue() {
            return modifyStatue;
        }

        public void setModifyStatue(boolean modifyStatue) {
            this.modifyStatue = modifyStatue;
        }
    }

    public void setType(Rldfv002Type type) {
        this.type = type;
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

    public String getModifyValue() {
        if (field1 == null || newField1 == null) {
            return "";
        }

        if (StringUtils.equals(field1, newField1)) {
            this.modifyValue = StringUtils.EMPTY;

        } else {
            this.modifyValue = "*";
        }
        return modifyValue;
    }

    private boolean isTheSame(String StatusVal1, String statusVal2) {
        String val1 = StringUtils.trim(StatusVal1);
        String val2 = StringUtils.trim(statusVal2);

        if (StringUtils.equals(val1, val2)) {
            return Boolean.TRUE;
        }

        // 當舊值等於N 或是 空白 ->新值變成空白orN都屬於一樣
        if (StringUtils.equals(val1, StringUtils.EMPTY) || (StringUtils.equals(val1, "N"))
                || (StringUtils.equals(val1, "0")) || (StringUtils.equals(val1, "NO"))) {
            if (StringUtils.equals(val2, StringUtils.EMPTY)
                    || (StringUtils.equals(val2, "N") || (StringUtils.equals(val2, "NO")) || (StringUtils.equals(val1,
                            "0")))) {
                return Boolean.TRUE;
            }

        }
        return Boolean.FALSE;
    }

    public void setModifyValue(String modifyValue) {
        this.modifyValue = modifyValue;
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

    public String getCheckBoxLabel() {
        if (null == this.getType()) {
            this.checkBoxLabel = StringUtils.EMPTY;

        } else {
            this.checkBoxLabel = this.getType().getDefaultValue();

        }
        return checkBoxLabel;
    }

    public void setCheckBoxLabel(String checkBoxLabel) {
        this.checkBoxLabel = checkBoxLabel;
    }

    public String getCheckBoxNewLabel() {

        if (null == this.getType()) {
            this.checkBoxNewLabel = StringUtils.EMPTY;

        } else {
            this.checkBoxNewLabel = this.getType().getDefaultValue();

        }

        return checkBoxNewLabel;
    }

    public List<RisCode> getRisCodes() {
        return risCodes;
    }

    public void setRisCodes(List<RisCode> risCodes) {
        this.risCodes = risCodes;
    }

    public void setCheckBoxNewLabel(String checkBoxNewLabel) {
        this.checkBoxNewLabel = checkBoxNewLabel;
    }

    public boolean isCertification() {
        return isCertification;
    }

    public void setCertification(boolean isCertification) {
        this.isCertification = isCertification;
    }

    @Override
    public String toString() {
        return "Rl0x001DTOResult [type=" + type + ", field1=" + field1 + ", newField1=" + newField1 + ", codeLabel="
                + codeLabel + ", modifyValue=" + modifyValue + "]";
    }

    public boolean isOtherFication() {
        return isOtherFication;
    }

    public void setOtherFication(boolean isOtherFication) {
        this.isOtherFication = isOtherFication;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Rl0x001DTOResult) {
            Rl0x001DTOResult o = (Rl0x001DTOResult) obj;
            if (StringUtils.equals(o.getType().getColumnCode(), this.type.getColumnCode())) {
                return true;
            }

        }
        return super.equals(obj);

        // TODO Auto-generated method stub

    }
}
