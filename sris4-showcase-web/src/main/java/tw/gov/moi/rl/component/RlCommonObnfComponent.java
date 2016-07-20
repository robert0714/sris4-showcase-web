/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rcdf074aType;
import tw.gov.moi.domain.Rcdff003Type;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfs074Type;
import tw.gov.moi.domain.XldfhdrmType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XCDF002E;
import tw.gov.moi.rl.component.xldf.dto.XLDF001H;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF002M;
import tw.gov.moi.rl.component.xldf.dto.XLDF003S;
import tw.gov.moi.rl.component.xldf.dto.XLDF004H;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004N;
import tw.gov.moi.rl.component.xldf.dto.XLDF005M;
import tw.gov.moi.rl.component.xldf.dto.XLDF006M;
import tw.gov.moi.rl.component.xldf.dto.XLDF007M;
import tw.gov.moi.rl.component.xldf.dto.XLDF008M;
import tw.gov.moi.rl.component.xldf.dto.XLDF008S;
import tw.gov.moi.rl.component.xldf.dto.XLDF009S;
import tw.gov.moi.rl.component.xldf.dto.XLDF010M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.component.xldf.dto.XLDF039S;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;
import tw.gov.moi.rl.component.xldf.dto.XLDF049M;
import tw.gov.moi.rl.component.xldf.dto.XLDF058M;
import tw.gov.moi.rl.component.xldf.dto.XLDF087T;
import tw.gov.moi.rl.component.xldf.dto.XLDF088T;
import tw.gov.moi.rl.component.xldf.dto.XLDF089T;
import tw.gov.moi.rl.component.xldf.dto.XLDF100M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM01M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM02M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM03M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM04M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM05M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM06M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM08M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM09M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM11M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM13M;
import tw.gov.moi.rs.dto.ObnfDTO;
import tw.gov.moi.rs.dto.PairEntry;

/**
 * Rl共用Obnf產生元件.
 * 
 * @author JL
 */
public interface RlCommonObnfComponent {

    /** The Constant error12. */
    String error12 = "製作RLDF088T結(離)婚證明書資料通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error13. */
    String error13 = "製作RLDF087T登記婚前結(離)婚證明書資料通報[RL]或[RC]的ObnfDTO";

    /** The Constant error14. */
    String error14 = "製作RLDF089T英文結(離)婚證明書資料通報[RL]或[RC]的ObnfDTO";

    /** The Constant error15. */
    String error15 = "製作RCDF002E國民身分證異動紀錄通報[RC]的ObnfDTO";

    /** The Constant error16. */
    String error16 = "製作RRDF003M除口紀錄通報[RR]的ObnfDTO";

    /** The Constant error17. */
    String error17 = "製作RLDF006M個人遷徙紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error18. */
    String error18 = "製作RLDF007M姓名更改紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error19. */
    String error19 = "製作RLDF008M特殊註記資料通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error20. */
    String error20 = "製作RLDF047M姓名羅馬拼音通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error21. */
    String error21 = "製作RLDFM03M統號更改紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error22. */
    String error22 = "製作RLDFM04M收養紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error23. */
    String error23 = "製作RLDFM05M監護、輔助、未成年子女權利義務行使負擔資料通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error24. */
    String error24 = "製作RLDFM06M國民身分證掛失紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error25. */
    String error25 = "製作RLDFM07M重婚資料通報[RL]或[RR及RC]的ObnfDTO";

    /** The Constant error26. */
    String error26 = "製作RLDFM08M監護、輔助、未成年子女權利義務行使負擔紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The error27. */
    String error27 = "製作RLDFM09M出生日期更改紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /** The error28. */
    String error28 = "製作RRDFX系列（全戶記事欄位化）通報 [RR及RC]的ObnfDTO";

    /** The error29. */
    String error29 = "製作RRDFY系列（個人記事欄位化）通報 [RR及RC]的ObnfDTO";

    /** The error30. */
    String error30 = " 製作RLDFM11M個人姓氏資料通報[RL]或[RR及RC]的ObnfDTO";

    /** The error31. */
    String error31 = "製作RLDF004N戶政所對兵役課通報檔通報役政的ObnfDTO";

