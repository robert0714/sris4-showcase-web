/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.constant;

/**
 * The Interface TxCodeConstant.
 * 
 * @Deprecated
 */
@Deprecated
public interface RlTxCodeConstant {

    /** 執行GetDataComponent WebService取得資料失敗 */
    public String TXD136E = tw.gov.moi.rs.common.constant.RsCDMesg.TXD136E.getCode();

    /** XLDF領域物件類別錯誤. */
    final String TX_ERROR_1 = "1";

    /** 戶籍資料不存在. */
    final String TX_ERROR_2 = "2";

    /** 更新教育程度失敗 */
    String TX6808E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6808E.getCode();

    /** XLDF領域物件類別錯誤. */
    final String TX_ERROR_3 = "3";

    /** 資料不存在 */
    final String TX_B056_E = tw.gov.moi.rs.common.constant.RsCDMesg.TXB056E.getCode();

    /** 資料不存在 */
    final String TX_D000_E = tw.gov.moi.rs.common.constant.RsCDMesg.TXD000E.getCode();

    /** 資料 空白證號 不存在 */
    final String CH_6005_W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6005W.getCode();

    /** 資料驗證成功 */
    public String TX6004S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6004S.getCode();

    /** 資料 空白證號 格式錯誤 */
    final String CH_6016_W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6016W.getCode();

    /** 必要時，請於撤銷後設籍地辦理遷入登記(補辦戶籍遷入)，再透過記事更正登記，登載必要記事. */
    final String CH6100W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6100W.getCode();

    /** 將全戶基本資料搬到除戶全戶基本資料失敗. */
    final String TX_6114_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6114E.getCode();

    /** 將全戶動態記事搬到除戶全戶動態記事失敗. */
    final String TX_6115_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6115E.getCode();

    /** 將個人基本資料搬到除戶個人基本資料失敗. */
    final String TX_6116_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6116E.getCode();

    /** 將個人記事搬到除戶個人記事失敗. */
    final String TX_6117_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6117E.getCode();

    /** 將個人遷徙紀錄搬到除戶個人遷徙紀錄失敗. */
    final String TX_6118_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6118E.getCode();

    /** 將姓名更改紀錄搬到除戶姓名更改紀錄失敗. */
    final String TX_6119_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6119E.getCode();

    /** 將姓名羅馬拼音紀錄搬到除戶姓名羅馬拼音紀錄失敗. */
    final String TX_6120_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6120E.getCode();

    /** 刪除特殊人口資料失敗. */
    final String TX_6121_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6121E.getCode();

    /** 刪除限制遷徙人口資料失敗. */
    final String TX_6122_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6122E.getCode();

    /** 刪除所內記事失敗. */
    final String TX_6123_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6123E.getCode();

    /** 將個人基本資料複製到除戶個人基本資料失敗. */
    final String TX_6124_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6124E.getCode();

    /** 將個人記事複製到除戶個人記事失敗. */
    final String TX_6125_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6125E.getCode();

    /** 將個人遷徙紀複製到除戶個人遷徙紀錄失敗. */
    final String TX_6126_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6126E.getCode();

    /** 將姓名更改紀錄複製到除戶姓名更改紀錄失敗. */
    final String TX_6127_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6127E.getCode();

    /** 將姓名羅馬拼音紀錄複製到除戶姓名羅馬拼音紀錄失敗. */
    final String TX_6128_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6128E.getCode();

    /** 所內記事資料不存在. */
    final String TX_6138_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6138E.getCode();

    /** 「將現戶簿頁之個人資料搬到除戶簿頁」失敗. */
    final String TX_6031_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6031E.getCode();

    /** 「以現戶簿頁之個人資料產生除戶簿頁」失敗. */
    final String TX_6032_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6032E.getCode();

    /** 受委託人不為同戶內現住人口. */
    final String TX6032W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6032W.getCode();

    /** 「刪除保護家庭暴力資料」失敗. */
    final String TX_6033_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6033E.getCode();

    /** 請檢視地址輸入無誤. */
    final String TX6033W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6033W.getCode();

    /** 申請人1不為同戶內現住人口. */
    final String TX6034W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6034W.getCode();

    /** 申請人2不為同戶內現住人口. */
    final String TX6035W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6035W.getCode();

    /** 「將出生資料搬到除戶出生資料」失敗. */
    final String TX_6034_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6034E.getCode();

    /** 「將婚姻紀錄搬到除戶婚姻紀錄」失敗. */
    final String TX_6035_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6035E.getCode();

    /** 「將統號更改紀錄搬到除戶統號更改紀錄」失敗. */
    final String TX_6036_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6036E.getCode();

    /** 請確認「修改申請書張數」*「修改申請書份數」不等於「數量」. */
    final String TX6036W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6036W.getCode();

    /** 「將收養紀錄搬到除戶收養紀錄」失敗. */
    final String TX_6037_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6037E.getCode();

    /** 「將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料」失敗. */
    final String TX_6038_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6038E.getCode();

    /** 「將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄」失敗. */
    final String TX_6039_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6039E.getCode();

    /** 「將重婚資料搬到除戶重婚資料」失敗. */
    final String TX_6040_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6040E.getCode();

    /** 「將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄」失敗. */
    final String TX_6041_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6041E.getCode();

    /** 「將出生日期更改紀錄搬到除戶出生日期更改紀錄」失敗. */
    final String TX_6042_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6042E.getCode();

    /** 執行列印作業失敗 */
    final String TX_6350_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6350E.getCode();

    /** 執行下載作業失敗 */
    final String TX_6351_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6351E.getCode();

    /** 「將個人申請書紀錄搬到除戶個人申請書紀錄」失敗. */
    final String TX_6431_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6431E.getCode();

    /** 「將個人申請書紀錄搬到除戶個人申請書紀錄」失敗. */
    final String TX_6432_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6432E.getCode();

    /** 「將出生資料複製到除戶出生資料」失敗. */
    final String TX_6371_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6371E.getCode();

    /** 「將婚姻紀錄複製到除戶婚姻紀錄」失敗. */
    final String TX_6372_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6372E.getCode();

    /** 「將統號更改紀錄搬到除戶統號更改紀錄」失敗. */
    final String TX_6373_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6373E.getCode();

    /** 「將收養紀錄搬到除戶收養紀錄」失敗. */
    final String TX_6374_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6374E.getCode();

    /** 「將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料」失敗. */
    final String TX_6375_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6375E.getCode();

    /** 「將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄」失敗. */
    final String TX_6376_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6376E.getCode();

    /** 「將重婚資料搬到除戶重婚資料」失敗. */
    final String TX_6377_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6377E.getCode();

    /** 「將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄」失敗. */
    final String TX_6378_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6378E.getCode();

    /** 「將出生日期更改紀錄複製到除戶出生日期更改紀錄」失敗. */
    final String TX_6379_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6379E.getCode();

    /** 「通報至RC的通報類別、通報資料表格型別應當同時有值」. */
    final String TX6730E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6730E.getCode();

    /** 「通報至RR的通報類別、通報資料表格型別應當同時有值」. */
    final String TX6731E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6731E.getCode();

    /** TX6799E=戶長統號須置於當事人統號欄位第一位 */
    final String TX6799E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6799E.getCode();

    /** The Constant TX6301E=查無當事人資料. */
    public final static String TX6301E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6301E.getCode();
    /** The Constant TX6302E=鎖定當事人資料失敗. */
    public final static String TX6302E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6302E.getCode();
    /** The Constant TX6303E=寫入交易當事人失敗. */
    public final static String TX6303E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6303E.getCode();
    /** The Constant TX6304E=交易已存在. */
    public final static String TX6304E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6304E.getCode();
    /** The Constant TX6305E=交易序號不可為空白. */
    public final static String TX6305E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6305E.getCode();
    /** The Constant TX6306E=Rldf004m not found, key. */
    public final static String TX6306E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6306E.getCode();
    /** The Constant TX6307E=Transaction XLDF fail. */
    public final static String TX6307E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6307E.getCode();
    /** The Constant TX6308E=找不到RLDF資料來源. */
    public final static String TX6308E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6308E.getCode();
    /** The Constant TX6309E=Tldf004m not found, key */
    public final static String TX6309E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6309E.getCode();
    /** The Constant TX6310E = 交易不存在. */
    public final static String TX6310E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6310E.getCode();
    /** The Constant TX6311E = 作業順序無效. */
    public final static String TX6311E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6311E.getCode();
    /** The Constant TX6312E = 作業編號不存在. */
    public final static String TX6312E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6312E.getCode();
    /** The Constant TX6313E = generate domainkey error. */
    public final static String TX6313E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6313E.getCode();
    /** The Constant TX6314E = 交易當事人已被刪除. */
    public final static String TX6314E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6314E.getCode();
    /** The Constant TX6315E = 資料鎖定失敗. */
    public final static String TX6315E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6315E.getCode();
    /** The Constant TX6316E = 作業順序不存在. */
    public final static String TX6316E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6316E.getCode();
    /** The Constant TX6317E = 變更動作無效. */
    public final static String TX6317E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6317E.getCode();
    /** The Constant TX6318E = 找不到原始狀態的領域物件. */
    public final static String TX6318E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6318E.getCode();
    /** The Constant TX6319E = 資料已被刪除. */
    public final static String TX6319E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6319E.getCode();
    /** The Constant TX6320E = 資料未鎖定. */
    public final static String TX6320E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6320E.getCode();
    /** The Constant TX6321E = 新增XLDF領域物件後，不應對它進行其它動作. */
    public final static String TX6321E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6321E.getCode();
    /** The Constant TX6322E = 不正確的XLDF領域物件動作. */
    public final static String TX6322E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6322E.getCode();
    /** The Constant TX6323E = 找不到讀取動作的XLDF領域物件. */
    public final static String TX6323E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6323E.getCode();
    /** The Constant TX6324E = 找不到XLDF領域物件. */
    public final static String TX6324E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6324E.getCode();
    /** The Constant TX6325E = 找不到前行作業的XLDF領域物件. */
    public final static String TX6325E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6325E.getCode();
    /** The Constant TX6326E = 新增動作不需要更新原始狀態. */
    public final static String TX6326E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6326E.getCode();
    /** The Constant TX6327E = 交易作業寫入錯誤. */
    public final static String TX6327E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6327E.getCode();
    /** The Constant TX6328E = 作業檢核失敗. */
    public final static String TX6328E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6328E.getCode();
    /** The Constant TX6329E = 作業存取記錄刪除錯誤. */
    public final static String TX6329E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6329E.getCode();
    /** The Constant TX6330E = 交易作業記錄刪除錯誤. */
    public final static String TX6330E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6330E.getCode();
    /** The Constant TX6331E = XLDF領域物件記錄刪除錯誤. */
    public final static String TX6331E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6331E.getCode();
    /** The Constant TX6332E = 當事人XLDF領域物件不存在. */
    public final static String TX6332E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6332E.getCode();
    /** The Constant TX6333E = 新增交易當事人索引失敗. */
    public final static String TX6333E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6333E.getCode();
    /** 未指定過濾條件. */
    public final static String TX6334E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6334E.getCode();
    /** The Constant TX6335E = 資料已被其它作業鎖定. */
    public final static String TX6335E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6335E.getCode();
    /** 套用全部作業變更失敗. */
    public final static String TX6336E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6336E.getCode();
    /** 取消作業變更失敗. */
    public final static String TX6337E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6337E.getCode();

    /** 寫入逕為登記申請人失敗. */
    public final static String TX6666E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6666E.getCode();

    /** 讀取逕為登記申請人記錄失敗. */
    public final static String TX6667E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6667E.getCode();

    /** 新增後投票所輸入錯誤. */
    public final static String TX6669E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6669E.getCode();

    /** 當事人有未成年子女，請於離婚登記存檔後，以未成年子女為當事人，辦理未成年子女權利義務行使負擔登記 */
    public final static String TX6504W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6504W.getCode();

    /** 當事人不能同申請人 */
    final static String TX6226W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6226W.getCode();

    /** 請辦理 */
    final static String TX6227W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6227W.getCode();

    /** 當事人與內政部統號重複，請查明 */
    public final static String TX6565E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6565E.getCode();

    /** 請改以大戶遷徙作業(10月開放試辦)辦理 (大戶定義:戶內人口含現住、非現住與死亡人口大於20人) */
    public final static String TX6566E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6566E.getCode();

