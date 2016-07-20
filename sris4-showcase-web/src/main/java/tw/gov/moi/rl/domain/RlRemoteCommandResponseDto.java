package tw.gov.moi.rl.domain;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.util.StringCompressUtil;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRemoteCommandResponseDto", propOrder = { "commandResult","abstractData" })
@XmlRootElement(name = "RlRemoteCommandResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlRemoteCommandResponseDto implements Serializable {

    private static final long serialVersionUID = -1544557678256765444L;

    @FieldName("命令模式所得結果")
    @XmlElement(name = "CommandResult", required = true)
    private String commandResult;
    
    @FieldName("抽象類別所得資料")
    @XmlElement(name = "AbstractData", required = true)
    private String abstractData;

    public Serializable getAbstractData() {
	Serializable result = null;
	try {
	    result = (Serializable)StringCompressUtil.deserializeFromBase64(this.abstractData);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }

    public void setAbstractData(final Serializable inputData) {
	try {
	    this.abstractData = StringCompressUtil.serializeAsBase64(inputData);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    public Serializable getCommandResult() {
	Serializable result = null;
	try {
	    result = (Serializable)StringCompressUtil.deserializeFromBase64(this.commandResult);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }

    public void setCommandResult(final Serializable serializedAppendGetMultiDatalogicList) {
	try {
	    this.commandResult = StringCompressUtil.serializeAsBase64(serializedAppendGetMultiDatalogicList);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
