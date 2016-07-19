package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf004nType;
import tw.gov.moi.rs.dto.ObnfDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01000DTO", propOrder = { "wkNoticeType", "wkChgType", "wkTableName", "transactionId", "mqMessageId",
		"wkSenderSiteId", "wkReceiverSiteId", "JmsCode", "JmsDeCode" })
@XmlRootElement(name = "Rl01000DTO")
public class Rl01000DTO {

	/** WkNoticeType */
	@XmlElement(name = "WkNoticeType")
	@FieldName("WkNoticeType")
	private String wkNoticeType;

	/** WkChgType */
	@XmlElement(name = "WkChgType")
	@FieldName("WkChgType")
	private String wkChgType;

	/** WkTableName */
	@XmlElement(name = "WkTableName")
	@FieldName("WkTableName")
	private String wkTableName;

	/** 交易序號 */
	@XmlElement(name = "TransactionId")
	@FieldName("TransactionId")
	private String transactionId;

	/** MQ Message ID */
	@XmlElement(name = "MqMessageId")
	@FieldName("MqMessageId")
	private String mqMessageId;

	/** WkSenderSiteId */
	@XmlElement(name = "WkSenderSiteId")
	@FieldName("WkSenderSiteId")
	private String wkSenderSiteId;

	/** WkReceiverSiteId */
	@XmlElement(name = "WkReceiverSiteId")
	@FieldName("WkReceiverSiteId")
	private String wkReceiverSiteId;

	/** ShowCase */
	@XmlElement(name = "ShowCase")
	@FieldName("ShowCase")
	private ObnfDTO showCase;

	/** JmsCode */
	@XmlElement(name = "JmsCode")
	@FieldName("JmsCode")
	private String jmsCode;

	/** JmsDeCode */
	@XmlElement(name = "JmsDeCode")
	@FieldName("JmsDeCode")
	private String jmsDeCode;
	
	
	/** JmsDeCode */
	@XmlElement(name = "Rldf004n")
	@FieldName("役政通報")
	private Rldf004nType rldf004n=new Rldf004nType();
	
	/** JmsDeCode */
	@XmlElement(name = "rldf004n2")
	@FieldName("役政通報")
	private Rldf004nType rldf004n2=new Rldf004nType();
	/** receiverSiteId_004n */
	@XmlElement(name = "receiverSiteId_004n")
	@FieldName("接收端siteId")
	private String receiverSiteId_004n;
	
	/** receiverSiteId_004n */
	@XmlElement(name = "pwd")
	@FieldName("接收端siteId")
	private String pwd;
	
	
	public String getJmsCode() {
		return jmsCode;
	}

	public void setJmsCode(String jmsCode) {
		this.jmsCode = jmsCode;
	}

	public String getJmsDeCode() {
		return jmsDeCode;
	}

	public void setJmsDeCode(String jmsDeCode) {
		this.jmsDeCode = jmsDeCode;
	}

	public ObnfDTO getShowCase() {
		return showCase;
	}

	public void setShowCase(ObnfDTO showCase) {
		this.showCase = showCase;
	}

	public String getWkNoticeType() {
		return wkNoticeType;
	}

	public void setWkNoticeType(String wkNoticeType) {
		this.wkNoticeType = wkNoticeType;
	}

	public String getWkChgType() {
		return wkChgType;
	}

	public void setWkChgType(String wkChgType) {
		this.wkChgType = wkChgType;
	}

	public String getWkTableName() {
		return wkTableName;
	}

	public void setWkTableName(String wkTableName) {
		this.wkTableName = wkTableName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMqMessageId() {
		return mqMessageId;
	}

	public void setMqMessageId(String mqMessageId) {
		this.mqMessageId = mqMessageId;
	}

	public String getWkSenderSiteId() {
		return wkSenderSiteId;
	}

	public void setWkSenderSiteId(String wkSenderSiteId) {
		this.wkSenderSiteId = wkSenderSiteId;
	}

	public String getWkReceiverSiteId() {
		return wkReceiverSiteId;
	}

	public void setWkReceiverSiteId(String wkReceiverSiteId) {
		this.wkReceiverSiteId = wkReceiverSiteId;
	}

	public Rldf004nType getRldf004n() {
		return rldf004n;
	}

	public void setRldf004n(Rldf004nType rldf004n) {
		this.rldf004n = rldf004n;
	}

	public String getReceiverSiteId_004n() {
		return receiverSiteId_004n;
	}

	public void setReceiverSiteId_004n(String receiverSiteId_004n) {
		this.receiverSiteId_004n = receiverSiteId_004n;
	}

	public Rldf004nType getRldf004n2() {
		return rldf004n2;
	}

	public void setRldf004n2(Rldf004nType rldf004n2) {
		this.rldf004n2 = rldf004n2;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
