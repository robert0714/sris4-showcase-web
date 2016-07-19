package tw.gov.moi.rl.rl01600.service;

/**
 * 製作臨時紙質門牌控制器.
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
import tw.gov.moi.rl.domain.Rl01660DTO;

public interface Rl01660Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01660DTO doPrint(final Rl01660DTO rl01660DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 批次列印
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(final Rl01660DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 顯示
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl01660DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl01660DTO doDownload(final Rl01660DTO rl01660DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
