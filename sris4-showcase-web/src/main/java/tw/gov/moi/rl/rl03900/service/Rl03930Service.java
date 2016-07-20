package tw.gov.moi.rl.rl03900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03930DTO;

/**
 * 全國個人概要資料查詢紀錄服務介面
 * 
 * @author David Wu
 */
public interface Rl03930Service {

    /** 執行「全國個人概要資料查詢紀錄」服務失敗 */
    final String DO_QUERY_ERROR = "執行「全國個人概要資料查詢紀錄」服務失敗";

    /**
     * 全國個人概要資料查詢紀錄
     * 
     * @param dto
     *            Rl03930DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl03930DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