    /** 以補登資料辦理遷入登記時，請用部分遷入 */
    public final static String TX6567E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6567E.getCode();

    /** 請輸入除戶日期、除戶時間 */
    public final static String TX6695E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6695E.getCode();

    /** 非一般國民身分證統一編號 */
    public final static String TX6568E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6568E.getCode();
    /** 統號配賦註記為未使用或有待查證統號 */
    public final static String TX6569E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6569E.getCode();

    /** 請輸入其他出生地點」 */
    public String TX6438E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6438E.getCode();

    /** The Constant ERR_MSG9=XLDFConfig class not found. */
    public final static String ERR_MSG9 = "XLDFConfig class not found.";
    /** 「判斷當事人身分角色」失敗. **/
    public final static String TX6338E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6338E.getCode();
    /** 「判斷姓名內容一致性」失敗. **/
    public final static String TX6339E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6339E.getCode();
    /** 「判斷婚前婚姻狀況」失敗. **/
    public final static String TX6340E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6340E.getCode();
    /** 「判斷是為外國人」失敗. **/
    public final static String TX6341E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6341E.getCode();
    /** 「判斷申請人是否為戶所代辦」失敗. **/
    public final static String TX6342E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6342E.getCode();
    /** 「判斷是否為限制遷徙人口」失敗. **/
    public final static String TX6343E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6343E.getCode();
    /** 「判斷另立新戶時新戶的戶別」失敗. **/
    public final static String TX6344E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6344E.getCode();
    /** 「判斷兩位當事人是否互為配偶」失敗. **/
    public final static String TX6345E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6345E.getCode();
    /** 「判斷當事人戶籍現況」失敗. **/
    public final static String TX6346E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6346E.getCode();
    /** 「判斷當事人是否有配偶」失敗. **/
    public final static String TX6347E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6347E.getCode();
    /** 「判斷當事人是否為戶長」失敗. **/
    public final static String TX6348E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6348E.getCode();
    /** 「判斷當事人是否須要法定代理人同意」失敗. **/
    public final static String TX6349E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6349E.getCode();

    public final String TX6392E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6392E.getCode();
    /** 輸入資料有異動，但未執行「資料驗證」，請先執行「資料驗證」成功後再執行「暫存」 */
    public String TX6412E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6412E.getCode();

    /** 資料已存在 */
    public String TX6421E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6421E.getCode();

    /** 當事人已申請過出生地登記 */
    public String TX6436E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6436E.getCode();

    /** 親等關係說明 */
    public String CH6000I = tw.gov.moi.rs.common.constant.RsCDMesg.CH6000I.getCode();

    /** 請輸入 */
    public String TX6000W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6000W.getCode();

    /** 姓、名合併資料與姓名資料不符 */
    public String CH6003W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6003W.getCode();

    /** 「終止日期」不可小於「起始日期」 */
    public String CH6010W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6010W.getCode();

    /** 須符合國民身分證統一編號編碼規則 */
    public String CH6001W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6001W.getCode();

    /** 戶下有未成年子女 */
    public String TX6206W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6206W.getCode();

    /** 兩位申請人統號相同 */
    public String TX6001E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6001E.getCode();

    /** 自己與自己不得結婚 */
    public String TX6002E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6002E.getCode();

    /** 請以現無戶籍者結(離)婚登記作業處理 */
    public String TX6003E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6003E.getCode();

    /** 請輸入(原屬)國籍 */
    public String TX6004E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6004E.getCode();

    /** 須輸入(原屬)國籍其他內容 */
    public String TX6005E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6005E.getCode();

    /** 請擇一輸入護照號碼、統一證號或其他證號 */
    public String TX6006E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6006E.getCode();

    /** 請輸入國外地址或補登國內地址 */
    public String TX6007E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6007E.getCode();

    /** (原屬)國籍代碼不可為001～005 */
    public String TX6008E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6008E.getCode();

    /** (原屬)國籍須為無戶籍國民 */
    public String TX6009E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6009E.getCode();

    /** 不得代發他所初領之戶口名簿 */
    public String TX6009W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6009W.getCode();

    /** (原屬)國籍須為香港或澳門 */
    public String TX6010E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6010E.getCode();

    /** (原屬)國籍須為中國大陸 */
    public String TX6011E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6011E.getCode();

    /** 配偶姓名更改錯誤 */
    public String TX6012E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6012E.getCode();

    /** 配偶欄姓名不得為空白 */
    public String TX6013E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6013E.getCode();

    /** 已婚不得再婚 */
    public String TX6014E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6014E.getCode();

    /** 當事人婚姻狀況錯誤請查明婚姻狀況 */
    public String TX6015E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6015E.getCode();

    /** 夫須為男性 */
    public String TX6016E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6016E.getCode();

    /** 妻須為女性 */
    public String TX6017E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6017E.getCode();

    /** 請輸入結(離)婚地點 */
    public String TX6018E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6018E.getCode();

    /** 結(離)婚地點輸入錯誤 */
    public String TX6019E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6019E.getCode();

    /** 結(離)婚地點不可為空白 */
    public String TX6020E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6020E.getCode();

    /** 當事人未滿20歲須法定代理人同意 */
    public String TX6021E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6021E.getCode();

    /** 擬入戶戶長個人基本資料不存在 */
    public String TX6047E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6047E.getCode();

    /** 全戶基本資料不存在 */
    public String TX6048E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6048E.getCode();

    /** 擬入戶戶長統號，戶號輸入錯誤 */
    public String TX6049E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6049E.getCode();

    /** 擬入戶戶長須為現住人口 */
    public String TX6050E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6050E.getCode();

    /** 擬入戶戶長須為本國人 */
    public String TX6051E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6051E.getCode();

    /** 生父個人基本資料不存在 */
    public String TX6052E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6052E.getCode();

    /** 生父須為男性 */
    public String TX6053E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6053E.getCode();

    /** 生母個人基本資料不存在 */
    public String TX6054E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6054E.getCode();

    /** 生母須為女性 */
    public String TX6055E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6055E.getCode();

    /** 檢核戶籍地址是否為合法的門牌資料失敗 */
    public String TX6056E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6056E.getCode();

    /** 空白國民身分證及膠膜資料之統一編號不同 */
    public String TX6058E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6058E.getCode();

    /** 膠膜號不存在 */
    public String TX6060E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6060E.getCode();

    /** 作廢人員必須為領用人員或保管人員 */
    public String TX6061E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6061E.getCode();

    /** 須先領用及確認空白國民身分證或膠膜 */
    public String TX6062E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6062E.getCode();

    /** 已發證，不可作廢 */
    public String TX6063E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6063E.getCode();

    /** 已作廢，不可再作廢 */
    public String TX6064E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6064E.getCode();

    /** 尚未登錄空白證號、膠膜號或已結案，不可作廢 */
    public String TX6066E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6066E.getCode();

    /** 無符合之國民身分證列印資料 */
    public String TX6067E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6067E.getCode();

    /** 空白證號或膠膜未使用，應分別作廢 */
    public String TX6068E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6068E.getCode();

    /** 系統檔案處理錯誤 */
    public String TX6069E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6069E.getCode();

    public String TX6087E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6087E.getCode();

    public String TX6088E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6088E.getCode();

    public String TX6089E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6089E.getCode();

    public String TX6090E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6090E.getCode();

    public String TX6091E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6091E.getCode();

    public String TX6092E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6092E.getCode();

    public String TX6093E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6093E.getCode();

    public String TX6094E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6094E.getCode();

    public String TX6095E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6095E.getCode();

    /** XLDF DTO 類別未對應XLDF Domain Object 類別 */
    public String TX6096E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6096E.getCode();

    /** 空值DTO不可設值 */
    public String TX6097E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E.getCode();

    /** 預設建構子初始物件失敗 */
    public String TX6098E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6098E.getCode();

    /** 複製XLDF領域物件欄位失敗 */
    public String TX6099E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E.getCode();

    /** 投票權設定錯誤 */
    public String CH6068W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6068W.getCode();

    /** 擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查 */
    public String TX6101E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6101E.getCode();

    /** 生父之配偶姓名與生母姓名不一致 */
    public String TX6102W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6102W.getCode();

    /** 警示：輸入資料可能有誤，請確認! */
    public String TX6411W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6411W.getCode();

    /** 生母之配偶姓名與生父姓名不一致 */
    public String TX6103W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6103W.getCode();
    /** 國民身分證已辦理掛失。掛失日期及時間 */
    public String TX6104W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6104W.getCode();
    /** 申請書資料超過一筆 */
    public String TX6129E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6129E.getCode();
    /** 呼叫送通報封包服務介面失敗 */
    public String TX6406E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6406E.getCode();

    /** 執行程式失敗 */
    public String TX6130E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6130E.getCode();

    /** 申請人不可為當事人 */
    public String TX6910E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6910E.getCode();

    /** 當事人非遷出國外、喪失國籍、喪失身分，不得辦理遷入登記(恢復戶籍) */
    public String TX6913E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6913E.getCode();
    /** 執行死亡登記程式失敗 */
    public String TX6369E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6369E.getCode();

    /** 執行「暫存」程式失敗 */
    public String TX6132E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6132E.getCode();

    /** 取得出生者配賦統號失敗 */
    public String TX6190E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6190E.getCode();

    /** 取得自立新戶之配賦新戶號失敗 */
    public String TX6191E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6191E.getCode();

    /** 本登記初始化失敗，詳細錯誤訊息如下列，請記錄錯誤訊息後，按「關閉視窗」按鈕返回。 */
    public String TX6911E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6911E.getCode();

    /** 請輸入死亡者配偶(原屬)國籍 */
    public String TX6024E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6024E.getCode();

    /** 當事人已年滿20歲，請確認是否繼續辦理 */
    public String TX6022W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6022W.getCode();

    /** 遷徙當事人有限制遷徙人口，請確認無誤後方可繼續辦理 */
    public String TX6023W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6023W.getCode();

    /** 請確認變更日期在今天之後 */
    public String TX6026W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6026W.getCode();

    /** 姓名未變更，請確認 */
    public String TX6027W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6027W.getCode();

    /** 須輸入死亡者配偶(原屬)國籍其他內容 */
    public String TX6025E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6025E.getCode();

    /** 死亡者配偶(原屬)國籍代碼不可為001～005 */
    public String TX6026E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6026E.getCode();

    /** 死亡者配偶(原屬)國籍須為無戶籍國民 */
    public String TX6027E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6027E.getCode();

    /** 死亡者配偶(原屬)國籍須為香港或澳門 */
    public String TX6028E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6028E.getCode();

    /** 死亡者配偶(原屬)國籍須為中國大陸 */
    public String TX6029E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6029E.getCode();

    /** 請擇一輸入死亡者配偶護照號碼、統一證號或其他證號 */
    public String TX6030E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6030E.getCode();

    /** 請輸入死亡者配偶國外地址 */
    public String TX6031E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6031E.getCode();

    /** 請輸入登記項目 */
    public String TX6032E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6032E.getCode();

    /** 請輸入國民身分證是否繳回 */
    public String TX6033E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6033E.getCode();

    /** 請輸入死亡日期 */
    public String TX6034E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6034E.getCode();

    /** 請輸入死亡日期確定方式 */
    public String TX6035E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6035E.getCode();

    /** 請輸入死亡地點 */
    public String TX6036E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6036E.getCode();

    /** 請輸入死亡地點性質 */
    public String TX6037E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6037E.getCode();

    /** 請輸入死亡原因 */
    public String TX6038E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6038E.getCode();

    /** 請輸入附繳證件 */
    public String TX6039E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6039E.getCode();

    /** 請輸入判決法院名稱 */
    public String TX6040E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6040E.getCode();

    /** 請輸入判決日期 */
    public String TX6041E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6041E.getCode();

    /** 請輸入判決字號 */
    public String TX6042E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6042E.getCode();

    /** 請擇一輸入駐外館處通報日期、國外死亡日期 */
    public String TX6043E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6043E.getCode();

    /** 附繳證件須包含死亡證明書 */
    public String TX6044E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6044E.getCode();

    /** 日期輸入錯誤 */
    public String TX6045E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6045E.getCode();

    /** 死亡日期輸入錯誤 */
    public String TX6046E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6046E.getCode();

