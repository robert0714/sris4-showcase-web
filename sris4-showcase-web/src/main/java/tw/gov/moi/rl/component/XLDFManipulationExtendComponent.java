package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Map;


import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.XLDFChangeParams;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFMassChangeParam;
import tw.gov.moi.rl.component.dto.XLDFOperationCreationParams;
import tw.gov.moi.rl.component.dto.XLDFQueryParams;
import tw.gov.moi.rl.component.dto.XLDFTransaction;
import tw.gov.moi.rl.component.dto.XLDFTransactionOperation;
import tw.gov.moi.rl.component.dto.XLDFTransactionParams;
import tw.gov.moi.rl.component.dto.XLDFTxnPersonCreationParams;
import tw.gov.moi.rl.component.dto.XLDFUpdateInsertedParams;
import tw.gov.moi.rl.domain.Rl0a300DTO;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * XLDF操作共用元件介面.
 * 
 * @author JL
 */
public interface XLDFManipulationExtendComponent {

    /**
     * 建立XLDF的交易物件.
     * 
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立XLDF交易設定參數
     * @return 傳回產生的XLDF交易物件
     * @throws RisBusinessException
     *             「交易已存在」、「查無當事人資料」、「鎖定當事人資料失敗」、「寫入交易當事人失敗
     */
    XLDFTransaction createTransaction(final DBSMain conn, final ExecutantType executantType,
            final XLDFTransactionParams params) throws RisBusinessException;

    /**
     * 取得最新的XLDF的交易物件.
     * 
     * @param conn
     * @param executantType
     * @return 傳回產生的XLDF交易物件
     * @throws RisBusinessException
     */
    XLDFTransaction getXLDFTransaction(final DBSMain conn, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 建立作業的原始狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立XLDF設定參數
     * @param XLDFTransaction
     *            交易主檔
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序無效」、「作業編號不存在」、「資料已被刪除」、「資料鎖定失敗」、「
     *             找不到RLDF資料來源」、
     */
    <E extends XLDFDomainObject> E createOriginXLDF(ExecutantType executantType, XLDFCreationParams params,
            XLDFTransaction transMaster) throws RisBusinessException;

    /**
     * 建立作業的原始狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立XLDF設定參數
     * @param XLDFTransaction
     *            交易主檔
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序無效」、「作業編號不存在」、「資料已被刪除」、「資料鎖定失敗」、「
     *             找不到RLDF資料來源」、
     */
    <E extends XLDFDomainObject> E createOriginXLDF(DBSMain conn, ExecutantType executantType,
            XLDFCreationParams params, final XLDFTransaction transMaster) throws RisBusinessException;

    /**
     * 建立作業的原始狀態之XLDF.(獨立TXN)
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立XLDF設定參數
     * @param XLDFTransaction
     *            交易主檔
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序無效」、「作業編號不存在」、「資料已被刪除」、「資料鎖定失敗」、「
     *             找不到RLDF資料來源」、
     */
    <E extends XLDFDomainObject> E createOriginXLDF_oldSingleTxn(ExecutantType executantType,
            XLDFCreationParams params, final XLDFTransaction transMaster) throws RisBusinessException;

    /**
     * 建立作業的變更狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            變更XLDF設定參數
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序不存在」、「變更動作無效」、「資料未鎖定」、「找不到原始狀態的領域物件」、
     *             「資料已被刪除」
     */
    <E extends XLDFDomainObject> E createChangeXLDF(DBSMain conn, ExecutantType executantType,
            XLDFChangeParams<E> params) throws RisBusinessException;

    /**
     * 建立作業的變更狀態之XLDF.withe single connection
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            變更XLDF設定參數
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序不存在」、「變更動作無效」、「資料未鎖定」、「找不到原始狀態的領域物件」、
     *             「資料已被刪除」
     */
    <E extends XLDFDomainObject> E createChangeXLDF(XLDFChangeParams<E> params, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 建立作業的變更狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            變更XLDF設定參數
     * @param accessGroupList
     *            List<XldfopracsType>
     * @return XLDFMassChangeParam
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序不存在」、「變更動作無效」、「資料未鎖定」、「找不到原始狀態的領域物件」、
     *             「資料已被刪除」
     */
    <E extends XLDFDomainObject> XLDFMassChangeParam createChangeXLDF(DBSMain conn, ExecutantType executantType,
            XLDFChangeParams<E> params, Map<String, Map<String, String>> accessGroupList) throws RisBusinessException;

    /**
     * 建立作業的變更狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            變更XLDF設定參數
     * @param accessGroupList
     *            List<XldfopracsType>
     * @return XLDFMassChangeParam
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序不存在」、「變更動作無效」、「資料未鎖定」、「找不到原始狀態的領域物件」、
     *             「資料已被刪除」
     */
    <E extends XLDFDomainObject> XLDFMassChangeParam getCreateChangeXLDF(DBSMain conn, ExecutantType executantType,
            XLDFChangeParams<E> params, Map<String, Map<String, String>> accessGroupList) throws RisBusinessException;

    /**
     * 建立XLDF的作業物件.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立交易作業XLDF設定參數
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「交易作業寫入錯誤」、「交易不存在」、「作業順序無效」、「作業編號不存在」
     */
    XLDFTransactionOperation createOperation(DBSMain conn, ExecutantType executantType,
            XLDFOperationCreationParams params) throws RisBusinessException;

    /**
     * 建立作業的原始狀態之交易當事人XLDF.
     * 
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立交易當事人XLDF設定參數
     * @return 傳回產生的XLDF domain object
     * @throws RisBusinessException
     *             「XLDF寫入錯誤」、「交易不存在」、「作業順序無效」、「作業編號不存在」、「交易當事人已被刪除」
     */
    XLDFDomainObject createOriginTxnPersonXLDF(DBSMain conn, ExecutantType executantType,
            XLDFTxnPersonCreationParams params) throws RisBusinessException;

    /**
     * 取得作業原始狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @return 傳回XLDF domain object
     * @throws RisBusinessException
     *             「找不到讀取動作的XLDF領域物件」、「交易不存在」、「作業順序不存在」
     */
    <E extends XLDFDomainObject> E getOriginXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params)
            throws RisBusinessException;

    /**
     * 取得作業變更狀態之XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @return 傳回XLDF domain object
     * @throws RisBusinessException
     *             「找不到XLDF領域物件」、「交易不存在」、「作業順序不存在」、「XLDF領域物件動作不正確」、「新增XLDF領域物件後，
     *             不應對它進行其它動作」
     */
    <E extends XLDFDomainObject> E getChangeXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params)
            throws RisBusinessException;

