package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rl02800FeeDTO")
public class Rl02800FeeDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 列印資料-正本份數. <BR>
     * Default: 1.
     */
    @XmlElement(name = "OriginalCopies")
    private String originalCopies = "1";

    /**
     * 列印資料-副本份數. <BR>
     * Default: 1.
     */
    @XmlElement(name = "Duplicatecopies")
    private String duplicateCopies = "1";

    /** 列印資料-張數. */
    @XmlElement(name = "Quantity")
    private String quantity = "0";

    /** 列印資料-正本單價. */
    @XmlElement(name = "OriginalFee")
    private String originalFee = "0";

    /** 列印資料-副本單價. */
    @XmlElement(name = "DuplicateFee")
    private String duplicateFee = "0";

    /** 列印資料-正本金額. */
    @XmlElement(name = "OFeeAmount")
    private String oFeeAmount = "0";

    /** 列印資料-副本金額. */
    @XmlElement(name = "DFeeAmount")
    private String dFeeAmount = "0";

    /** 列印資料-正本免收規費原因. */
    @XmlElement(name = "OFreeReason")
    private String oFreeReason;

    /** 列印資料-副本免收規費原因. */
    @XmlElement(name = "DFreeReason")
    private String dFreeReason;

    /** 正本收據號碼. */
    @XmlElement(name = "OreceiptId")
    private String oReceiptId;

    /** 副本收據號碼. */
    @XmlElement(name = "DreceiptId")
    private String dReceiptId;

    public String getOriginalCopies() {
        return originalCopies;
    }

    public void setOriginalCopies(String originalCopies) {
        this.originalCopies = originalCopies;
    }

    public String getDuplicateCopies() {
        return duplicateCopies;
    }

    public void setDuplicateCopies(String duplicateCopies) {
        this.duplicateCopies = duplicateCopies;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOriginalFee() {
        return originalFee;
    }

    public void setOriginalFee(String originalFee) {
        this.originalFee = originalFee;
    }

    public String getDuplicateFee() {
        return duplicateFee;
    }

    public void setDuplicateFee(String duplicateFee) {
        this.duplicateFee = duplicateFee;
    }

    public String getoFeeAmount() {
        return oFeeAmount;
    }

    public void setoFeeAmount(String oFeeAmount) {
        this.oFeeAmount = oFeeAmount;
    }

    public String getdFeeAmount() {
        return dFeeAmount;
    }

    public void setdFeeAmount(String dFeeAmount) {
        this.dFeeAmount = dFeeAmount;
    }

    public String getoFreeReason() {
        return oFreeReason;
    }

    public void setoFreeReason(String oFreeReason) {
        this.oFreeReason = oFreeReason;
    }

    public String getdFreeReason() {
        return dFreeReason;
    }

    public void setdFreeReason(String dFreeReason) {
        this.dFreeReason = dFreeReason;
    }

    public String getoReceiptId() {
        return oReceiptId;
    }

    public void setoReceiptId(String oReceiptId) {
        this.oReceiptId = oReceiptId;
    }

    public String getdReceiptId() {
        return dReceiptId;
    }

    public void setdReceiptId(String dReceiptId) {
        this.dReceiptId = dReceiptId;
    }

    @Override
    public String toString() {
        return "Rl02800FeeDTO [originalCopies=" + originalCopies + ", duplicateCopies=" + duplicateCopies + ", quantity=" + quantity + ", originalFee=" + originalFee + ", duplicateFee=" + duplicateFee + ", oFeeAmount=" + oFeeAmount + ", dFeeAmount=" + dFeeAmount + ", oFreeReason=" + oFreeReason + ", dFreeReason=" + dFreeReason + ", oReceiptId=" + oReceiptId + ", dReceiptId=" + dReceiptId + "]";
    }

}