    /** 當事人掛失的身分證的時間及日期 : */
    String TX6081W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6081W.getCode();

    /** 請輸入申請人國民身分證統一編號 */
    String TX6082E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6082E.getCode();

    /** 請輸入當事人國民身分證統一編號 */
    String TX6083E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6083E.getCode();

    /** 不可輸入當事人國民身分證統一編號 */
    String TX6084E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6084E.getCode();

    /** 申請人國民身分證統一編號不可相同 */
    String TX6085E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6085E.getCode();

    /** 作業代碼錯誤 */
    String TX6086E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6086E.getCode();

    /** 當事人非原住民身份 */
    public String TX6194E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6194E.getCode();

    /** 從監護人姓時，從姓方式須為一方決定 */
    public String TX6133E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6133E.getCode();

    /** 生父與生母的姓氏不相同，從姓不可為父母同姓未約定 */
    public String TX6420E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6420E.getCode();

    /** 若父母同姓未約定時，從姓方式應亦相同 */
    public String TX6134E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6134E.getCode();

    /** 若父母同姓未約定時，從姓應亦相同 */
    public String TX6135E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6135E.getCode();

    /** 生父全戶基本資料不存在 */
    public String TX6136E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6136E.getCode();

    /** 生母全戶基本資料不存在 */
    public String TX6137E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6137E.getCode();

    /** 原住民身分或族別輸入錯誤 */
    public String TX6195E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6195E.getCode();

    /** 全面換證起始資料不存在 */
    public String TX6155E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6155E.getCode();

    /** 個人基本資料不存在 */
    public String TX6156E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6156E.getCode();

    /** 遷入地輸入錯誤 */
    public String TX6148E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6148E.getCode();

    /** 特殊註記資料不存在 */
    public String TX6157E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6157E.getCode();

    /** 全面換證資料不存在 */
    public String TX6158E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6158E.getCode();

    /** 當事人之戶長個人基本資料不存在 */
    public String TX6022E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6022E.getCode();

    /** 影像索引資料不存在 */
    public String TX6159E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6159E.getCode();

    /** 初領或補領不可異地辦理 */
    public String TX6160E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6160E.getCode();

    /** 受理日期不可小於全面換證起始日 */
    public String TX6161E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6161E.getCode();

    /** 請輸入免列印相片原因 */
    public String TX6162E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6162E.getCode();

    /** 不可輸入免列印相片原因及說明 */
    public String TX6163E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6163E.getCode();

    /** 兩位申請人需為夫妻關係 */
    public String TX6216W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6216W.getCode();

    /** 免列印相片原因非其他，不可輸入說明 */
    public String TX6164E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6164E.getCode();

    /** 當事人不為現住人口 */
    public String TX6165E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6165E.getCode();

    /** 當事人領補換代碼錯誤 */
    public String TX6166E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6166E.getCode();

    /** 當事人已領證，不可辦初領 */
    public String TX6167E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6167E.getCode();

    /** 當事人未領證，不可申請補換 */
    public String TX6168E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6168E.getCode();

    /** 國民身分證申請辦理中，不可再辦理 */
    public String TX6169E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6169E.getCode();

    /** 全面換證辦理中，不可請領/國民身分證申請辦理中，不可再辦理 */
    public String TX6170E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6170E.getCode();

    /** 受理日期錯誤 */
    public String TX6171E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6171E.getCode();

    /** 當事人請領中，不可重複請領 */
    public String TX6172E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6172E.getCode();

    /** 當事人請領中，不可重複請領 */
    public String TX6173E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6173E.getCode();

    /** 當出生者為入他人戶時，稱謂不可為戶長 */
    public String TX6174E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6174E.getCode();

    /** 當事人清單資料不存在 */
    public String TX6175E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6175E.getCode();

    /** 當事人最後一筆姓名羅馬拼音紀錄為撤銷紀錄 */
    public String TX6177W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6177W.getCode();

    /** 錯誤訊息: 事人非原住地的現住人口 */
    public String TX6131E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6131E.getCode();
    /** 錯誤訊息: 所內記事資料不存在 */
    public String TX6138E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6138E.getCode();
    /** 錯誤訊息: 虛報遷徙人口必須撤銷遷徙後才可遷徙 */
    public String TX6139E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6139E.getCode();
    /** 錯誤訊息: 執行遷入登記程式失敗 */
    public String TX6140E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6140E.getCode();
    /** 錯誤訊息: 緊急動員人口不得遷徙 */
    public String TX6141E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6141E.getCode();
    /** 錯誤訊息: 限制住居人口不得遷徙 */
    public String TX6142E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6142E.getCode();
    /** 錯誤訊息: 保護管束人口不得遷徙 */
    public String TX6143E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6143E.getCode();
    /** 錯誤訊息: 遷出人口不為同一戶 */
    public String TX6144E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6144E.getCode();
    /** 錯誤訊息: 未選擇個人記事 */
    public String TX6145E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6145E.getCode();
    /** 錯誤訊息: 該戶沒有戶長 */
    public String TX6147E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6147E.getCode();
    /** 錯誤訊息: 遷入地行政區域輸入錯誤 */
    // public String TX6148E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6148E.getCode();
    /** 錯誤訊息: 當事人為遷入地現住人口或死亡人口 */
    public String TX6149E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6149E.getCode();
    /** 錯誤訊息: 遷入戶戶別輸入錯誤 */
    public String TX6152E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6152E.getCode();
    /** 錯誤訊息: 全戶遷出時，不可執行清除國民身分證統一編號 */
    public String TX6153E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6153E.getCode();
    /** 錯誤訊息: 請以遷出撤銷或遷回本戶作業處理 */
    public String TX6150E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6150E.getCode();
    /** 錯誤訊息: 全戶遷出或含戶長部分遷出時，須提供戶口名簿 */
    public String TX6154E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6154E.getCode();
    /** 錯誤訊息: 未勾選欲清除國民身分證統一編號 */
    public String TX6146E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6146E.getCode();
    /** 錯誤訊息: 兼任戶長個人基本資料不存在 */
    public String TX6198E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6198E.getCode();
    /** 錯誤訊息: 兼任戶長非現住人口 */
    public String TX6199E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6199E.getCode();
    /** 錯誤訊息: 需為現住人口或遷出國外人口 */
    public String TX6113E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6113E.getCode();
    /** 全國個人資料摘要資料不存在 */
    public String TX6192E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6192E.getCode();

    /** 當勾選了進行逾期申報之罰鍰檢視，則事件發生(確定)日期為必輸入. */
    final String TX6858E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6858E.getCode();

    /** 當事人非保護家庭暴力被保護人 */
    public String TX6193E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6193E.getCode();

    /** 錯誤訊息: 遷入戶長必須為當事人之一 */
    public String TX6196E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6196E.getCode();

    /** 當出生身份為無依兒童時，其從姓方式及從姓需為（依）從監護人之姓 */
    public String TX6189E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6189E.getCode();

    /** 里鄰門牌資料不存在 */
    public String TX6200E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6200E.getCode();

    /** 目前該登記，不開放當事人身份為現無戶籍者 */
    String TX6214W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6214W.getCode();

    /** 資料加鎖失敗請稍後再試 */
    public String TX6217E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6217E.getCode();

    /** 該投票所名冊已列印不得調整 */
    public String TX6211W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6211W.getCode();

    /** 執行「原住民傳統姓名羅馬拼音」服務失敗 */
    public String TX6228E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6228E.getCode();

    /** 請選擇新戶長 */
    public String TX6229E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6229E.getCode();

    /** 從姓為從父姓時，出生者之姓應與生父相同 */
    public String TX6354E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6354E.getCode();

    /** 從姓為從母姓時，出生者之姓應與生母相同 */
    public String TX6355E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6355E.getCode();

    /** 當出生身份為非婚生未認領時，從姓不可為從父姓 */
    public String TX6356E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6356E.getCode();

    /** 當出生身份為無依兒童時，從姓不可為從父姓或從母姓 */
    public String TX6357E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6357E.getCode();

    /** 當出生地點為大陸其他國家或國外其他城市時，請輸入出生地點名稱 */
    public String TX6358E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6358E.getCode();

    /** 戶內有遷出未接通報人口，須先處理遷出未接通報人口 */
    public String TX6368E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6368E.getCode();

    /** 執行「資料驗證」程式失敗 */
    public String TX6387E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6387E.getCode();

    /** 輸入資料錯誤 */
    public String TX6352E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6352E.getCode();

    /** 姓名長度限制為50個中文字 */
    public String TX6930E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6930E.getCode();

    /** 請輸入其他之附繳證件 */
    public String TX6353E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6353E.getCode();

    /** 申請日期不等於系統日期，是否繼續辦理 */
    public String TX6571W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6571W.getCode();

    /** 自立新戶時請先輸入地址 */
    public String TX6234E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6234E.getCode();

    /** 警告訊息: 遷入者與本戶所統號重覆，請查明，若無誤請繼續處理 */
    public String TX6151W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6151W.getCode();

    /** 出生別之性別與出生通報資料之性別不一致，請確認 */
    public String TX6235W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6235W.getCode();

    /** 執行「戶籍大簿明細戶籍資料查詢」服務失敗 */
    public String TX6359E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6359E.getCode();

    /** 兼任戶長本人須為自身戶籍地戶長 */
    public String TX6386E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6386E.getCode();

    /** 自動組合記事失敗 */
    public String TX6388E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6388E.getCode();

    /** 附送證件為其他時，請輸入說明 */
    public String TX6389E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6389E.getCode();

    /** 免列印相片原因為其他時，請輸入說明 */
    public String TX6390E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6390E.getCode();

    /** 附繳證件請至少選取一項 */
    public String TX6391E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6391E.getCode();

    /** 遺(滅)日期不得大於系統日期 */
    public String TX6400E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6400E.getCode();

    /** 金額不得空白且為數字 */
    public String TX6401E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6401E.getCode();

    /** WS 鎖定失敗. **/
    public String TX6407E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6407E.getCode();

    /** WS 解鎖失敗. **/
    public String TX6408E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6408E.getCode();

    /** WS 檢核鎖定失敗. **/
    public String TX6409E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6409E.getCode();

    /** WS 檢核鎖定型態失敗. **/
    public String TX6410E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6410E.getCode();

    /** 當事人發生加鎖失敗狀況，無法辦理全戶遷出 */
    public String TX6418E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6419E.getCode();

    /** 當事人或戶下未遷出人口發生加鎖失敗狀況，無法辦理含戶長部分遷出 */
    public String TX6419E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6419E.getCode();

    /** 欲新增之統號已為當事人之一 */
    public String TX6413E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6413E.getCode();

    /** 請重新輸入遷入戶號、遷入戶長統號 */
    public String TX6414E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6414E.getCode();
    /** 當事人非現住人口 */
    public String TX6445E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6445E.getCode();

    /** 執行GetDataComponent取得資料失敗 */
    public String TX6383E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6383E.getCode();

    /** 執行RlRetrieveRLDFTableDataComponent取得資料失敗 */
    public String TX6362E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6362E.getCode();

    /** 執行GetDataComponent WebService取得資料失敗 */
    public String TX6384E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6384E.getCode();

    /** 請輸入 */
    public String CH6005W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6005W.getCode();

    /** 原保管人員與新保管人員不能為同一人 */
    public String CH6006W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6006W.getCode();

    /** 執行作業失敗 */
    public String TXD088E = tw.gov.moi.rs.common.constant.RsCDMesg.TXD088E.getCode();

    /** 執行作業失敗 */
    public String TX6397E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6397E.getCode();

    /** 資料不存在 */
    public String TX6201E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6201E.getCode();

    /** 是否執行此作業 */
    public String CH6022W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6022W.getCode();

    /** 輸入資料重複，請查明後再處理 */
    public String CH6029W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6029W.getCode();

    /** 資料重複設定 */
    public String TX6361E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6361E.getCode();

    /** 處理成功 */
    public String TX6000S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6000S.getCode();

    /** 製作ObnfDTO通報物件失敗 */
    String TX_6539_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6539E.getCode();

    /** 沒有符合條件之資料 */
    String TX6513E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6513E.getCode();

    /** 個人基本資料不存在 */
    String TX6423E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6423E.getCode();

    /** 資料已存在不得新增 */
    String TX6521E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6521E.getCode();

    /** 無法取得原登記申請書資料檔 */
    String TX6865E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6865E.getCode();

