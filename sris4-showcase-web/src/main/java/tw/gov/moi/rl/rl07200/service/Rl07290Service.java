package tw.gov.moi.rl.rl07200.service;

/**
 * 製作戶口校正未接受校正人口數及其原因統計表.
 * 
 * @author KenFC
 * 
 */
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07290DTO;

public interface Rl07290Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl07290DTO doPrint(final Rl07290DTO rl07290DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl07290DTO doDownload(final Rl07290DTO rl07290DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
