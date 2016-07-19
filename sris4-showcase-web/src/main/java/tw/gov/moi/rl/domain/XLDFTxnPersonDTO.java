package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF047H;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;

/**
 * XLDFTxnPersonDTO
 * 
 * @author Data.Cneng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFTxnPersonDTO", propOrder = { "personData", "romeName", "personSerialNo", "siteId",
        "isDisplayQueryBtn" })
@XmlRootElement(name = "XLDFTxnPersonDTO")
public class XLDFTxnPersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(XLDFTxnPersonDTO.class);

    /** 個人基本資料 */
    @XmlElement(name = "PersonData")
    @FieldName("個人基本資料")
    private XLDFDomainObject personData;

    @XmlElement(name = "RomeName")
    @FieldName("羅馬姓名")
    private XLDFDomainObject romeName;

    @XmlElement(name = "PersonSerialNo", required = true)
    @FieldName("流水號")
    private Integer personSerialNo;

    /** site id */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業代碼")
    private String siteId;

    @XmlElement(name = "IsDisplayQueryBtn")
    @FieldName("是否顯示放大鏡")
    private boolean isDisplayQueryBtn;

    public XLDFTxnPersonDTO() {
        super();
    }

    public XLDFTxnPersonDTO(XLDFDomainObject personData, XLDFDomainObject romeName, Integer personSerialNo) {
        super();
        this.personData = personData;
        this.romeName = romeName;
        this.personSerialNo = personSerialNo;
    }

    public XLDFDomainObject getPersonData() {
        return personData;
    }

    public void setPersonData(XLDFDomainObject personData) {
        this.personData = personData;
    }

    public XLDFDomainObject getRomeName() {
        return romeName;
    }

    public void setRomeName(XLDFDomainObject romeName) {
        this.romeName = romeName;
    }

    public Integer getPersonSerialNo() {
        return personSerialNo;
    }

    public void setPersonSerialNo(Integer personSerialNo) {
        this.personSerialNo = personSerialNo;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * 取得姓名羅馬拼音
     * 
     * @return String
     */
    public String getNameRomanization() {
        String returnObject = null;

        if (null != romeName) {
            if (XLDF047M.class.isInstance(romeName)) {
                returnObject = ((XLDF047M) romeName).getDomainObj().getNameRomanization();
            } else if (XLDF047H.class.isInstance(romeName)) {
                returnObject = ((XLDF047H) romeName).getDomainObj().getNameRomanization();
            }
        }

        LOGGER.debug("NameRomanization : {}", returnObject);
        return returnObject;
    }

    public boolean isDisplayQueryBtn() {
        return isDisplayQueryBtn;
    }

    public void setDisplayQueryBtn(boolean isDisplayQueryBtn) {
        this.isDisplayQueryBtn = isDisplayQueryBtn;
    }
}