    /** 刪除修改時原資料一定要存在 */
    String TX6522E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6522E.getCode();

    /** 請補登個人基本資料 */
    String TX6523E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6523E.getCode();

    /** 除戶全戶基本資料不存在 */
    String TX6524E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6524E.getCode();

    /** 請補登全戶基本資料料 */
    String TX6525E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6525E.getCode();

    /** 請至少選擇一位被申請人 */
    String TX6663W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6663W.getCode();

    /** 資料不存在，請輸入 */
    public String CH6011E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6011E.getCode();
    /** 統號配額範圍錯誤 */
    public String CH6011W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6011W.getCode();
    /**
     * 戶號配額範圍錯誤
     */
    public String CH6012W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6012W.getCode();

    /** 戶號輸入錯誤:戶號第1碼必須為A~Z */
    public String CH6013W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6013W.getCode();

    /** 戶號輸入錯誤:戶號第2碼~第7碼必須為A~Z或0~9 */
    public String CH6014W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6014W.getCode();

    /** 戶號輸入錯誤:戶號第8碼必須為0~9 */
    public String CH6015W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6015W.getCode();

    /** 驗證指定送達地址維護資料失敗 */
    public String TX6540E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6540E.getCode();

    /** 執行查詢作業失敗 */
    public String TX6542E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6542E.getCode();

    /** 查無資料 */
    public String TX6543E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6543E.getCode();

    /** 指定送達地址維護當事人-個人基本資料暫存失敗 */
    public String TX6545E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6545E.getCode();

    /** 執行規費處理程式失敗 */
    public String TX6546E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6546E.getCode();

    /** 當事人不能為外籍者 */
    public String TX6547E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6547E.getCode();

    /** XLDF領域物件不是變更狀態或非新增動作. */
    public String TX6548E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6548E.getCode();

    /** 新增規費明細錯誤. */
    public String TX6549E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6549E.getCode();

    /** 日期格式錯誤 */
    public String CH6020W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6020W.getCode();

    /** 時間格式錯誤 */
    public String CH6021W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6021W.getCode();

    /** 輸入資料與先前資料不一致，請再重新驗證 */
    public String CH6026W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6026W.getCode();

    /** 空白國民身分證/膠膜號碼格式錯誤 */
    public String CH6016W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6016W.getCode();

    /** 起始號碼與終止號碼之年份不符 */
    public String CH6017W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6017W.getCode();

    /** 起始號碼不可大於終止號碼 */
    public String CH6018W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6018W.getCode();

    /** 夫(妻)一方為外籍請繼續辦理 */
    public String CH6041W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6041W.getCode();

    /** 請依當事人需求執行姓名變更/冠姓/從姓登記 */
    public String CH6093W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6093W.getCode();

    /** 請依據當事人需求，先行辦理未成年子女權利義務行使負擔登記 */
    public String CH6096W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6096W.getCode();

    /** 請依據當事人需求，執行「稱謂更改作業」 */
    public String CH6098W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6098W.getCode();

    /** 必要時請辦理「遷入登記（補辦戶籍遷入）」 */
    public String CH6099W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6099W.getCode();

    /** 已領（使）用之空白國民身分證（膠膜）不可調撥 */
    public String TX6516E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6516E.getCode();

    /** 刪除空白國民身分證及膠膜使用記錄檔錯誤 */
    public String TX6517E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6517E.getCode();

    /** 空白國民身分證（膠膜）配賦資料不存在 */
    public String TX6518E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6518E.getCode();

    /** 新增空白國民身分證及膠膜使用記錄檔錯誤 */
    public String TX6519E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6519E.getCode();

    /** 空白國民身分證及膠膜領發月報資料不存在 */
    public String TX6520E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6520E.getCode();

    /** 該領用人尚有未使用之空白國民身分證（膠膜） */
    public String TX6536E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6536E.getCode();

    /** 已無未領用之空白國民身分證（膠膜） */
    public String TX6537E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6537E.getCode();

    /** 未領用之空白國民身分證（膠膜）數量不夠 */
    public String TX6538E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6538E.getCode();

    /** 資料輸入重複 */
    public String CH6013E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6013E.getCode();

    /** 執行「查詢英文拼音資料」服務失敗 */
    public String TX6233E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6233E.getCode();

    /** 該空白證（膠膜）已作廢 */
    public String TX6527E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6527E.getCode();

    /** 該空白證（膠膜）已使用 */
    public String TX6528E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6528E.getCode();

    /** 該空白證（膠膜）已領用 */
    public String TX6529E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6529E.getCode();

    /** 該空白證（膠膜）已登錄遺失 */
    public String TX6530E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6530E.getCode();

    /** 非帳管人員不得處理 */
    public String TX6531E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6531E.getCode();

    /** 更新空白國民身分證及膠膜使用記錄檔錯誤 */
    public String TX6503E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6503E.getCode();

    /** 新增空白國民身分證及膠膜遺失記錄檔錯誤 */
    public String TX6502E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6502E.getCode();

    /** 選舉人名冊資料不存在 */
    public String TX6505E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6505E.getCode();

    /** 空白國民身分證及膠膜使用記錄無符合資料 */
    public String TX6499E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6499E.getCode();

    /** 執行「驗証查詢輸入的戶口補校正統一編號是否符合」服務失敗 */
    String TX6364E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6364E.getCode();

    /** 資料有誤 */
    String TX6441E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6441E.getCode();

    /** 檢核FeeDTO資料錯誤 */
    String TX6550E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6550E.getCode();

    /** 新增規費主檔失敗 */
    String TX6551E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6551E.getCode();

    /** 新增規費明細檔失敗 */
    String TX6552E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6552E.getCode();

    /** 無領用待確認之空白國民身分證（膠膜） */
    public String TX6560E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6560E.getCode();

    /** 無未繳回之空白國民身分證（膠膜） */
    public String TX6561E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6561E.getCode();

    /** 當事人無請領資料 */
    public String TX6489E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6489E.getCode();

    /** 須由原受理戶所辦理 */
    public String TX6490E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6490E.getCode();

    /** 本案件已結案 */
    public String TX6491E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6491E.getCode();

    /** 本案件不受理 */
    public String TX6492E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6492E.getCode();

    /** 本案件已撤銷請領 */
    public String TX6493E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6493E.getCode();

    /** 本案件已註銷 */
    public String TX6494E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6494E.getCode();

    /** 已證證而未登錄空白證號，應先登錄空白證號 */
    public String TX6495E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6495E.getCode();

    /** 已護貝而未登錄膠膜號，應先登錄膠膜號 */
    public String TX6496E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6496E.getCode();

    /** 是否已護貝輸入錯誤(膠膜號非空白) */
    public String TX6497E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6497E.getCode();

    /** 除戶個人基本資料不存在 */
    public String TX6498E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6498E.getCode();

    /** 執行「查詢年終靜態鄰數資料」服務失敗 */
    String TX6230E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6230E.getCode();

    /** 執行「確認登錄稱謂代碼對照資料」服務失敗 */
    public String TX6231E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6231E.getCode();

    /** 執行「歸化國籍者姓名羅馬拼音登記／更正／變更／撤銷」服務失敗 */
    public String TX6232E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6232E.getCode();

    /** 無遺失待確認之空白國民身分證（膠膜） */
    public String TX6509E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6509E.getCode();

    /** 該空白證（膠膜）已登錄，不可新增 */
    public String TX6510E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6510E.getCode();

    /** 非該空白證（膠膜）之保管人員，不可新增 */
    public String TX6511E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6511E.getCode();

    /** 該空白證（膠膜）非瑕疵退回待確認，不可修改或刪除 */
    public String TX6512E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6512E.getCode();

    /** 執行「查詢已登錄逕遷至戶政事務所人數」服務失敗 */
    final String TX6381E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6381E.getCode();

    /** 執行「儲存登錄逕遷至戶政事務所人數資料」服務失敗 */
    final String TX6382E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6382E.getCode();

    /** 當事人無請領記錄 */
    public String TX6526E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6526E.getCode();

    /** 須由原受理地辦理 */
    public String TX6682E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6682E.getCode();

    /** 尚未登錄膠膜號 */
    public String TX6683E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6683E.getCode();

    /** 已經經過品管 */
    public String TX6684E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6684E.getCode();

    /** 當事人不存在辦理他所請領紀錄 */
    public String TX6685E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6685E.getCode();

    /** 戶長非現住人口或不具戶長身分 */
    public String TX6687E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6687E.getCode();

    /** 本作業僅提供已電腦化戶所之查詢 */
    public String TX6532E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6532E.getCode();

    /** 開始日期不可大於終止日期 */
    public String TX6533E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6533E.getCode();

    /** 村里鄰錯誤 */
    public String TX6534E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6534E.getCode();

    /** 出生日期輸入錯誤 */
    public String TX6535E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6535E.getCode();

    /** 當事人未辦理印鑑登記 */
    public String TX6594E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6594E.getCode();

    /** 當事人已辦理印鑑註銷 */
    public String TX6595E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6595E.getCode();

    /** 當事人印登代碼錯誤 */
    public String TX6596E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6596E.getCode();

    /** 執行列印作業失敗 */
    String TX6350E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6350E.getCode();

    /** 執行下載作業失敗 */
    String TX6351E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6351E.getCode();

    /** 數值格式錯誤 */
    public final String CH6025W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6025W.getCode();

    /** 無此筆通報資料 */
    public final String TX6573W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6573W.getCode();

    /** 尚未完成製證程序，不可發證 */
    public String TX6556E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6556E.getCode();

    /** 請先登錄空白證號及膠膜號 */
    public String TX6557E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6557E.getCode();

    /** 夫妻雙方之配偶姓名不互為彼此，請至親等作業更正資料 後再辦理 */
    public String TX6601E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6601E.getCode();

    /** 遷出國外者，請以補登資料辦理本作業 */
    public String TX6605E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6605E.getCode();

    /** 請改以撤銷大戶遷徙作業辦理 */
    public String TX6606E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6606E.getCode();

    /** 撤銷後戶籍地輸入錯誤 */
    public String TX6607E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6607E.getCode();

    /** 該作業點不得做此項作業 */
    public String TX6608E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6608E.getCode();

    /** 當事人非同一戶人口 */
    public String TX6609E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6609E.getCode();

    /** 原登記遷出地不相同 */
    public String TX6610E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6610E.getCode();

    /** 請重新輸入 */
    public String TX6642E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6642E.getCode();

    /** 當事人為撤銷後戶籍地現住人口或死亡人口 */
    public String TX6644E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6644E.getCode();

    /** 當事人與撤銷後戶籍地統號重覆，請查明，若無誤請繼續處理 */
    public String TX6644W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6644W.getCode();

    /** 擬入戶戶別錯誤或兼任戶長註記錯誤 */
    public String TX6650E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6650E.getCode();

    /** 當事人遷出類別不是遷出國外，不得撤銷遷出國外 */
    public String TX6652E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6652E.getCode();

    /** 當事人有不為同戶遷出者 */
    public String TX6653E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6653E.getCode();

    /** 該投票所別之里鄰資料不存在 */
    public String TX6664E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6664E.getCode();

    /** 撤銷後應回原住址 */
    public String TX6645E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6645E.getCode();

    /** 該投票所尚未編頁，不得新增 */
    public String TX6671E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6671E.getCode();

    /** 當事人或戶下未撤銷人口發生加鎖失敗狀況，無法辦理本作業 */
    public String TX6643E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6643E.getCode();

    /** 取得關係人資料失敗 */
    public String TX6654E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6654E.getCode();

    /** 寫入外加申請人記錄失敗 */
    public String TX6655E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6655E.getCode();

    /** 交易當事人或外加當事人已存在 */
    public String TX6656E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6656E.getCode();

    /** 刪除外加申請人記錄失敗 */
    public String TX6657E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6657E.getCode();

    /** 外加當事人不存在 */
    public String TX6658E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6658E.getCode();

    /** 不能移除交易申請人（或受委託人） */
    public String TX6659E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6659E.getCode();

    /** 讀取外加申請人記錄失敗 */
    public String TX6660E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6660E.getCode();

    /** 請至少輸入一個條件 */
    String CH6023W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6023W.getCode();

    /** 當事人無原住民身分不得註記族別 */
    public String CH6033W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6033W.getCode();

