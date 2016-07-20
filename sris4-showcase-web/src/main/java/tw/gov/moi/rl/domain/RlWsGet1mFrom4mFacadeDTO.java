package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlWsGet1mFrom4mFacadeDTO", propOrder = { "main4M", "main1M"  })
@XmlRootElement(name = "RlWsGet1mFrom4mFacadeDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlWsGet1mFrom4mFacadeDTO implements RlWsRule ,Serializable{
    @FieldName("被查詢者的4M")
    @XmlElement(name = "Main4M", required = true)
    private XLDFPersonDataDomainObject main4M;
    @FieldName("被查詢者的1M")
    @XmlElement(name = "Main1M", required = true)
    private XLDFHouseholdDataDomainObject main1M;
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
    

}