    /** XLDF030M error msg. */
    String error32 = "製作RLDF030M所內記事檔資料通報 RR及RC的ObnfDTO";

    /** XLDF030T error msg. */
    String error33 = "製作RLDF030T他所行政協助所內記事檔資料通報 RR及RC的ObnfDTO";

    /** The Constant error34. */
    String error34 = "製作RLDF010M處理限制遷徙人口資料通報的ObnfDTO";

    /** The Constant error35. */
    String error35 = "製作RLDF049M保護家庭暴力資料通報[RL]或[RC]的ObnfDTO";

    /** The Constant error36 製作RLDFM06M國民身分證掛失紀錄通報[RL]或[RR]的ObnfDTO. */
    String error36 = "製作RLDFM06M國民身分證掛失紀錄通報[RL]或[RR]的ObnfDTO";

    /** The Constant error37 製作RLDF007M姓名更改紀錄通報[RL]或[RR]的ObnfDTO. */
    String error37 = "製作RLDF007M姓名更改紀錄通報[RL]或[RR]的ObnfDTO";

    /** The Constant error38 製作RLDF100M應清查人口資料通報[RL]或[RR及RC]的ObnfDTO . */
    String error38 = "製作RLDF100M應清查人口資料通報[RL]或[RR及RC]的ObnfDTO ";

    /** The Constant error39 製作XLDFHDRM下除戶通報[RL]ObnfDTO. */
    String error39 = "製作XLDFHDRM下除戶通報[RL]ObnfDTO";

    /**
     * 製作申請書通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：用於通報1S、2R、4T類申請書<br>
     * 註2.1：當申請書為1S、2R時，receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFxxxA登記申請書
     * 」，RC層級「RCDFxxxA登記申請書」，若不為本地作業點，則為通報RL層<br>
     * 註2.2：當申請書為4T時，目的是讓接收端呼叫8110統計程式，故4T之receiverSiteId必須為本地，且不會往RR、RC通報<br>
     * 註3：noticeType，1S類為"L017"，2R類為"L003"，4T類為"L004"<br>
     * 註4：entityClass，設定RL之申請書型態，例如出生登記
     * ，不論是往上或往RL層通報，都設定為"Rldfs001.class"，吉堂接收程式需在做轉換成目標class.
     * 
     * @param dto
     *            the dto
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作申請書通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeApplicationFormObnfDTO(final XLDFDomainObject dto, final ExecutantType info, final String chgType,
            final String noticeType, final String receiverSiteId) throws RisBusinessException;

    /**
     * 製作申請書通報[RL]或[RR及RC]的ObnfDTO，可設定是否呼叫8110統計程式<br>
     * 
     * 註1：用於通報1S、2R、4T類申請書 <br>
     * 註2.1：當申請書為1S、2R時，receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFxxxA登記申請書」，RC層級「
     * RCDFxxxA登記申請書」，若不為本地作業點，則為通報RL層<br>
     * 註2.2：當申請書為4T時，目的是讓接收端呼叫8110統計程式，故4T之receiverSiteId必須為本地，且不會往RR、RC通報<br>
     * 註3：noticeType，1S類為"L017"，2R類為"L003"，4T類為"L004"<br>
     * 註4：entityClass，設定RL之申請書型態，例如出生登記，不論是往上或往RL層通報，都設定為"Rldfs001.class"，
     * 吉堂接收程式需在做轉換成目標class
     * 
     * 
     * @param dto
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param call8110Flag
     *            判斷是否呼叫8110 程式(Y/N)
     * @return ObnfDTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    ObnfDTO makeApplicationFormObnfDTO(final XLDFDomainObject dto, final ExecutantType info, final String chgType,
            final String noticeType, final String receiverSiteId, final String call8110Flag)
            throws RisBusinessException;

    /**
     * 製作異動[特殊統號]資料通報[RL]或[RR及RC]的ObnfDTO<BR>
     * <BR>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF100M」，RC層級「RCDF100M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * <BR>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param sequenceId
     *            作業順序
     * @param personId
     *            正常統號
     * @param specialId
     *            特殊統號
     * @param pExecutantType
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeChangeSpecialIdObnfDTO(final Integer sequenceId, final String personId, final String specialId,
            final ExecutantType pExecutantType, final String chgType, final String noticeType,
            final String receiverSiteId);

    /**
     * 製作RRDFX系列（全戶記事欄位化）通報 [RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFX系列（全戶記事欄位化）」，RC層級「RRDFX系列（
     * 全戶記事欄位化）」<BR>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param pXLDFDomainObject
     *            XLDFDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeHouseholdNoteDetailObnfDTO(final XLDFDomainObject pXLDFDomainObject,
            final ExecutantType pExecutantType, final String pChgType, final String pNoticeType,
            final String pReceiverSiteId);

    /**
     * 製作親等資料通報[RC親等系統]或無戶籍者資料庫的ObnfDTO <BR>
     * <BR>
     * 註1：noticeType "C009"：通報親等系統.
     * 
     * @param wkDataObject
     *            通報親等系統之資料
     * @param executantType
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param sequenceId
     *            作業順序編號
     * @param entityClass
     *            通報親等系統之資料之Class名稱
     * @return ObnfDTO
     */
    @Deprecated
    ObnfDTO makeKinshipObnfDTO(final List<PairEntry> wkDataObject, final ExecutantType executantType,
            final String chgType, final String noticeType, final String receiverSiteId, final String sequenceId,
            final Class<?> entityClass);

