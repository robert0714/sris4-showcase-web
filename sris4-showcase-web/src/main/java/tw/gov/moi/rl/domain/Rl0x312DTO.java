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
import tw.gov.moi.domain.Rldf007hType;
import tw.gov.moi.domain.Rldfs212Type;

/**
 * 
 * @author Peter
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x319DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored",
        "IsVerify", "CommononType" })
@XmlRootElement(name = "Rl0x319DTO")
public class Rl0x312DTO implements Serializable {

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

    // 來源資料
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Rldf007hType selectData = new Rldf007hType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf007hType> resutlts = new ArrayList<Rldf007hType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs212Type recored = new Rldfs212Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "update_site_id")
    @FieldName("update_site_id")
    private String update_site_id = StringUtils.EMPTY;

    @XmlElement(name = "update_area_code")
    @FieldName("update_area_code")
    private String update_area_code = StringUtils.EMPTY;

    @XmlElement(name = "update_admin_office_code")
    @FieldName("update_admin_office_code")
    private String update_admin_office_code = StringUtils.EMPTY;

    @XmlElement(name = "apply_date")
    @FieldName("apply_date")
    private String apply_date = StringUtils.EMPTY;

    @XmlElement(name = "apply_time")
    @FieldName("apply_time")
    private String apply_time = StringUtils.EMPTY;

    @XmlElement(name = "update_reason")
    @FieldName("update_reason")
    private String update_reason = StringUtils.EMPTY;

    @XmlElement(name = "business_type")
    @FieldName("business_type")
    private String business_type = StringUtils.EMPTY;

    @XmlElement(name = "status")
    @FieldName("status")
    private String status = StringUtils.EMPTY;

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

    @XmlElement(name = "registrar_id")
    @FieldName("registrar_id")
    private String registrar_id = StringUtils.EMPTY;

    @XmlElement(name = "registrar_name")
    @FieldName("registrar_name")
    private String registrar_name = StringUtils.EMPTY;

    @XmlElement(name = "old_person_id")
    @FieldName("old_person_id")
    private String old_person_id = StringUtils.EMPTY;

    @XmlElement(name = "old_modify_yyymmdd")
    @FieldName("old_modify_yyymmdd")
    private String old_modify_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "old_modify_time")
    @FieldName("old_modify_time")
    private String old_modify_time = StringUtils.EMPTY;

    @XmlElement(name = "old_remove_yyymmdd")
    @FieldName("old_remove_yyymmdd")
    private String old_remove_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "old_remove_time")
    @FieldName("old_remove_time")
    private String old_remove_time = StringUtils.EMPTY;

    @XmlElement(name = "old_site_id")
    @FieldName("old_site_id")
    private String old_site_id = StringUtils.EMPTY;

    @XmlElement(name = "old_accept_admin_office_code")
    @FieldName("old_accept_admin_office_code")
    private String old_accept_admin_office_code = StringUtils.EMPTY;

    @XmlElement(name = "old_original_name")
    @FieldName("old_original_name")
    private String old_original_name = StringUtils.EMPTY;

    @XmlElement(name = "old_original_maiden_name")
    @FieldName("old_original_maiden_name")
    private String old_original_maiden_name = StringUtils.EMPTY;

    @XmlElement(name = "old_original_married_name")
    @FieldName("old_original_married_name")
    private String old_original_married_name = StringUtils.EMPTY;

    @XmlElement(name = "old_original_last_name")
    @FieldName("old_original_last_name")
    private String old_original_last_name = StringUtils.EMPTY;

    @XmlElement(name = "old_original_first_name")
    @FieldName("old_original_first_name")
    private String old_original_first_name = StringUtils.EMPTY;

    @XmlElement(name = "old_new_name")
    @FieldName("old_new_name")
    private String old_new_name = StringUtils.EMPTY;

    @XmlElement(name = "new_person_id")
    @FieldName("new_person_id")
    private String new_person_id = StringUtils.EMPTY;

    @XmlElement(name = "new_modify_yyymmdd")
    @FieldName("new_modify_yyymmdd")
    private String new_modify_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "new_modify_time")
    @FieldName("new_modify_time")
    private String new_modify_time = StringUtils.EMPTY;

    @XmlElement(name = "new_remove_yyymmdd")
    @FieldName("new_remove_yyymmdd")
    private String new_remove_yyymmdd = StringUtils.EMPTY;

    @XmlElement(name = "new_remove_time")
    @FieldName("new_remove_time")
    private String new_remove_time = StringUtils.EMPTY;

    @XmlElement(name = "new_site_id")
    @FieldName("new_site_id")
    private String new_site_id = StringUtils.EMPTY;

    @XmlElement(name = "new_accept_admin_office_code")
    @FieldName("new_accept_admin_office_code")
    private String new_accept_admin_office_code = StringUtils.EMPTY;

    @XmlElement(name = "new_original_name")
    @FieldName("new_original_name")
    private String new_original_name = StringUtils.EMPTY;

    @XmlElement(name = "new_original_maiden_name")
    @FieldName("new_original_maiden_name")
    private String new_original_maiden_name = StringUtils.EMPTY;

    @XmlElement(name = "new_original_married_name")
    @FieldName("new_original_married_name")
    private String new_original_married_name = StringUtils.EMPTY;

    @XmlElement(name = "new_original_last_name")
    @FieldName("new_original_last_name")
    private String new_original_last_name = StringUtils.EMPTY;

    @XmlElement(name = "new_original_first_name")
    @FieldName("new_original_first_name")
    private String new_original_first_name = StringUtils.EMPTY;

    @XmlElement(name = "new_new_name")
    @FieldName("new_new_name")
    private String new_new_name = StringUtils.EMPTY;

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

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf007hType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldf007hType unLockData = null;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf007hType commononType = null;

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

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldf007hType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf007hType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf007hType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf007hType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs212Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs212Type recored) {
        this.recored = recored;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUpdate_site_id() {
        return update_site_id;
    }

    public void setUpdate_site_id(String update_site_id) {
        this.update_site_id = update_site_id;
    }

    public String getUpdate_area_code() {
        return update_area_code;
    }

    public void setUpdate_area_code(String update_area_code) {
        this.update_area_code = update_area_code;
    }

    public String getUpdate_admin_office_code() {
        return update_admin_office_code;
    }

    public void setUpdate_admin_office_code(String update_admin_office_code) {
        this.update_admin_office_code = update_admin_office_code;
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

    public String getUpdate_reason() {
        return update_reason;
    }

    public void setUpdate_reason(String update_reason) {
        this.update_reason = update_reason;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getOld_person_id() {
        return old_person_id;
    }

    public void setOld_person_id(String old_person_id) {
        this.old_person_id = old_person_id;
    }

    public String getOld_modify_yyymmdd() {
        return old_modify_yyymmdd;
    }

    public void setOld_modify_yyymmdd(String old_modify_yyymmdd) {
        this.old_modify_yyymmdd = old_modify_yyymmdd;
    }

    public String getOld_modify_time() {
        return old_modify_time;
    }

    public void setOld_modify_time(String old_modify_time) {
        this.old_modify_time = old_modify_time;
    }

    public String getOld_site_id() {
        return old_site_id;
    }

    public void setOld_site_id(String old_site_id) {
        this.old_site_id = old_site_id;
    }

    public String getOld_accept_admin_office_code() {
        return old_accept_admin_office_code;
    }

    public void setOld_accept_admin_office_code(String old_accept_admin_office_code) {
        this.old_accept_admin_office_code = old_accept_admin_office_code;
    }

    public String getOld_original_name() {
        return old_original_name;
    }

    public void setOld_original_name(String old_original_name) {
        this.old_original_name = old_original_name;
    }

    public String getOld_original_maiden_name() {
        return old_original_maiden_name;
    }

    public void setOld_original_maiden_name(String old_original_maiden_name) {
        this.old_original_maiden_name = old_original_maiden_name;
    }

    public String getOld_original_married_name() {
        return old_original_married_name;
    }

    public void setOld_original_married_name(String old_original_married_name) {
        this.old_original_married_name = old_original_married_name;
    }

    public String getOld_original_last_name() {
        return old_original_last_name;
    }

    public void setOld_original_last_name(String old_original_last_name) {
        this.old_original_last_name = old_original_last_name;
    }

    public String getOld_original_first_name() {
        return old_original_first_name;
    }

    public void setOld_original_first_name(String old_original_first_name) {
        this.old_original_first_name = old_original_first_name;
    }

    public String getOld_new_name() {
        return old_new_name;
    }

    public void setOld_new_name(String old_new_name) {
        this.old_new_name = old_new_name;
    }

    public String getNew_person_id() {
        return new_person_id;
    }

    public void setNew_person_id(String new_person_id) {
        this.new_person_id = new_person_id;
    }

    public String getNew_modify_yyymmdd() {
        return new_modify_yyymmdd;
    }

    public void setNew_modify_yyymmdd(String new_modify_yyymmdd) {
        this.new_modify_yyymmdd = new_modify_yyymmdd;
    }

    public String getNew_modify_time() {
        return new_modify_time;
    }

    public void setNew_modify_time(String new_modify_time) {
        this.new_modify_time = new_modify_time;
    }

    public String getNew_site_id() {
        return new_site_id;
    }

    public void setNew_site_id(String new_site_id) {
        this.new_site_id = new_site_id;
    }

    public String getNew_accept_admin_office_code() {
        return new_accept_admin_office_code;
    }

    public void setNew_accept_admin_office_code(String new_accept_admin_office_code) {
        this.new_accept_admin_office_code = new_accept_admin_office_code;
    }

    public String getNew_original_name() {
        return new_original_name;
    }

    public void setNew_original_name(String new_original_name) {
        this.new_original_name = new_original_name;
    }

    public String getNew_original_maiden_name() {
        return new_original_maiden_name;
    }

    public void setNew_original_maiden_name(String new_original_maiden_name) {
        this.new_original_maiden_name = new_original_maiden_name;
    }

    public String getNew_original_married_name() {
        return new_original_married_name;
    }

    public void setNew_original_married_name(String new_original_married_name) {
        this.new_original_married_name = new_original_married_name;
    }

    public String getNew_original_last_name() {
        return new_original_last_name;
    }

    public void setNew_original_last_name(String new_original_last_name) {
        this.new_original_last_name = new_original_last_name;
    }

    public String getNew_original_first_name() {
        return new_original_first_name;
    }

    public void setNew_original_first_name(String new_original_first_name) {
        this.new_original_first_name = new_original_first_name;
    }

    public String getNew_new_name() {
        return new_new_name;
    }

    public void setNew_new_name(String new_new_name) {
        this.new_new_name = new_new_name;
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

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldf007hType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf007hType commononType) {
        this.commononType = commononType;
    }

    public String getOld_remove_yyymmdd() {
        return old_remove_yyymmdd;
    }

    public void setOld_remove_yyymmdd(String old_remove_yyymmdd) {
        this.old_remove_yyymmdd = old_remove_yyymmdd;
    }

    public String getOld_remove_time() {
        return old_remove_time;
    }

    public void setOld_remove_time(String old_remove_time) {
        this.old_remove_time = old_remove_time;
    }

    public String getNew_remove_yyymmdd() {
        return new_remove_yyymmdd;
    }

    public void setNew_remove_yyymmdd(String new_remove_yyymmdd) {
        this.new_remove_yyymmdd = new_remove_yyymmdd;
    }

    public String getNew_remove_time() {
        return new_remove_time;
    }

    public void setNew_remove_time(String new_remove_time) {
        this.new_remove_time = new_remove_time;
    }

    public Rldf007hType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf007hType lockData) {
        this.lockData = lockData;
    }

    public Rldf007hType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf007hType unLockData) {
        this.unLockData = unLockData;
    }

}
