package tw.gov.moi.rl.rl03900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03910DTO;

/**
 * 全國個人概要資料查詢服務介面
 * 
 * @author David Wu
 */
public interface Rl03910Service {

    /** 執行「全國個人概要資料查詢」服務失敗 */
    final String DO_QUERY_ERROR = "執行「全國個人概要資料查詢」服務失敗";
    
    /** 執行「查詢個人詳細資料」服務失敗 */
    final String DO_QUERY_PERSON_DATA_ERROR = "執行「查詢個人詳細資料」服務失敗";
    
    /** 執行「全國個人概要資料申請查詢」服務失敗 */
    final String DO_APPLY_ERROR = "執行「全國個人概要資料申請查詢」服務失敗";
    
    /** 主管尚未簽核此次申請 */
    final String DO_APPLY_NOT_VERIFY = "主管尚未簽核此次申請";

    /** 主管核退此次申請 */
    final String DO_APPLY_REJECT = "主管核退此次申請，核退原因:";
    
    /** 執行「新增全國個人概要資料查詢紀錄」服務失敗 */
    final String ADD_QUERY_LOG_ERROR = "執行「新增全國個人概要資料查詢紀錄」服務失敗";
    
    /** 執行「發送通知訊息給主管簽核全國個人概要資料查詢申請」服務失敗 */
    final String INSERT_REMINDER_ERROR = "執行「發送通知訊息給主管簽核全國個人概要資料查詢申請」服務失敗";
    
    /**
     * 申請全國個人概要資料查詢
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.SAVE)
    public void doApply(final Rl03910DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 驗證申請全國個人概要資料查詢
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkApply(final Rl03910DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 全國個人概要資料查詢
     * 
     * @param dto Rl03910DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl03910DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 送通知訊息告知主管核准全國個人概要資料查詢申請
     * 
     * @param ExecutantType executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.SAVE)
    public void insertReminder(ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 查詢個人詳細資料
     * 
     * @param dto Rl03910DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryPersonData(final Rl03910DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 新增全國個人概要查詢紀錄
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.SAVE)
    public void addQueryLog(final Rl03910DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