    /**
     * 製作親等資料通報[RC親等系統]或無戶籍者資料庫的ObnfDTO.
     * 
     * @param wkKey
     *            已身統號
     * @param wkDataObject
     *            通報親等系統之資料
     * @param executantType
     *            使用者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param sequenceId
     *            作業順序編號
     * @param entityClass
     *            通報親等系統之資料之Class名稱
     * @return ObnfDTO
     */
    ObnfDTO makeKinshipObnfDTO(final String wkKey, final List<PairEntry> wkDataObject,
            final ExecutantType executantType, final String chgType, final String noticeType,
            final String receiverSiteId, final String sequenceId, final Class<?> entityClass);

    /**
     * 製作RRDFY系列（個人記事欄位化）通報 [RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFY系列（個人記事欄位化）」，RC層級「RRDFY系列（
     * 個人記事欄位化）」<BR>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param pXLDFDomainObject
     *            XLDFDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makePersonNoteDetailObnfDTO(XLDFDomainObject pXLDFDomainObject, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId);

    /**
     * Make rcd f001 m complex obnf dto.
     * 
     * @param xldf001m
     *            XLDFDomainObject （可輸入）
     * @param xldf004m
     *            XLDFDomainObject （必輸入）
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param extraFieldMap
     *            放置欲更新之RCDF001M欄位且此欄位不存在於RLDF001M跟RLDF004M
     * @param extraNoticeMap
     *            放置須提供通報處理程式特殊處理之field
     * @return the obnf dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    ObnfDTO makeRCDF001MComplexObnfDTO(XLDF001M xldf001m, XLDF004M xldf004m, ExecutantType info, String chgType,
            String noticeType, String receiverSiteId, Map<String, Object> extraFieldMap,
            Map<String, Object> extraNoticeMap) throws RisBusinessException;

    /**
     * 製作RCDF001M全國個人基本資料通報RC的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RC層級之「RCDF001M」，若不為本地作業點，
     * 則為通報RL接收端後由接收端通報RC層級之「RCDF001M」 註2：noticeType "L007"：通報RC 層級RCDF001M<br>
     * 註3：因應修改或刪除需準備RC1M之PK統號，故xldf004m一定要傳入，由其取得統號後作為wKey.
     * 
     * @param xldf001m
     *            XLDFDomainObject （可輸入）
     * @param xldf004m
     *            XLDFDomainObject （必輸入）
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param extraFieldMap
     *            放置欲更新之RCDF001M欄位且此欄位不存在於RLDF001M跟RLDF004M
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RCDF001M全國個人基本資料通報RC的ObnfDTO失敗」
     */
    ObnfDTO makeRCDF001MObnfDTO(XLDF001M xldf001m, XLDF004M xldf004m, ExecutantType info, String chgType,
            String noticeType, String receiverSiteId, Map<String, Object> extraFieldMap) throws RisBusinessException;

