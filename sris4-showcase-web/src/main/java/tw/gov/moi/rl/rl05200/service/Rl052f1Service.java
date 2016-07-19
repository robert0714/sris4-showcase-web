package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052f1DTO;

public interface Rl052f1Service {

    String COUNT_SQL = "select COUNT(1) from rldf060m where print_mark=' ' and site_id = ? ";

    /**
     * 列印司法院通報明細表
     * 
     * @param rl052f1DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052f1DTO rl052f1DTO, final ExecutantType executantType) throws RisBusinessException;

}
