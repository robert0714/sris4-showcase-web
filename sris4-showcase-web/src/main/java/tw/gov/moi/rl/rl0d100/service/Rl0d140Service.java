package tw.gov.moi.rl.rl0d100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0d140DTO;

/**
 * 空白國民身分證使用狀況登錄服務介面.
 * 
 * @author 劉嘉煒
 * 
 */
public interface Rl0d140Service {

    /** 執行「取得空白國民身分證/膠膜使用狀況登錄查詢處理」服務失敗 */
    final String DO_QUERY_ERROR = "執行「取得空白國民身分證/膠膜使用狀況登錄查詢處理」服務失敗";

    /** 執行「更新空白國民身分證/膠膜使用狀況登錄存檔處理」服務失敗 */
    final String DO_SAVE_ERROR = "執行「更新空白國民身分證/膠膜使用狀況登錄存檔處理」服務失敗";

    /**
     * Verify data.
     * 
     * @param rl0d140DTO
     *            the rl0d140 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0d140DTO rl0d140DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Save data.
     * 
     * @param rl0d140DTO
     *            the rl0d140 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0d140DTO rl0d140DTO, final ExecutantType executantType) throws RisBusinessException;

    // @RisServiceMethod(MethodType.QUERY)
    public void getCount(final Rl0d140DTO rl0d140DTO, final ExecutantType executantType) throws RisBusinessException;
}
