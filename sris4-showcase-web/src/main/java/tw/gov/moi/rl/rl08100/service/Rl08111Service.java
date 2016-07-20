package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08111DTO;

/**
 * 製作工作站受理案件日報表服務介面
 * 
 * @author
 */
public interface Rl08111Service {

    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(Rl08111DTO dto, ExecutantType executantType) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    void doDownload(Rl08111DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPreview(Rl08111DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    void doBatchPrint(Rl08111DTO dto, ExecutantType executantType) throws RisBusinessException;
}
