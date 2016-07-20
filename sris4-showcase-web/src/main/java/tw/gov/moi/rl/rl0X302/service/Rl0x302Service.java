package tw.gov.moi.rl.rl0X302.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x302DTO;

/**
 * 除戶全戶基本資料檔職權更正
 * 
 * @author Andy
 * 
 */
public interface Rl0x302Service {

    static String FUNC_CODE = "RL0X302";

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔
     * 
     * @param v2
     * @param target
     * @param exe
     * @return
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfv002Type> getRldv002(Rl0x302DTO dto, ExecutantType exe);

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setQueryResult(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得新統號
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void addNewId(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得新戶號
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void addNewHouseId(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得村里
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void addVillage(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void lockData(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void unlockData(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void cleanWebUI(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

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
    public void refreshUI(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf001hType getUILeftValue(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf001hType getUIRightValue(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setCodeLabele(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 產生個人記事
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void makeNoteForA(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 產生個人記事
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void makeNoteForD(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 產生個人記事
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void makeNoteForM(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkData(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.VERIFY)
    public void verifyDataEdit(Rl0x302DTO dto, ExecutantType exe) throws RisBusinessException;

}
