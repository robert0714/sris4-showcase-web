package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.mutltiDataPocess.RlRemoteCommandLogic;
import tw.gov.moi.rs.dto.PairEntry;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRemoteCommandRequestDto", propOrder = { "commandClassTypeCanonicalName" ,"destiSiteId","executantType" ,"paramaters" })
@XmlRootElement(name = "RlRemoteCommandRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlRemoteCommandRequestDto implements Serializable {
    
    private static final long serialVersionUID = 1318261071129869863L;

    @FieldName("命令模式使用的class name")
    @XmlElement(name = "commandClassTypeCanonicalName", required = true)
    private String commandClassTypeCanonicalName;
    
    @FieldName("命令模式的執行作業點")
    @XmlElement(name = "destiSiteId", required = true)
    private String destiSiteId;
    
    @FieldName("使用資訊")
    @XmlElement(name = "executantType", required = true)
    private ExecutantType executantType ;
    
    @FieldName("參數")
    @XmlElement(name = "paramaters", required = true)
    private PairEntry paramaters;
    
    public Class<? extends RlRemoteCommandLogic> getCommandClassType() {
	Class<RlRemoteCommandLogic> clazz = null;
	if (StringUtils.isNotBlank(this.commandClassTypeCanonicalName)) {
	    try {
		clazz = (Class<RlRemoteCommandLogic>) Class.forName(this.commandClassTypeCanonicalName);
	    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	    }
	}
	return clazz;
    }

    public void setCommandClassType(final Class<? extends RlRemoteCommandLogic> clazz) {
	if (clazz != null) {
	    this.commandClassTypeCanonicalName = clazz.getCanonicalName();
	}
    }

    public ExecutantType getExecutantType() {
        return executantType;
    }

    public void setExecutantType(ExecutantType executantType) {
        this.executantType = executantType;
    }

    public PairEntry getParamaters() {
        return paramaters;
    }

    public void setParamaters(PairEntry paramaters) {
        this.paramaters = paramaters;
    }

    public String getDestiSiteId() {
        return destiSiteId;
    }

    public void setDestiSiteId(String destiSiteId) {
        this.destiSiteId = destiSiteId;
    }
    
}
