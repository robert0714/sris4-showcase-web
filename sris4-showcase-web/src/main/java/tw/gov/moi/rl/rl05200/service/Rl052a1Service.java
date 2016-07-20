package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052a1DTO;

public interface Rl052a1Service {

    /** The RLRP04500. */
    public String RLRP052A1 = "RLRP052A1";
    String COUNT_SQL = "select COUNT(1) from rldf051m where print_mark=' ' and site_id = ? ";

    /**
     * 列印出生通報明細表服務介面.
     * 
     * @param executantType
     *            使用者資訊
     * @return String：報表檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052a1DTO rl052a1DTO, final ExecutantType executantType) throws RisBusinessException;

}