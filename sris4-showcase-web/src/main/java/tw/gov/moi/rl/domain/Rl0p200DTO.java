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
@XmlType(name = "rl0p200DTO", propOrder = { "start_date", "end_date", "area_code", "admin_officce_code",
        "accept_site_id", "person_id", "sys_date", "sys_time", "apply_reason", "check_image", "remark", "document",
        "passport_scan_name", "passport_scan_filepath", "apply_person_name", "apply_birth_yyymmdd",
        "apply_city_county_code", "apply_town_code", "apply_village", "apply_neighbor", "apply_street_doorplate",
        "relation_type", "relation_person_id", "relation_person_name", "relation_birth_yyymmdd",
        "relation_city_county_code", "relation_town_code", "relation_village", "relation_neighbor",
        "relation_street_doorplate", "comm_person_id", "comm_person_name", "comm_birth_yyymmdd",
        "comm_city_county_code", "comm_town_code", "comm_village", "comm_neighbor", "comm_street_doorplate",
        "user_name", "foreign_office_mark", "seq_no" })
@XmlRootElement(name = "Rl0P200DTO")
public class Rl0p200DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Start_date", required = true)
    @FieldName("申辦日期(起)")
    private String start_date;

    @XmlElement(name = "End_date", required = true)
    @FieldName("申辦日期(迄)")
    private String end_date;

    @XmlElement(name = "Area_code", required = true)
    @FieldName("行政區域代碼")
    private String area_code;

    @XmlElement(name = "Admin_officce_code", required = true)
    @FieldName("戶所代碼")
    private String admin_officce_code;

    @XmlElement(name = "Accept_site_id", required = true)
    @FieldName("作業點代碼")
    private String accept_site_id;

    @XmlElement(name = "Person_id", required = true)
    @FieldName("護照申請人統號")
    private String person_id;

    @XmlElement(name = "Sys_date", required = true)
    @FieldName("申辦日期")
    private String sys_date;

    @XmlElement(name = "Sys_time", required = true)
    @FieldName("申辦時間")
    private String sys_time;

    @XmlElement(name = "Apply_reason", required = true)
    @FieldName("辦理原因")
    private String apply_reason;

    @XmlElement(name = "Check_image", required = true)
    @FieldName("人別審查結果")
    private String check_image;

    @XmlElement(name = "Remark", required = true)
    @FieldName("所內備註")
    private String remark;

    @XmlElement(name = "Document", required = true)
    @FieldName("補件通知註記")
    private String document;

    @XmlElement(name = "Passport_scan_name", required = true)
    @FieldName("申請書掃瞄檔名稱")
    private String passport_scan_name;

    @XmlElement(name = "Passport_scan_filepath", required = true)
    @FieldName("申請書掃瞄檔位置")
    private String passport_scan_filepath;

    @XmlElement(name = "Apply_person_name", required = true)
    @FieldName("護照申請人姓名")
    private String apply_person_name;

    @XmlElement(name = "Apply_birth_yyymmdd", required = true)
    @FieldName("護照申請人出生日期")
    private String apply_birth_yyymmdd;

    @XmlElement(name = "Apply_city_county_code", required = true)
    @FieldName("護照申請人省市縣市代碼")
    private String apply_city_county_code;

    @XmlElement(name = "Apply_city_county_code", required = true)
    @FieldName("護照申請人鄉鎮市區代碼")
    private String apply_town_code;

    @XmlElement(name = "Apply_village", required = true)
    @FieldName("護照申請人村里")
    private String apply_village;

    @XmlElement(name = "Apply_village", required = true)
    @FieldName("護照申請人鄰")
    private String apply_neighbor;

    @XmlElement(name = "Apply_street_doorplate", required = true)
    @FieldName("護照申請人街路門牌")
    private String apply_street_doorplate;

    @XmlElement(name = "Relation_type", required = true)
    @FieldName("關係人身分")
    private String relation_type;

    @XmlElement(name = "Relation_person_id", required = true)
    @FieldName("關係人統號")
    private String relation_person_id;

    @XmlElement(name = "Relation_person_name", required = true)
    @FieldName("關係人姓名")
    private String relation_person_name;

    @XmlElement(name = "Relation_birth_yyymmdd", required = true)
    @FieldName("關係人出生日期")
    private String relation_birth_yyymmdd;

    @XmlElement(name = "Relation_city_county_code", required = true)
    @FieldName("關係人省市縣市代碼")
    private String relation_city_county_code;

    @XmlElement(name = "Relation_town_code", required = true)
    @FieldName("關係人鄉鎮市區代碼")
    private String relation_town_code;

    @XmlElement(name = "Relation_village", required = true)
    @FieldName("關係人村里")
    private String relation_village;

    @XmlElement(name = "Relation_neighbor", required = true)
    @FieldName("關係人鄰")
    private String relation_neighbor;

    @XmlElement(name = "Relation_street_doorplate", required = true)
    @FieldName("關係人街路門牌")
    private String relation_street_doorplate;

    @XmlElement(name = "Comm_person_id", required = true)
    @FieldName("受委任人統號")
    private String comm_person_id;

    @XmlElement(name = "Comm_person_name", required = true)
    @FieldName("受委任人姓名")
    private String comm_person_name;

    @XmlElement(name = "Comm_birth_yyymmdd", required = true)
    @FieldName("受委任人出生年月日")
    private String comm_birth_yyymmdd;

    @XmlElement(name = "Comm_city_county_code", required = true)
    @FieldName("受委任人省市縣市代碼")
    private String comm_city_county_code;

    @XmlElement(name = "Comm_town_code", required = true)
    @FieldName("受委任人鄉鎮市區代碼")
    private String comm_town_code;

    @XmlElement(name = "Comm_village", required = true)
    @FieldName("受委任人村里")
    private String comm_village;

    @XmlElement(name = "Comm_neighbor", required = true)
    @FieldName("受委任人鄰")
    private String comm_neighbor;

    @XmlElement(name = "Comm_neighbor", required = true)
    @FieldName("受委任人街路門牌")
    private String comm_street_doorplate;

    @XmlElement(name = "User_name", required = true)
    @FieldName("戶籍員姓名")
    private String user_name;

    @XmlElement(name = "Foreign_office_mark", required = true)
    @FieldName("外交部註記")
    private String foreign_office_mark;

    @XmlElement(name = "Seq_no", required = true)
    @FieldName("序號")
    private String seq_no;

    @XmlElement(name = "Rldfp100LockList", required = true)
    @FieldName("查詢顯示結果 ")
    private List<Rl0p200ResultDTO> rldfp100LockList = new ArrayList<Rl0p200ResultDTO>();

    @XmlElement(name = "Rldfp100LockList", required = true)
    @FieldName("查詢顯示結果 ")
    private List<Rl0p200ResultDTO> rldfp101LockList = new ArrayList<Rl0p200ResultDTO>();

    @XmlElement(name = "ResultDto", required = true)
    @FieldName("Rl0p200ResultDTO")
    private Rl0p200ResultDTO resultDto = new Rl0p200ResultDTO();

    /**
     * Get the start_date
     * 
     * @return the start_date
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * Set the start_date
     * 
     * @param start_date
     *            the start_date to set
     */
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    /**
     * Get the end_date
     * 
     * @return the end_date
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * Set the end_date
     * 
     * @param end_date
     *            the end_date to set
     */
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    /**
     * Get the area_code
     * 
     * @return the area_code
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * Set the area_code
     * 
     * @param area_code
     *            the area_code to set
     */
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    /**
     * Get the admin_officce_code
     * 
     * @return the admin_officce_code
     */
    public String getAdmin_officce_code() {
        return admin_officce_code;
    }

    /**
     * Set the admin_officce_code
     * 
     * @param admin_officce_code
     *            the admin_officce_code to set
     */
    public void setAdmin_officce_code(String admin_officce_code) {
        this.admin_officce_code = admin_officce_code;
    }

    /**
     * Get the accept_site_id
     * 
     * @return the accept_site_id
     */
    public String getAccept_site_id() {
        return accept_site_id;
    }

    /**
     * Set the accept_site_id
     * 
     * @param accept_site_id
     *            the accept_site_id to set
     */
    public void setAccept_site_id(String accept_site_id) {
        this.accept_site_id = accept_site_id;
    }

    /**
     * Get the person_id
     * 
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * Set the person_id
     * 
     * @param person_id
     *            the person_id to set
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * Get the sys_date
     * 
     * @return the sys_date
     */
    public String getSys_date() {
        return sys_date;
    }

    /**
     * Set the sys_date
     * 
     * @param sys_date
     *            the sys_date to set
     */
    public void setSys_date(String sys_date) {
        this.sys_date = sys_date;
    }

    /**
     * Get the sys_time
     * 
     * @return the sys_time
     */
    public String getSys_time() {
        return sys_time;
    }

    /**
     * Set the sys_time
     * 
     * @param sys_time
     *            the sys_time to set
     */
    public void setSys_time(String sys_time) {
        this.sys_time = sys_time;
    }

    /**
     * Get the apply_reason
     * 
     * @return the apply_reason
     */
    public String getApply_reason() {
        return apply_reason;
    }

    /**
     * Set the apply_reason
     * 
     * @param apply_reason
     *            the apply_reason to set
     */
    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    /**
     * Get the check_image
     * 
     * @return the check_image
     */
    public String getCheck_image() {
        return check_image;
    }

    /**
     * Set the check_image
     * 
     * @param check_image
     *            the check_image to set
     */
    public void setCheck_image(String check_image) {
        this.check_image = check_image;
    }

    /**
     * Get the remark
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Set the remark
     * 
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Get the document
     * 
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * Set the document
     * 
     * @param document
     *            the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Get the passport_scan_name
     * 
     * @return the passport_scan_name
     */
    public String getPassport_scan_name() {
        return passport_scan_name;
    }

    /**
     * Set the passport_scan_name
     * 
     * @param passport_scan_name
     *            the passport_scan_name to set
     */
    public void setPassport_scan_name(String passport_scan_name) {
        this.passport_scan_name = passport_scan_name;
    }

    /**
     * Get the passport_scan_filepath
     * 
     * @return the passport_scan_filepath
     */
    public String getPassport_scan_filepath() {
        return passport_scan_filepath;
    }

    /**
     * Set the passport_scan_filepath
     * 
     * @param passport_scan_filepath
     *            the passport_scan_filepath to set
     */
    public void setPassport_scan_filepath(String passport_scan_filepath) {
        this.passport_scan_filepath = passport_scan_filepath;
    }

    /**
     * Get the apply_person_name
     * 
     * @return the apply_person_name
     */
    public String getApply_person_name() {
        return apply_person_name;
    }

    /**
     * Set the apply_person_name
     * 
     * @param apply_person_name
     *            the apply_person_name to set
     */
    public void setApply_person_name(String apply_person_name) {
        this.apply_person_name = apply_person_name;
    }

    /**
     * Get the apply_birth_yyymmdd
     * 
     * @return the apply_birth_yyymmdd
     */
    public String getApply_birth_yyymmdd() {
        return apply_birth_yyymmdd;
    }

    /**
     * Set the apply_birth_yyymmdd
     * 
     * @param apply_birth_yyymmdd
     *            the apply_birth_yyymmdd to set
     */
    public void setApply_birth_yyymmdd(String apply_birth_yyymmdd) {
        this.apply_birth_yyymmdd = apply_birth_yyymmdd;
    }

    /**
     * Get the apply_city_county_code
     * 
     * @return the apply_city_county_code
     */
    public String getApply_city_county_code() {
        return apply_city_county_code;
    }

    /**
     * Set the apply_city_county_code
     * 
     * @param apply_city_county_code
     *            the apply_city_county_code to set
     */
    public void setApply_city_county_code(String apply_city_county_code) {
        this.apply_city_county_code = apply_city_county_code;
    }

    /**
     * Get the apply_town_code
     * 
     * @return the apply_town_code
     */
    public String getApply_town_code() {
        return apply_town_code;
    }

    /**
     * Set the apply_town_code
     * 
     * @param apply_town_code
     *            the apply_town_code to set
     */
    public void setApply_town_code(String apply_town_code) {
        this.apply_town_code = apply_town_code;
    }

    /**
     * Get the apply_village
     * 
     * @return the apply_village
     */
    public String getApply_village() {
        return apply_village;
    }

    /**
     * Set the apply_village
     * 
     * @param apply_village
     *            the apply_village to set
     */
    public void setApply_village(String apply_village) {
        this.apply_village = apply_village;
    }

    /**
     * Get the apply_neighbor
     * 
     * @return the apply_neighbor
     */
    public String getApply_neighbor() {
        return apply_neighbor;
    }

    /**
     * Set the apply_neighbor
     * 
     * @param apply_neighbor
     *            the apply_neighbor to set
     */
    public void setApply_neighbor(String apply_neighbor) {
        this.apply_neighbor = apply_neighbor;
    }

    /**
     * Get the apply_street_doorplate
     * 
     * @return the apply_street_doorplate
     */
    public String getApply_street_doorplate() {
        return apply_street_doorplate;
    }

    /**
     * Set the apply_street_doorplate
     * 
     * @param apply_street_doorplate
     *            the apply_street_doorplate to set
     */
    public void setApply_street_doorplate(String apply_street_doorplate) {
        this.apply_street_doorplate = apply_street_doorplate;
    }

    /**
     * Get the relation_type
     * 
     * @return the relation_type
     */
    public String getRelation_type() {
        return relation_type;
    }

    /**
     * Set the relation_type
     * 
     * @param relation_type
     *            the relation_type to set
     */
    public void setRelation_type(String relation_type) {
        this.relation_type = relation_type;
    }

    /**
     * Get the relation_person_id
     * 
     * @return the relation_person_id
     */
    public String getRelation_person_id() {
        return relation_person_id;
    }

    /**
     * Set the relation_person_id
     * 
     * @param relation_person_id
     *            the relation_person_id to set
     */
    public void setRelation_person_id(String relation_person_id) {
        this.relation_person_id = relation_person_id;
    }

    /**
     * Get the relation_person_name
     * 
     * @return the relation_person_name
     */
    public String getRelation_person_name() {
        return relation_person_name;
    }

    /**
     * Set the relation_person_name
     * 
     * @param relation_person_name
     *            the relation_person_name to set
     */
    public void setRelation_person_name(String relation_person_name) {
        this.relation_person_name = relation_person_name;
    }

    /**
     * Get the relation_birth_yyymmdd
     * 
     * @return the relation_birth_yyymmdd
     */
    public String getRelation_birth_yyymmdd() {
        return relation_birth_yyymmdd;
    }

    /**
     * Set the relation_birth_yyymmdd
     * 
     * @param relation_birth_yyymmdd
     *            the relation_birth_yyymmdd to set
     */
    public void setRelation_birth_yyymmdd(String relation_birth_yyymmdd) {
        this.relation_birth_yyymmdd = relation_birth_yyymmdd;
    }

    /**
     * Get the relation_city_county_code
     * 
     * @return the relation_city_county_code
     */
    public String getRelation_city_county_code() {
        return relation_city_county_code;
    }

    /**
     * Set the relation_city_county_code
     * 
     * @param relation_city_county_code
     *            the relation_city_county_code to set
     */
    public void setRelation_city_county_code(String relation_city_county_code) {
        this.relation_city_county_code = relation_city_county_code;
    }

    /**
     * Get the relation_town_code
     * 
     * @return the relation_town_code
     */
    public String getRelation_town_code() {
        return relation_town_code;
    }

    /**
     * Set the relation_town_code
     * 
     * @param relation_town_code
     *            the relation_town_code to set
     */
    public void setRelation_town_code(String relation_town_code) {
        this.relation_town_code = relation_town_code;
    }

    /**
     * Get the relation_village
     * 
     * @return the relation_village
     */
    public String getRelation_village() {
        return relation_village;
    }

    /**
     * Set the relation_village
     * 
     * @param relation_village
     *            the relation_village to set
     */
    public void setRelation_village(String relation_village) {
        this.relation_village = relation_village;
    }

    /**
     * Get the relation_neighbor
     * 
     * @return the relation_neighbor
     */
    public String getRelation_neighbor() {
        return relation_neighbor;
    }

    /**
     * Set the relation_neighbor
     * 
     * @param relation_neighbor
     *            the relation_neighbor to set
     */
    public void setRelation_neighbor(String relation_neighbor) {
        this.relation_neighbor = relation_neighbor;
    }

    /**
     * Get the relation_street_doorplate
     * 
     * @return the relation_street_doorplate
     */
    public String getRelation_street_doorplate() {
        return relation_street_doorplate;
    }

    /**
     * Set the relation_street_doorplate
     * 
     * @param relation_street_doorplate
     *            the relation_street_doorplate to set
     */
    public void setRelation_street_doorplate(String relation_street_doorplate) {
        this.relation_street_doorplate = relation_street_doorplate;
    }

    /**
     * Get the comm_person_id
     * 
     * @return the comm_person_id
     */
    public String getComm_person_id() {
        return comm_person_id;
    }

    /**
     * Set the comm_person_id
     * 
     * @param comm_person_id
     *            the comm_person_id to set
     */
    public void setComm_person_id(String comm_person_id) {
        this.comm_person_id = comm_person_id;
    }

    /**
     * Get the comm_person_name
     * 
     * @return the comm_person_name
     */
    public String getComm_person_name() {
        return comm_person_name;
    }

    /**
     * Set the comm_person_name
     * 
     * @param comm_person_name
     *            the comm_person_name to set
     */
    public void setComm_person_name(String comm_person_name) {
        this.comm_person_name = comm_person_name;
    }

    /**
     * Get the comm_birth_yyymmdd
     * 
     * @return the comm_birth_yyymmdd
     */
    public String getComm_birth_yyymmdd() {
        return comm_birth_yyymmdd;
    }

    /**
     * Set the comm_birth_yyymmdd
     * 
     * @param comm_birth_yyymmdd
     *            the comm_birth_yyymmdd to set
     */
    public void setComm_birth_yyymmdd(String comm_birth_yyymmdd) {
        this.comm_birth_yyymmdd = comm_birth_yyymmdd;
    }

    /**
     * Get the comm_city_county_code
     * 
     * @return the comm_city_county_code
     */
    public String getComm_city_county_code() {
        return comm_city_county_code;
    }

    /**
     * Set the comm_city_county_code
     * 
     * @param comm_city_county_code
     *            the comm_city_county_code to set
     */
    public void setComm_city_county_code(String comm_city_county_code) {
        this.comm_city_county_code = comm_city_county_code;
    }

    /**
     * Get the comm_town_code
     * 
     * @return the comm_town_code
     */
    public String getComm_town_code() {
        return comm_town_code;
    }

    /**
     * Set the comm_town_code
     * 
     * @param comm_town_code
     *            the comm_town_code to set
     */
    public void setComm_town_code(String comm_town_code) {
        this.comm_town_code = comm_town_code;
    }

    /**
     * Get the comm_village
     * 
     * @return the comm_village
     */
    public String getComm_village() {
        return comm_village;
    }

    /**
     * Set the comm_village
     * 
     * @param comm_village
     *            the comm_village to set
     */
    public void setComm_village(String comm_village) {
        this.comm_village = comm_village;
    }

    /**
     * Get the comm_neighbor
     * 
     * @return the comm_neighbor
     */
    public String getComm_neighbor() {
        return comm_neighbor;
    }

    /**
     * Set the comm_neighbor
     * 
     * @param comm_neighbor
     *            the comm_neighbor to set
     */
    public void setComm_neighbor(String comm_neighbor) {
        this.comm_neighbor = comm_neighbor;
    }

    /**
     * Get the comm_street_doorplate
     * 
     * @return the comm_street_doorplate
     */
    public String getComm_street_doorplate() {
        return comm_street_doorplate;
    }

    /**
     * Set the comm_street_doorplate
     * 
     * @param comm_street_doorplate
     *            the comm_street_doorplate to set
     */
    public void setComm_street_doorplate(String comm_street_doorplate) {
        this.comm_street_doorplate = comm_street_doorplate;
    }

    /**
     * Get the user_name
     * 
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * Set the user_name
     * 
     * @param user_name
     *            the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * Get the foreign_office_mark
     * 
     * @return the foreign_office_mark
     */
    public String getForeign_office_mark() {
        return foreign_office_mark;
    }

    /**
     * Set the foreign_office_mark
     * 
     * @param foreign_office_mark
     *            the foreign_office_mark to set
     */
    public void setForeign_office_mark(String foreign_office_mark) {
        this.foreign_office_mark = foreign_office_mark;
    }

    /**
     * Get the seq_no
     * 
     * @return the seq_no
     */
    public String getSeq_no() {
        return seq_no;
    }

    /**
     * Set the seq_no
     * 
     * @param seq_no
     *            the seq_no to set
     */
    public void setSeq_no(String seq_no) {
        this.seq_no = seq_no;
    }

    /**
     * Get the rldfp100LockList
     * 
     * @return the rldfp100LockList
     */
    public List<Rl0p200ResultDTO> getRldfp100LockList() {
        return rldfp100LockList;
    }

    /**
     * Set the rldfp100LockList
     * 
     * @param rldfp100LockList
     *            the rldfp100LockList to set
     */
    public void setRldfp100LockList(List<Rl0p200ResultDTO> rldfp100LockList) {
        this.rldfp100LockList = rldfp100LockList;
    }

    /**
     * Get the rldfp101LockList
     * 
     * @return the rldfp101LockList
     */
    public List<Rl0p200ResultDTO> getRldfp101LockList() {
        return rldfp101LockList;
    }

    /**
     * Set the rldfp101LockList
     * 
     * @param rldfp101LockList
     *            the rldfp101LockList to set
     */
    public void setRldfp101LockList(List<Rl0p200ResultDTO> rldfp101LockList) {
        this.rldfp101LockList = rldfp101LockList;
    }

    public Rl0p200ResultDTO getResultDto() {
        return resultDto;
    }

    public void setResultDto(Rl0p200ResultDTO resultDto) {
        this.resultDto = resultDto;
    }

}
