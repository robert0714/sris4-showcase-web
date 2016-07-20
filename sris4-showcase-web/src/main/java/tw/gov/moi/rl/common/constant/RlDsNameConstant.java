/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.constant;

/**
 * @author JL
 * 
 */
public interface RlDsNameConstant {

    /** rldf004m003.xml. */
    final String RLDF004M_BY_HID = "rldf004m003";

    /**
     * 交易記錄
     * <p>
     * The Constant DS_NAME1 = queryTransMaster.
     * <p>
     * eq transactionId, eq accept_admin_office_code
     * */
    public final static String DS_NAME1 = "queryTransMaster";
    /**
     * 當事人索引檔
     * <p>
     * The Constant DS_NAME2 = queryTargetPerson.
     * <p>
     * eq transactionId
     * */
    public final static String DS_NAME2 = "queryTargetPerson";
    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME3 = queryFunctionRecord.
     * <p>
     * eq transactionId
     * */
    public final static String DS_NAME3 = "queryFunctionRecord";
    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME4 = queryAccessRecord.
     * <p>
     * by eq transactionId, eq sequenceId, eq serialNo
     * */
    public final static String DS_NAME4 = "queryAccessRecord";
    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME6 = queryAccessRecordByDomain.
     * <p>
     * by eq transactionId, eq xldfType, eq domainKey
     * */
    public final static String DS_NAME6 = "queryAccessRecordByDomain";
    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME7 = queryAccessRecord.
     * <p>
     * by eq transactionId, eq sequenceId
     * */
    public final static String DS_NAME7 = "queryAccessRecordBySequenceId";
    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME12 = queryAccessRecordByTransactionId.
     * <p>
     * by eq transactionId
     * */
    public final static String DS_NAME12 = "queryAccessRecordByTransactionId";
    /**
     * queryCopy交易作業記錄檔
     * <p>
     * The Constant DS_NAME5 = queryCopyAccessRecord.
     * <p>
     * by eq transactionId, le sequenceId, eq copyRefXldfType,eq
     * copyRefDomainKey
     * */
    public final static String DS_NAME5 = "queryCopyAccessRecord";
    /**
     * 查詢個人基本資料
     * <p>
     * The Constant DS_NAME8 = rldf004mByKey.
     * */
    public final static String DS_NAME8 = "rldf004mByKey";
    /**
     * 查詢除戶個人基本資料
     * <p>
     * The Constant DS_NAME9 = rldf004hByKey.
     * */
    public final static String DS_NAME9 = "rldf004hByKey";
    /**
     * 查詢補登個人基本資料
     * <p>
     * The Constant DS_NAME10 = queryTldf004mByKey.
     * */
    public final static String DS_NAME10 = "tldf004mByKey";
    /**
     * 查詢全戶資料
     * <p>
     * The Constant DS_NAME11 = rldf001mByKey.
     * */
    public final static String DS_NAME11 = "rldf001mByKey";

    /**
     * rl01462.getRldf045m
     */
    final static String DS_NAME_BY_01462 = "rl01462.getRldf045m";

    /**
     * 逕為登記申請人檔
     * <p>
     * The Constant DS_NAME13 = queryXldfefaplcByTxnId.
     * <p>
     * by eq transactionId
     * */
    public final static String DS_NAME13 = "queryXldfefaplcByTxnId";

    /**
     * 逕為申請人檔
     * <p>
     * The Constant DS_NAME14 = queryXldfaplcexType.
     * <p>
     * by eq transactionId by eq personId by eq personRole
     * */
    public final static String DS_NAME14 = "queryXldfaplcexType";

    /**
     * 逕為申請人檔
     * <p>
     * The Constant DS_NAME15 = queryXldfaplcexTypeList.
     * <p>
     * by eq transactionId by eq seqId
     * */
    public final static String DS_NAME15 = "queryXldfaplcexTypeList";

    /**
     * 交易作業紀錄檔
     * <p>
     * The Constant DS_NAME16 = queryFunctionRecordBySeqId.
     * <p>
     * by eq transactionId by eq seqId
     * */
    public final static String DS_NAME16 = "queryFunctionRecordBySeqId";

    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME17 = queryAccessRecordByDomainAndSeqId.
     * <p>
     * by eq transactionId, eq xldfType, eq domainKey,eq seqId
     * */
    public final static String DS_NAME17 = "queryAccessRecordByDomainAndSeqId";

