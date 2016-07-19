package tw.gov.moi.rl.rl01a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01a50DTO;

public interface Rl01a50Service {

    String DS_NAME = "Rl01a50.getRldf030t";

    /**
     * 查詢所內記事資料
     * 
     * @param rl01a50DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRegisteredRecord(final Rl01a50DTO rl01a50dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 行政協助強制結案
     * 
     * @param rl01a50DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doConcludeRldf030t(final Rl01a50DTO rl01a50dto, final ExecutantType executantType)
            throws RisBusinessException;

}
