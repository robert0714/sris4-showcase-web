package tw.gov.moi.rl.rl0p300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0p300DTO;

/**
 * 
 * 護照親辦人別確認資料查詢處理服務介面
 * 
 * @author Jack Liao
 * 
 */

public interface Rl0p300Service {
    public String RLRP0P300 = "RLRP0P300";
    public String RLRP0P310 = "RLRP0P310";

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl0p300DTO rl0p300DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(Rl0p300DTO rl0p300DTO, ExecutantType executantType) throws RisBusinessException;

}
