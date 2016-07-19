package tw.gov.moi.rl.component.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.math.NumberUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.XLDFTxnPersonDTO;

/**
 * The Class XLDFTransaction.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFTransaction", propOrder = { "applicant1", "applicant2", "delegatedPerson", "transactionId",
        "siteId", "transactionPersons", "operations", "acceptAdminOfficeCode", "currentPersonIndex", "fineReceiptId",
        "doGetAllFiles" })
@XmlRootElement(name = "XLDFTransaction")
public class XLDFTransaction {

    // 申請人1資料
    /** The applicant1. */
    @XmlElement(name = "applicant1")
    @FieldName("申請人1資料")
    private XLDFApplicantDataDTO applicant1;

    // 申請人2資料
    /** The applicant2. */
    @XmlElement(name = "applicant2")
    @FieldName("申請人2資料")
    private XLDFApplicantDataDTO applicant2;

    // 受委託人資料
    /** The delegated person. */
    @XmlElement(name = "delegatedPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** The transaction id. */
    @XmlElement(name = "transactionId")
    @FieldName("交易序號")
    private String transactionId;

    /** The site id. */
    @XmlElement(name = "siteId")
    @FieldName("作業點代碼")
    private String siteId;

    // 當事人清單
    /** The transaction persons. */
    @XmlElement(name = "transactionPersons")
    @FieldName("當事人清單")
    private List<XLDFTxnPersonDTO> transactionPersons = new ArrayList<XLDFTxnPersonDTO>();

    // 作業清單
    /** The operations. */
    @XmlElement(name = "operations")
    @FieldName("作業清單")
    private List<XLDFTransactionOperation> operations = new ArrayList<XLDFTransactionOperation>();

    /** The accept admin office code. */
    @XmlElement(name = "acceptAdminOfficeCode")
    @FieldName("戶政事務所代碼")
    private String acceptAdminOfficeCode;

    /** The current person index. */
    @XmlElement(name = "currentPersonIndex")
    @FieldName("當事人索引")
    private Integer currentPersonIndex;

    /** The fine receipt id. */
    @XmlElement(name = "fineReceiptId")
    @FieldName("規費序號")
    private String fineReceiptId;

    /** The do get all files. */
    @XmlElement(name = "DoGetAllFiles")
    @FieldName("是否已取得遠端主機全戶加戶下成員資料放入本地主機")
    private boolean doGetAllFiles = Boolean.FALSE;

    /**
     * Gets the current person index.
     *
     * @return the current person index
     */
    public Integer getCurrentPersonIndex() {
        return this.currentPersonIndex == null ? NumberUtils.INTEGER_ZERO : this.currentPersonIndex;
    }

    /**
     * Sets the current person index.
     *
     * @param currentPersonIndex the new current person index
     */
    public void setCurrentPersonIndex(Integer currentPersonIndex) {
        this.currentPersonIndex = currentPersonIndex;
    }

    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Sets the transaction id.
     *
     * @param transactionId the new transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the operations.
     *
     * @return the operations
     */
    public List<XLDFTransactionOperation> getOperations() {
        return this.operations;
    }

    /**
     * Sets the operations.
     *
     * @param operations the new operations
     */
    public void setOperations(List<XLDFTransactionOperation> operations) {
        this.operations = operations;
    }

    /**
     * Gets the accept admin office code.
     *
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return this.acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     *
     * @param acceptAdminOfficeCode the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the applicant1.
     *
     * @return the applicant1
     */
    public XLDFApplicantDataDTO getApplicant1() {
        return this.applicant1;
    }

    /**
     * Sets the applicant1.
     *
     * @param applicant1 the new applicant1
     */
    public void setApplicant1(XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
    }

    /**
     * Gets the applicant2.
     *
     * @return the applicant2
     */
    public XLDFApplicantDataDTO getApplicant2() {
        return this.applicant2;
    }

    /**
     * Sets the applicant2.
     *
     * @param applicant2 the new applicant2
     */
    public void setApplicant2(XLDFApplicantDataDTO applicant2) {
        this.applicant2 = applicant2;
    }

    /**
     * Gets the delegated person.
     *
     * @return the delegated person
     */
    public XLDFPersonBriefDataDTO getDelegatedPerson() {
        return this.delegatedPerson;
    }

    /**
     * Sets the delegated person.
     *
     * @param delegatedPerson the new delegated person
     */
    public void setDelegatedPerson(XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    /**
     * Gets the transaction persons.
     *
     * @return the transaction persons
     */
    public List<XLDFTxnPersonDTO> getTransactionPersons() {
        return this.transactionPersons;
    }

    /**
     * Sets the transaction persons.
     *
     * @param transactionPersons the new transaction persons
     */
    public void setTransactionPersons(List<XLDFTxnPersonDTO> transactionPersons) {
        this.transactionPersons = transactionPersons;
    }

    /**
     * Gets the current person.
     *
     * @return the current person
     */
    public XLDFTxnPersonDTO getCurrentPerson() {
        XLDFTxnPersonDTO returnVal = null;
        final List<XLDFTxnPersonDTO> txnPrs = getTransactionPersons();
        final  Integer currentPersIndex = getCurrentPersonIndex();
        if (CollectionUtils.isNotEmpty(txnPrs)) {
            for (XLDFTxnPersonDTO dto : txnPrs) {
                if (currentPersIndex.equals(dto.getPersonSerialNo())) {
                    returnVal = dto;
                    break;
                }
            }
        }
        return returnVal;
    }

    /**
     * Gets the site id.
     *
     * @return the site id
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * Sets the site id.
     *
     * @param siteId the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the fine receipt id.
     *
     * @return the fine receipt id
     */
    public String getFineReceiptId() {
        return this.fineReceiptId;
    }

    /**
     * Sets the fine receipt id.
     *
     * @param fineReceiptId the new fine receipt id
     */
    public void setFineReceiptId(String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
    }

    /**
     * Checks if is do get all files.
     *
     * @return the doGetAllFiles
     */
    public boolean isDoGetAllFiles() {
        return this.doGetAllFiles;
    }

    /**
     * Sets the do get all files.
     *
     * @param doGetAllFiles            the doGetAllFiles to set
     */
    public void setDoGetAllFiles(boolean doGetAllFiles) {
        this.doGetAllFiles = doGetAllFiles;
    }

}
