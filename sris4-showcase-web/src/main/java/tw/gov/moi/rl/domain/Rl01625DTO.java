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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01625DTO", propOrder = { "registerYyymmdd", "registerBatch", "village", "neighbor",
        "newStreetDoorplate", "changeRange", "selectedRl01625OldAddressDTO", "editedRl01625OldAddressDTO",
        "listRl01625OldAddressDTO", "listRl01625HouseHoldDTO" })
@XmlRootElement(name = "Rl01625DTO")
public class Rl01625DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 編釘日期 */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd = "";

    /** 編釘批號 */
    @XmlElement(name = "RegisterBatch")
    @FieldName("編釘批號")
    private String registerBatch = "";

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰 ")
    private String neighbor = "";

    /** 合併後門牌 */
    @XmlElement(name = "NewStreetDoorplate")
    @FieldName("合併後門牌")
    private String newStreetDoorplate = "";

    /** 複製筆數 */
    @XmlElement(name = "ChangeRange")
    @FieldName("複製筆數")
    private String changeRange = "";

    /** 使用者選取的 */
    @XmlElement(name = "SelectedRl01625OldAddressDTO")
    @FieldName("使用者選取的")
    private Rl01625OldAddressDTO selectedRl01625OldAddressDTO = new Rl01625OldAddressDTO();

    /** 使用者編輯的 */
    @XmlElement(name = "EditedRl01625OldAddressDTO")
    @FieldName("使用者編輯的")
    private Rl01625OldAddressDTO editedRl01625OldAddressDTO = new Rl01625OldAddressDTO();

    /** 合併前門牌list */
    @XmlElement(name = "ListRl01625OldAddressDTO")
    @FieldName("合併前門牌list")
    private List<Rl01625OldAddressDTO> listRl01625OldAddressDTO = new ArrayList<Rl01625OldAddressDTO>(0);

    /** 戶長資料List */
    @XmlElement(name = "ListRl01625HouseHoldDTO")
    @FieldName("戶長資料List")
    private List<Rl01625HouseHoldDTO> listRl01625HouseHoldDTO = new ArrayList<Rl01625HouseHoldDTO>(0);

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterBatch() {
        return registerBatch;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getChangeRange() {
        return changeRange;
    }

    public void setChangeRange(String changeRange) {
        this.changeRange = changeRange;
    }

    public List<Rl01625OldAddressDTO> getListRl01625OldAddressDTO() {
        return listRl01625OldAddressDTO;
    }

    public void setListRl01625OldAddressDTO(List<Rl01625OldAddressDTO> listRl01625OldAddressDTO) {
        this.listRl01625OldAddressDTO = listRl01625OldAddressDTO;
    }

    public List<Rl01625HouseHoldDTO> getListRl01625HouseHoldDTO() {
        return listRl01625HouseHoldDTO;
    }

    public void setListRl01625HouseHoldDTO(List<Rl01625HouseHoldDTO> listRl01625HouseHoldDTO) {
        this.listRl01625HouseHoldDTO = listRl01625HouseHoldDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rl01625OldAddressDTO getSelectedRl01625OldAddressDTO() {
        return selectedRl01625OldAddressDTO;
    }

    public void setSelectedRl01625OldAddressDTO(Rl01625OldAddressDTO selectedRl01625OldAddressDTO) {
        this.selectedRl01625OldAddressDTO = selectedRl01625OldAddressDTO;
    }

    public Rl01625OldAddressDTO getEditedRl01625OldAddressDTO() {
        return editedRl01625OldAddressDTO;
    }

    public void setEditedRl01625OldAddressDTO(Rl01625OldAddressDTO editedRl01625OldAddressDTO) {
        this.editedRl01625OldAddressDTO = editedRl01625OldAddressDTO;
    }

    public String getNewStreetDoorplate() {
        return newStreetDoorplate;
    }

    public void setNewStreetDoorplate(String newStreetDoorplate) {
        this.newStreetDoorplate = newStreetDoorplate;
    }

}
