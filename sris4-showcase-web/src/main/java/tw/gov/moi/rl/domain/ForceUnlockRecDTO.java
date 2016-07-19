package tw.gov.moi.rl.domain;

import java.io.Serializable;

public class ForceUnlockRecDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3362971669150186524L;

    /**** 解鎖戶籍員帳號 *****/
    private String userId;
    /***** 解鎖戶籍員作業點 *****/
    private String userSited;
    /***** 解鎖戶籍員執行日期 *******/
    private String userDate;
    /***** 解鎖戶籍員執行時間 *******/
    private String userTime;
    /***** 鎖定戶籍員帳號 *******/
    private String actionUser;
    /***** 鎖定戶籍員作業點 *******/
    private String actionSiteId;
    /***** 鎖定的交易序號 *******/
    private String dataTxId;
    /***** 鎖定的民眾統號 *******/
    private String dataPersonId;

    public final String getUserId() {
	return userId;
    }

    public final void setUserId(final String userId) {
	this.userId = userId;
    }

    public final String getUserSited() {
	return userSited;
    }

    public final void setUserSited(final String userSited) {
	this.userSited = userSited;
    }

    public final String getUserDate() {
	return userDate;
    }

    public final void setUserDate(final String userDate) {
	this.userDate = userDate;
    }

    public final String getUserTime() {
	return userTime;
    }

    public final void setUserTime(final String userTime) {
	this.userTime = userTime;
    }

    public final String getActionUser() {
	return actionUser;
    }

    public final void setActionUser(final String actionUser) {
	this.actionUser = actionUser;
    }

    public final String getActionSiteId() {
	return actionSiteId;
    }

    public final void setActionSiteId(final String actionSiteId) {
	this.actionSiteId = actionSiteId;
    }

    public final String getDataTxId() {
	return dataTxId;
    }

    public final void setDataTxId(final String dataTxId) {
	this.dataTxId = dataTxId;
    }

    public String getDataPersonId() {
        return dataPersonId;
    }

    public void setDataPersonId(String datapersonId) {
        this.dataPersonId = datapersonId;
    }

}
