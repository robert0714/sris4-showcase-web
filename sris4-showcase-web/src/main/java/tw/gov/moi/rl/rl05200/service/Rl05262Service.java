package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05262DTO;

/**
 * 教育程度註記通報服務介面
 * 
 * @author
 */
public interface Rl05262Service {

    @WorkStatus(FinalType.FINAL)
    void doBatchPrint(Rl05262DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doPreview(Rl05262DTO dto, ExecutantType executantType) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    void doDownload(Rl05262DTO dto, ExecutantType executantType) throws RisBusinessException;
}
