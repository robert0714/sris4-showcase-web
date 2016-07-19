/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto.rl03100;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde201wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldf007mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldf018dType;
import tw.gov.moi.domain.Rldf030mType;
import tw.gov.moi.domain.Rldf039mType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.domain.Rldfm01mType;
import tw.gov.moi.domain.Rldfm02mType;
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.domain.Rldfm04mType;
import tw.gov.moi.domain.Rldfm06mType;
import tw.gov.moi.domain.Rldfm08mType;
import tw.gov.moi.domain.Rldfm11mType;
import tw.gov.moi.rl.domain.Rl03100AboardDTO;
import tw.gov.moi.rl.domain.Rl03100ConditionDTO;
import tw.gov.moi.rl.domain.Rl03100RiConditionDTO;
import tw.gov.moi.rl.domain.Rl03100hDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;
import tw.gov.moi.rs.dto.PersonImageDTO;

/**
 * 31查詢結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100DTO", propOrder = { "rldf004m", "rldf005mList", "rldf049mList", "queryDTO", "householdHead",
        "rldf047m", "rldf007mList", "rldfm02mList", "rldfm08mList", "rldfm01m", "rldfm01mList", "rldfm06mList",
        "selRldfm06m", "rldf008mList", "rldf006mList", "rldf030mList", "histroyImageList", "rldf002dList",
        "rlde201wListt", "selRldfm02m", "selRldf002d", "selHistroyImage", "lastHistroyImage", "selRldf039m",
        "rldfm03mList", "rldf018dList", "queryed", "violence", "hList", "selectedh", "condition", "riCondition",
        "deathFlag", "aboardList", "showVPFlag", "vpIdList", "vpIdString", "personBirthYyymmdd", "sealApplyContent",
        "rldfm04mList", "rldfm11mType","lockStatus", "selRldf018d", "rldf018dMemberList" })
@XmlRootElement(name = "Rl03100DTO")
public class Rl03100DTO implements Serializable {

    private final static long serialVersionUID = 1L;

    @XmlElement(name = "Rldf001m")
    @FieldName("全戶資料")
    protected Rldf001mType rldf001m;

    @XmlElement(name = "Rldf002mList")
    @FieldName("全戶記事清單")
    protected List<Rldf002mType> rldf002mList;

    @XmlElement(name = "Rldf004mList")
    @FieldName("戶下成員清單")
    protected List<Rldf004mType> rldf004mList;

    @FieldName("個人資料")
    @XmlElement(name = "Rldf004m")
    protected Rldf004mType rldf004m;
    
    @FieldName("個人資料鎖定情形")
    @XmlElement(name = "LockStatus")
    protected RsLockInforDTO lockStatus;

    @FieldName("個人記事清單")
    @XmlElement(name = "Rldf005mList")
    protected List<Rldf005mType> rldf005mList;

    @FieldName("家暴記錄")
    @XmlElement(name = "Rldf049mList")
    protected List<Rldf049mType> rldf049mList;

    @FieldName("查詢條件")
    @XmlElement(name = "QueryDTO")
    protected Rl03100QueryDTO queryDTO;

    @FieldName("戶長個人資料")
    @XmlElement(name = "HouseholdHead")
    protected Rldf004mType householdHead;

    /** 羅馬拼音檔 */
    @FieldName("羅馬拼音檔")
    @XmlElement(name = "Rldf047m")
    protected Rldf047mType rldf047m;

    /** 姓名更改紀錄. */
    @FieldName("姓名更改紀錄")
    @XmlElement(name = "Rldf007mList")
    protected List<Rldf007mType> rldf007mList;

    /** 婚姻紀錄. */
    @FieldName("婚姻紀錄")
    @XmlElement(name = "Rldfm02mList")
    protected List<Rldfm02mType> rldfm02mList = new ArrayList<Rldfm02mType>();

    /** 監護資料. */
    @FieldName("監護資料")
    @XmlElement(name = "Rldfm08mList")
    protected List<Rldfm08mType> rldfm08mList = new ArrayList<Rldfm08mType>();

    /** 出生資料 */
    @FieldName("出生資料")
    @XmlElement(name = "Rldfm01m")
    private Rldfm01mType rldfm01m = new Rldfm01mType();

    /** 出生資料. */
    @FieldName("出生資料")
    @XmlElement(name = "Rldfm01mList")
    protected List<Rldfm01mType> rldfm01mList = new ArrayList<Rldfm01mType>();

    /** 身分證掛失資料. */
    @FieldName("身分證掛失資料")
    @XmlElement(name = "Rldfm06mList")
    protected List<Rldfm06mType> rldfm06mList = new ArrayList<Rldfm06mType>();

    /** 被選取的身分證掛失資料. */
    @FieldName("被選取的身分證掛失資料")
    @XmlElement(name = "SelRldfm06m")
    private Rldfm06mType selRldfm06m = new Rldfm06mType();

    /** 特殊註記. */
    @FieldName("特殊註記")
    @XmlElement(name = "Rldf008mList")
    protected List<Rldf008mType> rldf008mList = new ArrayList<Rldf008mType>();

    /** 遷徒紀錄. */
    @FieldName("遷徒紀錄")
    @XmlElement(name = "Rldf006mList")
    protected List<Rldf006mType> rldf006mList = new ArrayList<Rldf006mType>();

    /** 所內記事. */
    @FieldName("所內記事")
    @XmlElement(name = "Rldf030mList")
    protected List<Rldf030mType> rldf030mList = new ArrayList<Rldf030mType>();

    /** 歷史影像資料. */
    @FieldName("歷史影像資料")
    @XmlElement(name = "HistroyImageList")
    protected List<PersonImageDTO> histroyImageList = new ArrayList<PersonImageDTO>();

    /** 身分證請領資料. */
    @FieldName("身分證請領資料")
    @XmlElement(name = "rldf002dList")
    protected List<Rldf002dType> rldf002dList = new ArrayList<Rldf002dType>();

    /** 戶口名簿請領紀錄. */
    @FieldName("戶口名簿請領紀錄")
    @XmlElement(name = "Rlde201wListt")
    protected List<Rlde201wType> rlde201wListt = new ArrayList<Rlde201wType>();

    /** 被選取的婚姻紀錄 */
    @FieldName("被選取的婚姻紀錄")
    @XmlElement(name = "SelRldfm02m")
    private Rldfm02mType selRldfm02m = new Rldfm02mType();

    /** 被選取的身分證請領紀錄 */
    @FieldName("被選取的身分證請領紀錄")
    @XmlElement(name = "SelRldf002d")
    private Rldf002dType selRldf002d = new Rldf002dType();

    /** 被選取的歷史影像紀錄 */
    @FieldName("被選取的歷史影像紀錄")
    @XmlElement(name = "SelHistroyImage")
    private PersonImageDTO selHistroyImage = new PersonImageDTO();

    /** 最新的歷史影像紀錄 */
    @FieldName("最新的歷史影像紀錄")
    @XmlElement(name = "LastHistroyImage")
    private PersonImageDTO lastHistroyImage = new PersonImageDTO();

    /** 被選取得入出境資料 */
    @FieldName("被選取得入出境資料")
    @XmlElement(name = "SelRldf039m")
    private Rldf039mType selRldf039m = new Rldf039mType();

    /** 統號更改紀錄. */
    @FieldName("統號更改紀錄")
    @XmlElement(name = "Rldfm03mList")
    protected List<Rldfm03mType> rldfm03mList = new ArrayList<Rldfm03mType>();

    /** 戶口名簿請領紀錄. */
    @FieldName("戶口名簿請領紀錄")
    @XmlElement(name = "Rldf018dList")
    protected List<Rldf018dType> rldf018dList = new ArrayList<Rldf018dType>();

    /** 是否已經query過資料 旗標 */
    @FieldName("是否已經query過資料 旗標")
    @XmlElement(name = "Queryed")
    private boolean queryed = false;

    /** 家暴被害 */
    @FieldName("家暴被害")
    @XmlElement(name = "Violence")
    private List<Rldf004mType> violence = new ArrayList<Rldf004mType>();

    /** 除戶清單 */
    @FieldName("除戶清單")
    @XmlElement(name = "HList")
    private List<Rl03100hDTO> hList = new ArrayList<Rl03100hDTO>();

    /** 選取除戶資料 */
    @FieldName("選取除戶資料")
    @XmlElement(name = "SelectedH")
    private Rl03100hDTO selectedh;

    /** 查詢條件 */
    @FieldName("查詢條件")
    @XmlElement(name = "Condition")
    private Rl03100ConditionDTO condition = new Rl03100ConditionDTO();

    /** 查詢條件 */
    @FieldName("查詢條件")
    @XmlElement(name = "RiCondition")
    private Rl03100RiConditionDTO riCondition = new Rl03100RiConditionDTO();

    /** 特殊註記死亡旗標 */
    @FieldName("特殊註記死亡旗標")
    @XmlElement(name = "DeathFlag")
    private boolean deathFlag = false;

    /** 出入境紀錄 */
    @FieldName("出入境紀錄")
    @XmlElement(name = "AboardDto")
    private List<Rl03100AboardDTO> aboardList = new ArrayList<Rl03100AboardDTO>();

    /** 家暴註記旗標 */
    @FieldName("家暴註記旗標")
    @XmlElement(name = "ShowVPFlag")
    private boolean showVPFlag = false;

    /** 家暴註記統號清單 */
    @FieldName("家暴註記統號清單")
    @XmlElement(name = "VpIdList")
    private List<String> vpIdList = new ArrayList<String>();

    /** 家暴註記統號字串 */
    @FieldName("家暴註記統號字串")
    @XmlElement(name = "VpIdString")
    private String vpIdString = "";

    /** 被選取人的出生日期. */
    @FieldName("被選取人的出生日期")
    @XmlElement(name = "PersonBirthYyymmdd")
    private String personBirthYyymmdd = "";

    /** 印鑑登記內容. */
    @FieldName("印鑑登記內容")
    @XmlElement(name = "SealApplyContent")
    private String sealApplyContent = "";

    /** 認領、收養記錄檔. */
    @FieldName("認領、收養記錄檔")
    @XmlElement(name = "Rldfm04mList")
    protected List<Rldfm04mType> rldfm04mList = new ArrayList<Rldfm04mType>();

    /** 個人姓氏資料檔. */
    @FieldName("個人姓氏資料檔")
    @XmlElement(name = "Rldfm11mType")
    private Rldfm11mType rldfm11mType;

    /** 被選取的戶口名簿請領紀錄. */
    @FieldName("被選取的戶口名簿請領紀錄")
    @XmlElement(name = "SelRldf018d")
    private Rldf018dType selRldf018d = new Rldf018dType();

    /** 戶口名簿請領紀錄查看明細資料. */
    @XmlElement(name = "Rldf018dMemberList")
    @FieldName("戶口名簿請領紀錄查看明細資料")
    private List<Rl03100MemberDTO> rldf018dMemberList = new ArrayList<Rl03100MemberDTO>();

    /**
     * @return the rldf001m
     */
    public Rldf001mType getRldf001m() {
        if (rldf001m == null) {
            rldf001m = new Rldf001mType();
        }
        return rldf001m;
    }

    /**
     * @param rldf001m
     *            the rldf001m to set
     */
    public void setRldf001m(Rldf001mType rldf001m) {
        this.rldf001m = rldf001m;
    }

    /**
     * @return the rldf002mList
     */
    public List<Rldf002mType> getRldf002mList() {
        if (rldf002mList == null) {
            rldf002mList = new ArrayList<Rldf002mType>();
        }
        return rldf002mList;
    }

    /**
     * @param rldf002mList
     *            the rldf002mList to set
     */
    public void setRldf002mList(List<Rldf002mType> rldf002mList) {
        this.rldf002mList = rldf002mList;
    }

    /**
     * @return the rldf004mList
     */
    public List<Rldf004mType> getRldf004mList() {
        if (rldf004mList == null) {
            rldf004mList = new ArrayList<Rldf004mType>();
        }
        return rldf004mList;
    }

    /**
     * @param rldf004mList
     *            the rldf004mList to set
     */
    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    /**
     * @return the rldf004m
     */
    public Rldf004mType getRldf004m() {
        if (rldf004m == null) {
            rldf004m = new Rldf004mType();
        }
        return rldf004m;
    }

    /**
     * @param rldf004m
     *            the rldf004m to set
     */
    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    /**
     * @return the rldf030mList
     */
    public List<Rldf030mType> getRldf030mList() {
        if (rldf030mList == null) {
            rldf030mList = new ArrayList<Rldf030mType>();
        }
        return rldf030mList;
    }

    /**
     * @param rldf030mList
     *            the rldf030mList to set
     */
    public void setRldf030mList(List<Rldf030mType> rldf030mList) {
        this.rldf030mList = rldf030mList;
    }

    /**
     * @return the rldf005mList
     */
    public List<Rldf005mType> getRldf005mList() {
        if (rldf005mList == null) {
            rldf005mList = new ArrayList<Rldf005mType>();
        }
        return rldf005mList;
    }

    /**
     * @param rldf005mList
     *            the rldf005mList to set
     */
    public void setRldf005mList(List<Rldf005mType> rldf005mList) {
        this.rldf005mList = rldf005mList;
    }

    /**
     * @return the rldf049mList
     */
    public List<Rldf049mType> getRldf049mList() {
        if (rldf049mList == null) {
            rldf049mList = new ArrayList<Rldf049mType>();
        }
        return rldf049mList;
    }

    /**
     * @param rldf049mList
     *            the rldf049mList to set
     */
    public void setRldf049mList(List<Rldf049mType> rldf049mList) {
        this.rldf049mList = rldf049mList;
    }

    /**
     * @return the queryDTO
     */
    public Rl03100QueryDTO getQueryDTO() {
        if (queryDTO == null) {
            queryDTO = new Rl03100QueryDTO();
        }
        return queryDTO;
    }

    /**
     * @param queryDTO
     *            the queryDTO to set
     */
    public void setQueryDTO(Rl03100QueryDTO queryDTO) {

        this.queryDTO = queryDTO;
    }

    /**
     * @return the householdHead
     */
    public Rldf004mType getHouseholdHead() {
        if (householdHead == null) {
            householdHead = new Rldf004mType();
        }
        return householdHead;
    }

    /**
     * @param householdHead
     *            the householdHead to set
     */
    public void setHouseholdHead(Rldf004mType householdHead) {

        this.householdHead = householdHead;
    }

    public List<Rldf007mType> getRldf007mList() {
        if (rldf007mList == null) {
            rldf007mList = new ArrayList<Rldf007mType>();
        }
        return rldf007mList;
    }

    public void setRldf007mList(List<Rldf007mType> rldf007mList) {
        this.rldf007mList = rldf007mList;
    }

    public Rldf047mType getRldf047m() {
        if (rldf047m == null) {
            rldf047m = new Rldf047mType();
        }
        return rldf047m;
    }

    public void setRldf047m(Rldf047mType rldf047m) {
        this.rldf047m = rldf047m;
    }

    /**
     * @return the queryed
     */
    public boolean isQueryed() {
        return queryed;
    }

    /**
     * @param queryed
     *            the queryed to set
     */
    public void setQueryed(boolean queryed) {
        this.queryed = queryed;
    }

    /**
     * @return the rldfm02mList
     */
    public List<Rldfm02mType> getRldfm02mList() {
        return rldfm02mList;
    }

    /**
     * @param rldfm02mList
     *            the rldfm02mList to set
     */
    public void setRldfm02mList(List<Rldfm02mType> rldfm02mList) {
        this.rldfm02mList = rldfm02mList;
    }

    /**
     * @return the rldfm08mList
     */
    public List<Rldfm08mType> getRldfm08mList() {
        return rldfm08mList;
    }

    /**
     * @param rldfm08mList
     *            the rldfm08mList to set
     */
    public void setRldfm08mList(List<Rldfm08mType> rldfm08mList) {
        this.rldfm08mList = rldfm08mList;
    }

    /**
     * @return the rldfm01mList
     */
    public List<Rldfm01mType> getRldfm01mList() {
        return rldfm01mList;
    }

    /**
     * @param rldfm01mList
     *            the rldfm01mList to set
     */
    public void setRldfm01mList(List<Rldfm01mType> rldfm01mList) {
        this.rldfm01mList = rldfm01mList;
    }

    /**
     * @return the rldfm06mList
     */
    public List<Rldfm06mType> getRldfm06mList() {
        return rldfm06mList;
    }

    /**
     * @param rldfm06mList
     *            the rldfm06mList to set
     */
    public void setRldfm06mList(List<Rldfm06mType> rldfm06mList) {
        this.rldfm06mList = rldfm06mList;
    }

    /**
     * @return the rldf008mList
     */
    public List<Rldf008mType> getRldf008mList() {
        return rldf008mList;
    }

    /**
     * @param rldf008mList
     *            the rldf008mList to set
     */
    public void setRldf008mList(List<Rldf008mType> rldf008mList) {
        this.rldf008mList = rldf008mList;
    }

    /**
     * @return the rldf006mList
     */
    public List<Rldf006mType> getRldf006mList() {
        return rldf006mList;
    }

    /**
     * @param rldf006mList
     *            the rldf006mList to set
     */
    public void setRldf006mList(List<Rldf006mType> rldf006mList) {
        this.rldf006mList = rldf006mList;
    }

    /**
     * @return the rldf002dList
     */
    public List<Rldf002dType> getRldf002dList() {
        return rldf002dList;
    }

    /**
     * @param rldf002dList
     *            the rldf002dList to set
     */
    public void setRldf002dList(List<Rldf002dType> rldf002dList) {
        this.rldf002dList = rldf002dList;
    }

    /**
     * @return the rlde201wListt
     */
    public List<Rlde201wType> getRlde201wListt() {
        return rlde201wListt;
    }

    /**
     * @param rlde201wListt
     *            the rlde201wListt to set
     */
    public void setRlde201wListt(List<Rlde201wType> rlde201wListt) {
        this.rlde201wListt = rlde201wListt;
    }

    /**
     * @return the selRldfm02m
     */
    public Rldfm02mType getSelRldfm02m() {
        return selRldfm02m;
    }

    /**
     * @param selRldfm02m
     *            the selRldfm02m to set
     */
    public void setSelRldfm02m(Rldfm02mType selRldfm02m) {
        this.selRldfm02m = selRldfm02m;
    }

    /**
     * @return the selRldf002d
     */
    public Rldf002dType getSelRldf002d() {
        return selRldf002d;
    }

    /**
     * @param selRldf002d
     *            the selRldf002d to set
     */
    public void setSelRldf002d(Rldf002dType selRldf002d) {
        this.selRldf002d = selRldf002d;
    }

    /**
     * @return the rldfm01m
     */
    public Rldfm01mType getRldfm01m() {
        return rldfm01m;
    }

    /**
     * @param rldfm01m
     *            the rldfm01m to set
     */
    public void setRldfm01m(Rldfm01mType rldfm01m) {
        this.rldfm01m = rldfm01m;
    }

    public List<Rldf004mType> getViolence() {
        return violence;
    }

    public void setViolence(List<Rldf004mType> violence) {
        this.violence = violence;
    }

    public List<Rl03100hDTO> gethList() {
        return hList;
    }

    public void sethList(List<Rl03100hDTO> hList) {
        this.hList = hList;
    }

    public Rl03100hDTO getSelectedh() {
        return selectedh;
    }

    public void setSelectedh(Rl03100hDTO selectedh) {
        this.selectedh = selectedh;
    }

    public Rl03100ConditionDTO getCondition() {
        return condition;
    }

    public void setCondition(Rl03100ConditionDTO condition) {
        this.condition = condition;
    }

    public Rl03100RiConditionDTO getRiCondition() {
        return riCondition;
    }

    public void setRiCondition(Rl03100RiConditionDTO riCondition) {
        this.riCondition = riCondition;
    }

    public boolean isDeathFlag() {
        return deathFlag;
    }

    public void setDeathFlag(boolean deathFlag) {
        this.deathFlag = deathFlag;
    }

    // public Info getSelHistroyImage() {
    // return selHistroyImage;
    // }
    //
    // public void setSelHistroyImage(Info selHistroyImage) {
    // this.selHistroyImage = selHistroyImage;
    // }

    public Rldf039mType getSelRldf039m() {
        return selRldf039m;
    }

    public void setSelRldf039m(Rldf039mType selRldf039m) {
        this.selRldf039m = selRldf039m;
    }

    public List<Rldfm03mType> getRldfm03mList() {
        return rldfm03mList;
    }

    public void setRldfm03mList(List<Rldfm03mType> rldfm03mList) {
        this.rldfm03mList = rldfm03mList;
    }

    public List<Rldf018dType> getRldf018dList() {
        return rldf018dList;
    }

    public void setRldf018dList(List<Rldf018dType> rldf018dList) {
        this.rldf018dList = rldf018dList;
    }

    public List<PersonImageDTO> getHistroyImageList() {
        return histroyImageList;
    }

    public void setHistroyImageList(List<PersonImageDTO> histroyImageList) {
        this.histroyImageList = histroyImageList;
    }

    public PersonImageDTO getSelHistroyImage() {
        return selHistroyImage;
    }

    public void setSelHistroyImage(PersonImageDTO selHistroyImage) {
        this.selHistroyImage = selHistroyImage;
    }

    public PersonImageDTO getLastHistroyImage() {
        return lastHistroyImage;
    }

    public void setLastHistroyImage(PersonImageDTO lastHistroyImage) {
        this.lastHistroyImage = lastHistroyImage;
    }

    public Rldfm06mType getSelRldfm06m() {
        return selRldfm06m;
    }

    public void setSelRldfm06m(Rldfm06mType selRldfm06m) {
        this.selRldfm06m = selRldfm06m;
    }

    public List<Rl03100AboardDTO> getAboardList() {
        return aboardList;
    }

    public void setAboardList(List<Rl03100AboardDTO> aboardList) {
        this.aboardList = aboardList;
    }

    public boolean isShowVPFlag() {
        return showVPFlag;
    }

    public void setShowVPFlag(boolean showVPFlag) {
        this.showVPFlag = showVPFlag;
    }

    public List<String> getVpIdList() {
        return vpIdList;
    }

    public void setVpIdList(List<String> vpIdList) {
        this.vpIdList = vpIdList;
    }

    public String getVpIdString() {
        return vpIdString;
    }

    public void setVpIdString(String vpIdString) {
        this.vpIdString = vpIdString;
    }

    public String getPersonBirthYyymmdd() {
        return personBirthYyymmdd;
    }

    public void setPersonBirthYyymmdd(String personBirthYyymmdd) {
        this.personBirthYyymmdd = personBirthYyymmdd;
    }

    public String getSealApplyContent() {
        return sealApplyContent;
    }

    public void setSealApplyContent(String sealApplyContent) {
        this.sealApplyContent = sealApplyContent;
    }

    public List<Rldfm04mType> getRldfm04mList() {
        return rldfm04mList;
    }

    public void setRldfm04mList(List<Rldfm04mType> rldfm04mList) {
        this.rldfm04mList = rldfm04mList;
    }

    public Rldfm11mType getRldfm11mType() {
        return rldfm11mType;
    }

    public void setRldfm11mType(Rldfm11mType rldfm11mType) {
        this.rldfm11mType = rldfm11mType;
    }

    public RsLockInforDTO getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(RsLockInforDTO lockStatus) {
        this.lockStatus = lockStatus;
    }

	public Rldf018dType getSelRldf018d() {
		return selRldf018d;
	}

	public void setSelRldf018d(Rldf018dType selRldf018d) {
		this.selRldf018d = selRldf018d;
	}

	public List<Rl03100MemberDTO> getRldf018dMemberList() {
		return rldf018dMemberList;
	}

	public void setRldf018dMemberList(List<Rl03100MemberDTO> rldf018dMemberList) {
		this.rldf018dMemberList = rldf018dMemberList;
	}

}
