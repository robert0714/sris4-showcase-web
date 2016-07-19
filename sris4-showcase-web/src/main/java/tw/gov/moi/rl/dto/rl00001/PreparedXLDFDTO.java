package tw.gov.moi.rl.dto.rl00001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.component.dto.XLDFAction;
import tw.gov.moi.rl.component.dto.XLDFDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreparedXLDFDTO", propOrder = { "operationSequenceId", "operationCode", "domainType", "xldfDomainOb",
        "domainKey", "xldfAct", "clz" })
public class PreparedXLDFDTO {

    @XmlElement(name = "OperationSequenceId", required = true)
    public Integer operationSequenceId;

    @XmlElement(name = "OperationCode", required = true)
    public String operationCode;

    @XmlElement(name = "DomainType", required = true)
    public Class<? extends XLDFDomainObject> domainType;

    @XmlElement(name = "XldfDomainOb", required = true)
    public XLDFDomainObject xldfDomainOb;

    @XmlElement(name = "DomainKey", required = true)
    public String domainKey;

    @XmlElement(name = "XldfAct", required = true)
    public XLDFAction xldfAct;

    @XmlElement(name = "Clz", required = true)
    public Class<? extends XLDFDomainObject> clz;

    public XLDFDomainKey key;

    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public Class<? extends XLDFDomainObject> getDomainType() {
        return domainType;
    }

    public void setDomainType(Class<? extends XLDFDomainObject> domainType) {
        this.domainType = domainType;
    }

    public XLDFDomainObject getXldfDomainOb() {
        return xldfDomainOb;
    }

    public void setXldfDomainOb(XLDFDomainObject xldfDomainOb) {
        this.xldfDomainOb = xldfDomainOb;
    }

    public String getDomainKey() {
        return domainKey;
    }

    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
    }

    public XLDFAction getXldfAct() {
        return xldfAct;
    }

    public void setXldfAct(XLDFAction xldfAct) {
        this.xldfAct = xldfAct;
    }

    public Class<? extends XLDFDomainObject> getClz() {
        return clz;
    }

    public void setClz(Class<? extends XLDFDomainObject> clz) {
        this.clz = clz;
    }

    public XLDFDomainKey getKey() {
        return key;
    }

    public void setKey(XLDFDomainKey key) {
        this.key = key;
    }

}
