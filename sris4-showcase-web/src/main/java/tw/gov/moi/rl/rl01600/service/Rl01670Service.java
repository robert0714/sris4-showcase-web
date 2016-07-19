package tw.gov.moi.rl.rl01600.service;

/**
 * 製作門牌編釘對照表控制器.
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
import tw.gov.moi.rl.domain.Rl01670DTO;

public interface Rl01670Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01670DTO doPrint(final Rl01670DTO rl01670DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01670DTO doDownload(final Rl01670DTO rl01670DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 批次列印
     * 
     * @param rl01650DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl01670DTO doBatchPrint(final Rl01670DTO rl01670DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl01670DTO dto, ExecutantType executantType) throws RisBusinessException;
}
