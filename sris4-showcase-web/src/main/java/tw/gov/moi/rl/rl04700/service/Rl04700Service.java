package tw.gov.moi.rl.rl04700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04700DTO;

/**
 * 製作全戶基本資料門牌及里鄰門牌資料核對表服務.
 * 
 * @author Mego Pegn
 * 
 */

public interface Rl04700Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl04700DTO rl04700DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04700DTO rl04700DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl04700DTO rl04700DTO, ExecutantType executantType) throws RisBusinessException;

}
