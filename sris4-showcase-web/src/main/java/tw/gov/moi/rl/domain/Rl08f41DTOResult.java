package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rldf001mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f41DTOResult", propOrder = { "reportMap", "reportKind", "reportId", "sourceFieldNameList",
        "targetFieldNameList", "rldfz101TypeList", "sourceData", "tempTable", "sqlStatement", "fieldValueList",
        "rlde853wType" })
@XmlRootElement(name = "Rl08f41DTOResult")
public class Rl08f41DTOResult implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "rlde806wType", required = true)
    @FieldName("Rlde806wType")
    private Rlde806wType rlde806wType = new Rlde806wType();

    @XmlElement(name = "rldf001mType", required = true)
    @FieldName("Rldf001mType ")
    private Rldf001mType rldf001mType = null;

    private String fulladdress = StringUtils.EMPTY;

    // =====================================///
    // ==4M or 4H 資料
    // =====================================///

    private String livingStyleCode = "";// 原住民身分
    private String moveInYyymmdd = "";// 遷入日期
    private String personalMarket = "";// 個人註記
    private String personalMarketContent = "";// 個人註記內容
    private String birthPlaceCode = "";// 戶籍地址
    private String idCardApplyYyymmdd = "";// 補換證

    // =====================================///
    // ==rlde853資料
    // =====================================///
    private String streetDoorplate = "";

    private List<Rl08f41Vote> votess = new ArrayList<Rl08f41Vote>();

    public List<Rl08f41Vote> getVotess() {
        return votess;
    }

    public void setVotess(List<Rl08f41Vote> votess) {
        this.votess = votess;
    }

    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    public String getMoveInYyymmdd() {
        return moveInYyymmdd;
    }

    public void setMoveInYyymmdd(String moveInYyymmdd) {
        this.moveInYyymmdd = moveInYyymmdd;
    }

    public String getPersonalMarket() {
        return personalMarket;
    }

    public void setPersonalMarket(String personalMarket) {
        this.personalMarket = personalMarket;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public Rl08f41DTOResult(Rlde806wType rlde806wType) {
        super();
        this.rlde806wType = rlde806wType;
    }

    public Rl08f41DTOResult() {
        super();

    }

    public Rlde806wType getRlde806wType() {
        return rlde806wType;
    }

    public void setRlde806wType(Rlde806wType rlde806wType) {
        this.rlde806wType = rlde806wType;
    }

    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
    }

    public String getFulladdress() {
        return fulladdress;
    }

    public void setFulladdress(String fulladdress) {
        this.fulladdress = fulladdress;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getPersonalMarketContent() {
        return personalMarketContent;
    }

    public void setPersonalMarketContent(String personalMarketContent) {
        this.personalMarketContent = personalMarketContent;
    }

    @Override
    public String toString() {
        return "Rl08f41DTOResult [rlde806wType=" + rlde806wType + ", rldf001mType=" + rldf001mType + ", fulladdress="
                + fulladdress + ", livingStyleCode=" + livingStyleCode + ", moveInYyymmdd=" + moveInYyymmdd
                + ", personalMarket=" + personalMarket + ", birthPlaceCode=" + birthPlaceCode + ", idCardApplyYyymmdd="
                + idCardApplyYyymmdd + ", streetDoorplate=" + streetDoorplate + "]";
    }

}