    /** 婚姻狀況（類別）輸入錯誤 */
    public String CH6034W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6034W.getCode();

    /** 起始鄰不可大於終止鄰 */
    String CH6008W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6008W.getCode();

    /** 執行「儲存國民小學學區資料」服務失敗 */
    String TX6370E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6370E.getCode();

    /** 開立日期輸入錯誤 */
    String CH6043W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6043W.getCode();
    /** 資料輸入重複 */
    String CH6014E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6014E.getCode();

    /** 資料取得錯誤. */
    String TX6514E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6514E.getCode();

    /** 此人非遷出人口 */
    String TX6570E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6570E.getCode();

    /** 該空白證（膠膜）須由原登錄人員修改或刪除 */
    public String TX6590E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6590E.getCode();

    /** 當事人未滿七歲得由法定代理人代辦 */
    public String TX6591E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6591E.getCode();

    /** 當事人受禁治產宣告得由法定代理人代辦 */
    public String TX6592E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6592E.getCode();

    /** 當事人已辦理印鑑登記 */
    public String TX6593E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6593E.getCode();
    /** 輸入錯誤 */
    public String CH6015E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6015E.getCode();

    /** 執行「查詢戶口校正資料」服務失敗 */
    String TX6365E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6365E.getCode();

    /** 請執行特殊註記資料刪除更正或變更作業 */
    String TX6559E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6559E.getCode();

    /** 如要產生統號請將國民身分證統一編號清空 */
    public String CH6030W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6030W.getCode();

    /** 執行死亡撤銷登記程式失敗 */
    String TX6417E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6417E.getCode();

    /** 本統號不配賦使用 */
    public String CH6032W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6032W.getCode();

    /** 補登人口為現住人口 */
    public String CH6031W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6031W.getCode();

    /** 補登人口為本戶所死亡人口 */
    public String CH6036W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6036W.getCode();

    /** 請補登全戶基本資料 */
    public String CH6035W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6035W.getCode();

    /** 受理日期不可小於全面換證起始日 */
    String CH6045W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6045W.getCode();

    /** 全戶基本資料不存在 */
    String TX6515E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6515E.getCode();

    /** 戶長基本資料不存在 */
    String TX6202E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6202E.getCode();

    /** 電話格式有誤 */
    String CH6046W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6046W.getCode();

    /** 執行配偶姓名更正廢止程式失敗 */
    String TX6575E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6575E.getCode();

    /** 當事人非現住人口、死亡人口、或遷出國外的除口人口 */
    String TX6586E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6586E.getCode();

    /** 當事人不為戶長 */
    String TX6563E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6563E.getCode();

    /** 申請人需為現住人口 */
    String TX6564E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6564E.getCode();

    String TX6555E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6555E.getCode();

    /** 輸入筆數錯誤 */
    String CH6058W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6058W.getCode();

    /** 資料有誤，請重新選擇查詢門牌 */
    String TX6572E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6572E.getCode();

    /** 改(增)編前門牌不存在里鄰門牌資料檔 */
    String TX6581E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6581E.getCode();

    /** 改(增)編後門牌不可存在里鄰門牌資料檔 */
    String TX6582E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6582E.getCode();

    /** 改(增)編後門牌不可存在全戶基本資料檔 */
    String TX6583E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6583E.getCode();

    /** 請確認是否統號重複 */
    public String CH6038W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6038W.getCode();

    /** 當事人未滿20歲 */
    public String TX6215W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6215W.getCode();

    /** 不得使用未配賦之戶號請重新輸入戶號 */
    public String TX6073E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6073E.getCode();

    /** 增編前後門牌錯誤 */
    String CH6059W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6059W.getCode();

    /** 該作業已被其他人鎖定，請稍候進行 */
    public String TX6575W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6575W.getCode();

    /** 不可新增兼任戶長 */
    public String CH6016E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6016E.getCode();

    /** 新增一戶時，其年靜全戶資料不應存在 */
    public String CH6017E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6017E.getCode();

    /** 靜態資料已存在，不必新增 */
    public String CH6018E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6018E.getCode();

    /** 非原住民卻有族別 */
    public String CH6019E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6019E.getCode();

    /** 戶長為兼任戶長，戶別須為共同事業戶 */
    public String CH6020E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6020E.getCode();

    /** 戶別不可為單獨生活戶 */
    public String CH6021E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6021E.getCode();

    /** 戶別不可為共同生活戶 */
    public String CH6022E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6022E.getCode();

    /** 村里鄰，戶長統號，戶號須同時輸入或同時不輸入 */
    public String CH6023E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6023E.getCode();

    /** 新增戶下一人時，其年靜全戶資料應存在 */
    public String CH6024E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6024E.getCode();

    /** 戶長的年終靜態個人資料不存在 */
    public String CH6025E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6025E.getCode();

    /** 欲入戶的戶長不具戶長身分，請先查核之 */
    public String CH6026E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6026E.getCode();

    /** 擬入戶戶別錯誤 */
    public String CH6027E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6027E.getCode();

    /** 戶內人口的戶別不一致，請先查核之 */
    public String CH6028E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6028E.getCode();

    /** 欲入戶為單獨生活戶，但目前戶內已多於一人 */
    public String CH6029E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6029E.getCode();

    /** 統號輸入重複 */
    public String CH6030E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6030E.getCode();

    /** 戶內新增人口後，戶別不可為單獨生活戶 */
    public String CH6031E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6031E.getCode();

    /** 同一戶人口，其戶別應相同 */
    public String CH6032E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6032E.getCode();

    /** 當事人戶別應與戶內原有人口的戶別相同 */
    public String CH6033E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6033E.getCode();

    /** 當事人戶別不應與戶內原有人口的戶別相同 */
    public String CH6034E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6034E.getCode();

    /** 空白國民身分證與膠膜使用記錄檔無符合資料 */
    String TX6210E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6210E.getCode();

    /** 此筆請領記錄已撤銷請領或不受理 */
    String TX6204E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6204E.getCode();

    /** 此筆請領記錄未結案 */
    String TX6205E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6205E.getCode();

    /** 當事人記事未輸入 */
    String TX6472E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6472E.getCode();

    /** 執行配偶姓名更正程式失敗 */
    String TX6597E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6597E.getCode();

    /** 執行父姓名更正程式失敗 */
    String TX6598E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6598E.getCode();

    /** 執行母姓名更正程式失敗 */
    String TX6599E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6599E.getCode();

    /** 執行存檔作業失敗 */
    public String TX6363E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6363E.getCode();

    /** 須在當事人現住戶所或發證戶所執行 */
    String CH6061W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6061W.getCode();

    /** 該戶所代碼不得做此項作業 */
    String CH6062W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6062W.getCode();

    /** 請輸入最新請領資料之發證戶所 */
    String CH6063W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6063W.getCode();

    /** 最新請領資料不可與註銷案件相同 */
    String CH6064W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6064W.getCode();

    /** 執行查詢作業失敗 */
    String TXB056E = tw.gov.moi.rs.common.constant.RsCDMesg.TXB056E.getCode();

    /** 執行列印作業失敗 */
    String TXB047E = tw.gov.moi.rs.common.constant.RsCDMesg.TXB047E.getCode();

    /** 出生者統一編號與處理狀況請擇一輸入 */
    public String CH6048W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6048W.getCode();

    /** 處理狀況為毋需辦理，未辦原因不可輸入 */
    public String CH6053W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6053W.getCode();

    /** 未輸入處理狀況時，未辦原因不可輸入 */
    public String CH6052W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6052W.getCode();

    /** 統號輸入重複 */
    public String CH6056W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6056W.getCode();

    /** 未輸入出生者統一編號，逕為登記不可輸入 */
    public String CH6050W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6050W.getCode();

    /** 未輸入出生者統一編號時，親子鑑定不可輸入 */
    public String CH6051W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6051W.getCode();

    /** 催告日期輸入錯誤 */
    public String CH6054W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6054W.getCode();

    /** 無資料輸入，請輸入資料 */
    public String CH6055W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6055W.getCode();

    /** 個人資料更新失敗 */
    String TX6203E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6203E.getCode();

    /** 申請人資料不存在 */
    String TX6415E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6415E.getCode();

    /** 案件未符催告期限，不需開立催告書 */
    String TX6221E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6221E.getCode();

    /** 執行統一編號更正登記程式失敗 */
    String TX6433E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6433E.getCode();

    /** 執行姓名更正登記程式失敗 */
    String TX6806E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6806E.getCode();

    /** 執行姓名變更/冠姓/從姓登記程式失敗 */
    String TX6807E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6807E.getCode();

    /** 取得最後一筆姓名更改紀錄失敗 */
    String TX6651E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6651E.getCode();

    /** 請至少選擇一項申請事由 */
    String TX6665W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6665W.getCode();

    /** 不存在入出監通報資料 */
    public String TX6696E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6696E.getCode();

    /** 空白證號不存在 */
    public String TX6699E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6699E.getCode();

    /** 請輸入 */
    public String CHD000W = tw.gov.moi.rs.common.constant.RsCDMesg.CHD000W.getCode();

    /** 空白國民身分證/膠膜號碼格式錯誤 */
    public String CHD008W = tw.gov.moi.rs.common.constant.RsCDMesg.CHD008W.getCode();

    /** 格式錯誤 */
    public String TXD137E = "TXD137E";

    /** 國民身分證已列印 */
    public String TX6612E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6612E.getCode();

    /** 領補換日期不可小於全面換證起始日 */
    public String TX6614E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6614E.getCode();

    /** 國民身分證請領記錄與個人基本資料之領補換日期不符 */
    public String TX6615E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6615E.getCode();

    /** 國民身分證請領紀錄與個人基本資料之領補換代碼不符 */
    public String TX6616E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6616E.getCode();

    /** 除戶姓名羅馬拼音記錄不存在 */
    public String TX6617E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6617E.getCode();

    /** 當事人最後一筆除戶姓名羅馬拼音記錄為撤銷記錄 */
    public String TX6618E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6618E.getCode();

    /** 需先掃瞄照片或選擇沿用影像 */
    public String TX6619E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6619E.getCode();

    /** 須先領用及確認空白國民身分證 */
    public String TX6620E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6620E.getCode();

    /** 姓名羅馬拼音資料不存在 */
    public String TX6621E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6621E.getCode();

    /** 當事人姓名有缺字，請採人工繕寫 */
    public String TX6622E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6622E.getCode();

    /** 行政區域調整或門牌整編已生效，不得更正 */
    public String TX6075E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6075E.getCode();

    /** 當事人未登記羅馬拼音，不可採人工繕寫 */
    public String TX6623E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6623E.getCode();

    /** 當事人無養父母，不可列印養父及雙橫線 */
    public String TX6624E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6624E.getCode();

    /** 當事人有生父，不可印列單橫線 */
    public String TX6625E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6625E.getCode();

    /** 生父姓名有缺字，請採人工繕寫 */
    public String TX6626E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6626E.getCode();

    /** 當事人有養父，父姓名列印旗標只可列印養父 */
    public String TX6627E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6627E.getCode();

    /** 養父姓名有缺字，請採人工繕寫 */
    public String TX6628E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6628E.getCode();

    /** 當事人無養父母，不可列印養母及雙橫線 */
    public String TX6629E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6629E.getCode();

    /** 當事人有生母，不可印列單橫線 */
    public String TX6630E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6630E.getCode();

    /** 生母姓名有缺字，請採人工繕寫 */
    public String TX6631E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6631E.getCode();

    /** 當事人有養母，母姓名列印旗標只可列印養母 */
    public String TX6632E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6632E.getCode();

    /** 養母姓名有缺字，請採人工繕寫 */
    public String TX6633E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6633E.getCode();

    /** 配偶姓名有缺字，請採人工繕寫 */
    public String TX6634E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6634E.getCode();

    /** 除了99999及99998以外，均須列印預設出生地 */
    public String TX6635E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6635E.getCode();

    /** 已登錄出生地但出生地列印旗標輸入錯誤 */
    public String TX6636E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6636E.getCode();

    /** 需先登錄出生地 */
    public String TX6637E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6637E.getCode();

    /** 當事人配偶非已歿，不可列印已歿配偶姓名 */
    public String TX6638E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6638E.getCode();

    /** 膠膜號不存在 */
    public String TX6707E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6707E.getCode();