    /**
     * lock XLDF.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @throws RisBusinessException
     *             「交易不存在」、「資料已存在異動資料」
     */
    void lockOriginXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params) throws RisBusinessException;

    /**
     * 取得XLDF的交易物件.
     * 
     * @param conn
     *            資料庫連線
     * @param trans
     *            XLDF的交易物件
     * @param executantType
     *            執行環境設定參數
     * @throws RisBusinessException
     *             [交易不存在]
     */
    void readTransaction(DBSMain conn, XLDFTransaction trans, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得作業合併原始與變更狀態的XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @return 傳回XLDF domain object
     * @throws RisBusinessException
     *             「找不到XLDF領域物件」、「交易不存在」、「作業順序不存在」、「XLDF領域物件動作不正確」、「新增XLDF領域物件後，
     *             不應對它進行其它動作」
     */
    <E extends XLDFDomainObject> E getMergedXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params)
            throws RisBusinessException;

    /**
     * 更新作業原始狀態的XLDF.
     * 
     * @param <E>
     *            XLDFDomainObject
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @return 傳回修正後的XLDF domain object
     * @throws RisBusinessException
     *             「作業順序不存在」、「資料未鎖定」、「找不到前行作業的XLDF領域物件」、「新增動作不需要更新原始狀態」
     */
    <E extends XLDFDomainObject> E updateOriginXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params)
            throws RisBusinessException;

    /**
     * 增加交易當事人到交易戶籍當事人.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param domainObj
     *            增加交易當事人到交易戶籍當事人
     * @throws RisBusinessException
     *             「交易不存在」、「當事人XLDF領域物件不存在」「新增交易當事人索引失敗」
     */
    <E extends XLDFDomainObject> void appendTransactionParson(DBSMain conn, ExecutantType executantType, E domainObj)
            throws RisBusinessException;

    /**
     * 刪除作業所有的XLDF.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param operationSequenceId
     *            作業順序編號
     * @throws RisBusinessException
     *             「交易不存在」、「作業順序不存在」、「XLDF領域物件記錄刪除錯誤」、「作業存取記錄刪除錯誤」、「交易作業記錄刪除錯誤」
     */
    void deleteOperationXLDF(DBSMain conn, ExecutantType executantType, Integer operationSequenceId)
            throws RisBusinessException;

    /**
     * 刪除作業所有變更的XLDF.(除了罰鍰處理資料:XLDF009E,XLDE009E,XLDFU002,XLDFU003)
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param operationSequenceId
     *            作業順序編號
     * @param keepFineData
     *            是否保存罰鍰處理資料
     * @return the int
     * @throws RisBusinessException
     *             「交易不存在」、「作業順序不存在」
     */
    void deleteChangeXLDF(DBSMain conn, ExecutantType executantType, Integer operationSequenceId, boolean keepFineData)
            throws RisBusinessException;

    /**
     * 刪除作業所有變更的XLDF.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param operationSequenceId
     *            作業順序編號
     * @return the int
     * @throws RisBusinessException
     *             「交易不存在」、「作業順序不存在」
     */
    void deleteChangeXLDF(DBSMain conn, ExecutantType executantType, Integer operationSequenceId)
            throws RisBusinessException;

    /**
     * 刪除作業所有變更的XLDF.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @throws RisBusinessException
     *             「交易不存在」、「作業順序不存在」
     */
    void deleteChangeXLDF(DBSMain conn, ExecutantType executantType, XLDFQueryParams params)
            throws RisBusinessException;

    /**
     * 套用全部作業的變更.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param unLock
     *            解鎖
     * @throws RisBusinessException
     *             「交易不存在」
     */
    //void applyChanges(DBSMain conn, ExecutantType executantType, boolean unLock) throws RisBusinessException;
    
    /**
     * 套用全部作業的變更.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param unLock
     *            解鎖
     * @throws RisBusinessException
     *             「交易不存在」
     * ps.2014.02.13版本
     */
    void applyChanges(ExecutantType executantType, boolean unLock) throws RisBusinessException;
    /**
     * 套用全部作業的變更.(給階段三 規費處理使用)
     * 
     * @param executantType
     *            執行環境設定參數
     * @param unLock
     *            解鎖
     * @throws RisBusinessException
     *             「交易不存在」
     */
    void applyChangesForPhase3(final Rl0a300DTO dto, ExecutantType executantType, boolean unLock)
            throws RisBusinessException;

    /**
     * 套用全部作業的變更.(測試 新版下除戶與儲存 包通報)
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @param unLock
     *            解鎖
     * @throws RisBusinessException
     *             「交易不存在」
     */
    //void applyChangesTest(DBSMain conn, ExecutantType executantType, boolean unLock) throws RisBusinessException;

    /**
     * 取銷全部作業的變更.
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @throws RisBusinessException
     *             「交易不存在」
     */
    void undoChanges(DBSMain conn, ExecutantType executantType) throws RisBusinessException;

    /**
     * 依過濾比對條件取得XLDF領域物件清單.
     * 
     * @param conn
     *            資料庫連線
     * @param filter
     *            過濾條件比較運算子
     * @param operationSequenceId
     *            需要過濾的作業順序
     * @param executantType
     *            執行環境設定參數
     * @return
     * @throws RisBusinessException
     *             「未指定過濾條件」、「作業順序不存在」
     */
    List<? extends XLDFDomainObject> filterXLDF(DBSMain conn, XLDFFilterComparator filter, Integer operationSequenceId,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 依過濾比對條件取得XLDF領域物件清單.
     * 
     * @param conn
     *            資料庫連線
     * @param filter
     *            過濾條件比較運算子
     * @param operationSequenceId
     *            需要過濾的作業順序
     * @param accessRecord
     *            List<XldfopracsType>
     * @param executantType
     *            執行環境設定參數
     * @return
     * @throws RisBusinessException
     *             「未指定過濾條件」、「作業順序不存在」
     */
    List<? extends XLDFDomainObject> filterXLDF(DBSMain conn, XLDFFilterComparator filter, Integer operationSequenceId,
            ExecutantType executantType, List<XldfopracsType> accessRecord) throws RisBusinessException;

    /**
     * 依過濾比對條件取得XLDF領域物件清單.
     * 
     * @param conn
     *            資料庫連線
     * @param filter
     *            過濾條件比較運算子
     * @param operationSequenceId
     *            需要過濾的作業順序
     * @param executantType
     *            執行環境設定參數
     * @return
     * @throws RisBusinessException
     *             「未指定過濾條件」、「作業順序不存在」
     */
    List<? extends XLDFDomainObject> filterXLDF(DBSMain conn, XLDFDomainFilterComparator filter,
            Integer operationSequenceId, ExecutantType executantType) throws RisBusinessException;

    /**
     * 依過濾比對條件取得已刪除的XLDF領域物件鍵值清單.
     * 
     * @param conn
     *            資料庫連線
     * @param filter
     *            過濾條件比較運算子
     * @param operationSequenceId
     *            需要過濾的作業順序
     * @param executantType
     *            執行環境設定參數
     * @return 已刪除的XLDF領域物件鍵值清單
     * @throws RisBusinessException
     *             「未指定過濾條件」、「作業順序不存在」
     */
    List<? extends XLDFDomainObject> filterDeletedXLDF(DBSMain conn, XLDFFilterComparator filter,
            Integer operationSequenceId, ExecutantType executantType) throws RisBusinessException;

    /**
     * 依過濾比對條件取得已刪除的XLDF領域物件鍵值清單.
     * 
     * @param conn
     *            資料庫連線
     * @param filter
     *            過濾條件比較運算子
     * @param operationSequenceId
     *            需要過濾的作業順序
     * @param executantType
     *            執行環境設定參數
     * 
     * @param accessRecord
     *            List<XldfopracsType>
     * @return 已刪除的XLDF領域物件鍵值清單
     * @throws RisBusinessException
     *             「未指定過濾條件」、「作業順序不存在」
     */
    List<? extends XLDFDomainObject> filterDeletedXLDF(DBSMain conn, XLDFFilterComparator filter,
            Integer operationSequenceId, ExecutantType executantType, List<XldfopracsType> accecsRecords)
            throws RisBusinessException;

    /**
     * 結束XLDF交易
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @throws RisBusinessException
     */
    //void closeTransaction(DBSMain conn, ExecutantType executantType) throws RisBusinessException;

    /**
     * 移除XLDF交易
     * 
     * @param conn
     *            資料庫連線
     * @param executantType
     *            執行環境設定參數
     * @throws RisBusinessException
     */
    void removeTransaction(DBSMain conn, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得最後一筆的SequenceId.
     * 
     * @param executantType
     *            執行環境設定參數
     * @return integer
     * @throws RisBusinessException
     */
    Integer getLastOperationSequence(ExecutantType executantType) throws RisBusinessException;

    /**
     * 更新作業新增動作的XLDF領域物件.
     * 
     * @param conn
     *            資料庫連線
     * @param params
     *            更新新增動作XLDF設定參數
     * @param info
     *            執行環境設定參數
     * @return XLDFDomainObject
     * @throws RisBusinessException
     *             TX-6310-E「交易不存在」、TX-6316-E「作業順序不存在」、
     *             TX-6324-E「找不到XLDF領域物件」、TX-6548-E「XLDF領域物件不是變更狀態或非新增動作」
     */
    XLDFDomainObject updateInsertedXLDF(DBSMain conn, XLDFUpdateInsertedParams params, ExecutantType info)
            throws RisBusinessException;

    /**
     * 寫unlock record
     * 
     * @param conn
     *            資料庫連線
     * @param dataEntity
     *            被鎖定的資料
     * @param info
     *            執行環境設定參數
     * @return XLDFDomainObject
     * @throws RisBusinessException
     * 
     */
    void writeUnlockRecord(DBSMain conn, Object dataEntity, String tableName, String key, final String dSiteId,
            ExecutantType info) throws RisBusinessException;

    /**
     * 包XLDFYXXXM/XLDFYXXXDM 個人記事欄位化的OBNFDTO
     * 
     * @param seqId
     * @param info
     * @throws RisBusinessException
     */
    List<ObnfDTO> doMakeXldfyDataOnbf(Map<String, List<XldfopracsType>> accessMap, final Integer seqId,
            ExecutantType info) throws RisBusinessException;

    /**
     * Apply changes test.
     *
     * @param executantType the executant type
     * @param unLock the un lock
     * @throws RisBusinessException the ris business exception
     */
    void applyChangesTest(final ExecutantType executantType, final boolean unLock) throws RisBusinessException;
}
