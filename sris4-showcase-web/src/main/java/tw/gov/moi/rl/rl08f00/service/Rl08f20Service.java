package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f20DTO;

/**
 * 選舉人資料轉錄服務介面
 * 
 * @author Stanley.Li
 */
public interface Rl08f20Service {

    /**
     * 前端UI資料驗證
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doValidDataForUI(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 執行
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doTransferStart(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkVoteData(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setSmallArea(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl08f20DTO setVoteIdentity(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doRecordFile(final Rl08f20DTO rl08f20DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