    /** 當事人最後一筆姓名羅馬拼音記錄為撤銷記錄 */
    public String TX6176E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6176E.getCode();

    /** 執行遷徙作業業務共用元件程式失敗 */
    public String TX6717E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6717E.getCode();

    /** 執行撤銷遷出登記程式失敗 */
    public String TX6718E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6718E.getCode();

    /** 無戶籍者不得執行本作業 */
    public String TX6604E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6604E.getCode();

    /** 執行養母姓名更正程式失敗 */
    String TX6648E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6648E.getCode();

    /** 申請現行戶籍謄本不存在於除戶年分內 */
    String TX6662W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6662W.getCode();

    /** 此統號已存在選舉人名冊，不得新增 */
    String TX6662E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6662E.getCode();

    /** 輸入日期不符合邏輯 */
    public String CH6065W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6065W.getCode();

    /** 生母國籍資料錯誤 */
    public String CH6066W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6066W.getCode();

    /** 請同時輸入起始值與終止值 */
    public String CH6079W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6079W.getCode();

    /** 不可輸入民國前日期 */
    public String CH6080W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6080W.getCode();

    /** 「終止日期」不可小於「起始日期」 */
    public String CHD004W = tw.gov.moi.rs.common.constant.RsCDMesg.CHD004W.getCode();

    /** 起始胎次不可大於終止胎次 */
    public String CH6082W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6082W.getCode();

    /** 起始體重不可大於終止體重 */
    public String CH6083W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6083W.getCode();

    /** 起始懷胎週數不可大於終止懷胎週數 */
    public String CH6084W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6084W.getCode();

    /** 起始年齡不可大於終止年齡 */
    public String CH6085W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6085W.getCode();

    /** 起始結婚期間不可大於終止結婚期間 */
    public String CH6086W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6086W.getCode();

    /** 申登期限已跨年度，請確認工作日設定是否已完成 */
    public String CH6078W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6078W.getCode();

    /** 起投票所不可大於迄投票所 */
    public String CH6060W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6060W.getCode();

    /** 請先將上次改編或調整資料清除,再登錄新資料 */
    public String TX6074E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6074E.getCode();

    /** 當事人無請領紀錄 */
    public String TX6065E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6065E.getCode();

    /** 須為現住人口或遷出國外者 */
    public String TX6714E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6714E.getCode();

    /** 須為死亡人口才可刪除 */
    public String TX6715E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6715E.getCode();

    /** 請確認畫面輸入是否有誤，若無誤請按存檔 */
    public String TX6716E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6716E.getCode();

    /** 須待通報收妥後方可執行 **/
    public String TX6001W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6001W.getCode();

    /** 呼叫取得最後收妥時間Web服務失敗 */
    public String TX6405E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6405E.getCode();

    /** 個人基本資料不存在 */
    public String CH6076W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6076W.getCode();

    /** 非本戶所現住人口 */
    public String CH6077W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6077W.getCode();

    /** 代發案件超過筆數，請洽運作支援中心處理 */
    public String TX6720E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6720E.getCode();

    /** 遷徙紀錄不存在 */
    public String TX6721E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6721E.getCode();

    /** 撤銷後戶籍地住址不屬於撤銷住變範圍 */
    public String TX6727E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6727E.getCode();

    /** 起鄰不得大於迄鄰 */
    public String CH6028W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6028W.getCode();

    /** 廢止門牌不存在里鄰門牌資料檔 */
    public String TX6600E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6600E.getCode();

    /** 不可輸入發出日期並選擇未發出 */
    public String CH6072E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6072E.getCode();

    /** 不可輸入作廢日期並選擇未作廢 */
    public String CH6073E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6073E.getCode();

    /** 全戶動態記事不存在 */
    public String TX6178E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6178E.getCode();

    /** 個人記事資料不存在 */
    public String TX6179E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6179E.getCode();

    /** 特殊人口資料不存在 */
    public String TX6186E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6186E.getCode();

    /** 申請人不可為死亡者本人 */
    public String TX6187E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6187E.getCode();

    /** 受委託人不可為死亡者本人 */
    public String TX6188E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6188E.getCode();

    /** 執行住變撤銷登記程式失敗 */
    public String TX6722E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6722E.getCode();

    /** 驗證住變撤銷登記申請資料失敗 */
    public String TX6728E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6728E.getCode();
    /** 擬入戶住址與撤銷後住址不相符 */
    public String TX6755E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6755E.getCode();

    /** 該姓名所有之個人基本資料不存在 */
    public String TX6742E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6742E.getCode();

    /** 當事人之全戶基本資料不存在 */
    public String TX6743E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6743E.getCode();

    /** 該村里所有之全戶基本資料不存在 */
    public String TX6744E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6744E.getCode();

    /** 戶長之個人基本資料不存在 */
    public String TX6745E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6745E.getCode();

    /** 該戶所有之個人基本資料不存在 */
    public String TX6746E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6746E.getCode();

    /** 該街路門牌所有之全戶基本資料不存在 */
    public String TX6747E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6747E.getCode();

    /** 該姓名所有之除戶個人基本資料不存在 */
    public String TX6748E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6748E.getCode();

    /** 當事人之除戶全戶基本資料不存在 */
    public String TX6749E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6749E.getCode();

    /** 該村里所有之除戶全戶基本資料不存在 */
    public String TX6750E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6750E.getCode();

    /** 戶長之除戶個人基本資料不存在 */
    public String TX6751E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6751E.getCode();

    /** 該戶所有之除戶個人基本資料不存在 */
    public String TX6752E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6752E.getCode();

    /** 該街路門牌所有之除戶全戶基本資料不存在 */
    public String TX6753E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6753E.getCode();

    /** 非全戶住變或全戶撤銷住變時，擬入戶不可為原戶 */
    public String TX6759E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6759E.getCode();

    /** 輸入之除戶年份大於系統年份 */
    public String CH6036E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6036E.getCode();

    /** 資料格式有誤 */
    public String CH6037E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6037E.getCode();

    /** 此統號已刪除不得更正 */
    public String TX6674E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6674E.getCode();

    /** 批次列印已送出 */
    public String TX6732S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6732S.getCode();

    /** 該證已發證，不可辦理本作業 */
    public String TX6700E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6700E.getCode();

    /** 領用人員必須為登錄人員 */
    public String TX6701E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6701E.getCode();

    /** 無法取得報表檔案 */
    public String TX6729E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6729E.getCode();

    /** 已無未使用之空白國民身分證（膠膜） */
    public String TX6702E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6702E.getCode();

    /** 未使用之空白國民身分證（膠膜）數量不夠 */
    public String TX6703E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6703E.getCode();

    /** 該投票所名冊已列印，請執行重印作業 */
    public String TX6688E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6688E.getCode();

    /** 此統一編號尚未製證不可登錄 */
    public String TX6704E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6704E.getCode();

    /** 此統一編號已登錄空白證號不可再登錄 */
    public String TX6705E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6705E.getCode();

    /** 此統一編號無國民身分證列印資料 */
    public String TX6706E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6706E.getCode();

    /**
     * 住變人口數超過２０人
     */
    String TX6796E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6796E.getCode();

    /** 請選擇住變遷出戶新戶長 */
    String TX6797E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6797E.getCode();

    /** 全戶基本資料不存在 */
    String TX6798E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6798E.getCode();

    /** 擬入戶之住址錯誤 */
    String TX6790E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6790E.getCode();

    /** 同址住變時，請以分合戶作業辦理 */
    String TX6791E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6791E.getCode();

    /** 虛擬遷徙人口必須撤銷遷徙後才可遷徙 */
    String TX6792E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6792E.getCode();

    /** 他往工投資料已存在 */
    public String TX6672E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6672E.getCode();

    /** 此選舉人已被刪除 */
    public String TX6673E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6673E.getCode();

    /** 他往工投資料不存在 */
    public String TX6686E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6686E.getCode();

    /** 選舉人名冊無此統號資料 */
    public String TX6681E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6681E.getCode();

    /** 此選舉人不為他往工投 */
    public String TX6691E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6691E.getCode();

    /** 當事人無特殊註記資料 **/
    public String TX6739E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6739E.getCode();

    /** 特殊人口不存在 **/
    public String TX6760E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6760E.getCode();

    /** 催告個案資料不存在 **/
    public String TX6197E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6197E.getCode();

    /** 資料輸入不完整 */
    public String TX6754E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6754E.getCode();

    /** 執行「催告個案資料查詢與列印處理服務」服務失敗 */
    public String TX6208E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6208E.getCode();

    /** 護照申請親辦資料不存在 */
    public String TX6394E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6394E.getCode();

    /** 不可輸入更正後投票所 */
    public String TX6677E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6677E.getCode();

    /** 請輸入數字 */
    String CHD014W = tw.gov.moi.rs.common.constant.RsCDMesg.CHD014W.getCode();

    /** 「送通報封包」失敗 */
    public String TX6108E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6108E.getCode();

    /** 起始日期不可大於終止日期 **/
    public String CH6087W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6087W.getCode();

    /** 執行姓名變更撤銷登記程式失敗 */
    String TX6661E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6661E.getCode();

    /** 執行配偶姓名變更程式失敗 */
    String TX6756E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6756E.getCode();

    /** 驗證成功，請繼續執行列印戶籍謄本 */
    String TX6762I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6762I.getCode();

    /** 沒有符合查詢條件之資料 */
    public String TX6765E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6765E.getCode();

    /** 取得功能失敗 */
    String TX6726E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6726E.getCode();

    /** 批次作業已送出 */
    String TX6002S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6002S.getCode();

    /** 本戶口名簿發證後所載資料未異動 */
    String TX6005S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6005S.getCode();

    /** 請再確認所輸入資料是否正確 */
    String TX6875E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6875E.getCode();

    /** 戶號存量足夠，無須申請配賦 */
    public String TX6001I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6001I.getCode();

    /** 統號存量足夠，無須申請配賦 */
    public String TX6000I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6000I.getCode();

    /** 已執行過轉錄按登記日期分資料 */
    public String TX6439E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6439E.getCode();

    /** 未執行過轉錄按登記日期分資料 */
    public String TX6444E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6444E.getCode();

    /** 出生登記申請書 */
    public String TX6443E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6443E.getCode();

    /** 已執行過轉錄按發生日期分資料 */
    public String TX6440E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6440E.getCode();

    /** 資料不存在 */
    public String TX6000E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6000E.getCode();

    /** 申登日期不可小於發生日期 */
    public String CH6089W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6089W.getCode();

    /** 儲存資料與列印資料不一致 */
    public String TX6774E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6774E.getCode();

    /**
     * 查無出生登記申請書已詳出生日日期分類資料
     */
    public String TX6214E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6214E.getCode();

    /** 死亡(宣告)尚未辦理登記 */
    String TX6775E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6775E.getCode();

    /** 戶長統號錯誤 */
    public String TX6784E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6784E.getCode();

    /** 戶號錯誤 */
    public String TX6785E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6785E.getCode();

    /** 含戶長遷出時，遷出戶戶長不得拒提戶口名簿 */
    public String TX6787E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6787E.getCode();

    /** 驗證成功，請繼續執行列印英文戶籍謄本 */
    public String TX6777I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6777I.getCode();

    /** 沒有修改任何資料 */
    public String CH6090W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6090W.getCode();

    /** 至少選擇一筆調整資料 */
    public String CH6091W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6091W.getCode();

    /** 請重新驗證查詢 */
    public String CH6092W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6092W.getCode();

    /** 該戶長個人基本資料之戶長統號、戶號錯誤 */
    public String TX6023E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6023E.getCode();

    /** 取得最後一筆除戶個人基本資料失敗 */
    public String TX6641E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6641E.getCode();

    /** 全面換證資料與個人基本資料不符 */
    public final String TX6800E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6800E.getCode();

    /** 執行「列印核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數統計表」服務失敗 */
    public String TXD009E = tw.gov.moi.rs.common.constant.RsCDMesg.TXD009E.getCode();

    /** 請登錄最少一筆行政區域調整資料 */
    public final String TX6803E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6803E.getCode();

    /** 請先執行門牌整編作業 */
    public final String TX6804E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6804E.getCode();

    /** 遷入戶戶長必須為住變當事人之一 */
    public final String TX6805E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6805E.getCode();

    /** 法定代理人非當事人權利義務行使負擔人 */
    public String TX6809E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6809E.getCode();

