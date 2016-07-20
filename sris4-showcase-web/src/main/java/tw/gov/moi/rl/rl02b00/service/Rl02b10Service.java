package tw.gov.moi.rl.rl02b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02b10DTO;

public interface Rl02b10Service {

    /**
     * 取得使用狀況查詢處理
     * 
     * @param rl02b10DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl02b10DTO rl02b10DTO, final ExecutantType executantType) throws RisBusinessException;

}
