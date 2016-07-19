package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class RlWsRule004FacadeDTO implements RlWsRule ,Serializable{
    @FieldName("戶下現住人口4M")
    @XmlElement(name = "Main4M", required = true)
    private List<XLDFPersonDataDomainObject> main4MList;

    public List<XLDFPersonDataDomainObject> getMain4MList() {
        return main4MList;
    }

    public void setMain4MList(List<XLDFPersonDataDomainObject> main4mList) {
        main4MList = main4mList;
    }

}
