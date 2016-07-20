package tw.gov.moi.rl.rl06d00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldf021oType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06d00DTO;

/**
 * 列印戶號配賦表處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl06d00Service {

    /**
     * 申請戶號配賦
     * 
     * @param rl06d00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doApply(final Rl06d00DTO rl06d00dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢戶號配賦檔(RLDF021M)中，尚未被配賦的資料筆數
     * 
     * @param rl06d00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryIdQty(final Rl06d00DTO rl06d00dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 查詢安全存量
     * 
     * @param rl06d00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldf021oType> doQuerySaftyQty(final Rl06d00DTO rl06d00dto, final ExecutantType executantType)
            throws RisBusinessException;

}