    /**
     * 當事人索引檔
     * <p>
     * The Constant DS_NAME18 = queryTargetPersonBySerailNo.
     * <p>
     * eq transactionId,eq personSerialNo
     * */
    public final static String DS_NAME18 = "queryTargetPersonBySerailNo";

    /**
     * 通報物件發送紀錄檔
     * <p>
     * The Constant DS_NAME19 = queryRedfobsdlgByTxId.
     * <p>
     * eq transactionId
     * */
    public final static String DS_NAME19 = "queryRedfobsdlgByTxId";

    /**
     * 特殊通報物件檔
     * <p>
     * The Constant DS_NAME20 = queryXldfspecialnoticeByTxIdAndSeqId.
     * <p>
     * eq transactionId eq sequenceId
     * */
    public final static String DS_NAME20 = "queryXldfspecialnoticeByTxIdAndSeqId";

    /**
     * 下除戶紀錄檔
     * <p>
     * The Constant DS_NAME21 = queryXldfhdrmByTxnId.
     * <p>
     * eq transactionId
     * */
    public final static String DS_NAME21 = "queryXldfhdrmByTxnId";

    /**
     * 下除戶紀錄檔
     * <p>
     * The Constant DS_NAME21 = queryXldfhdrmByTxnIdAndSeqId.
     * <p>
     * eq transactionId ,eq sequenceId
     * */
    public final static String DS_NAME22 = "queryXldfhdrmByTxnIdAndSeqId";

    /**
     * 交易作業記錄檔
     * <p>
     * The Constant DS_NAME23 = queryAccessRecordBySequenceIdAnExcludeAction.
     * <p>
     * by eq transactionId, eq sequenceId ne action
     * */
    public final static String DS_NAME23 = "queryAccessRecordBySequenceIdAnExcludeAction";

    /** rl083a0.getRldf034m */
    String RL083A0_GET_RLDF034M = "rl083a0.getRldf034m";

    /** rl0f210.getRldf013dWithLaunch */
    String RL0F210_13D_LAUNCH = "rl0f210.getRldf013dWithLaunch";
    /** rl0f210.getRldf013d */
    String RL0F210_13D = "rl0f210.getRldf013d";
    /**
     * rl0f220.getRldf012d
     */
    String RL0F220_12D = "rl0f220.getRldf012d";

    /**
     * rl0f260.getRldf012d
     */
    String RL0F260_12D = "rl0f260.getRldf012d";

    /**
     * rl0f130.getRldf012d
     */
    String RL0F130_12D = "rl0f130.getRldf012d";

    /**
     * rl01630.getRldf001e
     */
    String RL01630_RLDF001E = "rl01630.getRldf001e";

    /**
     * getRldf012d
     */
    String RLDF012D = "getRldf012d";

    /** rl0f220.getRldf013d */
    String RL0F220_13D = "rl0f220.getRldf013d";

    /** rl0f220.getRldf013dByKey */
    String RL0F220_13D_BYKEY = "rl0f220.getRldf013dByKey";

    /** rl0f220.getRldf014d */
    String RL0F220_14D = "rl0f220.getRldf014d";

    /** rl01b30.getRldf049m */
    String RL01B30_GET_RLDF049M = "rl01b30.getRldf049m";

    /** rl08411.getRldf001m */
    String RL08411_GET_RLDF001M = "rl08411.getRldf001m";

    /** rl08411.getRlde829w */
    String RL08411_GET_RLDE829W = "rl08411.getRlde829w";

    /** rl01471.getRldf008m */
    String RL01471_GET_RLDF008M = "rl01471.getRldf008m";

    /** rl01471.getRldf004h */
    String RL01471_GET_RLDF004H = "rl01471.getRldf004h";

    /** rl01471.getRldf004m */
    String RL01471_GET_RLDF004M = "rl01471.getRldf004m";

