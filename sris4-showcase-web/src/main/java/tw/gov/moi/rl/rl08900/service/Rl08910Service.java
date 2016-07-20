package tw.gov.moi.rl.rl08900.service;

/**
 * 核准更改姓名通報單控制器.
 * 
 * @author KenFC
 * 
 */
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08910DTO;

public interface Rl08910Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl08910DTO doPrint(final Rl08910DTO rl08910DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl08910DTO doDownload(final Rl08910DTO rl08910DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
