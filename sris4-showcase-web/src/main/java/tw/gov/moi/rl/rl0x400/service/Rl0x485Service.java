package tw.gov.moi.rl.rl0x400.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x485DTO;

/**
 * 戶號配賦職權更正處理服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl0x485Service {

    static String FUNC_CODE = "RL0X321";

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    void initWebUI(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    void doQuery(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔
     * 
     * @param v2
     * @param target
     * @param exe
     * @return
     */
    public List<Rldfv002Type> getRldv002(Rl0x485DTO dto, ExecutantType exe);

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void setQueryResult(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得新戶號
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void addNewHouseId(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    public void lockData(Rl0x485DTO dto, ExecutantType exe);

    public void unlockData(Rl0x485DTO dto, ExecutantType exe);

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void cleanWebUI(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 重製頁面
     * 
     * @param quertUI
     *            查詢畫面
     * @param resultUI
     *            結果畫面
     * @param src
     *            預設值
     * @throws RisBusinessException
     */
    public void refreshUI(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    String getContentByCode(String[] category_code, ExecutantType exe);

    void doQueryAll(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;

    void verifyData(Rl0x485DTO dto, ExecutantType exe) throws RisBusinessException;
}
