package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01h31DTO
 * 
 * @author Alan Lo
 */
public class Rl01h31DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 省市縣市代碼 */
    @XmlElement(name = "CityCountyCode")
    @FieldName("省市縣市代碼")
    private String cityCountyCode;

    /** 鄉鎮市區代碼 */
    @XmlElement(name = "TownCode")
    @FieldName("鄉鎮市區代碼")
    private String townCode;

    /** 戶所代碼 */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 行政區域/中文資料 */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域/中文資料")
    private String areaCode;

    /** 行政區域英文內容_漢語 */
    @XmlElement(name = "SiteIdE1")
    @FieldName("行政區域英文內容_漢語")
    private String siteIdE1;

    /** 行政區域英文內容_通用 */
    @XmlElement(name = "SiteIdE2")
    @FieldName("行政區域英文內容_通用")
    private String siteIdE2;

    /** 出生地/中文資料 */
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地/中文資料")
    private String birthPlaceCode;

    /** 出生地英文資料_漢語 */
    @XmlElement(name = "BirthPlaceE1")
    @FieldName("出生地英文資料_漢語")
    private String birthPlaceE1;

    /** 出生地英文資料_通用 */
    @XmlElement(name = "BirthPlaceE2")
    @FieldName("出生地英文資料_通用")
    private String birthPlaceE2;

    /** 村里/中文資料 */
    @XmlElement(name = "VillageC")
    @FieldName("村里/中文資料")
    private String villageC;

    /** 村里英文資料_漢語 */
    @XmlElement(name = "VillageE1")
    @FieldName("村里英文資料_漢語")
    private String villageE1;

    /** 村里英文資料_通用 */
    @XmlElement(name = "VillageE2")
    @FieldName("村里英文資料_通用")
    private String villageE2;

    /** 街路門牌/中文資料 */
    @XmlElement(name = "StreetDoorplateC")
    @FieldName("街路門牌/中文資料")
    private String streetDoorplateC;

    /** 街路門牌英文名稱_漢語 */
    @XmlElement(name = "StreetDoorplateE1")
    @FieldName("街路門牌英文名稱_漢語")
    private String streetDoorplateE1;

    /** 街路門牌英文名稱_通用 */
    @XmlElement(name = "StreetDoorplateE2")
    @FieldName("街路門牌英文名稱_通用")
    private String streetDoorplateE2;

    /** 國籍 /中文資料 */
    @XmlElement(name = "Code")
    @FieldName("國籍 /中文資料")
    private String code;

    /** 國籍英文內容_漢語 */
    @XmlElement(name = "Native1")
    @FieldName("國籍英文內容_漢語")
    private String native1;

    /** 國籍英文內容_通用 */
    @XmlElement(name = "Native2")
    @FieldName("國籍英文內容_通用")
    private String native2;

    /** 其他 */
    @XmlElement(name = "Other")
    @FieldName("其他")
    private String other;

    /** 保留欄位 */
    @XmlElement(name = "ApplyReason")
    @FieldName("保留欄位")
    private String applyReason;

    /** 查詢結果 */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl01h31DTO> resultList = new ArrayList<Rl01h31DTO>();

    /** dataTable 中文資料 */
    @XmlElement(name = "ChineseData")
    @FieldName("dataTable 中文資料")
    private String chineseData;

    /** dataTable 漢語拼音 */
    @XmlElement(name = "HanData")
    @FieldName("dataTable 漢語拼音")
    private String hanData;

    /** dataTable 通用拼音 */
    @XmlElement(name = "UniversalData")
    @FieldName("dataTable 通用拼音")
    private String universalData;

    /** ErrorMessage 訊息 */
    @XmlElement(name = "ErrMsg")
    @FieldName("ErrorMessage 訊息")
    private String errMsg;

    public String getCityCountyCode() {
        return cityCountyCode;
    }

    public void setCityCountyCode(String cityCountyCode) {
        this.cityCountyCode = cityCountyCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
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

    public String getSiteIdE1() {
        return siteIdE1;
    }

    public void setSiteIdE1(String siteIdE1) {
        this.siteIdE1 = siteIdE1;
    }

    public String getSiteIdE2() {
        return siteIdE2;
    }

    public void setSiteIdE2(String siteIdE2) {
        this.siteIdE2 = siteIdE2;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public String getBirthPlaceE1() {
        return birthPlaceE1;
    }

    public void setBirthPlaceE1(String birthPlaceE1) {
        this.birthPlaceE1 = birthPlaceE1;
    }

    public String getBirthPlaceE2() {
        return birthPlaceE2;
    }

    public void setBirthPlaceE2(String birthPlaceE2) {
        this.birthPlaceE2 = birthPlaceE2;
    }

    public String getVillageC() {
        return villageC;
    }

    public void setVillageC(String villageC) {
        this.villageC = villageC;
    }

    public String getVillageE1() {
        return villageE1;
    }

    public void setVillageE1(String villageE1) {
        this.villageE1 = villageE1;
    }

    public String getVillageE2() {
        return villageE2;
    }

    public void setVillageE2(String villageE2) {
        this.villageE2 = villageE2;
    }

    public String getStreetDoorplateC() {
        return streetDoorplateC;
    }

    public void setStreetDoorplateC(String streetDoorplateC) {
        this.streetDoorplateC = streetDoorplateC;
    }

    public String getStreetDoorplateE1() {
        return streetDoorplateE1;
    }

    public void setStreetDoorplateE1(String streetDoorplateE1) {
        this.streetDoorplateE1 = streetDoorplateE1;
    }

    public String getStreetDoorplateE2() {
        return streetDoorplateE2;
    }

    public void setStreetDoorplateE2(String streetDoorplateE2) {
        this.streetDoorplateE2 = streetDoorplateE2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNative1() {
        return native1;
    }

    public void setNative1(String native1) {
        this.native1 = native1;
    }

    public String getNative2() {
        return native2;
    }

    public void setNative2(String native2) {
        this.native2 = native2;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public List<Rl01h31DTO> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rl01h31DTO> resultList) {
        this.resultList = resultList;
    }

    public String getChineseData() {
        return chineseData;
    }

    public void setChineseData(String chineseData) {
        this.chineseData = chineseData;
    }

    public String getHanData() {
        return hanData;
    }

    public void setHanData(String hanData) {
        this.hanData = hanData;
    }

    public String getUniversalData() {
        return universalData;
    }

    public void setUniversalData(String universalData) {
        this.universalData = universalData;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}
