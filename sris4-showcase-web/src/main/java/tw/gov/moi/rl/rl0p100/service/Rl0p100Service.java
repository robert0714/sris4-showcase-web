package tw.gov.moi.rl.rl0p100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0p100DTO;

/**
 * 
 * 護照申請親辦登記處理服務介面
 * 
 * @author Mego Peng
 * 
 */

public interface Rl0p100Service {

    /**
     * 查詢護照申請親辦登記資料
     * 
     * @param Rl0p100DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行作業失敗(TX-6397-E) 查詢護照申請親辦登記資料
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(Rl0p100DTO rl0p100DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存護照申請親辦登記資料
     * 
     * @param Rl0p100DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行作業失敗(TX-6397-E) 儲存護照申請親辦登記資料
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl0p100DTO rl0p100DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢護照申請親辦登記資料
     * 
     * @param Rl0p100DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行作業失敗(TX-6397-E) 查詢護照申請親辦登記資料
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyTwentyOld(Rl0p100DTO rl0p100DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢護照申請親辦登記資料
     * 
     * @param Rl0p100DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行作業失敗(TX-6397-E) 查詢護照申請親辦登記資料
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getRelation(Rl0p100DTO rl0p100DTO, ExecutantType executantType) throws RisBusinessException;
}
