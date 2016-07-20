package tw.gov.moi.rl.rl0X318.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldfm03hType;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x318DTO;

public interface Rl0x318Service {

    static String FUNC_CODE = "RL0X318";

    /**
     * 初始化畫面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔
     * 
     * @param v2
     * @param target
     * @param exe
     * @return
     */
    @RisServiceMethod(MethodType.QUERY)
    List<Rldfv002Type> getRldv002(final Rl0x318DTO dto, final ExecutantType exe);

    /**
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void setQueryResult(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得新統號
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void addNewId(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 核准
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSumit(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 核退
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doReject(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    void lockData(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    void unlockData(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void cleanWebUI(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

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
    void refreshUI(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rldfm03hType getUILeftValue(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rldfm03hType getUIRightValue(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void setCodeLabele(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

    @RisServiceMethod(MethodType.VERIFY)
    void verifyDataEdit(final Rl0x318DTO dto, final ExecutantType exe) throws RisBusinessException;

}
