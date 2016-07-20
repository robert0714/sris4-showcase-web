package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.xldf.dto.XLDF001A;
import tw.gov.moi.rl.component.xldf.dto.XLDF002D;
import tw.gov.moi.rl.component.xldf.dto.XLDF008A;
import tw.gov.moi.rl.component.xldf.dto.XLDF008M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM06M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 
 * @author Weiren.Jheng
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlWsRule008FacadeDTO", propOrder = { "main4M", "main1M", "householdHead4M", "xLDF001A", "xLDF002D",
        "xLDF008A", "xLDF008M", "xLDFM06M" })
@XmlRootElement(name = "RlWsRule008FacadeDTO")
public class RlWsRule008FacadeDTO implements RlWsRule, Serializable {

    private static final long serialVersionUID = 4748285131073708956L;

    @XmlElement(name = "")
    @FieldName("當事人的現戶個人資料")
    private XLDFPersonDataDomainObject main4M;// 被查詢者的4M

    @XmlElement(name = "")
    @FieldName("當事人的現戶全戶資料")
    private XLDFHouseholdDataDomainObject main1M;// 被查詢者的1M

    @XmlElement(name = "")
    @FieldName("當事人的現戶戶長個人資料")
    private XLDFPersonDataDomainObject householdHead4M;// 被查詢者的戶長之4M

    @XmlElement(name = "XLDF001A")
    @FieldName("當事人全面換證資料")
    private XLDF001A xLDF001A;

    @XmlElement(name = "XLDF002D")
    @FieldName("當事人新式國民身分證請領記錄檔")
    private XLDF002D xLDF002D;

    @XmlElement(name = "XLDF008A")
    @FieldName("全面換證起始日資料檔")
    private XLDF008A xLDF008A;

    @XmlElement(name = "XLDF008M")
    @FieldName("當事人特殊人口資料檔")
    private List<XLDF008M> xLDF008M;

    @XmlElement(name = "XLDFM06M")
    @FieldName("當事人國民身分證掛失紀錄檔")
    private XLDFM06M xLDFM06M;

    public XLDFPersonDataDomainObject getMain4M() {
        return main4M;
    }

    public void setMain4M(XLDFPersonDataDomainObject main4m) {
        main4M = main4m;
    }

    public XLDFHouseholdDataDomainObject getMain1M() {
        return main1M;
    }

    public void setMain1M(XLDFHouseholdDataDomainObject main1m) {
        main1M = main1m;
    }

    public XLDFPersonDataDomainObject getHouseholdHead4M() {
        return householdHead4M;
    }

    public void setHouseholdHead4M(XLDFPersonDataDomainObject householdHead4M) {
        this.householdHead4M = householdHead4M;
    }

    public XLDF001A getxLDF001A() {
        return xLDF001A;
    }

    public void setxLDF001A(XLDF001A xLDF001A) {
        this.xLDF001A = xLDF001A;
    }

    public XLDF002D getxLDF002D() {
        return xLDF002D;
    }

    public void setxLDF002D(XLDF002D xLDF002D) {
        this.xLDF002D = xLDF002D;
    }

    public XLDF008A getxLDF008A() {
        return xLDF008A;
    }

    public void setxLDF008A(XLDF008A xLDF008A) {
        this.xLDF008A = xLDF008A;
    }

    public XLDFM06M getxLDFM06M() {
        return xLDFM06M;
    }

    public void setxLDFM06M(XLDFM06M xLDFM06M) {
        this.xLDFM06M = xLDFM06M;
    }

    public List<XLDF008M> getxLDF008M() {
        return xLDF008M;
    }

    public void setxLDF008M(List<XLDF008M> xLDF008M) {
        this.xLDF008M = xLDF008M;
    }

}
