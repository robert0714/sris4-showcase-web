package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldfu003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDFU003;
import tw.gov.moi.rl.dto.XLDFDomainDTO;

/**
 * XLDFCertificationFeeDTO
 * 
 * @author Data.Cneng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFCertificationFeeDTO", propOrder = { "sequenceId", "freeFlag", "otherFreeReason",
        "mainSerialNumber", "state", "mannualAddFlag", "applySiteId", "applyCode", "freeReasonCode", "action",
        "applySeq", "quantity", "cancelReason", "personId", "siteId", "applyTransactionId", "subtotal",
        "applySequenceId", "serialNumber", "feeItem", "unit", "fineFlag", "price", "feeCode", "feeCancelFlag" })
public class XLDFCertificationFeeDTO implements XLDFDomainDTO, Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "FreeFlag", required = true)
    @FieldName("freeFlag")
    private String freeFlag;

    @XmlElement(name = "OtherFreeReason", required = true)
    @FieldName("otherFreeReason")
    private String otherFreeReason;

    @XmlElement(name = "MainSerialNumber", required = true)
    @FieldName("mainSerialNumber")
    private String mainSerialNumber;

    @XmlElement(name = "State", required = true)
    @FieldName("state")
    private String state;

    @XmlElement(name = "MannualAddFlag", required = true)
    @FieldName("mannualAddFlag")
    private String mannualAddFlag;

    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("applySiteId")
    private String applySiteId;

    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("applyCode")
    private String applyCode;

    @XmlElement(name = "FreeReasonCode", required = true)
    @FieldName("freeReasonCode")
    private String freeReasonCode;

    @XmlElement(name = "Action", required = true)
    @FieldName("action")
    private String action;

    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("applySeq")
    private Integer applySeq;

    @XmlElement(name = "Quantity", required = true)
    @FieldName("數量")
    private Integer quantity;

    @XmlElement(name = "CancelReason", required = true)
    @FieldName("cancelReason")
    private String cancelReason;

    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("交易序號")
    private String applyTransactionId;

    @XmlElement(name = "Subtotal", required = true)
    @FieldName("小計")
    private Integer subtotal;

    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("序號")
    private Integer applySequenceId;

    @XmlElement(name = "SerialNumber", required = true)
    @FieldName("流水號")
    private String serialNumber;

    @XmlElement(name = "FeeItem", required = true)
    @FieldName("feeItem")
    private String feeItem;

    @XmlElement(name = "Unit", required = true)
    @FieldName("單位")
    private String unit;

    @XmlElement(name = "FineFlag", required = true)
    @FieldName("fineFlag")
    private String fineFlag;

    @XmlElement(name = "Price", required = true)
    @FieldName("單價")
    private Integer price;

    @XmlElement(name = "FeeCode")
    @FieldName("feeCode")
    private String feeCode;

    @XmlElement(name = "FeeCancelFlag", required = true)
    @FieldName("feeCancelFlag")
    private String feeCancelFlag;

    @XmlElement(name = "SequenceId", required = true)
    @FieldName("序號")
    private String sequenceId;

    /** 統號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getFreeFlag() {
        return freeFlag;
    }

    public void setFreeFlag(String freeFlag) {
        this.freeFlag = freeFlag;
    }

    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    public String getMainSerialNumber() {
        return mainSerialNumber;
    }

    public void setMainSerialNumber(String mainSerialNumber) {
        this.mainSerialNumber = mainSerialNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMannualAddFlag() {
        return mannualAddFlag;
    }

    public void setMannualAddFlag(String mannualAddFlag) {
        this.mannualAddFlag = mannualAddFlag;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getFreeReasonCode() {
        return freeReasonCode;
    }

    public void setFreeReasonCode(String freeReasonCode) {
        this.freeReasonCode = freeReasonCode;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(Integer applySeq) {
        this.applySeq = applySeq;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFeeItem() {
        return feeItem;
    }

    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFineFlag() {
        return fineFlag;
    }

    public void setFineFlag(String fineFlag) {
        this.fineFlag = fineFlag;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeCancelFlag() {
        return feeCancelFlag;
    }

    public void setFeeCancelFlag(String feeCancelFlag) {
        this.feeCancelFlag = feeCancelFlag;
    }

    public XLDFDomainObject makeXLDFDomainObject() {

        XLDFU003 result = new XLDFU003();
        result.setDomainObj(new Xldfu003Type());

        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }
}
