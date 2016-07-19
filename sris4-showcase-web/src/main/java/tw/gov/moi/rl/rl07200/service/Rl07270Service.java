package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07270DTO;

/**
 * 列印未校正人口名冊處理服務.
 * 
 * @author Mego Pegn
 * 
 */

public interface Rl07270Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl07270DTO rl07270DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl07270DTO rl07270DTO, final ExecutantType executantType) throws RisBusinessException;
}
