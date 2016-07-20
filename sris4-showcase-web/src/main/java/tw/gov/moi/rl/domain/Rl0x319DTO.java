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
import tw.gov.moi.domain.Rldfm09mType;
import tw.gov.moi.domain.Rldfs219Type;

/**
 * 
 * @author Peter
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x319DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored",
        "IsVerify", "CommononType" })
@XmlRootElement(name = "Rl0x319DTO")
public class Rl0x319DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MainDTO")
    @FieldName("主檔")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldfm09mType lockData = null;

    // 來源資料
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Rldfm09mType selectData = new Rldfm09mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldfm09mType> resutlts = new ArrayList<Rldfm09mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs219Type recored = new Rldfs219Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "apply_date")
    @FieldName("apply_date")
    private String apply_date = StringUtils.EMPTY;

    @XmlElement(name = "apply_time")
    @FieldName("apply_time")
    private String apply_time = StringUtils.EMPTY;

    @XmlElement(name = "approve_date")
    @FieldName("approve_date")
    private String approve_date = StringUtils.EMPTY;

    @XmlElement(name = "approve_time")
    @FieldName("approve_time")
    private String approve_time = StringUtils.EMPTY;

    @XmlElement(name = "approver_id")
    @FieldName("approver_id")
    private String approver_id = StringUtils.EMPTY;

    @XmlElement(name = "approver_name")
    @FieldName("approver_name")
    private String approver_name = StringUtils.EMPTY;

    @XmlElement(name = "business_type")
    @FieldName("business_type")
    private String business_type = StringUtils.EMPTY;

    @XmlElement(name = "new_accept_admin_office_code")
    @FieldName("new_accept_admin_office_code")
    private String new_accept_admin_office_code = StringUtils.EMPTY;

    @XmlElement(name = "new_change_yyymmdd")
    @FieldName("new_change_yyymmdd")
    private String new_change_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "new_change_hhmmss")
    @FieldName("new_change_hhmmss")
    private String new_change_hhmmss = StringUtils.EMPTY;

    @XmlElement(name = "new_old_birth_yyymmdd")
    @FieldName("new_old_birth_yyymmdd")
    private String new_old_birth_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "new_person_id")
    @FieldName("new_person_id")
    private String new_person_id = StringUtils.EMPTY;

    @XmlElement(name = "new_site_id")
    @FieldName("new_site_id")
    private String new_site_id = StringUtils.EMPTY;

    @XmlElement(name = "old_accept_admin_office_code")
    @FieldName("old_accept_admin_office_code")
    private String old_accept_admin_office_code = StringUtils.EMPTY;

    @XmlElement(name = "old_change_hhmmss")
    @FieldName("old_change_hhmmss")
    private String old_change_hhmmss = StringUtils.EMPTY;

    @XmlElement(name = "old_change_yyymmdd")
    @FieldName("old_change_yyymmdd")
    private String old_change_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "old_old_birth_yyymmdd")
    @FieldName("old_old_birth_yyymmdd")
    private String old_old_birth_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "old_person_id")
    @FieldName("old_person_id")
    private String old_person_id = StringUtils.EMPTY;

    @XmlElement(name = "old_site_id")
    @FieldName("old_site_id")
    private String old_site_id = StringUtils.EMPTY;

    @XmlElement(name = "registrar_id")
    @FieldName("registrar_id")
    private String registrar_id = StringUtils.EMPTY;

    @XmlElement(name = "registrar_name")
    @FieldName("registrar_name")
    private String registrar_name = StringUtils.EMPTY;

    @XmlElement(name = "status")
    @FieldName("status")
    private String status = StringUtils.EMPTY;

    @XmlElement(name = "update_site_id")
    @FieldName("update_site_id")
    private String update_site_id = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "nowProcessType")
    @FieldName("R檔預設值")
    private Rldfm09mType nowProcessType = null;

    @XmlElement(name = "CheckApprove")
    @FieldName("R檔預設值")
    private Rldfm09mType checkApprove = null;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("(作業點代碼")
    private String siteId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteLabel", required = true)
    @FieldName("(作業點代碼")
    private String siteLabel;

    /** 作業點代碼. */
    @XmlElement(name = "acceptAdminOfficeCode", required = true)
    @FieldName("(作業點代碼")
    private String acceptAdminOfficeCode;

    /** 作業點代碼. */
    @XmlElement(name = "acceptAdminOfficeCodeLabel", required = true)
    @FieldName("(作業點代碼")
    private String acceptAdminOfficeCodeLabel;

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    public Rldfm09mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldfm09mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldfm09mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldfm09mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs219Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs219Type recored) {
        this.recored = recored;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldfm09mType getNowProcessType() {
        return nowProcessType;
    }

    public void setNowProcessType(Rldfm09mType nowProcessType) {
        this.nowProcessType = nowProcessType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    @Override
    public String toString() {
        return "Rl0x319DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", lockData=" + lockData + ", selectData=" + selectData + ", resutlts=" + resutlts + ", recored="
                + recored + ", reason=" + reason + ", apply_date=" + apply_date + ", apply_time=" + apply_time
                + ", approve_date=" + approve_date + ", approve_time=" + approve_time + ", approver_id=" + approver_id
                + ", approver_name=" + approver_name + ", business_type=" + business_type
                + ", new_accept_admin_office_code=" + new_accept_admin_office_code + ", new_change_yyymmdd="
                + new_change_yyymmdd + ", new_change_hhmmss=" + new_change_hhmmss + ", new_old_birth_yyymmdd="
                + new_old_birth_yyymmdd + ", new_person_id=" + new_person_id + ", new_site_id=" + new_site_id
                + ", old_accept_admin_office_code=" + old_accept_admin_office_code + ", old_change_hhmmss="
                + old_change_hhmmss + ", old_change_yyymmdd=" + old_change_yyymmdd + ", old_old_birth_yyymmdd="
                + old_old_birth_yyymmdd + ", old_person_id=" + old_person_id + ", old_site_id=" + old_site_id
                + ", registrar_id=" + registrar_id + ", registrar_name=" + registrar_name + ", status=" + status
                + ", update_site_id=" + update_site_id + ", isVerify=" + isVerify + ", nowProcessType="
                + nowProcessType + ", checkApprove=" + checkApprove + ", siteId=" + siteId + ", siteLabel=" + siteLabel
                + ", acceptAdminOfficeCode=" + acceptAdminOfficeCode + ", acceptAdminOfficeCodeLabel="
                + acceptAdminOfficeCodeLabel + "]";
    }

    public String getApply_date() {
        return apply_date;
    }

    public void setApply_date(String apply_date) {
        this.apply_date = apply_date;
    }

    public String getApply_time() {
        return apply_time;
    }

    public void setApply_time(String apply_time) {
        this.apply_time = apply_time;
    }

    public String getApprove_date() {
        return approve_date;
    }

    public void setApprove_date(String approve_date) {
        this.approve_date = approve_date;
    }

    public String getApprove_time() {
        return approve_time;
    }

    public void setApprove_time(String approve_time) {
        this.approve_time = approve_time;
    }

    public String getApprover_id() {
        return approver_id;
    }

    public void setApprover_id(String approver_id) {
        this.approver_id = approver_id;
    }

    public String getApprover_name() {
        return approver_name;
    }

    public void setApprover_name(String approver_name) {
        this.approver_name = approver_name;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getNew_accept_admin_office_code() {
        return new_accept_admin_office_code;
    }

    public void setNew_accept_admin_office_code(String new_accept_admin_office_code) {
        this.new_accept_admin_office_code = new_accept_admin_office_code;
    }

    public String getNew_change_yyymmdd() {
        return new_change_yyymmdd;
    }

    public void setNew_change_yyymmdd(String new_change_yyymmdd) {
        this.new_change_yyymmdd = new_change_yyymmdd;
    }

    public String getNew_change_hhmmss() {
        return new_change_hhmmss;
    }

    public void setNew_change_hhmmss(String new_change_hhmmss) {
        this.new_change_hhmmss = new_change_hhmmss;
    }

    public String getNew_old_birth_yyymmdd() {
        return new_old_birth_yyymmdd;
    }

    public void setNew_old_birth_yyymmdd(String new_old_birth_yyymmdd) {
        this.new_old_birth_yyymmdd = new_old_birth_yyymmdd;
    }

    public String getNew_person_id() {
        return new_person_id;
    }

    public void setNew_person_id(String new_person_id) {
        this.new_person_id = new_person_id;
    }

    public String getNew_site_id() {
        return new_site_id;
    }

    public void setNew_site_id(String new_site_id) {
        this.new_site_id = new_site_id;
    }

    public String getOld_accept_admin_office_code() {
        return old_accept_admin_office_code;
    }

    public void setOld_accept_admin_office_code(String old_accept_admin_office_code) {
        this.old_accept_admin_office_code = old_accept_admin_office_code;
    }

    public String getOld_change_hhmmss() {
        return old_change_hhmmss;
    }

    public void setOld_change_hhmmss(String old_change_hhmmss) {
        this.old_change_hhmmss = old_change_hhmmss;
    }

    public String getOld_change_yyymmdd() {
        return old_change_yyymmdd;
    }

    public void setOld_change_yyymmdd(String old_change_yyymmdd) {
        this.old_change_yyymmdd = old_change_yyymmdd;
    }

    public String getOld_old_birth_yyymmdd() {
        return old_old_birth_yyymmdd;
    }

    public void setOld_old_birth_yyymmdd(String old_old_birth_yyymmdd) {
        this.old_old_birth_yyymmdd = old_old_birth_yyymmdd;
    }

    public String getOld_person_id() {
        return old_person_id;
    }

    public void setOld_person_id(String old_person_id) {
        this.old_person_id = old_person_id;
    }

    public String getOld_site_id() {
        return old_site_id;
    }

    public void setOld_site_id(String old_site_id) {
        this.old_site_id = old_site_id;
    }

    public String getRegistrar_id() {
        return registrar_id;
    }

    public void setRegistrar_id(String registrar_id) {
        this.registrar_id = registrar_id;
    }

    public String getRegistrar_name() {
        return registrar_name;
    }

    public void setRegistrar_name(String registrar_name) {
        this.registrar_name = registrar_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdate_site_id() {
        return update_site_id;
    }

    public void setUpdate_site_id(String update_site_id) {
        this.update_site_id = update_site_id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteLabel() {
        return siteLabel;
    }

    public void setSiteLabel(String siteLabel) {
        this.siteLabel = siteLabel;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getAcceptAdminOfficeCodeLabel() {
        return acceptAdminOfficeCodeLabel;
    }

    public void setAcceptAdminOfficeCodeLabel(String acceptAdminOfficeCodeLabel) {
        this.acceptAdminOfficeCodeLabel = acceptAdminOfficeCodeLabel;
    }

    public Rldfm09mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldfm09mType lockData) {
        this.lockData = lockData;
    }

    public Rldfm09mType getUnLockData() {
        return lockData;
    }

    public void setUnLockData(Rldfm09mType unLockData) {
        this.lockData = unLockData;
    }

    public Rldfm09mType getCheckApprove() {
        return checkApprove;
    }

    public void setCheckApprove(Rldfm09mType checkApprove) {
        this.checkApprove = checkApprove;
    }

}