    /** 當事人無個人基本資料 */
    public String TX6810E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6810E.getCode();

    /** 當事人無全戶基本資料 */
    public String TX6811E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6811E.getCode();

    /** 受委託人(法定代理人)無個人基本資料 */
    public String TX6812E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6812E.getCode();

    /** 受委託人(法定代理人)無全戶基本資料 */
    public String TX6813E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6813E.getCode();

    /** 此統號於非上班時間掛失且戶所尚未確認 */
    public String TX6814E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6814E.getCode();

    /** 此統號已掛失 */
    public String TX6815E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6815E.getCode();

    /** 此統號已撤銷掛失 */
    public String TX6816E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6816E.getCode();

    /** 此統號已移除掛失 */
    public String TX6817E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6817E.getCode();

    /** 此統號已鎖定辦理掛失 */
    public String TX6818E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6818E.getCode();

    /** 此統號已鎖定辦理撤銷掛失 */
    public String TX6819E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6819E.getCode();

    /** 此統號已鎖定辦理移除掛失 */
    public String TX6820E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6820E.getCode();

    /** 此統號資料已鎖定 */
    public String TX6821E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6821E.getCode();

    /** 門牌整編尚未解鎖 */
    public final String TX6825E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6825E.getCode();

    /** 門牌整編資料尚未清除 */
    public final String TX6827E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6827E.getCode();

    /** 執行驗證查詢成功，請繼續執行後續作業 */
    public final String TX6828S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6828S.getCode();

    /**
     * 逕為登記申請種類必須為全戶住變
     */
    String TX6828E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6828E.getCode();

    /** 逕為登記申請種類必須為自立新戶 */
    String TX6829E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6829E.getCode();

    /** 無此請領紀錄 */
    public final String TX6180E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6180E.getCode();

    /** 驗證成功 */
    public final String TX6003S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6003S.getCode();

    /** 聯絡電話不可含有特殊符號 */
    public final String TX6732E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6732E.getCode();

    /** 輸入之國民身分證統一編號不可重複 */
    public final String TX6733E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6733E.getCode();

    /** 受委託人之個人基本資料不存在 */
    public final String TX6734E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6734E.getCode();

    /** 受委託人全戶基本資料不存在 */
    public final String TX6735E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6735E.getCode();

    /** 當事人必須為同戶之人口 */
    public final String TX6736E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6736E.getCode();

    /** 戶長不為現住人口 */
    public final String TX6737E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6737E.getCode();

    /** 原戶長不具戶長身分 */
    public final String TX6738E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6738E.getCode();

    /** 失蹤、入監、受監護宣告人口，須以例行性請領處理 */
    public final String TX6740E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6740E.getCode();

    /** 當事人請領中，不可重覆請領 */
    public final String TX6741E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6741E.getCode();

    /** 執行新增規費收據程式失敗 */
    public final String TX_6802_E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6802E.getCode();

    /** 調整或整編日期不可小於系統日期 */
    public final String TX6831E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6831E.getCode();

    /** 行政區域調整已生效，不允許還原 */
    public final String TX6832E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6832E.getCode();

    /** 執行通訊中斷後遷入登記程式失敗 */
    public final String TX6845E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6845E.getCode();

    /** 執行通訊中斷後遷入登記，須使用補登資料 */
    public final String TX6846E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6846E.getCode();

    /** 全戶自立新戶必須需同戶號與同戶長 */
    public final String TX6847E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6847E.getCode();

    /** 入他人不可入原遷出戶 */
    public final String TX6848E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6848E.getCode();

    /** 執行原住民身分及族別登記程式失敗 */
    public final String TX6757E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6757E.getCode();

    /** 受理日期不可大於系統日期 */
    public final String TX6833E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6833E.getCode();

    /** 統號之發証資料不存在該戶政事務所 */
    public final String TX6834E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6834E.getCode();

    /** 執行統一編號變更登記程式失敗 */
    String TX6465E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6465E.getCode();

    /** 地址資料不存在 */
    String TX6393E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6393E.getCode();

    /** 請查閱除戶簿頁 */
    public final String TX6779E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6779E.getCode();

    /** 當事人無喪偶，不可列印已歿配偶姓名. */
    public final String TX6835E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6835E.getCode();

    /** 當事人非除戶人口. */
    public final String TX6836E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6836E.getCode();

    /** 當事人有「現戶個人基本資料」，請用「現戶個人基本資料」辦理撤銷廢止戶籍. */
    public final String TX6837E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6837E.getCode();

    /** 執行撤銷原住民身分及族別登記程式失敗 */
    public final String TX6758E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6758E.getCode();

    /** 主管尚未簽核此次申請. */
    public final String TX6840E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6840E.getCode();

    /** 主管核退此次申請. */
    public final String TX6841E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6841E.getCode();

    /** 請確認小計不等於數量乘單價 */
    public final String TX6003W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6003W.getCode();

    /** 異動資料通報 */
    String TX6105E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6105E.getCode();

    /** 請確認本姓為空白 */
    public final String TX6005W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6005W.getCode();

    /** 請確認名為空白 */
    public final String TX6006W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6006W.getCode();

    /** 此電腦無下載檔案的IP權限 */
    public final String TX6838E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6838E.getCode();

    /** 執行未成年子女權利義務行使負擔撤銷登記程式失敗 */
    public final String TX6224E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6224E.getCode();

    /** 執行未成年子女權利義務行使負擔廢止登記程式失敗 */
    public final String TX6225E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6225E.getCode();

    /** 出生起迄日期不可跨年查詢 */
    public final String TX6095W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6095W.getCode();

    /** 請確認與未成年子女之關係是否正確 */
    public final String TX6002W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6002W.getCode();

    /** 姓名更改記錄超過一筆 */
    public final String TX6843E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6843E.getCode();

    /** 分(合)戶不可全戶自立新戶 */
    public final String TX6844E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6844E.getCode();

    /** 請確認姓名更改是否無誤，若無誤請繼續辦理 */
    public final String TX6007W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6007W.getCode();

    /** 無姓名更改紀錄不得執行本作業 */
    public final String TX6647E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6647E.getCode();

    /** 姓名更正撤銷登記程式執行失敗 */
    public final String TX6649E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6649E.getCode();

    /** 受理日期不為系統日期，請確認 */
    public final String TX6011W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6011W.getCode();

    /** 請查明父姓名列印旗標 */
    public final String TX6012W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6012W.getCode();

    /** 請查明母姓名列印旗標 */
    public final String TX6013W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6013W.getCode();

    /** 保管人不屬於該戶內成員，無法申請 */
    public final String TX6849E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6849E.getCode();

    /** 無自國外遷入之遷徙記錄資料 */
    public final String TX6850E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6850E.getCode();

    /** 須為同批遷入，才可同時撤銷 */
    public final String TX6851E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6851E.getCode();

    /** 生父與養母有婚姻關係，只可選擇列印生父 */
    public final String TX6852E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6852E.getCode();

    /** 生母與養父有婚姻關係，只可選擇列印生母 */
    public final String TX6853E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6853E.getCode();

    /** 單方收養，父姓名列印旗標只可列印雙橫線 */
    public final String TX6854E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6854E.getCode();

    /** 單方收養，母姓名列印旗標只可列印雙橫線 */
    public final String TX6855E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6855E.getCode();

    /** 同一戶內只能有一位成員稱謂是戶長 */
    public final String TX6856E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6856E.getCode();

    /** 請選擇遷入戶新戶長 */
    public final String TX6857E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6857E.getCode();

    /** 取得外籍者國籍或區域代碼有誤 */
    public final String TX6861E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6861E.getCode();

    /** 記事類別修改成功 */
    public final String TX6863I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6863I.getCode();

    /** 當事人無統號更改記錄，無法回復舊統號，請選擇其他變更類別 */
    public final String TX6860E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6860E.getCode();

    /** 同一統號只能回復一次，請選擇其他變更類別 */
    public final String TX6862E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6862E.getCode();

    /** 取得最後一筆統號更改紀錄失敗 */
    public final String TX6859E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6859E.getCode();

    /** 死亡者配偶為死亡人口，請校正死亡者之個人基本資料 */
    public final String TX6863E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6863E.getCode();

    /** 無法取得死亡者配偶資料，請輸入配偶統號、作業點代碼後按下取得資料鈕 */
    public final String TX6010W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6010W.getCode();

    /** 戶政事務所調整儲存成功 */
    public final String TX6004I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6004I.getCode();

    /** 戶政事務所調整資料已存在，請先刪除再新增 */
    public final String TX6866E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6866E.getCode();

    /** 請登錄最少一筆戶政事務所調整資料 */
    public final String TX6867E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6867E.getCode();

    /** 調整期不可小於系統日期 */
    public final String TX6868E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6868E.getCode();

    /** 調整期不可小於系統日期 */
    public final String TX6869E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6869E.getCode();

    /** 請先執行政區域調整作業 */
    public final String TX6870E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6870E.getCode();

    /** 該申請書已被撤銷，無須再次撤銷 */
    public final String TX6871E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6871E.getCode();

    /** 未達法定開單日 */
    public final String TX6207E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6207E.getCode();

    /** 此證尚未掛失 */
    public final String TX6877E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6877E.getCode();

    /** 本戶口名簿發證後，戶內人口僅役別欄異動 */
    public final String TX6879E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6879E.getCode();

    /** 申請人已為遷出人口，不得申請戶口名簿 */
    public final String TX6015W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6015W.getCode();

    /** 下列戶內人口有家暴註記 */
    public final String TX6016W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6016W.getCode();

    /** 此戶內人口無任何記事，無法挑選 */
    public String TX6017W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6017W.getCode();

    /** 請登錄最少一筆跨行政區域調整資料 */
    public final String TX6880E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6880E.getCode();

    /**
     * 已有申請資料
     */
    public final String TX6881E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6881E.getCode();

    /** 申請人全戶基本資料不存在 */
    public final String TX6424E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6424E.getCode();

    /** 委託人全戶基本資料不存在 */
    public final String TX6425E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6425E.getCode();

    /** 己身全戶基本資料不存在 */
    public final String TX6426E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6426E.getCode();

    /** 申請人個人基本資料不存在 */
    public final String TX6427E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6427E.getCode();

    /** 委託人個人基本資料 */
    public final String TX6428E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6428E.getCode();

    /** 存檔成功 */
    public final String CH6001S = tw.gov.moi.rs.common.constant.RsCDMesg.CH6001S.getCode();

    /** 請執行出生地變更或更正登記 */
    public final String CH6097W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6097W.getCode();

    /** 當事人無原登記原住民身分，不得進行原住民身分及族別更正登記 */
    String TX6366E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6366E.getCode();

    /** 保護令尚未到期 */
    String TX6367E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6367E.getCode();

    /** 空白國民身份證/膠膜號碼格式錯誤 */
    public final String TX6882E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6882E.getCode();

    /** 當事人身分證已掛失，「申請事由」請選擇「補領」. */
    public final String TX6883E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6883E.getCode();

    /** 更新規費明細錯誤 */
    public final String TX6873E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6873E.getCode();

    /** 更新申請書資料錯誤 */
    public final String TX6874E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6874E.getCode();

    /** 當事人與配偶之互為配偶檢核失敗. */
    public final String TX6878E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6878E.getCode();

    /** 出境日期至今未滿2年. */
    public final String TX6395E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6395E.getCode();

    /** 請先執行「資料驗證」成功後再執行「申請」 . */
    public final String TX6887E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6887E.getCode();

    /** 執行未成年子女權利義務行使負擔登記程式失敗 */
    public final String TX6890E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6890E.getCode();

    /** 須為現住人口或喪失國籍、遷出國外、喪失身分的除口人口 */
    public final String TX6885E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6885E.getCode();

    /** 須為現住人口、死亡人口或喪失國籍、遷出國外、喪失身分的除口人口 */
    public final String TX6932E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6932E.getCode();

    /** 須為喪失國籍、遷出國外、喪失身分的除戶人口 */
    public final String TX6886E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6886E.getCode();

    /** 本作業無法與其他作業合併辦理，請存檔後再執行本作業 */
    public final String TX6888E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6888E.getCode();

    /** 當事人姓名字數超過十五個字，請採人工繕寫 */
    public final String TX6891E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6891E.getCode();

