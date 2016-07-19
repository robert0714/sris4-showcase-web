package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001eType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf022dType;
import tw.gov.moi.domain.Rldfz2a20Type;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a20DTO", propOrder = { "applyYyymmddStart", "applyYyymmddEnd", "acceptType", "sendId", "villages",
        "sendPageNo", "sendLotNo", "sendPageNo2", "sendLotNo2", "ackCode", "siteId", "nowYyy", "nowMmdd", "nowUseNo", "fileFormat", "reportURL",
        "reportName", "reportParams", "selfList", "otherList", "villageNames", "haveExcelData", "rldf001eTypeSendPageNo", "rldf001eTypeSendPageNoNew",
        "rldf001eTypeSendLotNo", "listRldf002d", "listRldf022d", "listRldf002d22dList", "msgList", "countMap" })
@XmlRootElement(name = "Rl02a20DTO")
public class Rl02a20DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 受理日期起 */
    @XmlElement(name = "ApplyYyymmddStart")
    @FieldName("受理日期起")
    private String applyYyymmddStart = "";

    /** 受理日期迄 */
    @XmlElement(name = "ApplyYyymmddEnd")
    @FieldName("受理日期迄")
    private String applyYyymmddEnd = "";

    /** 辦理類別 */
    @XmlElement(name = "AcceptType")
    @FieldName("辦理類別")
    private String acceptType = "";

    /** 送件識別碼 */
    @XmlElement(name = "SendId")
    @FieldName("送件識別碼")
    private String sendId = "";

    /** 村里 */
    @XmlElement(name = "Villages")
    @FieldName("村里")
    private List<String> villages = new ArrayList<String>();

    /** 送件聯單送件號碼 */
    @XmlElement(name = "SendPageNo")
    @FieldName("送件聯單送件號碼")
    private String sendPageNo = "";

    /** 送件聯單列印序號 */
    @XmlElement(name = "SendLotNo")
    @FieldName("送件聯單列印序號")
    private String sendLotNo = "";

    /** 送件聯單送件號碼2 */
    @XmlElement(name = "SendPageNo2")
    @FieldName("送件聯單送件號碼2")
    private String sendPageNo2 = "";

    /** 送件聯單列印序號2 */
    @XmlElement(name = "SendLotNo2")
    @FieldName("送件聯單列印序號2")
    private String sendLotNo2 = "";

    /** 字號識別代碼 */
    @XmlElement(name = "AckCode")
    @FieldName("字號識別代碼")
    private String ackCode = "";

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 使用年度 */
    @XmlElement(name = "NowYyy")
    @FieldName("使用年度")
    private String nowYyy = "";

    /** 使用年月 */
    @XmlElement(name = "NowMmdd")
    @FieldName("使用年月")
    private String nowMmdd = "";

    /** 目前使用號碼 */
    @XmlElement(name = "NowUseNo")
    @FieldName("目前使用號碼")
    private String nowUseNo = "";

    /** 檔案格式 */
    @XmlElement(name = "FileFormat")
    @FieldName("檔案格式")
    private String fileFormat = "";

    /** 報表URL */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL = "";

    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    @XmlElement(name = "SelfList")
    @FieldName("本所辦理資料")
    private List<Rldfz2a20Type> selfList = new ArrayList<Rldfz2a20Type>();

    @XmlElement(name = "OtherList")
    @FieldName("他所辦理資料")
    private List<Rldfz2a20Type> otherList = new ArrayList<Rldfz2a20Type>();

    /** 村里總合 */
    @XmlElement(name = "VillageNames")
    @FieldName("村里總合")
    private String villageNames = RlConstant.EMPTY_STRING;

    /** 判斷 excel flag */
    @XmlElement(name = "HaveExcelData")
    @FieldName("判斷 excel flag")
    private boolean haveExcelData;

    /** rldf001eTypeSendPageNo */
    @XmlElement(name = "Rldf001eTypeSendPageNo")
    @FieldName("rldf001eTypeSendPageNo")
    private Rldf001eType rldf001eTypeSendPageNo = new Rldf001eType();

    /** rldf001eTypeSendPageNoNew */
    @XmlElement(name = "Rldf001eTypeSendPageNoNew")
    @FieldName("rldf001eTypeSendPageNoNew")
    private Rldf001eType rldf001eTypeSendPageNoNew = new Rldf001eType();

    /** rldf001eTypeSendLotNo */
    @XmlElement(name = "Rldf001eTypeSendLotNo")
    @FieldName("rldf001eTypeSendLotNo")
    private Rldf001eType rldf001eTypeSendLotNo = new Rldf001eType();

    /** listRldf002d */
    @XmlElement(name = "ListRldf002d")
    @FieldName("listRldf002d")
    private List<Rldf002dType> listRldf002d = new ArrayList<Rldf002dType>(0);

    /** listRldf022d */
    @XmlElement(name = "ListRldf022d")
    @FieldName("listRldf022d")
    private List<Rldf022dType> listRldf022d = new ArrayList<Rldf022dType>(0);

    /** listRldf002d22dList */
    @XmlElement(name = "ListRldf002d22dList")
    @FieldName("listRldf002d22dList")
    private List<Rl02a20Rldf002d22dDTO> listRldf002d22dList = new ArrayList<Rl02a20Rldf002d22dDTO>(0);

    /** 列印時提示的訊息 */
    @XmlElement(name = "MsgList")
    @FieldName("列印時提示的訊息")
    private List<String> msgList = new ArrayList<String>();

    /** 列印的筆數 */
    @XmlElement(name = "CountMap")
    @FieldName("列印的筆數")
    private HashMap<String, Integer> countMap = new HashMap<String, Integer>();

    public String getApplyYyymmddStart() {
        return applyYyymmddStart;
    }

    public void setApplyYyymmddStart(String applyYyymmddStart) {
        this.applyYyymmddStart = applyYyymmddStart;
    }

    public String getApplyYyymmddEnd() {
        return applyYyymmddEnd;
    }

    public void setApplyYyymmddEnd(String applyYyymmddEnd) {
        this.applyYyymmddEnd = applyYyymmddEnd;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getAckCode() {
        return ackCode;
    }

    public void setAckCode(String ackCode) {
        this.ackCode = ackCode;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getNowYyy() {
        return nowYyy;
    }

    public void setNowYyy(String nowYyy) {
        this.nowYyy = nowYyy;
    }

    public String getNowMmdd() {
        return nowMmdd;
    }

    public void setNowMmdd(String nowMmdd) {
        this.nowMmdd = nowMmdd;
    }

    public String getNowUseNo() {
        return nowUseNo;
    }

    public void setNowUseNo(String nowUseNo) {
        this.nowUseNo = nowUseNo;
    }

    public List<Rl02a20Rldf002d22dDTO> getListRldf002d22dList() {
        return listRldf002d22dList;
    }

    public void setListRldf002d22dList(List<Rl02a20Rldf002d22dDTO> listRldf002d22dList) {
        this.listRldf002d22dList = listRldf002d22dList;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getAcceptType() {
        return acceptType;
    }

    public void setAcceptType(String acceptType) {
        this.acceptType = acceptType;
    }

    public List<Rldf002dType> getListRldf002d() {
        return listRldf002d;
    }

    public void setListRldf002d(List<Rldf002dType> listRldf002d) {
        this.listRldf002d = listRldf002d;
    }

    public List<Rldf022dType> getListRldf022d() {
        return listRldf022d;
    }

    public void setListRldf022d(List<Rldf022dType> listRldf022d) {
        this.listRldf022d = listRldf022d;
    }

    public Rldf001eType getRldf001eTypeSendPageNo() {
        return rldf001eTypeSendPageNo;
    }

    public void setRldf001eTypeSendPageNo(Rldf001eType rldf001eTypeSendPageNo) {
        this.rldf001eTypeSendPageNo = rldf001eTypeSendPageNo;
    }

    public Rldf001eType getRldf001eTypeSendPageNoNew() {
        return rldf001eTypeSendPageNoNew;
    }

    public void setRldf001eTypeSendPageNoNew(Rldf001eType rldf001eTypeSendPageNoNew) {
        this.rldf001eTypeSendPageNoNew = rldf001eTypeSendPageNoNew;
    }

    public Rldf001eType getRldf001eTypeSendLotNo() {
        return rldf001eTypeSendLotNo;
    }

    public void setRldf001eTypeSendLotNo(Rldf001eType rldf001eTypeSendLotNo) {
        this.rldf001eTypeSendLotNo = rldf001eTypeSendLotNo;
    }

    public String getSendPageNo() {
        return sendPageNo;
    }

    public void setSendPageNo(String sendPageNo) {
        this.sendPageNo = sendPageNo;
    }

    public String getSendLotNo() {
        return sendLotNo;
    }

    public void setSendLotNo(String sendLotNo) {
        this.sendLotNo = sendLotNo;
    }

    public boolean isHaveExcelData() {
        return haveExcelData;
    }

    public void setHaveExcelData(boolean haveExcelData) {
        this.haveExcelData = haveExcelData;
    }

    public List<String> getVillages() {
        return villages;
    }

    public void setVillages(List<String> villages) {
        this.villages = villages;
    }

    public String getVillageNames() {
        return villageNames;
    }

    public void setVillageNames(String villageNames) {
        this.villageNames = villageNames;
    }

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public HashMap<String, String> getReportParams() {
		return reportParams;
	}

	public void setReportParams(HashMap<String, String> reportParams) {
		this.reportParams = reportParams;
	}

	public String getSendPageNo2() {
		return sendPageNo2;
	}

	public void setSendPageNo2(String sendPageNo2) {
		this.sendPageNo2 = sendPageNo2;
	}

	public String getSendLotNo2() {
		return sendLotNo2;
	}

	public void setSendLotNo2(String sendLotNo2) {
		this.sendLotNo2 = sendLotNo2;
	}

	public List<String> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<String> msgList) {
		this.msgList = msgList;
	}

	public HashMap<String, Integer> getCountMap() {
		return countMap;
	}

	public void setCountMap(HashMap<String, Integer> countMap) {
		this.countMap = countMap;
	}

	public List<Rldfz2a20Type> getSelfList() {
		return selfList;
	}

	public void setSelfList(List<Rldfz2a20Type> selfList) {
		this.selfList = selfList;
	}

	public List<Rldfz2a20Type> getOtherList() {
		return otherList;
	}

	public void setOtherList(List<Rldfz2a20Type> otherList) {
		this.otherList = otherList;
	}

}
