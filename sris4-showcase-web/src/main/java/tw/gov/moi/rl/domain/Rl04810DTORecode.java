package tw.gov.moi.rl.domain;

import java.io.Serializable;

public class Rl04810DTORecode implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String oldSiteId = "";
    private String newSiteId = "";
    private String oldAdminOfficeCode = "";
    private String newAdminOfficeCode = "";
    private String dataSiteId = "";
    private String oldStreetDoorPlate = "";
    private String newStreetDoorPlate = "";
    private String modifyDate = "";

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getOldSiteId() {
        return oldSiteId;
    }

    public void setOldSiteId(String oldSiteId) {
        this.oldSiteId = oldSiteId;
    }

    public String getNewSiteId() {
        return newSiteId;
    }

    public void setNewSiteId(String newSiteId) {
        this.newSiteId = newSiteId;
    }

    public String getOldAdminOfficeCode() {
        return oldAdminOfficeCode;
    }

    public void setOldAdminOfficeCode(String oldAdminOfficeCode) {
        this.oldAdminOfficeCode = oldAdminOfficeCode;
    }

    public String getNewAdminOfficeCode() {
        return newAdminOfficeCode;
    }

    public void setNewAdminOfficeCode(String newAdminOfficeCode) {
        this.newAdminOfficeCode = newAdminOfficeCode;
    }

    public String getDataSiteId() {
        return dataSiteId;
    }

    public void setDataSiteId(String dataSiteId) {
        this.dataSiteId = dataSiteId;
    }

    public String getOldStreetDoorPlate() {
        return oldStreetDoorPlate;
    }

    public void setOldStreetDoorPlate(String oldStreetDoorPlate) {
        this.oldStreetDoorPlate = oldStreetDoorPlate;
    }

    public String getNewStreetDoorPlate() {
        return newStreetDoorPlate;
    }

    public void setNewStreetDoorPlate(String newStreetDoorPlate) {
        this.newStreetDoorPlate = newStreetDoorPlate;
    }

}