    /** 生父姓名字數超過十五個字，請採人工繕寫 */
    public final String TX6892E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6892E.getCode();

    /** 生母姓名字數超過十五個字，請採人工繕寫 */
    public final String TX6893E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6893E.getCode();

    /** 養父姓名字數超過十五個字，請採人工繕寫 */
    public final String TX6894E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6894E.getCode();

    /** 養母姓名字數超過十五個字，請採人工繕寫 */
    public final String TX6895E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6895E.getCode();

    /** 當事人羅馬拼音字數超過四十個字，請採人工繕寫 */
    public final String TX6896E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6896E.getCode();

    /** 選舉權設定錯誤 */
    public final String TX6897E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6897E.getCode();

    /** 請選擇 */
    public final String TX6899E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6899E.getCode();

    /** 請確認權利義務行使負擔人統號輸入正確 */
    public final String TX6020W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6020W.getCode();

    /** 下列統號有家暴註記，無法全選記事，請自行挑選. */
    public final String TX6021W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6021W.getCode();

    /** 無此投票所錯誤. */
    public final String TX6898E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6898E.getCode();

    /** 該投票所尚未列印，無法製作原住民異動名冊 */
    public final String TX6901E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6901E.getCode();

    /** 目前未開放異地辦理,住變遷入地行政區域需與原住地行政區域相同 */
    public final String TX6902E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6902E.getCode();

    /** 目前未開放異地辦理,分(合)戶遷入地行政區域需與原住地行政區域相同 */
    public final String TX6903E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6903E.getCode();

    /** 目前未開放異地辦理,撤銷分(合)戶遷入地行政區域需與原住地行政區域相同 */
    public final String TX6904E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6904E.getCode();

    /** 當事人遷入地的除口之戶為大戶，請先做簿頁改換寫，再進行遷入登記 */
    public final String TX6908E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6908E.getCode();

    /**
     * 無投票所錯誤，請重新執行選舉人資料登錄作業
     */
    public final String TX6905E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6905E.getCode();
    /**
     * 請勾選核符規定或不符規定
     */
    public final String TX6906E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6906E.getCode();
    /**
     * 請勾選不符合規定的原因
     */
    public final String TX6907E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6907E.getCode();

    /** 請改以大戶死亡作業(10月開放試辦)辦理 (大戶定義:戶內人口含現住、非現住與死亡人口大於20人). */
    public final String TX6909E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6909E.getCode();

    /** 已執行另存電子檔，請稍後至「電子檔案下載申請」申請下載 */
    public final String TX6002I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6002I.getCode();

    /** 已執行另存電子檔，請稍後至「電子檔案下載執行」下載 */
    public final String TX6003I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6003I.getCode();

    /** 請選擇 */
    public final String CH6001I = tw.gov.moi.rs.common.constant.RsCDMesg.CH6001I.getCode();

    /** 報表已執行 */
    public final String CH6038E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6038E.getCode();

    /** 當事人國民身分證請領中，不得辦理本作業 */
    public final String TX6912E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6912E.getCode();

    /** 請確認死亡日期無誤. */
    public final String TX6018W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6018W.getCode();

    /** 執行姓名區分作業程式失敗 */
    public final String TX6914E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6914E.getCode();

    // 本月份人口統計月報表已執行成功,不可再次執行
    public final String TX6931E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6931E.getCode();

    /** 批次報表執行中 */
    public final String TX6005I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6005I.getCode();

    /** 批次報表執行中，請稍候執行「預覽列印」 */
    public final String TX6006I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6006I.getCode();

    /** 查無批次報表，請先執行「送出」 */
    public final String TX6007I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6007I.getCode();

    /** 批次執行中，稍後請查詢通知訊息以確認執行成功 */
    public final String TX6008I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6008I.getCode();

    /** 批次排成執行中 */
    public final String TX6009I = tw.gov.moi.rs.common.constant.RsCDMesg.TX6009I.getCode();

    /** 未執行備份作業,不可執行人口統計月報轉錄作業. */
    public final String TX6933E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6933E.getCode();

    /** 請先執行簿頁改換寫，再執行死亡登記. */
    public final String TX6934E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6934E.getCode();

    /** 申請人若是為房屋現住人，則必須為本地現住人口. */
    public final String TX6935E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6935E.getCode();

    /** 該戶口名簿封面編號已使用過，請重新輸入. */
    public final String TX6936E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6936E.getCode();

    /** 非正常國民身分證統一編號不得辦理死亡登記. */
    public final String TX6937E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6937E.getCode();

    /** 單方收養，養父和生母有婚姻關係，生母姓名不得為空白 */
    public final String TX6938E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6938E.getCode();

    /** 單方收養，生父和養母有婚姻關係，生父姓名不得為空白 */
    public final String TX6939E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6939E.getCode();

    /** 單方收養，養父和生母有婚姻關係，但養父之配偶姓名不等於生母姓名 */
    public final String TX6940E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6940E.getCode();

    /** 單方收養，生父和養母有婚姻關係，但生父之配偶姓名不等於養母姓名 */
    public final String TX6941E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6941E.getCode();

    /** 本戶口名簿發證後所載資料已異動 */
    public final String TX6942E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6942E.getCode();

    /** 僅役別欄異動 */
    public final String TX6943E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6943E.getCode();

    /** 所載資料已異動 */
    public final String TX6944E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6944E.getCode();

    /** 戶內人口大於20人，無法與其他登記兼辦. */
    public final String TX6946E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6946E.getCode();

    /** 原住地為大戶(共同事業戶或戶內含現住、非現住與死亡人口超過20人)之含戶長部分遷徙(撤銷)登記，須先執行戶長變更登記，再執行遷徙(撤銷)登記。 */
    public final String TX6947E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6947E.getCode();
    /** 原住地為大戶(共同事業戶或戶內含現住、非現住與死亡人口超過20人)之遷徙(撤銷)、須先執行簿頁改換寫(2700)，再執行遷徙(撤銷)登記。 */
    public final String TX6948E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6948E.getCode();

    /** 原住地為大戶(共同事業戶或戶內含現住、非現住與死亡人口超過20人)，無法與其他遷徙相關登記兼辦。 */
    public final String TX6949E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6949E.getCode();
    /**
     * 原住地為大戶(共同事業戶或戶內含現住、非現住與死亡人口超過20人)，含戶長之部分遷徙(撤銷)登記，須先做戶長變更登記(172A)再執行遷徙(撤銷)
     * 登記
     */
    public final String TX6950E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6950E.getCode();

    /**
     * 請確認是否已完成資料庫備份作業
     */
    public final String TX6951E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6951E.getCode();

    /** 本戶口名簿發證後，僅戶籍地址欄經行政區域調整、門牌整編異動 */
    public final String TX6006S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6006S.getCode();

    /** 所查驗請領日期，非本作業服務範圍 */
    public final String CH6101W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6101W.getCode();

    /** 請重新「列印掛失國民身分證申請紀錄表」. */
    public final String CH6102W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6102W.getCode();

    /**
     * 資料起迄不可跨月查詢
     */
    public final String CHD016W = tw.gov.moi.rs.common.constant.RsCDMesg.CHD016W.getCode();

    /**
     * 月報只可查詢上個月資料
     */
    public final String CH6103W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6103W.getCode();

    /** 目前戶籍大簿編輯只開放一次 */
    public final String CH6104W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6104W.getCode();
    /**
     * 批次排程作業已送出
     */
    public final String TX6007S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6007S.getCode();

    /** 該戶為大戶，辦理相關登記如遷徙、戶長變更、(撤銷)分(合)戶後，不可續辦登記。 */
    String TX6030W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6030W.getCode();

    /**
     * 該戶所代碼不得做此項作業
     */
    public final String TX6952E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6952E.getCode();

    /**
     * 己身統號第一碼不可為$
     */
    public final String TX6953E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6953E.getCode();

    /**
     * 委託人不可為申請人
     */
    public final String CH6040E = tw.gov.moi.rs.common.constant.RsCDMesg.CH6040E.getCode();

    /** 死亡日期小於遷入日期，請確認是否應先辦理撤銷遷徙登記. */
    public final String TX6029W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6029W.getCode();

    /** 所查之人非戶內人口，請刪除後再執行驗證查詢 */
    public final String TX6954E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6954E.getCode();

    /** 請確認姓為空白 */
    String TX6031W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6031W.getCode();

    /** 申請表單條碼值辨識失敗(008). */
    public final String TX6955E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6955E.getCode();

    /** 統號條碼辨識失敗(064). */
    public final String TX6956E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6956E.getCode();

    /** 統號條碼辨識失敗(192). */
    public final String TX6957E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6957E.getCode();

    /** 該員不符合改姓名條件. */
    public final String TX6958E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6958E.getCode();

    /** TX-6037-W=請確定個人基本資料已存在 */
    public final String TX6037W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6037W.getCode();

    /** TX-6038-W=請確認個人基本資料相關檔案已刪除 */
    public final String TX6038W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6038W.getCode();

    /** TX-6039-W=請確認個人基本資料及全戶動態記事已刪除 */
    public final String TX6039W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6039W.getCode();

    /** TX-6040-W=請確認全戶基本資料已存在 */
    public final String TX6040W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6040W.getCode();

    /** TX-6041-W=請確定除戶個人基本資料已存在 */
    public final String TX6041W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6041W.getCode();

    /** TX-6042-W=請確認除戶個人基本資料相關檔案已刪除 */
    public final String TX6042W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6042W.getCode();

    /** TX-6043-W=請確認除戶個人基本資料及除戶全戶動態記事已刪除 */
    public final String TX6043W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6043W.getCode();

    /** TX-6044-W=請確認除戶全戶基本資料已存在 */
    public final String TX6044W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6044W.getCode();

    /** 份數與單價必須大於0 */
    public final String TX6045W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6045W.getCode();

    /** 請確認已執行國民身分證處理狀況登錄作業 */
    public final String TX6048W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6048W.getCode();

    /** 請確認夫妻雙方懷孕事實後，給予登記結婚 */
    public final String TX6049W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6049W.getCode();

    /** 因附繳證件勾選了原戶口名簿，請確認請領種類正確勾選 . */
    public final String TX6050W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6050W.getCode();

    /** 單方收養，生父與養母無婚姻關係，父姓名列印旗標預設為雙橫線 . */
    public final String TX6051W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6051W.getCode();

    /** 單方收養，養父與生母無婚姻關係，母姓名列印旗標預設為雙橫線 . */
    public final String TX6052W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6052W.getCode();

    /** 戶內成員無出生地. */
    public final String CH6105W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6105W.getCode();

    /** 該被申請人在本次大宗戶籍謄本申請案件中，已經完成戶籍謄本製作. */
    public final String TX6046W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6046W.getCode();

    /** 請執行『完整出生地登錄作業』. */
    public final String TX6959E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6959E.getCode();

    /** 死亡(宣告)尚未辦理登記. */
    public final String TX6047W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6047W.getCode();

    /** 請至少選擇一筆資料. */
    public final String CH6106W = tw.gov.moi.rs.common.constant.RsCDMesg.CH6106W.getCode();

    /** 該選舉組合與投票日期已有資料，請執行回選舉主畫面執行清檔作業. */
    public final String TX6574W = tw.gov.moi.rs.common.constant.RsCDMesg.TX6574W.getCode();

    /** 此選舉組合與投票日期已設定投票所，不可複製投票所，請重新設定. */
    public final String TX6960E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6960E.getCode();

    /** 此統號尚未登錄空白證號. */
    public final String TX6961E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6961E.getCode();

    /** 此國民身分證統一編號已登錄膠膜號不可再登錄. */
    public final String TX6962E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6962E.getCode();

    /** 無法取得申請書資料. */
    public final String TX6963E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6963E.getCode();

    /** 當事人已為遷出人口，不得申請戶口名簿. */
    public final String TX6964E = tw.gov.moi.rs.common.constant.RsCDMesg.TX6964E.getCode();

    /** 所查驗戶口名簿戶籍資料沒有異動，為非現住人口狀態. */
    public final String TX6008S = tw.gov.moi.rs.common.constant.RsCDMesg.TX6008S.getCode();

    /** 關係人資料均為空值，必要時請輸入任一關係人統號姓名. */
    public final String CH6002I = tw.gov.moi.rs.common.constant.RsCDMesg.CH6002I.getCode();

}