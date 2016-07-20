package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05231DTO;

/**
 * 教育程度註記通報服務介面
 * 
 * @author
 */
public interface Rl05231Service {
    @WorkStatus(FinalType.FINAL)
    void doDownload(Rl05231DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    @WorkStatus(FinalType.FINAL)
    void doPrint(Rl05231DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doJob(Rl05231DTO dto, ExecutantType executantType) throws RisBusinessException;
}
