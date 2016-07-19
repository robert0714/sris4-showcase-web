package tw.gov.moi.rl.rl05300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05320DTO;

public interface Rl05320Service {

    /**
     * 查詢外來通報處理狀況
     * 
     * @param rl05320dto
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl05320DTO rl05320dto, final ExecutantType executantType) throws RisBusinessException;

}
