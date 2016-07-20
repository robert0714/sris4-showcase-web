package tw.gov.moi.rl.domain;

import java.io.Serializable;

public class Rl02a50Datatable implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7187331159571319604L;

    /** 異動類別 */
    private String updateType;

    /** 國民身分證統一編號 */
    private String personId;

    /** 註銷日期 */
    private String personName;

    /** 出生日期 */
    private String birthYyymmdd;

    /** 註銷日期 */
    private String expireYyymmdd;

    /** 註銷時間 */
    private String expireHhmmss;

    /** 註銷原因 */
    private String expireReason;

    /** 本次註銷原因 */
    private String newExpireReason;

    /** 戶所代碼 */
    private String adminOfficeCode;

    /** 行政區代碼 */
    private String areaCode;

    /** 村里 */
    private String village;

    /** 縣市代碼 */
    private String cityTownCode;

    /** 鄰 */
    private String neighbor;

    /** 街路門牌 */
    private String StreetDoorplate;

    /** 備註 */
    private String reservedField;

    /** 空白證號 */
    private String cardNo;

    /** 膠膜號 */
    private String cellophaneNo;

    /** disabled 本次註銷原因 */
    private boolean deleteItem;

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getExpireYyymmdd() {
        return expireYyymmdd;
    }

    public void setExpireYyymmdd(String expireYyymmdd) {
        this.expireYyymmdd = expireYyymmdd;
    }

    public String getExpireHhmmss() {
        return expireHhmmss;
    }

    public void setExpireHhmmss(String expireHhmmss) {
        this.expireHhmmss = expireHhmmss;
    }

    public String getExpireReason() {
        return expireReason;
    }

    public void setExpireReason(String expireReason) {
        this.expireReason = expireReason;
    }

    public String getNewExpireReason() {
        return newExpireReason;
    }

    public void setNewExpireReason(String newExpireReason) {
        this.newExpireReason = newExpireReason;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCityTownCode() {
        return cityTownCode;
    }

    public void setCityTownCode(String cityTownCode) {
        this.cityTownCode = cityTownCode;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return StreetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        StreetDoorplate = streetDoorplate;
    }

    public String getReservedField() {
        return reservedField;
    }

    public void setReservedField(String reservedField) {
        this.reservedField = reservedField;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCellophaneNo() {
        return cellophaneNo;
    }

    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    public boolean isDeleteItem() {
        return deleteItem;
    }

    public void setDeleteItem(boolean deleteItem) {
        this.deleteItem = deleteItem;
    }

}
