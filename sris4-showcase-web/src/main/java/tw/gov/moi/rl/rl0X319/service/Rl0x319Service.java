package tw.gov.moi.rl.rl0X319.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldfm09mType;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x319DTO;

/**
 * 戶號配賦職權更正處理服務介面
 * 
 * @author Peter
 * 
 */
public interface Rl0x319Service {

    static String FUNC_CODE = "RL0X319";

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔
     * 
     * @param v2
     * @param target
     * @param exe
     * @return
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfv002Type> getRldv002(Rl0x319DTO dto, ExecutantType exe);

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setQueryResult(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void cleanWebUI(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

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
    public void refreshUI(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldfm09mType getUILeftValue(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldfm09mType getUIRightValue(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setCodeLabele(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    String getContentByCode(String[] category_code, ExecutantType exe);

    @RisServiceMethod(MethodType.QUERY)
    void doQueryAll(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    void lockData(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    void unlockData(Rl0x319DTO dto, ExecutantType exe) throws RisBusinessException;

}
