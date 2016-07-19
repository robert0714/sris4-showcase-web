package tw.gov.moi.rl.rl0X461.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x461DTO;

/**
 * 收養登記申請書職權更正介面
 * 
 * @author Mego Peng
 * 
 */
public interface Rl0x461Service {

    /**
     * 初始化畫面
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 鎖定資料
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void lockData(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void setQueryResult(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 代碼顯示內容
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void setCodeLabele(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 驗證資料
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 申請職權更正
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 核准
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSumit(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 核退
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doReject(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 編輯職權更正
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyDataEdit(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 申請職權更正修改
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 解鎖資料
     * 
     * @param pRl0x461DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    void unlockData(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 重製頁面
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void refreshUI(final Rl0x461DTO pRl0x461DTO, final ExecutantType pExecutantType);

    /**
     * 取得畫面左邊內容內容
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getUIRightValue(final Rl0x461DTO pRl0x461DTO, final ExecutantType exe);

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void cleanWebUI(Rl0x461DTO dto, ExecutantType exe) throws RisBusinessException;

}