    /**
     * 製作RCDF002E國民身分證異動紀錄通報[RC]的ObnfDTO.<BR>
     * 註1：Xcdf002e只會通報RC
     * 
     * @param pXCDF002E
     *            XLDFDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @return the obnf dto
     */
    ObnfDTO makeRCDF002EObnfDTO(final XCDF002E pXCDF002E, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType);

    /**
     * 製作RCDF002E國民身分證異動紀錄通報[RC]的ObnfDTO.<BR>
     * 註1：Xcdf002e只會通報RC
     * 
     * @param pXCDF002E
     *            XLDFDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param receiverSiteId
     *            自定的接收端作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRCDF002EObnfDTO(final XCDF002E pXCDF002E, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String receiverSiteId);

    /**
     * Make rcd f001 m complex obnf dto.
     * 
     * @param xldf006m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param extraFieldMap
     *            放置欲更新之RCDF001M欄位且此欄位不存在於RLDF001M跟RLDF004M
     * @param extraNoticeMap
     *            放置須提供通報處理程式特殊處理之field
     * @return the obnf dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    ObnfDTO makeRCDF003MComplexObnfDTO(XLDF006M xldf006m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId, Map<String, Object> extraFieldMap, Map<String, Object> extraNoticeMap)
            throws RisBusinessException;

    /**
     * 製作RCDF003M 遷徙記錄通報RC的ObnfDTO
     * 註1：receiverSiteId若為本地作業點，則為往上通報RC層級之「RCDF003M」
     * ，若不為本地作業點，則為通報RL接收端後由接收端通報RC層級之「RCDF003M」 註2：noticeType "L007"：通報RC
     * 層級RCDF003M.
     * 
     * @param xldf006m
     *            the xldf006m
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別L007
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF001M全戶基本資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRCDF003MObnfDTO(XLDF006M xldf006m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RCDF074A的ObnfDTO(Rl01310 遷入登記使用)
     * 
     * 註1：noticeType "C001"：RL->RC 的申請書.
     * 
     * @param rcdf074a
     *            the rcdf074a
     * @param seqId
     *            the seq id
     * @param chgType
     *            the chg type
     * @param noticeType
     *            the notice type
     * @param receiverSiteId
     *            the receiver site id
     * @param pExecutantType
     *            the executant type
     * @return the obnf dto
     */
    ObnfDTO makeRCDF074AObnfDTO(final Rcdf074aType rcdf074a, final Integer seqId, final String chgType,
            final String noticeType, final String receiverSiteId, final ExecutantType pExecutantType);

