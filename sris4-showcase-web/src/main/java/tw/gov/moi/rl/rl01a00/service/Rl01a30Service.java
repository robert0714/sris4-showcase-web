package tw.gov.moi.rl.rl01a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01a30DTO;

public interface Rl01a30Service {

    /**
     * 查詢所內記事資料
     * 
     * @param rl01a30DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRegisteredRecord(final Rl01a30DTO rl01a30dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 更正所內記事資料
     * 
     * @param rl01a30DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doUpdateRegisteredRecord(final Rl01a30DTO rl01a30dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 查詢Rldf030t
     * 
     * @param rl01a30DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldf030t(final Rl01a30DTO rl01a30dto, final ExecutantType executantType)
            throws RisBusinessException;

}
