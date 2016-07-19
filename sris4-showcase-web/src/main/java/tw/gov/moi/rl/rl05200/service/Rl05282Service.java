package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05282DTO;

/**
 * 警政對戶政撤銷失蹤人口通報處理及製表服務介面
 */
public interface Rl05282Service {

    @WorkStatus(FinalType.FINAL)
    void doExecute(Rl05282DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doPrint(Rl05282DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doPrint(ExecutantType executantType);

    @WorkStatus(FinalType.FINAL)
    void doBatch(Rl05282DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doPreview(Rl05282DTO dto, ExecutantType executantType) throws RisBusinessException;

    void validateRsdf023mCanExecute(Rl05282DTO dto, ExecutantType executantType) throws RisBusinessException;
}
