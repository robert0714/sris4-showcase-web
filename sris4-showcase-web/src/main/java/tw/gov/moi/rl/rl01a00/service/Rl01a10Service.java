package tw.gov.moi.rl.rl01a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01a10DTO;

public interface Rl01a10Service {

    /**
     * 查詢所內記事資料
     * 
     * @param rl01a10DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRegisteredRecord(final Rl01a10DTO rl01a10dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 刪除所內記事資料
     * 
     * @param rl01a10DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doDeleteRegisteredRecord(final Rl01a10DTO rl01a10dto, final ExecutantType executantType)
            throws RisBusinessException;

}