    /**
     * 製作通報[RC]出生登記通報資料檔RCDFF001ObnfDTO的ObnfDTO <LI>
     * receiverSiteId固定為"00000000"(RC)<LI>
     * noticeType "C601" : 通報出生登記通報資料檔.
     * 
     * @param xldf058m
     *            XLDFDomainObject
     * @param info
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @return ObnfDTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    ObnfDTO makeRCDFF001ObnfDTO(final XLDF058M xldf058m, final ExecutantType info, final String chgType,
            final String noticeType) throws RisBusinessException;

    /**
     * 製作通報[RC]出生登記通報資料檔RCDFF003ObnfDTO的ObnfDTO <LI>
     * receiverSiteId固定為"00000000"(RC)<LI>
     * noticeType "C601" : 通報出生登記通報資料檔.
     * 
     * @param rcdff003Type
     *            XLDFDomainObject
     * @param info
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param sequenceId
     *            作業順序
     * @return ObnfDTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    ObnfDTO makeRCDFF003ObnfDTO(final Rcdff003Type rcdff003Type, final ExecutantType info, final String chgType,
            final String noticeType, final Integer sequenceId) throws RisBusinessException;

    /**
     * 製作RLDF001M全戶基本資料通報[[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR、RC層，若不為本地作業點，則為通報RL層<br>
     * 註2：通報RR層級之「RRDF001M個人基本資料」，RC層級之「RRDF001M個人基本資料」<br>
     * 註3：noticeType "L006"：通報戶籍資料.
     * 
     * @param rldf001mType
     *            the rldf001m type
     * @param sequenceId
     *            the sequence id
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSystemCode
     *            the receiver system code
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param oprCode
     *            作業代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF001M全戶基本資料通報[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF001MObnfDTO(Rldf001mType rldf001mType, final String sequenceId, ExecutantType info, String chgType,
            String noticeType, String receiverSystemCode, String receiverSiteId, final String oprCode)
            throws RisBusinessException;

    /**
     * 製作RLDF001M全戶基本資料通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：chgType："L"
     * type只適用在RLDF001M，為刪除ReceiverSiteId所在地的RR、RC的rrdf001m及其相關table<br>
     * 註2：receiverSiteId若為本地作業點
     * ，則為往上通報RR層級之「RRDF001M」，RC層級之「RRDF001M」，若不為本地作業點，則為通報RL層 <br>
     * 註3：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldf001m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF001M全戶基本資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF001MObnfDTO(XLDF001M xldf001m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF002M全戶記事通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF002M」，RC層級「RRDF002M」，若不為本地作業點，
     * 則為通報RL層 <br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldf002m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF002Mfm全戶記事通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF002MObnfDTO(XLDF002M xldf002m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF004M個人基本資料通報[[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR、RC層，若不為本地作業點，則為通報RL層<br>
     * 註2：通報RR層級之「RRDF004M個人基本資料」，RC層級之「RRDF004M個人基本資料」<br>
     * 註3：noticeType "L006"：通報戶籍資料.
     * 
     * @param rldf004mType
     *            the rldf004m type
     * @param sequenceId
     *            the sequence id
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSystemCode
     *            the receiver system code
     * @param receiverSiteId
     *            目的地作業點代碼
     * @param extraNoticeMap
     *            the extra notice map
     * @param oprCode
     *            the opr code
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF004M個人基本資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF004MObnfDTO(Rldf004mType rldf004mType, final String sequenceId, ExecutantType info, String chgType,
            String noticeType, String receiverSystemCode, String receiverSiteId, Map<String, Object> extraNoticeMap,
            final String oprCode) throws RisBusinessException;

    /**
     * 製作RLDF004M個人基本資料通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR、RC層，若不為本地作業點，則為通報RL層<br>
     * 註2：通報RR層級之「RRDF004M個人基本資料」，RC層級之「RRDF004M個人基本資料」<br>
     * 註3：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldf004m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF004M個人基本資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF004MObnfDTO(XLDF004M xldf004m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF004N戶政所對兵役課通報檔通報役政的ObnfDTO
     * 
     * 註1：noticeType "ML02"：戶政所對兵役課通報 .
     * 
     * @param pXLDF004N
     *            XLDF004NDomainObject
     * @param pExecutantType
     *            the executant type
     * @return the obnf dto
     */
    ObnfDTO makeRLDF004NObnfDTO(final XLDF004N pXLDF004N, final ExecutantType pExecutantType);

