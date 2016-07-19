package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDataQueryDsNameDto", propOrder = { "dsName", "destSiteId", "queryParameter"  })
@XmlRootElement(name = "MultiDataQueryDsNameDto")
public class MultiDataQueryDsNameDto implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @FieldName("交易代號")
    @XmlElement(name = "DsName", required = true)
    private String dsName  ;

    @FieldName("作業點代碼")
    @XmlElement(name = "DestSiteId", required = true)
    private String destSiteId;

    @FieldName("SQL指令內容")
    @XmlElement(name = "QueryParameter", required = true)
    private List<String> queryParameter ;

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public String getDestSiteId() {
        return destSiteId;
    }

    public void setDestSiteId(String destSiteId) {
        this.destSiteId = destSiteId;
    }

    public List<String> getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(List<String> queryParameter) {
        this.queryParameter = queryParameter;
    }
    
}