    /** rl01471.getRldf050m */
    String RL01471_GET_RLDF050M = "rl01471.getRldf050m";

    /** rl0d150.getRldf012d */
    String RL0D150_RLDF002D = "rl0d150.getRldf002d";

    /** rl0d150.getRldf012d */
    String RL0D150_RLDF012D = "rl0d150.getRldf012d";

    /** rl0d150.getRldf002dByApplyDate */
    String RL0D150_RLDF002D_BY_APPLYDATE = "rl0d150.getRldf002dByApplyDate";

    /** rl0d150.getRldf012dByNo */
    String RL0D150_RLDF012D_BY_NO = "rl0d150.getRldf012dByNo";

    /** rl0d150.getRldf022d */
    String RL0D150_RLDF022D = "rl0d150.getRldf022d";

    /** rl0d150.getRldf022dByApplyDate */
    String RL0D150_RLDF022D_BY_APPLYDATE = "rl0d150.getRldf022dByApplyDate";

    /** rl0d150.getRldf022d */
    String RL0D150_RLDF023D = "rl0d150.getRldf023d";

    /** rl01b20.getRldf049m */
    String RL01B20_GET_RLDF049M = "rl01b20.getRldf049m";

    /** getRldf008mByCode */
    String GET_RLDF008M_BY_CODE = "getRldf008mByCode";

    /**
     * 查詢安全存量
     */
    public final static String RL06C00_GET_RLDF022O = "rl06c00.getRldf022o";

    /** rl01d10.getRlde205w **/
    final static String rl01d10_getRlde205w = "rl01d10.getRlde205w";

    /** 年終靜態全戶資料 */
    public final static String RL08361_GET_RLDF004U = "rl08361.getRldf004u";

    /** 年終靜態個人資料 BY 戶長統號 */
    public final static String RL08361_GET_RLDF004S = "rl08361.getRldf004s";

    /** 年終靜態個人資料 BY 個人統號 */
    public final static String RL08361_GET_RLDF004S_BY_PERSONID = "rl08361.getRldf004sByPersonId";

    /** 讀取辦理他所新式國民身分證請領記錄 */
    public final static String RL0D160_GET_RLDF022D = "rl0d160.getRldf022d";

    /** 讀取空白國民身分證及膠膜使用紀錄 */
    public final static String RL0D160_GET_RLDF012D = "rl0d160.getRldf012d";

    /** 年終靜態個人資料 */
    public final static String RL08364_GET_RLDF004S = "rl08364.getRldf004s";

    /** 讀取空白國民身分證及膠膜使用紀錄資料 */
    public final static String RL0D120_GET_RLDF012D = "rl0d120.getRldf012d";

    /** 讀取沿用影像資料 */
    public final static String RL0D120_GET_RLDF017D = "rl0d120.getRldf017d";

    /** 讀取當事人辦理他所新式國民身分證請領紀錄 */
    public final static String RL0D120_GET_RLDF022D = "rl0d120.getRldf022d";

    /** 讀取全面換證起始日資料 */
    public final static String RL0D120_GET_RLDF008A = "rl0d120.getRldf008a";

    /** 讀取除戶個人基本資料 */
    public final static String RL0D120_GET_RLDF004H = "rl0d120.getRldf004h";

    /** 讀取除戶姓名羅馬拼音記錄資料 */
    public final static String RL0D120_GET_RLDF047H = "rl0d120.getRldf047h";

    /** 讀取國民身分證列印旗標資料檔 */
    public final static String RL0D120_GET_RLDFM12M = "rl0d120.getRldfm12m";

    /** 讀取完整村里資料 */
    public final static String RL0D120_GET_RLDF003P = "rl0d120.getRldf003p";

    /** rlf110.getRldfzf11 **/
    public final static String rl0f110_getRldfz11 = "rl0f110.getRldfzf11";

    /** 讀取選舉組合作用檔 */
    public final static String RL08F33_GET_RLDE800W = "rl08f33.getRlde800w";

    /** 讀取選舉組合作用檔 */
    public final static String RL08F3D_GET_RLDE800W = "rl08f3d.getRlde800w";

    /** 讀取投票所別資料檔 */
    public final static String RL08F33_GET_RLDE808W = "rl08f33.getRlde808w";

