package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a200DataDTO", propOrder = { "Number", "Category", "FeeItem", "Unit", "Price", "Account" })
@XmlRootElement(name = "Rl0a200DataDTO")
public class Rl0a200DataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 序號 */
    @XmlElement(name = "Number")
    @FieldName("序號")
    private String number;

    /** 規費項目類別 */
    @XmlElement(name = "Category")
    private String category;

    /** 規費項目名稱 */
    @XmlElement(name = "FeeItem")
    private String feeItem;

    /** 單位 */
    @XmlElement(name = "Unit")
    private String unit;

    /** 金額 */
    @XmlElement(name = "Price")
    private String price;

    /** 會計科目 */
    @XmlElement(name = "Account")
    private String account;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
