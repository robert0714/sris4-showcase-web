package tw.gov.moi.rl.rl0X326.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rcdf001mrlType;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x326DTO;

/**
 * 全國個人資料摘要檔
 * 
 * @author Andy
 * 
 */
public interface Rl0x326Service {

    static String FUNC_CODE = "RL0X326";

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    void initWebUI(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    void doQuery(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    void doApply(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    void doEditApply(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔
     * 
     * @param v2
     * @param target
     * @param exe
     * @return
     */
    public List<Rldfv002Type> getRldv002(Rl0x326DTO dto, ExecutantType exe);

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void setQueryResult(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得新統號
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void addNewHouseId(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSumit(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doReject(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    public void lockData(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    public void unlockData(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void cleanWebUI(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

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
    public void refreshUI(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public Rcdf001mrlType getUILeftValue(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public Rcdf001mrlType getUIRightValue(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void setCodeLabele(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 資料驗證
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void verifyData(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

    public void verifyDataEdit(Rl0x326DTO dto, ExecutantType exe) throws RisBusinessException;

}