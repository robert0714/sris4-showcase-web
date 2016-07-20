package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08150DTO;

/**
 * 製作戶籍登記案件索引（目錄）冊
 * 
 * @author
 */
public interface Rl08150Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doBatchPrint(Rl08150DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPreview(Rl08150DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doDownload(Rl08150DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(Rl08150DTO dto, ExecutantType executantType) throws RisBusinessException;
}
