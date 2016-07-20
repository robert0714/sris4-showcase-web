package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.domain.Rs04810DResultDTO;
import tw.gov.moi.rs.domain.Rs04810MainDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04810DTO", propOrder = { "adminOfficeCode", "oldSiteId", "oldAdminofficeCode", "modifyDate",
        "result" })
@XmlRootElement(name = "Rl04810DTO")
public class Rl04810DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "AdminOfficeCode")
    @FieldName("調整後作業點代碼")
    private String adminOfficeCode;

    @XmlElement(name = "OldSiteId")
    @FieldName("調整前作業點代碼")
    private String oldSiteId;

    @XmlElement(name = "OldAdminofficeCode")
    @FieldName("調整前作業點代碼")
    private String oldAdminofficeCode;

    @XmlElement(name = "ModifyDate")
    @FieldName("調整日期")
    private String modifyDate;

    private String oldStreetDoorPlate = "";
    private String newStreetDoorPlate = "";

    private String oldMainStreetDoorPlate = "";
    private String newMainStreetDoorPlate = "";

    @XmlElement(name = "Result")
    @FieldName("查詢結果")
    private List<Rs04810DResultDTO> result = new ArrayList<Rs04810DResultDTO>();

    private Rs04810MainDTO rl04810MainDTO = new Rs04810MainDTO();

    public Rs04810MainDTO getRl04810MainDTO() {
        return rl04810MainDTO;
    }

    public void setRl04810MainDTO(Rs04810MainDTO rl04810MainDTO) {
        this.rl04810MainDTO = rl04810MainDTO;
    }

    public String getOldAdminofficeCode() {
        return oldAdminofficeCode;
    }

    public void setOldAdminofficeCode(String oldAdminofficeCode) {
        this.oldAdminofficeCode = oldAdminofficeCode;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getOldSiteId() {
        return oldSiteId;
    }

    public void setOldSiteId(String oldSiteId) {
        this.oldSiteId = oldSiteId;
    }

    public List<Rs04810DResultDTO> getResult() {
        return result;
    }

    public void setResult(List<Rs04810DResultDTO> result) {
        this.result = result;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
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

    public String getOldMainStreetDoorPlate() {
        return oldMainStreetDoorPlate;
    }

    public void setOldMainStreetDoorPlate(String oldMainStreetDoorPlate) {
        this.oldMainStreetDoorPlate = oldMainStreetDoorPlate;
    }

    public String getNewMainStreetDoorPlate() {
        return newMainStreetDoorPlate;
    }

    public void setNewMainStreetDoorPlate(String newMainStreetDoorPlate) {
        this.newMainStreetDoorPlate = newMainStreetDoorPlate;
    }

}
