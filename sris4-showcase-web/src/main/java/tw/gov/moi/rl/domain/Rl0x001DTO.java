package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfv001Type;
import tw.gov.moi.domain.Rldfv003Type;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 職權更正申請 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x001DTO", propOrder = { "tableType", "tableCode", "businessType", "tableName", "recordList1",
        "recordList2", "recordList3", "transactionId", "recordTable", "updateSiteId", "codeName", "isEdit", "mainType",
        "tarClass", "otherTarClass", "record" })
@XmlRootElement(name = "Rl0x001DTO")
public class Rl0x001DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 行為代碼A.新增 D.刪除 M.更正
    @XmlElement(name = "BusinessType")
    @FieldName("職權更正類別")
    private String businessType;

    /* ↓↓↓↓↓ 戶籍資料 ↓↓↓↓↓ */
    @XmlElement(name = "FuncCode1")
    @FieldName("職權更正功能代碼1")
    private String funcCode1;

    @XmlElement(name = "BusinessType1")
    @FieldName("職權更正類別1")
    private String businessType1;
    /* ↑↑↑↑↑ 戶籍資料 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 申請書 ↓↓↓↓↓ */
    @XmlElement(name = "MainType2")
    @FieldName("申請書主分類2")
    private String mainType2;

    @XmlElement(name = "FuncCode2")
    @FieldName("職權更正功能代碼2")
    private String funcCode2;
    /* ↑↑↑↑↑ 申請書 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 其他資料 ↓↓↓↓↓ */
    @XmlElement(name = "FuncCode3")
    @FieldName("職權更正功能代碼3")
    private String funcCode3;

    @XmlElement(name = "BusinessType3")
    @FieldName("職權更正類別3")
    private String businessType3;
    /* ↑↑↑↑↑ 其他資料 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ Rldfv001 ↓↓↓↓↓ */
    @XmlElement(name = "TableCode")
    @FieldName("資料表代碼")
    private String tableCode;

    @XmlElement(name = "TableName")
    @FieldName("資料表中文名稱")
    private String tableName;

    @XmlElement(name = "TableType")
    @FieldName("資料表分類別")
    private String tableType;

    @XmlElement(name = "MainType")
    @FieldName("申請書主分類")
    private String mainType;

    @XmlElement(name = "FuncCode")
    @FieldName("職權更正功能代碼")
    private String funcCode;

    @XmlElement(name = "RecordTable")
    @FieldName("職權更正紀錄檔代碼")
    private String recordTable;
    /* ↑↑↑↑↑ Rldfv001 ↑↑↑↑↑ */

    @XmlElement(name = "TransactionId")
    @FieldName("交易序號")
    private String transactionId;

    @XmlElement(name = "RecordList1")
    @FieldName("職權更正記錄列表1")
    private List<Rldfv003Type> recordList1;

    @XmlElement(name = "RecordList2")
    @FieldName("職權更正記錄列表2")
    private List<Rldfv003Type> recordList2;

    @XmlElement(name = "RecordList3")
    @FieldName("職權更正記錄列表3")
    private List<Rldfv003Type> recordList3;

    // 1=可編輯, 0=不可編輯
    @XmlElement(name = "IsEdit")
    @FieldName("是否編輯")
    private String isEdit;

    @XmlElement(name = "Source")
    @FieldName("查詢結果預設值")
    private Object source = null;

    @XmlElement(name = "ModifySource")
    @FieldName("修改初始值")
    private Object modifySource = null;

    @XmlElement(name = "Rldfv001List")
    @FieldName("rldfv001List")
    private List<Rldfv001Type> rldfv001List;

    @XmlElement(name = "Rldfv001Map")
    @FieldName("rldfv001Map")
    private Map<String, Rldfv001Type> rldfv001Map;

    @XmlElement(name = "Rldfv003Type")
    @FieldName("rldfv003Type")
    private Rldfv003Type rldfv003Type;

    private List<ObnfDTO> obnfs = new ArrayList<ObnfDTO>();

    @XmlElement(name = "NoticeObj")
    @FieldName("NoticeObj")
    private Object noticeObj = null;

    // @XmlElement(name = "onbfTransactionId")
    // @FieldName("通報使用的交易序號")
    // private String onbfTransactionId;
    //
    // public String getOnbfTransactionId() {
    // return onbfTransactionId;
    // }
    //
    // public void setOnbfTransactionId(String onbfTransactionId) {
    // this.onbfTransactionId = onbfTransactionId;
    // }

    public Object getNoticeObj() {
        return noticeObj;
    }

    public void setNoticeObj(Object noticeObj) {
        this.noticeObj = noticeObj;
    }

    public List<ObnfDTO> getObnfs() {
        return obnfs;
    }

    public void setObnfs(List<ObnfDTO> obnfs) {
        this.obnfs = obnfs;
    }

    @XmlElement(name = "Hhhmmss")
    @FieldName("hhhmmss")
    private String hhhmmss = "";

    @XmlElement(name = "Yyymmdd")
    @FieldName("yyymmdd")
    private String yyymmdd = "";

    @XmlElement(name = "Des")
    @FieldName("des")
    private String des = "";

    @XmlElement(name = "ChangeColunn")
    @FieldName("被修改的欄位")
    private String changeColunn;

    @XmlElement(name = "isShowOtherBtn")
    @FieldName("是否顯示請選擇按鈕")
    private boolean isAddBtnShowed = false;

    @XmlElement(name = "tarClass")
    @FieldName("T輸出類型")
    private Class tarClass;

    @XmlElement(name = "otherTarClass")
    @FieldName("S輸出類型")
    private Class otherTarClass;

    @XmlElement(name = "record")
    @FieldName("記錄檔")
    private Object record;

    @XmlElement(name = "note")
    @FieldName("記錄檔")
    private String note = "";

    @XmlElement(name = "Rldfv001Type")
    @FieldName("rldfv001Type")
    private Rldfv001Type rldfv001Type = null;

    @XmlElement(name = "note")
    @FieldName("暫存來源資料")
    private Object tempSource = null;

    @XmlElement(name = "note")
    @FieldName("暫存修改資料")
    private Object tempModifySource = null;

    @XmlElement(name = "pkLists")
    @FieldName("屬於pk的rldfv002")
    private List<String> pkLists = new ArrayList<String>();

    @XmlElement(name = "Querys")
    @FieldName("查詢結果")
    private List<Rl0x001DTOResult> querys = null;

    @XmlElement(name = "Querys")
    @FieldName("畫面顯示資訊")
    private List<Rl0x001DTOResult> edits = null;

    public List<Rl0x001DTOResult> getQuerys() {
        return querys;

    }

    public List<Rl0x001DTOResult> getEdits() {
        return edits;
    }

    public void setEdits(List<Rl0x001DTOResult> edits) {
        this.edits = edits;
    }

    public void setQuerys(List<Rl0x001DTOResult> querys) {
        this.querys = querys;
    }

    public List<String> getPkLists() {
        return pkLists;
    }

    public void setPkLists(List<String> pkLists) {
        this.pkLists = pkLists;
    }

    public Object getTempSource() {
        return tempSource;
    }

    public void setTempSource(Object tempSource) {
        this.tempSource = tempSource;
    }

    public Object getTempModifySource() {
        return tempModifySource;
    }

    public void setTempModifySource(Object tempModifySource) {
        this.tempModifySource = tempModifySource;
    }

    public boolean isAddBtnShowed() {
        return isAddBtnShowed;
    }

    public void setAddBtnShowed(boolean isAddBtnShowed) {
        this.isAddBtnShowed = isAddBtnShowed;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getTableName() {
        return tableName;
    }

    public String getChangeColunn() {
        return changeColunn;
    }

    public void setChangeColunn(String changeColunn) {
        this.changeColunn = changeColunn;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRecordTable() {
        return recordTable;
    }

    public void setRecordTable(String recordTable) {
        this.recordTable = recordTable;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public Object getModifySource() {
        return modifySource;
    }

    public void setModifySource(Object modifySource) {
        this.modifySource = modifySource;
    }

    public List<Rldfv001Type> getRldfv001List() {
        if (rldfv001List == null) {
            rldfv001List = new ArrayList<Rldfv001Type>();
        }
        return rldfv001List;
    }

    public void setRldfv001List(List<Rldfv001Type> rldfv001List) {
        this.rldfv001List = rldfv001List;
    }

    public Map<String, Rldfv001Type> getRldfv001Map() {
        if (rldfv001Map == null) {
            rldfv001Map = new HashMap<String, Rldfv001Type>();
        }
        return rldfv001Map;
    }

    public void setRldfv001Map(Map<String, Rldfv001Type> rldfv001Map) {
        this.rldfv001Map = rldfv001Map;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    public String getFuncCode1() {
        return funcCode1;
    }

    public void setFuncCode1(String funcCode1) {
        this.funcCode1 = funcCode1;
    }

    public String getFuncCode2() {
        return funcCode2;
    }

    public void setFuncCode2(String funcCode2) {
        this.funcCode2 = funcCode2;
    }

    public String getFuncCode3() {
        return funcCode3;
    }

    public void setFuncCode3(String funcCode3) {
        this.funcCode3 = funcCode3;
    }

    public String getBusinessType1() {
        return businessType1;
    }

    public void setBusinessType1(String businessType1) {
        this.businessType1 = businessType1;
    }

    public String getBusinessType3() {
        return businessType3;
    }

    public void setBusinessType3(String businessType3) {
        this.businessType3 = businessType3;
    }

    public String getMainType2() {
        return mainType2;
    }

    public void setMainType2(String mainType2) {
        this.mainType2 = mainType2;
    }

    public Rldfv003Type getRldfv003Type() {
        return rldfv003Type;
    }

    public void setRldfv003Type(Rldfv003Type rldfv003Type) {
        this.rldfv003Type = rldfv003Type;
    }

    public List<Rldfv003Type> getRecordList1() {
        if (recordList1 == null) {
            recordList1 = new ArrayList<Rldfv003Type>();
        }
        return recordList1;
    }

    public void setRecordList1(List<Rldfv003Type> recordList1) {
        this.recordList1 = recordList1;
    }

    public List<Rldfv003Type> getRecordList2() {
        if (recordList2 == null) {
            recordList2 = new ArrayList<Rldfv003Type>();
        }
        return recordList2;
    }

    public void setRecordList2(List<Rldfv003Type> recordList2) {
        this.recordList2 = recordList2;
    }

    public List<Rldfv003Type> getRecordList3() {
        if (recordList3 == null) {
            recordList3 = new ArrayList<Rldfv003Type>();
        }
        return recordList3;
    }

    public String getHhhmmss() {
        return hhhmmss;
    }

    public void setHhhmmss(String hhhmmss) {
        this.hhhmmss = hhhmmss;
    }

    public String getYyymmdd() {
        return yyymmdd;
    }

    public void setYyymmdd(String yyymmdd) {
        this.yyymmdd = yyymmdd;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setRecordList3(List<Rldfv003Type> recordList3) {
        this.recordList3 = recordList3;
    }

    public Class getTarClass() {
        return tarClass;
    }

    public void setTarClass(Class tarClass) {
        this.tarClass = tarClass;
    }

    public Class getOtherTarClass() {
        return otherTarClass;
    }

    public void setOtherTarClass(Class otherTarClass) {
        this.otherTarClass = otherTarClass;
    }

    public Object getRecord() {
        return record;
    }

    public void setRecord(Object record) {
        this.record = record;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Rldfv001Type getRldfv001Type() {
        return rldfv001Type;
    }

    public void setRldfv001Type(Rldfv001Type rldfv001Type) {
        this.rldfv001Type = rldfv001Type;
    }

    // public boolean isExecute() {
    // return execute;
    // }
    //
    // public void setExecute(boolean execute) {
    // this.execute = execute;
    // }

}
