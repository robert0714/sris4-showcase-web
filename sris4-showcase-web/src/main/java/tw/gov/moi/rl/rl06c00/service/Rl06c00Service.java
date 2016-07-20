package tw.gov.moi.rl.rl06c00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldf022oType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06c00DTO;
import tw.gov.moi.rl.domain.Rl06c00IdQtyDTO;

/**
 * 列印統號配賦表處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl06c00Service {

    /**
     * 申請統號配賦
     * 
     * @param rl06c00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doApply(final Rl06c00DTO rl06c00dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 依據配賦身分及性別，加總、整理傳入之數量
     * 
     * @param rl06c00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    public void qtyOrderSum(final Rl06c00DTO rl06c00dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢統號配賦檔(RLDF022M)中，尚未被配賦的資料筆數
     * 
     * @param rl06c00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rl06c00IdQtyDTO> doQueryIdQty(final Rl06c00DTO rl06c00dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 查詢安全存量
     * 
     * @param rl06c00dto
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldf022oType> doQuerySaftyQty(final Rl06c00DTO rl06c00dto, final ExecutantType executantType)
            throws RisBusinessException;
}
