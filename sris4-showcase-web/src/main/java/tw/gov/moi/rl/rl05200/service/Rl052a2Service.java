package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052a2DTO;

public interface Rl052a2Service {

    String DS_NAME = "rl052a2.getRldf051m";

    /** The Constant REPORT_NAME. */
    String REPORT_NAME = "RLRP052A2";

    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(Rl052a2DTO rl052a2DTO, ExecutantType executantType) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(Rl052a2DTO rl052a2DTO, ExecutantType executantType) throws RisBusinessException;
}