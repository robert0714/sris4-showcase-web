package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.Map;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public class RlWsRuleDefaultData implements RlWsRule ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 5024107512844264473L;
    private Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> data;

    public Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> getData() {
        return data;
    }

    public void setData(Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> data) {
        this.data = data;
    }
    
    

}
