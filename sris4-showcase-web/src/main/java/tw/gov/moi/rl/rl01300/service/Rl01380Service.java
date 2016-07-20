package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.dto.rl01300.Rl01380DTO;

/**
 * 通訊中斷後遷出登記服務介面
 * 
 * 本作業辦理通訊中斷後之遷出登記
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl01380Service {

    /**
     * 初始化遷入登記
     * 
     * @param rl01380DTO
     * @param executantType
     * @return Rl01380DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷入登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO initOperationDTO(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得單一當事人個人資料
     * 
     * 
     * @param rl01380DTO
     * @param executantType
     * @return Rl01380DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO querySinglePerson(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料
     * 
     * @param rl01380DTO
     * @param executantType
     * @return Rl01380DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO queryManyPerson(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除當事人資料
     * 
     * @param rl01380DTO
     * @param executantType
     * @return Rl01380DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶遷出時，不可執行清除國民身分證統一編號」
     *             RisBusinessException：「未勾選欲清除國民身分證統一編號」
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO cancelSelectPerson(Rl01380DTO rl01380DTO, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param rl01380DTO
     * @param executantType
     * @return Rl01380DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO verifyAppData(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table
     * 
     * @param rl01380DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定新全戶資料
     * 
     * @param rl01380DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setNewHouseHold(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 點選申請種類
     * 
     * @param rl01380DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01380DTO changeMoveType(Rl01380DTO rl01380DTO, ExecutantType executant) throws RisBusinessException;

    /**
     * 刪除遷入登記資料
     * 
     * @param rl01380DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    public void doDelete(Rl01380DTO rl01380DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 點選遷入新戶長
     * 
     * @param rl01380DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    public void moveInHeadPersonIdRemoteCommand(Rl01380DTO rl01380DTO, ExecutantType executantType)
            throws RisBusinessException;

}
