package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDFU003;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showFeeDetailDTO", propOrder = { "keyValue", "feeCancelFlag", "applyCopyCnt", "mannualAddFlag",
        "feeDetail", "modifyFlag", "orgSerialNumber", "notCancelFlag" })
@XmlRootElement(name = "ShowFeeDetailDTO")
public class ShowFeeDetailDTO implements Serializable {

    private static final long serialVersionUID = -7525142903619369247L;

    /** Key */
    @FieldName("Key")
    @XmlElement(name = "KeyValue")
    private String keyValue;

    /** 規費作廢註記 */
    @FieldName("規費作廢註記")
    @XmlElement(name = "FeeCancelFlag")
    private Boolean feeCancelFlag;

    /** 修改申請書申請份數 */
    @FieldName("修改申請書申請份數")
    @XmlElement(name = "ApplyCopyCnt")
    private String applyCopyCnt;

    /** 自行新增註記 */
    @FieldName("自行新增註記")
    @XmlElement(name = "MannualAddFlag")
    private Boolean mannualAddFlag;

    /** 規費明細 */
    @FieldName("規費明細")
    @XmlElement(name = "FeeDetail")
    XLDFDomainObject feeDetail = new XLDFU003(StringUtils.EMPTY, StringUtils.EMPTY);

    /** 修改註記 */
    @FieldName("修改註記")
    @XmlElement(name = "ModifyFlag")
    private Boolean modifyFlag;

    /** 原識別序號 */
    @FieldName("原始識別序號")
    @XmlElement(name = "OrgSerialNumber")
    private String orgSerialNumber;

    /** 不可作廢註記 */
    @FieldName("不可作廢註記")
    @XmlElement(name = "NotCancelFlag")
    private Boolean notCancelFlag;

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Boolean getFeeCancelFlag() {
        return feeCancelFlag;
    }

    public void setFeeCancelFlag(Boolean feeCancelFlag) {
        this.feeCancelFlag = feeCancelFlag;
    }

    public XLDFDomainObject getFeeDetail() {
        return feeDetail;
    }

    public void setFeeDetail(XLDFDomainObject feeDetail) {
        this.feeDetail = feeDetail;
    }

    public String getApplyCopyCnt() {
        return applyCopyCnt;
    }

    public void setApplyCopyCnt(String applyCopyCnt) {
        this.applyCopyCnt = applyCopyCnt;
    }

    public Boolean getMannualAddFlag() {
        return mannualAddFlag;
    }

    public void setMannualAddFlag(Boolean mannualAddFlag) {
        this.mannualAddFlag = mannualAddFlag;
    }

    public Boolean getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(Boolean modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public String getOrgSerialNumber() {
        return orgSerialNumber;
    }

    public void setOrgSerialNumber(String orgSerialNumber) {
        this.orgSerialNumber = orgSerialNumber;
    }

    public Boolean getNotCancelFlag() {
        return notCancelFlag;
    }

    public void setNotCancelFlag(Boolean notCancelFlag) {
        this.notCancelFlag = notCancelFlag;
    }

}
