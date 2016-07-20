package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.dto.XLDFRemoveHouseholdDTO;
import tw.gov.moi.rl.component.dto.XLDFRemoveAsyncParam;

/**
 * 除戶簿頁資料處理共用元件介面.
 * 
 * @author JL
 * 
 */
public interface HouseholdRemoveProcessComponent {

    /**
     * 將全戶基本資料搬到除戶全戶基本資料.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶基本資料搬到除戶全戶基本資料」失敗
     */
    void moveRldf001mToRldf001h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將全戶動態記事搬到除戶全戶動態記事.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶動態記事搬到除戶全戶動態記事」失敗
     */
    void moveRldf002mToRldf002h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人基本資料搬到除戶個人基本資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人基本資料搬到除戶個人基本資料」失敗
     */
    void moveRldf004mToRldf004h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人記事搬到除戶個人記事.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人記事搬到除戶個人記事」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf005mToRldf005h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人遷徙紀錄搬到除戶個人遷徙紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人遷徙紀錄搬到除戶個人遷徙紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf006mToRldf006h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將姓名更改紀錄搬到除戶姓名更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將姓名更改紀錄搬到除戶姓名更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf007mToRldf007h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將特殊人口資料搬到除戶特殊人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將特殊人口資料搬到除戶特殊人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf008mToRldf008h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將限制遷徙人口資料搬到除戶限制遷徙人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將限制遷徙人口資料搬到除戶限制遷徙人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf010mToRldf010h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將姓名羅馬拼音紀錄搬到除戶姓名羅馬拼音紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將姓名羅馬拼音紀錄搬到除戶姓名羅馬拼音紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf047mToRldf047h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將登記婚前結(離)婚證明書資料搬到除戶登記婚前結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將登記婚前結(離)婚證明書資料搬到除戶登記婚前結(離)婚證明書資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf087tToRldf087h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將結(離)婚證明書資料搬到除戶結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將結(離)婚證明書資料搬到除戶結(離)婚證明書資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf088tToRldf088h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將英文結(離)婚證明書資料搬到除戶英文結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將英文結(離)婚證明書資料搬到除戶英文結(離)婚證明書資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldf089tToRldf089h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人基本資料搬到除戶個人基本資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人基本資料搬到除戶個人基本資料」失敗
     */
    void copyRldf004mToRldf004H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人記事搬到除戶個人記事.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人記事搬到除戶個人記事」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf005mToRldf005H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人遷徙紀錄搬到除戶個人遷徙紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人遷徙紀錄搬到除戶個人遷徙紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf006mToRldf006H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將姓名更改紀錄搬到除戶姓名更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將姓名更改紀錄搬到除戶姓名更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf007mToRldf007H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將特殊人口資料複製到除戶特殊人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將特殊人口資料複製到除戶特殊人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf008mToRldf008H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將限制遷徙人口資料複製到除戶限制遷徙人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將限制遷徙人口資料複製到除戶限制遷徙人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf010mToRldf010H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將姓名羅馬拼音紀錄搬到除戶姓名羅馬拼音紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將姓名羅馬拼音紀錄搬到除戶姓名羅馬拼音紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldf047mToRldf047H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除特殊人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除特殊人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldf008m(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除限制遷徙人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除限制遷徙人口資料」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldf010m(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除國民身分證列印旗標資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除所內記事」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldfm12m(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除所內記事.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除所內記事」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldf030m(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除他所行政協助所內記事.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除所內記事」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldf030t(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將現戶簿頁之個人資料搬到除戶簿頁.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將現戶簿頁之個人資料搬到除戶簿頁」失敗
     */
    void moveCurrentToRemove(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將現戶簿頁之個人資料搬到除戶簿頁.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @param processXldf004m
     *            是否要處理4M
     * @throws RisBusinessException
     *             「將現戶簿頁之個人資料搬到除戶簿頁」失敗
     */
    void moveCurrentToRemove(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info, boolean processXldf004m)
            throws RisBusinessException;

    /**
     * 將現戶簿頁之個人資料搬到除戶簿頁.(新版)
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @param processXldf004m
     *            是否要處理4M
     * @throws RisBusinessException
     *             「將現戶簿頁之個人資料搬到除戶簿頁」失敗
     */
    void moveCurrentToRemoveNew(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info, boolean processXldf004m)
            throws RisBusinessException;

    /**
     * 以現戶簿頁之個人資料產生除戶簿頁.(新版)
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @param ifProcessXldf004m
     *            是否處理Xldf004M下除戶作業
     * @throws RisBusinessException
     *             「以現戶簿頁之個人資料產生除戶簿頁」失敗
     */
    void copyCurrentToRemoveNew(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info,
            final boolean ifProcessXldf004m) throws RisBusinessException;

    /**
     * 將現戶簿頁之主要個人資料搬到除戶簿頁.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將現戶簿頁之主要個人資料搬到除戶簿頁」失敗
     */
    void moveCurrentToRemoveLight(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將現戶簿頁之主要個人資料搬到除戶簿頁.(新版通報程式)
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將現戶簿頁之主要個人資料搬到除戶簿頁」失敗
     */
    void moveCurrentToRemoveLightNew(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 以現戶簿頁之個人資料產生除戶簿頁.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「以現戶簿頁之個人資料產生除戶簿頁」失敗
     */
    void copyCurrentToRemove(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 以現戶簿頁之個人資料產生除戶簿頁.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @param ifProcessXldf004m
     *            是否處理Xldf004M下除戶作業
     * @throws RisBusinessException
     *             「以現戶簿頁之個人資料產生除戶簿頁」失敗
     */
    void copyCurrentToRemove(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info,
            final boolean ifProccessXldf004m) throws RisBusinessException;

    /**
     * 以現戶簿頁之主要個人資料產生除戶簿頁
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「以現戶簿頁之主要個人資料產生除戶簿頁」失敗
     */
    void copyCurrentToRemoveLight(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 刪除保護家庭暴力資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「刪除保護家庭暴力資料」失敗
     */
    List<XLDFRemoveAsyncParam> deleteRldf049m(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將出生資料搬到除戶出生資料.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將出生資料搬到除戶出生資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm01mToRldfm01h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將婚姻紀錄搬到除戶婚姻紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將婚姻紀錄搬到除戶婚姻紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm02mToRldfm02h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將統號更改紀錄搬到除戶統號更改紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將統號更改紀錄搬到除戶統號更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm03mToRldfm03h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將收養紀錄搬到除戶收養紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將收養紀錄搬到除戶收養紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm04mToRldfm04h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm05mToRldfm05h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm06mToRldfm06h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm08mToRldfm08h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將出生日期更改紀錄.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將出生日期更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm09mToRldfm09h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人申請書紀錄搬到除戶個人申請書紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人申請書紀錄搬到除戶個人申請書紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm10mToRldfm10h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人姓氏資料搬到除戶個人姓氏資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人姓氏資料搬到除戶個人姓氏資料」失敗
     */
    List<XLDFRemoveAsyncParam> getMoveRldfm11mToRldfm11h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將出生資料複製到除戶出生資料.
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人基本資料搬到除戶個人基本資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm01mToRldfm01H(XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將出生資料複製到除戶出生資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人基本資料搬到除戶個人基本資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm01mToRldfm01H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將婚姻紀錄複製到除戶婚姻紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將婚姻紀錄複製到除戶婚姻紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm02mToRldfm02H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將統號更改紀錄搬到除戶統號更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將統號更改紀錄搬到除戶統號更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm03mToRldfm03H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將收養紀錄搬到除戶收養紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將收養紀錄搬到除戶收養紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm04mToRldfm04H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將監護、輔助、未成年子女權利義務行使負擔資料搬到除戶監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm05mToRldfm05H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將國民身分證掛失紀錄搬到除戶國民身分證掛失紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm06mToRldfm06H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將監護、輔助、未成年子女權利義務行使負擔紀錄搬到除戶監護、輔助、未成年子女權利義務行使負擔紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm08mToRldfm08H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將出生日期更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將出生日期更改紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm09mToRldfm09H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人申請書紀錄複製到除戶個人申請書紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人申請書紀錄複製到除戶個人申請書紀錄」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm10mToRldfm10H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人姓氏資料複製到除戶個人姓氏資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將個人姓氏資料複製到除戶個人姓氏資料」失敗
     */
    List<XLDFRemoveAsyncParam> getCopyRldfm11mToRldfm11H(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將全戶基本資料複製到除戶全戶基本資料
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶基本資料複製到除戶全戶基本資料」失敗
     */
    void copyRldf001mToRldf001h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info);

    /**
     * 將全戶記事複製到除戶全戶記事
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶記事複製到除戶全戶記事」失敗
     */
    void copyRldf002mToRldf002h(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info);

    /**
     * 將遷入地除口且為遷徙當事人下除戶
     * 
     * @param conn
     *            DB連線
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將遷入地除口且為遷徙當事人下除戶」失敗
     */
    void moveMtoHforInplacePeople(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info);

    /**
     * 將個人基本相關資料刪除 全部版本, 刪除的Table請參考massMoveContext.xml的 deletePersonAllMap
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶基本資料搬到除戶全戶基本資料」失敗
     */
    void deletePersonCurrentAll(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將全戶基本資料搬到除戶全戶基本資料. 資料刪除的Table 參考massMoveContext.xml的 rlHouseholdRemoveMap
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶基本資料搬到除戶全戶基本資料」失敗
     */
    void deleteHouseholdCurrentAll(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 將個人基本資料刪除 light版本. 範圍MXXM,87 88 89 參考massMoveContext.xml的
     * deletePersonLightMap
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「將全戶基本資料搬到除戶全戶基本資料」失敗
     */
    void deletePersonCurrentLight(DBSMain conn, XLDFRemoveHouseholdDTO param, ExecutantType info)
            throws RisBusinessException;
}
