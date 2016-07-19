package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05232DTO;

/**
 * 列印外來申請書清單服務介面
 * 
 * @author
 */
public interface Rl05232Service {

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl05232DTO rl05232dto, ExecutantType executantType) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    public void doDownload(Rl05232DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
