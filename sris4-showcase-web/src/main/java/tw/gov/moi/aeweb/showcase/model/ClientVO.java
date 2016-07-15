package tw.gov.moi.aeweb.showcase.model;

import java.io.Serializable;
import java.sql.Date;

public class ClientVO implements Serializable {

	private String clientID;
	private String clientName;
	private String clientBornIdentity;
	private String clientBornLoc;
	private String clientBornOrder;
	private Date clientBornDate;
	private String clientAddress;
	private String clientMate;
	private String clientFather;
	private String clientMother;
	private String clientNewId;
	
	
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientBornIdentity() {
		return clientBornIdentity;
	}
	public void setClientBornIdentity(String clientBornIdentity) {
		this.clientBornIdentity = clientBornIdentity;
	}
	public String getClientBornLoc() {
		return clientBornLoc;
	}
	public void setClientBornLoc(String clientBornLoc) {
		this.clientBornLoc = clientBornLoc;
	}
	public String getClientBornOrder() {
		return clientBornOrder;
	}
	public void setClientBornOrder(String clientBornOrder) {
		this.clientBornOrder = clientBornOrder;
	}
	public Date getClientBornDate() {
		return clientBornDate;
	}
	public void setClientBornDate(Date clientBornDate) {
		this.clientBornDate = clientBornDate;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientMate() {
		return clientMate;
	}
	public void setClientMate(String clientMate) {
		this.clientMate = clientMate;
	}
	public String getClientFather() {
		return clientFather;
	}
	public void setClientFather(String clientFather) {
		this.clientFather = clientFather;
	}
	public String getClientMother() {
		return clientMother;
	}
	public void setClientMother(String clientMother) {
		this.clientMother = clientMother;
	}
	public String getClientNewId() {
		return clientNewId;
	}
	public void setClientNewId(String clientNewId) {
		this.clientNewId = clientNewId;
	}
	
	
}
