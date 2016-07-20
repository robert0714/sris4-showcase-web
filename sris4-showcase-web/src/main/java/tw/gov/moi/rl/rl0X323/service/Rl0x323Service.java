package tw.gov.moi.rl.rl0X323.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x323DTO;

/**
 * 歷史門牌初編資料檔職權更正
 * 
 * @author Mego
 * 
 */
public interface Rl0x323Service {

    void loadRldfv007(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setQueryResult(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void lockData(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void unlockData(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void cleanWebUI(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

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
    @RisServiceMethod(MethodType.QUERY)
    public void refreshUI(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getUILeftValue(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getUIRightValue(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setCodeLabele(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 檢核資料是否已存在DB
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(Rl0x323DTO dto, ExecutantType exe) throws RisBusinessException;

}
