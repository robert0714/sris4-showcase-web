package tw.gov.moi.rl.rl01600.service;

/**
 * 製作門牌編釘報告表控制器.
 * 
 * @author KenFC
 * 
 */
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01640DTO;

public interface Rl01640Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01640DTO doPrint(final Rl01640DTO rl01640DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01640DTO doDownload(final Rl01640DTO rl01640DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(final Rl01640DTO dto, final ExecutantType executantType) throws RisBusinessException;

    public void doPreview(final Rl01640DTO dto, ExecutantType executantType) throws RisBusinessException;

    public void insertDate(final Rl01640DTO dto, ExecutantType executantType) throws RisBusinessException;
}
