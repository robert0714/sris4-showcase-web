package tw.gov.moi.rl.rl01600.service;

/**
 * 製作門牌改編通報單控制器.
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
import tw.gov.moi.rl.domain.Rl01650DTO;

public interface Rl01650Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01650DTO doPrint(final Rl01650DTO rl01650DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01650DTO doDownload(final Rl01650DTO rl01650DTO, final ExecutantType executantType)
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
    public Rl01650DTO doBatchPrint(final Rl01650DTO rl01650DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 預覽報表
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl01650DTO dto, ExecutantType executantType) throws RisBusinessException;
}
