package tw.gov.moi.rl.rl07200.service;

/**
 * 列印戶口校正成果統計表.
 * 
 * @author KenFC
 * 
 */
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07280DTO;

public interface Rl07280Service {
    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl07280DTO doPrint(final Rl07280DTO rl07280DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl07280DTO doDownload(final Rl07280DTO rl07280DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
