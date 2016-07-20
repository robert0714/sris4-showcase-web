package tw.gov.moi.rl.rl03900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03920DTO;

/**
 * 全國個人概要資料查詢核准服務介面
 * 
 * @author David Wu
 */
public interface Rl03920Service {

    /** 執行「全國個人概要資料查詢申請」服務失敗 */
    final String DO_QUERY_ERROR = "執行「全國個人概要資料申請」服務失敗";

    /** 執行「全國個人概要資料查詢申請」服務失敗 */
    final String DO_VERIFY_ERROR = "執行「全國個人概要資料查詢核准」服務失敗";

    /** 執行「送通知訊息告知戶籍員，主管已簽核全國個人概要資料查詢申請」服務失敗 */
    final String INSERT_REMINDER_ERROR = "執行「送通知訊息告知戶籍員，主管已簽核全國個人概要資料查詢申請」服務失敗";
    
    /**
     * 全國個人概要資料查詢申請
     * 
     * @param dto Rl03920DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl03920DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 全國個人概要資料查詢核准
     * 
     * @param dto Rl03920DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    @WorkStatus(FinalType.FINAL)
    public void doVerify(final Rl03920DTO dto, final ExecutantType executantType) throws RisBusinessException;
//    
//    /**
//     * 送通知訊息告知戶籍員，主管已簽核全國個人概要資料查詢申請
//     * 
//     * @param dto
//     * @param ExecutantType executantType
//     * @throws RisBusinessException
//     */
//    @RisServiceMethod(MethodType.SAVE)
//    public void insertReminder(final Rl03920DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
