package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.dto.rl01800.Rl01803DTO;

/**
 * 撤銷遷入登記服務介面
 * 
 * 本作業只辦理自國外簽入之撤銷
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl01803Service {

    /**
     * 初始化遷入登記
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷入登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO initOperationDTO(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷出登記編輯頁面
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷出登記」失敗
     */

    Rl01803DTO loadOperationDTO(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷出登記編輯後頁面
     * 
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷出登記」失敗
     */

    Rl01803DTO reviewOperationDTO(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得單一當事人個人資料
     * 
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO querySinglePerson(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO queryManyPerson(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除當事人資料
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶遷出時，不可執行清除國民身分證統一編號」
     *             RisBusinessException：「未勾選欲清除國民身分證統一編號」
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO cancelSelectPerson(Rl01803DTO rl01803DTO, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param rl01803DTO
     * @param executantType
     * @return Rl01803DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO verifyAppData(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table
     * 
     * @param rl01803DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定新全戶資料
     * 
     * @param rl01803DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setNewHouseHold(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 點選申請種類
     * 
     * @param rl01803DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01803DTO changeMoveType(Rl01803DTO rl01803DTO, ExecutantType executant) throws RisBusinessException;

    /**
     * 刪除遷入登記資料
     * 
     * @param rl01803DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    public void doDelete(Rl01803DTO rl01803DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶)
     * 
     * @param Rl01803DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryPeopleBigHousehold(final Rl01803DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO
     * 
     * @param Rl01803DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    void clearBigHouseholdQryDTO(final Rl01803DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