    /** 讀取投票所別資料檔 */
    public final static String RL08F3D_GET_RLDE808W = "rl08f3d.getRlde808w";

    public final static String RL08F33_GET_REDFRPTF = "rl08f33.getRedfrptf";

    /** 讀取投票所別資料檔 */
    public final static String RL08F33_GET_RLDE808W_2 = "rl08f33.getRlde808w_2";

    /** 讀取選舉組合作用檔 */
    public final static String RL08F31_GET_RLDE800W = "rl08f31.getRlde800w";

    /** 讀取投票所別資料檔 */
    public final static String RL08F31_GET_RLDE808W = "rl08f31.getRlde808w";

    public final static String RL08F31_GET_REDFRPTF = "rl08f31.getRedfrptf";

    /** 讀取投票所別資料檔 */
    public final static String RL08F31_GET_RLDE808W_2 = "rl08f31.getRlde808w_2";

    /** 讀取投票所別資料檔 */
    public final static String RL08F71_GET_RLDE808W = "rl08f71.getRlde808w";

    /** 讀取罰鍰類別明細檔 */
    public final static String GET_FINEDATA_GET_RLDFD008_1 = "getFineData.getRldfd008_1";

    /** 讀取罰鍰類別明細檔 */
    public final static String GET_FINEDATA_GET_RLDFD008_2 = "getFineData.getRldfd008_2";

    /** 讀取罰鍰條文明細檔 */
    public final static String GET_FINEDATA_GET_RLDFD009 = "getFineData.getRldfd009";

    /** 讀取罰鍰類別與明細對應檔 */
    public final static String GET_FINEDATA_GET_RLDFD011 = "getFineData.getRldfd011";

    /** 讀取催告罰鍰明細類別檔 */
    public final static String GET_FINEDATA_GET_RLDFD010_1 = "getFineData.getRldfd010_1";

    /** 讀取催告罰鍰明細類別檔 */
    public final static String GET_FINEDATA_GET_RLDFD010_2 = "getFineData.getRldfd010_2";

    /** 讀取催告罰鍰明細類別檔 */
    public final static String GET_FINEDATA_GET_RLDFD010_3 = "getFineData.getRldfd010_3";

    /** 讀取罰鍰催告個案資料檔 */
    public final static String GET_FINEDATA_GET_RLDE009E_1 = "getFineData.getRlde009e_1";

    /** 讀取罰鍰催告個案資料檔 */
    public final static String GET_FINEDATA_GET_RLDE009E_2 = "getFineData.getRlde009e_2";

    /** 讀取催告罰鍰個案紀錄檔 */
    public final static String GET_FINEDATA_GET_RLDF009E = "getFineData.getRldf009e";

    /** 取出申請書代碼對應的罰鍰催告申登案別 */
    public final static String GET_FINEDATA_GET_RLDFD014 = "getFineData.getRldfd014";

    /** 讀取批次報表檔 */
    public final static String RL01450_GET_REDFRPTF = "rl01450.getRedfrptf";

    /**
     * 讀取全面換證起始日資料檔, DSXML:rldf008aCfg.xml, Conditions:site_id,
     * admin_office_code
     */
    public final static String RL0V700_GET_RLDF008A = "rl0v700.getRldf008a";

    /** 讀取全面換證起始日資料檔, DSXML:rldf008aCfg.xml, Conditions:site_id */
    public final static String RL02C40_GET_RLDF008A = "rl02c40.getRldf008a";

    /** 讀取全面換證資料檔, DSXML:rldf001aCfg.xml, Conditions:person_id, site_id */
    public final static String RL02C40_GET_RLDF001A = "rl02c40.getRldf001a";

    /**
     * 記事模版檔
     * <p>
     * The Constant RLGETNOTECOMPONENT_GET_RLDFD003 =
     * rlGetNoteComponent.getRldfd003.
     * <p>
     * by eq main_type, eq sub_type
     * */
    public final static String RLGETNOTECOMPONENT_GET_RLDFD003 = "rlGetNoteComponent.getRldfd003";

    /** 取得「村里」漢語、通用拼音資料. */
    String GET_RLDE211W = "getRlde211w";

