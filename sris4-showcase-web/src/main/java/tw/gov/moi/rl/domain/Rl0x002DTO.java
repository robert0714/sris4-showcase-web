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
import tw.gov.moi.domain.Rldfv001Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x002DTO", propOrder = { "recordList", "transactionId", "recordTable", "updateSiteId",
        "rldfv003Type", "source", "rldfv001Type" })
@XmlRootElement(name = "Rl0x002DTO")
public class Rl0x002DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 職權更正記錄列表 */
    @XmlElement(name = "RecordList", required = false)
    @FieldName("職權更正記錄列表")
    private List<Rl0x002RecDTO> recordList;

    /** 交易序號 */
    @XmlElement(name = "TransactionId", required = false)
    @FieldName("交易序號")
    private String transactionId;

    /** 職權更正紀錄檔代碼 */
    @XmlElement(name = "RecordTable", required = false)
    @FieldName("職權更正紀錄檔代碼")
    private String recordTable;

    /** 受理地作業點代碼 */
    @XmlElement(name = "UpdateSiteId", required = false)
    @FieldName("受理地作業點代碼")
    private String updateSiteId;

    /** 受理地作業點代碼 */
    @XmlElement(name = "Rldfv003Type", required = false)
    @FieldName("受理地作業點代碼")
    private Rl0x002RecDTO rl0x002RecDTO;

    /** 單筆資料 */
    @XmlElement(name = "Source", required = false)
    @FieldName("單筆資料")
    private Object source = null;

    /** 職權更正資料表設定檔 */
    @XmlElement(name = "Rldfv001Type", required = false)
    @FieldName("職權更正資料表設定檔")
    private Rldfv001Type rldfv001Type;

    @XmlElement(name = "MainDTO", required = false)
    @FieldName("查詢結果")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "ApplyDate", required = false)
    @FieldName("申請日期")
    private String applyDate;

    @XmlElement(name = "BusinessType", required = false)
    @FieldName("職權更正類別")
    private List<String> businessTypes;

    @XmlElement(name = "Status", required = false)
    @FieldName("流程狀態")
    private String status;

    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = "";

    @XmlElement(name = "Index")
    @FieldName("DataTable索引")
    private int index = -1;

    private List<String> funcs = new ArrayList<String>();

    private List<Rl0x002CheckDTO> rl0x002CheckDTOs = new ArrayList<Rl0x002CheckDTO>();

    @XmlElement(name = "ApplyStart")
    @FieldName("申請時間(起)")
    private String applyStart = "";

    @XmlElement(name = "applyEnd")
    @FieldName("申請時間(迄)")
    private String applyEnd = "";

    // private List<Rl0x002CheckDTO> rl0x002CheckDTO = new
    // ArrayList<Rl0x002CheckDTO>();

    private List<String> targets = new ArrayList<String>();

    public List<String> getTargets() {
        return targets;
    }

    public void setTargets(List<String> targets) {
        this.targets = targets;
    }

    public String getApplyStart() {
        return applyStart;
    }

    public void setApplyStart(String applyStart) {
        this.applyStart = applyStart;
    }

    public String getApplyEnd() {
        return applyEnd;
    }

    public void setApplyEnd(String applyEnd) {
        this.applyEnd = applyEnd;
    }

    public List<Rl0x002CheckDTO> getRl0x002CheckDTOs() {
        return rl0x002CheckDTOs;
    }

    public void setRl0x002CheckDTOs(List<Rl0x002CheckDTO> rl0x002CheckDTOs) {
        this.rl0x002CheckDTOs = rl0x002CheckDTOs;
    }

    public List<Rl0x002RecDTO> getRecordList() {
        if (recordList == null) {
            recordList = new ArrayList<Rl0x002RecDTO>();
        }
        return recordList;
    }

    public List<String> getFuncs() {
        return funcs;
    }

    public void setFuncs(List<String> funcs) {
        this.funcs = funcs;
    }

    public void setRecordList(List<Rl0x002RecDTO> recordList) {
        this.recordList = recordList;
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

    public String getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(String updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public Rl0x002RecDTO getRl0x002RecDTO() {
        return rl0x002RecDTO;
    }

    public void setRl0x002RecDTO(Rl0x002RecDTO rl0x002RecDTO) {
        this.rl0x002RecDTO = rl0x002RecDTO;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Rldfv001Type getRldfv001Type() {
        return rldfv001Type;
    }

    public void setRldfv001Type(Rldfv001Type rldfv001Type) {
        this.rldfv001Type = rldfv001Type;
    }

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getBusinessTypes() {
        return businessTypes;
    }

    public void setBusinessTypes(List<String> businessTypes) {
        this.businessTypes = businessTypes;
    }

    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
