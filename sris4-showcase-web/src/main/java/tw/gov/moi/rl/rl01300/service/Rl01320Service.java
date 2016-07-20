package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.dto.rl01300.Rl01320DTO;

/**
 * 遷出登記服務介面
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl01320Service {

    /**
     * 初始化遷出登記
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷出登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO initOperationDTO(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷出登記編輯頁面
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷出登記」失敗
     */

    Rl01320DTO loadOperationDTO(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷出登記編輯後頁面
     * 
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷出登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01320DTO reviewOperationDTO(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得單一當事人個人資料
     * 
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO querySinglePerson(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO queryManyPerson(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除當事人資料
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶遷出時，不可執行清除國民身分證統一編號」
     *             RisBusinessException：「未勾選欲清除國民身分證統一編號」
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO cancelSelectPerson(Rl01320DTO rl01320DTO, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param rl01320DTO
     * @param executantType
     * @return Rl01320DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO verifyAppData(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存遷出登記申請資料至XLDF Table
     * 
     * @param rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷出登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定新全戶資料
     * 
     * @param rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷出登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setNewHouseHold(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 點選申請種類
     * 
     * @param rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷出登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01320DTO changeMoveType(Rl01320DTO rl01320DTO, ExecutantType executant) throws RisBusinessException;

    /**
     * 刪除遷出登記資料
     * 
     * @param rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷出登記程式失敗」失敗
     */
    public void doDelete(Rl01320DTO rl01320DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶)
     * 
     * @param Rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryPeopleBigHousehold(final Rl01320DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 預設當事人資料與戶內成員清單(大戶)
     * 
     * 
     * @param Rl01320DTO
     * @param executantType
     * @throws RisBusinessException
     * 
     */
    @RisServiceMethod(MethodType.QUERY)
    void procApplyKind_BigHousehold(Rl01320DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO
     * 
     * @param Rl01320DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    void clearBigHouseholdQryDTO(final Rl01320DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