    /** 取得「街路門牌」漢語、通用拼音資料. */
    String GET_RLDE212W = "getRlde212w";

    /** 取得「國籍」漢語、通用拼音資料. */
    String GET_RLDE213W = "getRlde213w";

    /** 取得「出生地」漢語、通用拼音資料. */
    String GET_RLDE210W = "getRlde210w";

    /** 取得「行政區域」漢語、通用拼音資料. */
    String GET_RLDE209W = "getRlde209w";

    /**
     * DSxml:rldf002dCfg.xml
     * <p>
     * by person_id, accept_site_id
     * </p>
     */
    String RL0D120_GET_RLDF002D = "rl0d120.getRldf002d";

    /**
     * in redfrptfCfg.xml
     */
    public final String GET_REDFRPTF = "getRedfrptf";

    /**
     * 跨行政區域調整異動戶籍資料檔
     * <p>
     * The Constant maCompGetRlde491w masComp.getRlde491w.
     * <p>
     * eq old_Site_Id, eq new_site_id, eq modify_date
     * */
    String maComp_GetRlde491w = "masComp.getRlde491w";

    /**
     * 跨行政區域調整異動戶籍資料異動紀錄檔
     * <p>
     * The Constant maCompGetRlde492w masComp.getRlde491w.
     * <p>
     * eq old_Site_Id, eq new_site_id, eq modify_date
     * */
    String maComp_GetRlde492w = "masComp.getRlde492w";

    /**
     * 跨行政區域調整異動戶籍資料檔
     * <p>
     * 取得戶下成員人口的1M By 1M的key DSname:masComp.getRlf001mBy1mKey
     * <p>
     * eq household_Id, eq household_head_id, eq site_id
     * */
    String maComp_GetRldf001mBy1mKey = "masComp.getRlf001mBy1mKey";

    /**
     * 跨行政區域調整異動戶籍資料檔
     * <p>
     * 取得戶下成員人口的4M By 1M的key DSname:masComp.getRlf004mBy1mKey
     * <p>
     * eq household_Id, eq household_head_id, eq site_id
     * */
    String maComp_GetRldf004mBy1mKey = "masComp.getRlf004mBy1mKey";

    /**
     * 跨行政區域調整異動戶籍資料檔
     * <p>
     * 取得4M By 4M的key DSname:masComp.getRlf004mBy4mKey
     * <p>
     * eq person_id, eq site_id
     * */
    String maComp_GetRldf004mBy4mKey = "masComp.getRlf004mBy4mKey";

    /**
     * 取得存在於XLDF004M的戶下成員
     * <p>
     * 取得XLDF004M By 1M的key DSname:hbComp_GetXldf004mBy1mKey
     * <p>
     * ne action, ne sequence_id,eq transaction_id, eq household_head_id,eq
     * household_id, eq site_id
     * */
    String hbComp_GetXldf004mBy1mKey = "hbComp_GetXldf004mBy1mKey";

    /**
     * 取得存在於XLDF004M的戶下成員
     * <p>
     * 取得XLDF001M By 1M的key DSname:hbComp_GetXldf001mBy1mKey
     * <p>
     * ne action, ne sequence_id,eq transaction_id, eq household_head_id,eq
     * household_id, eq site_id
     * */
    String hbComp_GetXldf001mBy1mKey = "hbComp_GetXldf001mBy1mKey";
    /**
     * 取得存在於RLDF004M的戶下成員
     * <p>
     * 取得RLDF004M By 1M的key DSname:hbComp.GetRldfHouseholdMembers
     * <p>
     * eq household_head_id,eq household_id, eq site_id
     * */
    String hbComp_GetRldfHouseholdMembers = "hbComp.GetRldfHouseholdMembers";

    String GET_RLDF008A = "getRldf008a";

    /**
     * 取得國民身分證掛失紀錄
     */
    String RL01J00_GET_RLDFM06M = "rl01j00.getRldfm06m";

    /** 查詢監護、輔助、未成年子女權利義務行使負擔資料檔. */
    String RL01J00_GET_RLDFM05M = "rl01j00.getRldfm05m";
}