    /**
     * 製作RLDF005M個人記事通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF005M」，RC層級「RRDF005M」，若不為本地作業點，
     * 則為通報RL層 <br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldf005m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF005M個人記事通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF005MObnfDTO(XLDF005M xldf005m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF006M個人遷徙紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF006M」，RC層級「RCDF003M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF006M
     *            XLDF006MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF006MNormalObnfDTO(final XLDF006M pXLDF006M, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF006M個人遷徙紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF006M」，RC層級「RCDF003M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF006M
     *            XLDF006MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF006MObnfDTO(final XLDF006M pXLDF006M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF006M個人遷徙紀錄通報[RL]或[RR]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF006M」，若不為本地作業點， 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF006M
     *            XLDF006MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF006MSimpleObnfDTO(final XLDF006M pXLDF006M, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF006M 遷徙記錄通報RC的ObnfDTO 註1：只通報rc RCDF003M 註2：noticeType
     * "L006"：通報戶籍資料.
     * 
     * @param pXLDF006M
     *            the xLD f006 m
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            the chg type
     * @param pNoticeType
     *            the notice type
     * @param pReceiverSiteId
     *            the receiver site id
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF001M全戶基本資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF006MToOnlyRcObnfDTO(final XLDF006M pXLDF006M, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF007M姓名更改紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF007M」，RC層級「RCDF002M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF007M
     *            XLDF007MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF007MObnfDTO(final XLDF007M pXLDF007M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF007M姓名更改記錄通報[RL]或[RR]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF007M」，，若不為本地作業點， 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF007M
     *            XLDF007MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF007MSimpleObnfDTO(final XLDF007M pXLDF007M, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF008M特殊註記資料通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF008M」，RC層級「RRDF008M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF008M
     *            XLDF008MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF008MObnfDTO(final XLDF008M pXLDF008M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF008S申請書索引資料通報[RL]的ObnfDTO<br>
     * 
     * 註1：noticeType 8S為"L018" <br>
     * 註2：8S只會通報RL，不會通報RR、RC.
     * 
     * @param xldf008S
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF008S申請書索引資料ObnfDTO失敗」
     */
    ObnfDTO makeRLDF008SObnfDTO(XLDF008S xldf008S, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF009S外來申請書索引資料通報[RL]的ObnfDTO<br>
     * 
     * 註1：noticeType 9S為"L003" <br>
     * 註2：9S只會通報RL，不會通報RR、RC.
     * 
     * @param xldf009S
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF009S外來申請書索引資料ObnfDTO失敗」
     */
    ObnfDTO makeRLDF009SObnfDTO(XLDF009S xldf009S, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF010M處理限制遷徙人口資料通報.
     * 
     * @param xldf010m
     *            XLDF010M DomainObject
     * @param pExecutantType
     *            executantType
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeRLDF010MObnfDTO(final XLDF010M xldf010m, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 通報市縣及中央所內記事檔資料.
     * 
     * @param xldf030m
     *            XLDF030M DomainObject
     * @param exec
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param siteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeRLDF030MObnfDTO(final XLDF030M xldf030m, final ExecutantType exec, final String chgType,
            final String noticeType, final String siteId);

    /**
     * 通報市縣及中央所內記事檔資料.
     * 
     * @param xldf030m
     *            XLDF030M DomainObject
     * @param exec
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param siteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeRLDF030MToRrObnfDTO(final XLDF030M xldf030m, final ExecutantType exec, final String chgType,
            final String noticeType, final String siteId);

    /**
     * 通報市縣及中央他所行政協助所內記事檔資料.
     * 
     * @param xldf030t
     *            XLDF030T DomainObject
     * @param exec
     *            ExecutantType
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param siteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeRLDF030TObnfDTO(final XLDF030T xldf030t, final ExecutantType exec, final String chgType,
            final String noticeType, final String siteId);

    /**
     * 製作RLDF047M姓名羅馬拼音通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級
     * 「RRDF047M」，RC層級「RRDF047M」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF047M
     *            XLDF047MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF047MObnfDTO(final XLDF047M pXLDF047M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF049M保護家庭暴力資料通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級
     * 「RRDF049M」，RC層級「RRDF049M」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDF049M
     *            XLDF049MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF049MObnfDTO(final XLDF049M pXLDF049M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF087T登記婚前結(離)婚證明書資料通報[RL]或[RC]的ObnfDTO.
     * 
     * @param pXLDF087T
     *            XLDF087TDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF087TObnfDTO(final XLDF087T pXLDF087T, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF088T結(離)婚證明書資料通報[RL]或[RR及RC]的ObnfDTO.
     * 
     * @param xldf088T
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDF088T結(離)婚證明書資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDF088TObnfDTO(XLDF088T xldf088T, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDF089T英文結(離)婚證明書資料通報[RL]或[RC]的ObnfDTO.
     * 
     * @param pXLDF089T
     *            XLDF089TDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF089TObnfDTO(final XLDF089T pXLDF089T, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF100M應清查人口資料通報[RL]或[RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF100M」，RC層級「RCDF100M」，若不為本地作業點，
     * 則為通報RL層 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param pXLDF100M
     *            the xLD f100 m
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF100MObnfDTO(final XLDF100M pXLDF100M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM01M出生資料通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM01M」，RC層級「RRDFM01M」、「RCDFM01M」，
     * 若不為本地作業點，則為通報RL層 <br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldfM01m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDFM01M出生資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDFM01MObnfDTO(XLDFM01M xldfM01m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDFM02M婚姻紀錄資料通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM02M」，RC層級「RRDFM02M」、「RCDFM02M」，
     * 若不為本地作業點，則為通報RL層<br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldfM02m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDFM02M婚姻紀錄資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDFM02MObnfDTO(XLDFM02M xldfM02m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDFM03M統號更改紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM03M」，RC層級「RRDFM03M」、「RCDF004M」，
     * 若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM03M
     *            XLDFM03MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM03MObnfDTO(final XLDFM03M pXLDFM03M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM04M收養紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM04M」，RC層級「RRDFM04M」、「RCDFM04M」，
     * 若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM04M
     *            XLDFM04MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM04MObnfDTO(final XLDFM04M pXLDFM04M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM05M監護、輔助、未成年子女權利義務行使負擔資料通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點
     * ，則為往上通報RR層級「RRDFM05M」，RC層級「RRDFM05M」、「RCDFM05M」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM05M
     *            XLDFM05MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM05MObnfDTO(final XLDFM05M pXLDFM05M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM06M國民身分證掛失紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級
     * 「RRDFM06M」，RC層級「RRDFM06M」、「RCDFM06M」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM06M
     *            XLDFM06MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM06MObnfDTO(final XLDFM06M pXLDFM06M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM06M國民身分證掛失紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點， 「RRDFM06M」，RC層級「RRDFM06M」、「」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM06M
     *            XLDFM06MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM06MToRRObnfDTO(final XLDFM06M pXLDFM06M, final ExecutantType pExecutantType,
            final String pChgType, final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM08M監護、輔助、未成年子女權利義務行使負擔紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM08M」，RC層級「RRDFM08M」、「RCDFM08M」，
     * 若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM08M
     *            XLDFM08MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM08MObnfDTO(final XLDFM08M pXLDFM08M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF004N戶政所對兵役課通報檔通報役政的ObnfDTO
     * 
     * 註1：noticeType "ML02"：戶政所對兵役課通報 .
     * 
     * @param pXLDFM09M
     *            the xLDF m09 m
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            the chg type
     * @param pNoticeType
     *            the notice type
     * @param pReceiverSiteId
     *            the receiver site id
     * @return the obnf dto
     */

    /**
     * 製作RLDFM09M出生日期更改紀錄通報[RL]或[RR及RC]的ObnfDTO.<BR>
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級
     * 「RRDFM09M」，RC層級「RRDFM09M」、「RCDFM09M」，若不為本地作業點，則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料
     * 
     * 
     * @param pXLDFM09M
     *            XLDFM09MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM09MObnfDTO(final XLDFM09M pXLDFM09M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM01M個人申請書紀錄資料通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM10M」，RC層級「RRDFM10M」、「RCDFM10M」，
     * 若不為本地作業點，則為通報RL層<br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param xldfM10m
     *            XLDFDomainObject
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     * @throws RisBusinessException
     *             「製作RLDFM01M個人申請書紀錄資料通報[RL]或[RR及RC]的ObnfDTO失敗」
     */
    ObnfDTO makeRLDFM10MObnfDTO(XLDFM10M xldfM10m, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId) throws RisBusinessException;

    /**
     * 製作RLDFM11M個人姓氏資料通報[RL]或[RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM09M」，RC層級「RRDFM11M」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料 .
     * 
     * @param pXLDFM11M
     *            XLDFM11MDomainObject
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDFM11MObnfDTO(final XLDFM11M pXLDFM11M, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDFM13M通報[RL]或[RR及RC]的ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDFM13M」，RC層級「RRDFM13M」、「RCDFM13M」，
     * 若不為本地作業點，則為通報RL層 <br>
     * 註2：noticeType "L006"：通報戶籍資料.
     * 
     * @param pXLDFM13M
     *            the xLDF m13 m
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeRLDFM13MObnfDTO(XLDFM13M pXLDFM13M, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId);

    /**
     * 製作RRDF003M除口紀錄通報[RR]的ObnfDTO.<BR>
     * 註1：因應修改或刪除需準備RRDF003M之PK統號，故xldf004m一定要傳入，由其取得統號後作為weKEy
     * 
     * @param pXLDF001M
     *            XLDF001MDomainObject （可輸入）
     * @param pXLDF004M
     *            XLDF004MDomainObject （必輸入）
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pExtraFieldMap
     *            放置欲更新之RRDF003M欄位且此欄位不存在於RLDF001M跟RLDF004M
     * @param receiverSiteId
     *            the receiver site id
     * @return the obnf dto
     */
    ObnfDTO makeRRDF003MObnfDTO(final XLDF001M pXLDF001M, final XLDF004M pXLDF004M, final ExecutantType pExecutantType,
            final String pChgType, final Map<String, String> pExtraFieldMap, final String receiverSiteId);

    /**
     * 製作RRDF003M除口紀錄通報[RR]的ObnfDTO.<BR>
     * 註1：因應修改或刪除需準備RRDF003M之PK統號，故xldf004m一定要傳入，由其取得統號後作為weKEy
     * 
     * @param pXLDF001M
     *            XLDF001MDomainObject （可輸入）
     * @param pXLDF004M
     *            XLDF004MDomainObject （必輸入）
     * @param pXLDF001H
     *            XLDF001MDomainObject （可輸入）
     * @param pXLDF004H
     *            XLDF004MDomainObject （必輸入）
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pExtraFieldMap
     *            放置欲更新之RRDF003M欄位且此欄位不存在於RLDF001M跟RLDF004M
     * @param receiverSiteId
     *            the receiver site id
     * @return the obnf dto
     */
    ObnfDTO makeRRDF003MObnfDTO(final XLDF001M pXLDF001M, final XLDF004M pXLDF004M, final XLDF001H pXLDF001H,
            final XLDF004H pXLDF004H, final ExecutantType pExecutantType, final String pChgType,
            final Map<String, String> pExtraFieldMap, final String receiverSiteId);

    /**
     * 製作XLDFHDRM通報[RL]ObnfDTO<br>
     * 
     * 註1：receiverSiteId若為本地作業點， 若不為本地作業點，則為通報RL層 <br>
     * 註2：noticeType "LHRM"： 註3：changeType "8"：.
     * 
     * @param obj
     *            the obj
     * @param info
     *            登入者資訊
     * @param chgType
     *            異動模式
     * @param noticeType
     *            通報類別
     * @param receiverSiteId
     *            目的地作業點代碼
     * @return ObnfDTO
     */
    ObnfDTO makeXldfhdrmDTO(XldfhdrmType obj, ExecutantType info, String chgType, String noticeType,
            String receiverSiteId);

    /**
     * 製作RLDF003S[RL]或[RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF003s」，RC層級「RRDF003S」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料 .
     * 
     * @param srcObj
     *            the src obj
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF003SObnfDTO(final XLDF003S srcObj, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);

    /**
     * 製作RLDF0039S[RL]或[RR及RC]的ObnfDTO
     * 
     * 註1：receiverSiteId若為本地作業點，則為往上通報RR層級「RRDF039S」，RC層級「RRDF039S」，若不為本地作業點，
     * 則為通報RL層<BR>
     * 註2：noticeType "L006"：通報戶籍資料 .
     * 
     * @param srcObj
     *            the src obj
     * @param pExecutantType
     *            the executant type
     * @param pChgType
     *            異動模式
     * @param pNoticeType
     *            通報類別
     * @param pReceiverSiteId
     *            目的地作業點代碼
     * @return the obnf dto
     */
    ObnfDTO makeRLDF039SObnfDTO(final XLDF039S srcObj, final ExecutantType pExecutantType, final String pChgType,
            final String pNoticeType, final String pReceiverSiteId);
    /**
     * 產生RLDFS074的通報
     * @param rldfs074
     * @param oprCode
     * @param clazz
     * @param seqId
     * @param chgType
     * @param noticeType
     * @param receiverSiteId
     * @param info
     * @return
     */
    ObnfDTO makeRldfs074ObnfDTO (final Rldfs074Type rldfs074,final String oprCode,final Class<?> clazz, final Integer seqId, final String chgType, final String noticeType, final String receiverSiteId, final ExecutantType info);
}
