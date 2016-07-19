package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class XLDFAttribute implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2866379427407458735L;
    @XmlElement(name = "作業順序")    
    private Integer sequenceId ;
    @XmlElement(name = "XLDF動作")
    private String action;
    @XmlElement(name = "領域物件鍵值")
    private String domainKey;
    @XmlElement(name = "領域物件型別")
    private String xldfType;
    @XmlElement(name = "屬性名稱")
    private String xldfAttributeName;
    @XmlElement(name = "準備要更新的值")
    private String updateValue;
    public String getDomainKey() {
        return domainKey;
    }
    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
    }
    public String getXldfType() {
        return xldfType;
    }
    public void setXldfType(String xldfType) {
        this.xldfType = xldfType;
    }
    public String getXldfAttributeName() {
        return xldfAttributeName;
    }
    public void setXldfAttributeName(String xldfAttributeName) {
        this.xldfAttributeName = xldfAttributeName;
    }
    public String getUpdateValue() {
        return updateValue;
    }
    public void setUpdateValue(String updateValue) {
        this.updateValue = updateValue;
    }
    public Integer getSequenceId() {
        return sequenceId;
    }
    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    
    
}
