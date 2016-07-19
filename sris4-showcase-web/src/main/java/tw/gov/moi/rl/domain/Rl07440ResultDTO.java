package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07440ResultDTO", propOrder = { "dataIndex", "transactionId", "regDate", "document",
        "transactionCaseCode", "applyCaseCode", "lane", "personId", "personName" })
@XmlRootElement(name = "Rl07440ResultDTO")
public class Rl07440ResultDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1449642395131423366L;

    /** 查詢結果之資料序號 */
    @FieldName("查詢結果之資料序號")
    @XmlElement(name = "DataIndex", required = false)
    private int dataIndex;

    /** 催告個案交易序號(刪除之Key) */
    @FieldName("催告個案交易序號")
    @XmlElement(name = "TransactionId", required = false)
    private String transactionId;

    /** 開單(登記)日期 */
    @FieldName("開單(登記)日期")
    @XmlElement(name = "RegDate", required = false)
    private String regDate;

    /** 催告文號 */
    @FieldName("催告文號")
    @XmlElement(name = "Document", required = false)
    private String document;

    /** 催告書類別 */
    @FieldName("催告書類別")
    @XmlElement(name = "TransactionCaseCode", required = false)
    private String transactionCaseCode;

    /** 申登案別代碼 */
    @FieldName("申登案別代碼")
    @XmlElement(name = "ApplyCaseCode", required = false)
    private String applyCaseCode;

    /** 受催人統號 */
    @FieldName("受催人統號")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 受催人姓名 */
    @FieldName("受催人姓名")
    @XmlElement(name = "PersonName", required = false)
    private String personName;

    public int getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(int dataIndex) {
        this.dataIndex = dataIndex;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTransactionCaseCode() {
        return transactionCaseCode;
    }

    public void setTransactionCaseCode(String transactionCaseCode) {
        this.transactionCaseCode = transactionCaseCode;
    }

    public String getApplyCaseCode() {
        return applyCaseCode;
    }

    public void setApplyCaseCode(String applyCaseCode) {
        this.applyCaseCode = applyCaseCode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}
