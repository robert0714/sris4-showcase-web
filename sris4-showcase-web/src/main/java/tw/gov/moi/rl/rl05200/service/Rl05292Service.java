package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05292DTO;

/**
 * 全民健保資料回覆狀況查詢作業處理服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl05292Service {
    /**
     * 查詢全民健保資料回覆狀況
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl05292DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(final Rl05292DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 下載檔案URL
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl05292DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void insertRld048m(Rl05292DTO dto, ExecutantType executantType) throws RisBusinessException;

}
