package tw.gov.moi.rl.rl02b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02bc0DTO;

public interface Rl02bc0Service {

    /**
     * 空白國民身分證及膠膜使用日報表列印
     * 
     * @param rl02bc0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl02bc0DTO rl02bc0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載空白國民身分證及膠膜使用日報表
     * 
     * @param rl02bc0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl02bc0DTO rl02bc0DTO, final ExecutantType executantType) throws RisBusinessException;

}
