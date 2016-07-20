package tw.gov.moi.rl.rl0X325.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x325DTO;

/**
 * 歷史門牌初編資料檔職權更正
 * 
 * @author Mego
 * 
 */
public interface Rl0x325Service {

    final String[] PK_FIELD = new String[] { "siteId", "village", "neighbor", "streetDoorplate" };

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */

    void initWebUI(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */

    public void setQueryResult(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    public void lockData(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    public void unlockData(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */

    public void cleanWebUI(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

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

    public void refreshUI(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */

    public void getUILeftValue(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */

    public void getUIRightValue(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */

    public void setCodeLabele(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 檢核資料是否已存在DB
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(Rl0x325DTO dto, ExecutantType exe) throws RisBusinessException;

}
