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
import tw.gov.moi.domain.Rldf011sType;
import tw.gov.moi.domain.Rldfq001Type;
import tw.gov.moi.domain.Rldfq002Type;
import tw.gov.moi.domain.Rldfq003Type;
import tw.gov.moi.domain.Rldfq004Type;
import tw.gov.moi.domain.Rldfq079Type;
import tw.gov.moi.domain.Rldfq080Type;
import tw.gov.moi.domain.Rldfq0z4Type;
import tw.gov.moi.domain.Rldfq0z5Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08210DTO", propOrder = { "statYear", "recordType" })
@XmlRootElement(name = "Rl08210DTO")
public class Rl08210DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1652284573644087246L;

    /** 統計年份. */
    @XmlElement(name = "StatYear")
    @FieldName("統計年份")
    private String statYear;

    private String siteId;

    private String siteName;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /** 轉錄種類. */
    @XmlElement(name = "RecordType")
    @FieldName("轉錄種類")
    private String recordType;

    /** For Job Use */
    @XmlElement(name = "SerialStatem")
    @FieldName("For Job Use")
    private String serialStatem = "";

    /** For Job Use */
    @XmlElement(name = "runMethod")
    @FieldName("runMethod")
    private String runMethod = "";

    /** For Job Use */
    @XmlElement(name = "jobId")
    @FieldName("jobId")
    private String jobId = "";

    /** 申請書種類 */
    @XmlElement(name = "CertificateList")
    @FieldName("申請書種類")
    private List<String> certificateList = new ArrayList<String>();

    /** 申請書 */
    @XmlElement(name = "Certificate")
    @FieldName("申請書")
    private String certificate = "";

    /** 是否為主機點 */
    @XmlElement(name = "InSameHost")
    @FieldName("是否為主機點")
    private boolean inSameHost = false;

    /** 出生資料檔 */
    @XmlElement(name = "Rl08210001DTO")
    @FieldName("出生資料檔")
    private List<Rl08210001DTO> rl08210001DTO = new ArrayList<Rl08210001DTO>();

    // /** 出生登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft001Types")
    // @FieldName("出生登記申請書歷史資料檔")
    // private List<Rldft001Type> rldft001Types = new ArrayList<Rldft001Type>();

    /** 出生登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq001Types")
    @FieldName("出生登記申請書凍結歷史資料檔")
    private List<Rldfq001Type> rldfq001Types = new ArrayList<Rldfq001Type>();

    /** 死亡資料檔 */
    @XmlElement(name = "Rl08210002DTO")
    @FieldName("死亡資料檔")
    private List<Rl08210002DTO> rl08210002DTO = new ArrayList<Rl08210002DTO>();

    // /** 死亡登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft002Types")
    // @FieldName("死亡登記申請書歷史資料檔")
    // private List<Rldft002Type> rldft002Types = new ArrayList<Rldft002Type>();

    /** 死亡登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq002Types")
    @FieldName("死亡登記申請書凍結歷史資料檔")
    private List<Rldfq002Type> rldfq002Types = new ArrayList<Rldfq002Type>();

    /** 結婚資料檔 */
    @XmlElement(name = "Rl08210003DTO")
    @FieldName("結婚資料檔")
    private List<Rl08210003DTO> rl08210003DTO = new ArrayList<Rl08210003DTO>();

    // /** 結婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft003Types")
    // @FieldName("結婚登記申請書歷史資料檔")
    // private List<Rldft003Type> rldft003Types = new ArrayList<Rldft003Type>();

    /** 結婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq003Types")
    @FieldName("結婚登記申請書凍結歷史資料檔")
    private List<Rldfq003Type> rldfq003Types = new ArrayList<Rldfq003Type>();

    // /** 妻結婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft003TypesW")
    // @FieldName("妻結婚登記申請書歷史資料檔")
    // private List<Rldft003Type> rldft003TypesW = new
    // ArrayList<Rldft003Type>();

    /** 妻結婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq003TypesW")
    @FieldName("妻結婚登記申請書凍結歷史資料檔")
    private List<Rldfq003Type> rldfq003TypesW = new ArrayList<Rldfq003Type>();

    // /** 夫結婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft003TypesM")
    // @FieldName("夫結婚登記申請書歷史資料檔")
    // private List<Rldft003Type> rldft003TypesM = new
    // ArrayList<Rldft003Type>();

    /** 夫結婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq003TypesM")
    @FieldName("夫結婚登記申請書凍結歷史資料檔")
    private List<Rldfq003Type> rldfq003TypesM = new ArrayList<Rldfq003Type>();

    /** 離婚資料檔 */
    @XmlElement(name = "Rl08210004DTO")
    @FieldName("離婚資料檔")
    private List<Rl08210004DTO> rl08210004DTO = new ArrayList<Rl08210004DTO>();

    // /** 離婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft004Types")
    // @FieldName("離婚登記申請書歷史資料檔")
    // private List<Rldft004Type> rldft004Types = new ArrayList<Rldft004Type>();

    /** 離婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq004Types")
    @FieldName("離婚登記申請書凍結歷史資料檔")
    private List<Rldfq004Type> rldfq004Types = new ArrayList<Rldfq004Type>();

    /** 監護資料檔 */
    @XmlElement(name = "Rl08210079DTO")
    @FieldName("監護資料檔")
    private List<Rl082100079DTO> rl08210079DTO = new ArrayList<Rl082100079DTO>();

    // /** 監護登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft079Types")
    // @FieldName("監護登記申請書歷史資料檔")
    // private List<Rldft079Type> rldft079Types = new ArrayList<Rldft079Type>();

    /** 監護登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq079Types")
    @FieldName("監護登記申請書凍結歷史資料檔")
    private List<Rldfq079Type> rldfq079Types = new ArrayList<Rldfq079Type>();

    /** 未成年資料檔 */
    @XmlElement(name = "Rl08210080DTO")
    @FieldName("未成年資料檔")
    private List<Rl08210080DTO> rl08210080DTO = new ArrayList<Rl08210080DTO>();

    // /** 未成年登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft080Types")
    // @FieldName("未成年登記申請書歷史資料檔")
    // private List<Rldft080Type> rldft080Types = new ArrayList<Rldft080Type>();

    /** 未成年登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq080Types")
    @FieldName("未成年登記申請書凍結歷史資料檔")
    private List<Rldfq080Type> rldfq080Types = new ArrayList<Rldfq080Type>();

    /** 現無戶籍者結婚動態 */
    @XmlElement(name = "Rl082100Z4DTO")
    @FieldName("現無戶籍者結婚動態")
    private List<Rl082100Z4DTO> rl082100Z4DTO = new ArrayList<Rl082100Z4DTO>();

    // /** 現無戶籍者結婚動態歷史資料檔 */
    // @XmlElement(name = "Rldft0z4Types")
    // @FieldName("現無戶籍者結婚動態歷史資料檔")
    // private List<Rldft0z4Type> rldft0z4Types = new ArrayList<Rldft0z4Type>();

    /** 現無戶籍者結婚動態凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z4Types")
    @FieldName("現無戶籍者結婚動態凍結歷史資料檔")
    private List<Rldfq0z4Type> rldfq0z4Types = new ArrayList<Rldfq0z4Type>();

    /** 現無戶籍者離婚動態 */
    @XmlElement(name = "Rl082100Z5DTO")
    @FieldName("現無戶籍者離婚動態")
    private List<Rl082100Z5DTO> rl082100Z5DTO = new ArrayList<Rl082100Z5DTO>();

    // /** 現無戶籍者離婚動態歷史資料檔 */
    // @XmlElement(name = "Rldft0z5Types")
    // @FieldName("現無戶籍者離婚動態歷史資料檔")
    // private List<Rldft0z5Type> rldft0z5Types = new ArrayList<Rldft0z5Type>();

    /** 現無戶籍者離婚動態凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z5Types")
    @FieldName("現無戶籍者離婚動態凍結歷史資料檔")
    private List<Rldfq0z5Type> rldfq0z5Types = new ArrayList<Rldfq0z5Type>();

    /** 出生日期未詳 */
    @XmlElement(name = "Rldf011sTypes")
    @FieldName("出生日期未詳")
    private List<Rldf011sType> rldf011sTypes = new ArrayList<Rldf011sType>();

    /** 出生日期正確的 */
    @XmlElement(name = "Rldf011sTypesCur")
    @FieldName("出生日期正確")
    private List<Rldf011sType> rldf011sTypesCur = new ArrayList<Rldf011sType>();

    /** 教育程度DTO */
    @XmlElement(name = "eduDTO")
    @FieldName("教育程度DTO")
    private Rl08210EduDTO eduDTO = null;

    /** 分類類別 */
    @XmlElement(name = "classifytype")
    @FieldName("分類類別")
    private String classifytype = "";

    /** 分類類別代碼 */
    @XmlElement(name = "classifyTypeCode")
    @FieldName("分類類別代碼")
    private String classifyTypeCode = "";

    /** TableName */
    @XmlElement(name = "table")
    @FieldName("TableName")
    private String table = "";

    /** 修改欄位 */
    @XmlElement(name = "FixFeild")
    @FieldName("修改欄位")
    private String fixFeild = "";

    /** 其他欄位 */
    @XmlElement(name = "FixFeild")
    @FieldName("其他欄位")
    private String otherCode = "";

    /** 教育程度類型(父、母、夫、妻) */
    @XmlElement(name = "message")
    @FieldName("教育程度類型(父、母、夫、妻)")
    private String message = "";

    /** 是否清檔 */
    @XmlElement(name = "isCleanData")
    @FieldName("是否清檔")
    private String isCleanData = "1";

    /** ForInsert835 */
    @XmlElement(name = "ForInsert835")
    @FieldName("ForInsert835")
    private String forInsert835 = "";

    @XmlElement(name = "BirthNumDTO")
    @FieldName("birthNumDTO")
    private Rl08210BirthNumDTO birthNumDTO;

    @XmlElement(name = "executeTime")
    @FieldName("executeTime")
    private long executeTime;

    @XmlElement(name = "SiteNameTargetList")
    @FieldName("選擇的執行的作業點")
    private List<String> siteNameTargetList;

    @XmlElement(name = "BeginDate")
    @FieldName("BeginDate")
    private String beginDate = "";

    @XmlElement(name = "BeginTime")
    @FieldName("BeginTime")
    private String beginTime = "";

    @XmlElement(name = "warningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    private String nowCreateReportName;

    public String getNowCreateReportName() {
        return nowCreateReportName;
    }

    public void setNowCreateReportName(String nowCreateReportName) {
        this.nowCreateReportName = nowCreateReportName;
    }

    public long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(long executeTime) {
        this.executeTime = executeTime;
    }

    public String getOtherCode() {
        return otherCode;
    }

    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }

    public String getFixFeild() {
        return fixFeild;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setFixFeild(String fixFeild) {
        this.fixFeild = fixFeild;
    }

    public String getStatYear() {
        return statYear;
    }

    public String getClassifytype() {
        return classifytype;
    }

    public String getClassifyTypeCode() {
        return classifyTypeCode;
    }

    public String getForInsert835() {
        return forInsert835;
    }

    public void setForInsert835(String forInsert835) {
        this.forInsert835 = forInsert835;
    }

    public void setClassifytype(String classifytype) {
        this.classifytype = classifytype;
    }

    public void setClassifyTypeCode(String classifyTypeCode) {
        this.classifyTypeCode = classifyTypeCode;
    }

    public void setStatYear(String statYear) {
        this.statYear = statYear;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public List<Rl08210001DTO> getRl08210001DTO() {
        return rl08210001DTO;
    }

    public void setRl08210001DTO(List<Rl08210001DTO> rl08210001dto) {
        rl08210001DTO = rl08210001dto;
    }

    public List<Rl08210002DTO> getRl08210002DTO() {
        return rl08210002DTO;
    }

    public void setRl08210002DTO(List<Rl08210002DTO> rl08210002dto) {
        rl08210002DTO = rl08210002dto;
    }

    public List<Rl08210003DTO> getRl08210003DTO() {
        return rl08210003DTO;
    }

    public void setRl08210003DTO(List<Rl08210003DTO> rl08210003dto) {
        rl08210003DTO = rl08210003dto;
    }

    public List<Rl08210004DTO> getRl08210004DTO() {
        return rl08210004DTO;
    }

    public void setRl08210004DTO(List<Rl08210004DTO> rl08210004dto) {
        rl08210004DTO = rl08210004dto;
    }

    public List<Rl082100079DTO> getRl08210079DTO() {
        return rl08210079DTO;
    }

    public void setRl08210079DTO(List<Rl082100079DTO> rl08210079dto) {
        rl08210079DTO = rl08210079dto;
    }

    public List<Rl08210080DTO> getRl08210080DTO() {
        return rl08210080DTO;
    }

    public void setRl08210080DTO(List<Rl08210080DTO> rl08210080dto) {
        rl08210080DTO = rl08210080dto;
    }

    public List<Rl082100Z4DTO> getRl082100Z4DTO() {
        return rl082100Z4DTO;
    }

    public void setRl082100Z4DTO(List<Rl082100Z4DTO> rl082100z4dto) {
        rl082100Z4DTO = rl082100z4dto;
    }

    public List<Rl082100Z5DTO> getRl082100Z5DTO() {
        return rl082100Z5DTO;
    }

    public void setRl082100Z5DTO(List<Rl082100Z5DTO> rl082100z5dto) {
        rl082100Z5DTO = rl082100z5dto;
    }

    // public List<Rldft001Type> getRldft001Types() {
    // return rldft001Types;
    // }
    //
    // public void setRldft001Types(List<Rldft001Type> rldft001Types) {
    // this.rldft001Types = rldft001Types;
    // }

    public List<Rldfq001Type> getRldfq001Types() {
        return rldfq001Types;
    }

    public void setRldfq001Types(List<Rldfq001Type> rldfq001Types) {
        this.rldfq001Types = rldfq001Types;
    }

    // public List<Rldft002Type> getRldft002Types() {
    // return rldft002Types;
    // }
    //
    // public void setRldft002Types(List<Rldft002Type> rldft002Types) {
    // this.rldft002Types = rldft002Types;
    // }

    public List<Rldfq002Type> getRldfq002Types() {
        return rldfq002Types;
    }

    public void setRldfq002Types(List<Rldfq002Type> rldfq002Types) {
        this.rldfq002Types = rldfq002Types;
    }

    // public List<Rldft003Type> getRldft003Types() {
    // return rldft003Types;
    // }
    //
    // public void setRldft003Types(List<Rldft003Type> rldft003Types) {
    // this.rldft003Types = rldft003Types;
    // }

    public List<Rldfq003Type> getRldfq003Types() {
        return rldfq003Types;
    }

    public void setRldfq003Types(List<Rldfq003Type> rldfq003Types) {
        this.rldfq003Types = rldfq003Types;
    }

    // public List<Rldft004Type> getRldft004Types() {
    // return rldft004Types;
    // }
    //
    // public void setRldft004Types(List<Rldft004Type> rldft004Types) {
    // this.rldft004Types = rldft004Types;
    // }

    public List<Rldfq004Type> getRldfq004Types() {
        return rldfq004Types;
    }

    public void setRldfq004Types(List<Rldfq004Type> rldfq004Types) {
        this.rldfq004Types = rldfq004Types;
    }

    // public List<Rldft079Type> getRldft079Types() {
    // return rldft079Types;
    // }
    //
    // public void setRldft079Types(List<Rldft079Type> rldft079Types) {
    // this.rldft079Types = rldft079Types;
    // }

    public List<Rldfq079Type> getRldfq079Types() {
        return rldfq079Types;
    }

    public void setRldfq079Types(List<Rldfq079Type> rldfq079Types) {
        this.rldfq079Types = rldfq079Types;
    }

    // public List<Rldft080Type> getRldft080Types() {
    // return rldft080Types;
    // }
    //
    // public void setRldft080Types(List<Rldft080Type> rldft080Types) {
    // this.rldft080Types = rldft080Types;
    // }

    public List<Rldfq080Type> getRldfq080Types() {
        return rldfq080Types;
    }

    public void setRldfq080Types(List<Rldfq080Type> rldfq080Types) {
        this.rldfq080Types = rldfq080Types;
    }

    // public List<Rldft003Type> getRldft003TypesW() {
    // return rldft003TypesW;
    // }
    //
    // public void setRldft003TypesW(List<Rldft003Type> rldft003TypesW) {
    // this.rldft003TypesW = rldft003TypesW;
    // }

    public List<Rldfq003Type> getRldfq003TypesW() {
        return rldfq003TypesW;
    }

    public void setRldfq003TypesW(List<Rldfq003Type> rldfq003TypesW) {
        this.rldfq003TypesW = rldfq003TypesW;
    }

    // public List<Rldft003Type> getRldft003TypesM() {
    // return rldft003TypesM;
    // }
    //
    // public void setRldft003TypesM(List<Rldft003Type> rldft003TypesM) {
    // this.rldft003TypesM = rldft003TypesM;
    // }

    public List<Rldfq003Type> getRldfq003TypesM() {
        return rldfq003TypesM;
    }

    public void setRldfq003TypesM(List<Rldfq003Type> rldfq003TypesM) {
        this.rldfq003TypesM = rldfq003TypesM;
    }

    // public List<Rldft0z4Type> getRldft0z4Types() {
    // return rldft0z4Types;
    // }
    //
    // public void setRldft0z4Types(List<Rldft0z4Type> rldft0z4Type) {
    // this.rldft0z4Types = rldft0z4Types;
    // }

    public List<Rldfq0z4Type> getRldfq0z4Types() {
        return rldfq0z4Types;
    }

    public void setRldfq0z4Types(List<Rldfq0z4Type> rldfq0z4Types) {
        this.rldfq0z4Types = rldfq0z4Types;
    }

    // public List<Rldft0z5Type> getRldft0z5Types() {
    // return rldft0z5Types;
    // }
    //
    // public void setRldft0z5Types(List<Rldft0z5Type> rldft0z5Types) {
    // this.rldft0z5Types = rldft0z5Types;
    // }

    public List<Rldfq0z5Type> getRldfq0z5Types() {
        return rldfq0z5Types;
    }

    public void setRldfq0z5Types(List<Rldfq0z5Type> rldfq0z5Types) {
        this.rldfq0z5Types = rldfq0z5Types;
    }

    public List<Rldf011sType> getRldf011sTypes() {
        return rldf011sTypes;
    }

    public void setRldf011sTypes(List<Rldf011sType> rldf011sTypes) {
        this.rldf011sTypes = rldf011sTypes;
    }

    public List<Rldf011sType> getRldf011sTypesCur() {
        return rldf011sTypesCur;
    }

    public void setRldf011sTypesCur(List<Rldf011sType> rldf011sTypesCur) {
        this.rldf011sTypesCur = rldf011sTypesCur;
    }

    public String getSerialStatem() {
        return serialStatem;
    }

    public void setSerialStatem(String serialStatem) {
        this.serialStatem = serialStatem;
    }

    public String getRunMethod() {
        return runMethod;
    }

    public void setRunMethod(String runMethod) {
        this.runMethod = runMethod;
    }

    public Rl08210EduDTO getEduDTO() {
        return eduDTO;
    }

    public void setEduDTO(Rl08210EduDTO eduDTO) {
        this.eduDTO = eduDTO;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Rl08210BirthNumDTO getBirthNumDTO() {
        return birthNumDTO;
    }

    public void setBirthNumDTO(Rl08210BirthNumDTO birthNumDTO) {
        this.birthNumDTO = birthNumDTO;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIsCleanData() {
        return isCleanData;
    }

    public void setIsCleanData(String isCleanData) {
        this.isCleanData = isCleanData;
    }

    public List<String> getSiteNameTargetList() {
        return this.siteNameTargetList;
    }

    public void setSiteNameTargetList(List<String> siteNameTargetList) {
        this.siteNameTargetList = siteNameTargetList;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    @Override
    public String toString() {
        return "Rl08210DTO [statYear="
                + statYear
                + ", siteId="
                + siteId
                + ", recordType="
                + recordType
                + ", serialStatem="
                + serialStatem
                + ", certificateList="
                + certificateList
                + ", rl08210001DTO="
                + rl08210001DTO
                + ", rl08210002DTO="
                + rl08210002DTO
                + ", rl08210003DTO="
                + rl08210003DTO
                + ", rl08210004DTO="
                + rl08210004DTO
                + ", rl08210079DTO="
                + rl08210079DTO
                + ", rl08210080DTO="
                + rl08210080DTO
                + ", rl082100Z4DTO="
                + rl082100Z4DTO
                + ", rl082100Z5DTO="
                + rl082100Z5DTO
                // + ", rldft001Types=" + rldft001Types + ", rldft002Types=" +
                // rldft002Types + ", rldft003Types="
                // + rldft003Types + ", rldft003TypesW=" + rldft003TypesW +
                // ", rldft003TypesM=" + rldft003TypesM
                // + ", rldft004Types=" + rldft004Types + ", rldft079Types=" +
                // rldft079Types + +", rldft080Types="
                // + rldft080Types + ", rldft0z4Types=" + rldft0z4Types +
                // ", rldft0z5Types=" + rldft0z5Types
                + ", rldf011sTypes=" + rldf011sTypes + ", rldf011sTypesCur=" + rldf011sTypesCur + ", eduDTO=" + eduDTO
                + ", classifytype=" + classifytype + ", table=" + table + ", fixFeild=" + fixFeild + ", otherCode="
                + otherCode + ", forInsert835=" + forInsert835 + ", birthNumDTO=" + birthNumDTO + ",isCleanData="
                + isCleanData + ", rldfq001Types=" + rldfq001Types + ", rldfq002Types=" + rldfq002Types
                + ", rldfq003Types=" + rldfq003Types + ", rldfq003TypesW=" + rldfq003TypesW + ", rldfq003TypesM="
                + rldfq003TypesM + ", rldfq004Types=" + rldfq004Types + ", rldfq079Types=" + rldfq079Types
                + ", rldfq080Types=" + rldfq080Types + ", rldfq0z4Types=" + rldfq0z4Types + ", rldfq0z5Types="
                + rldfq0z5Types + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((recordType == null) ? 0 : recordType.hashCode());
        result = prime * result + ((statYear == null) ? 0 : statYear.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl08210DTO other = (Rl08210DTO) obj;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (recordType == null) {
            if (other.recordType != null)
                return false;
        } else if (!recordType.equals(other.recordType))
            return false;
        if (statYear == null) {
            if (other.statYear != null)
                return false;
        } else if (!statYear.equals(other.statYear))
            return false;
        return true;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public boolean isInSameHost() {
        return inSameHost;
    }

    public void setInSameHost(boolean inSameHost) {
        this.inSameHost = inSameHost;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
