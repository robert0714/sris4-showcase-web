package tw.gov.moi.rl.rl07300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07300DTO;

/**
 * 列印戶口普查處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl07300Service {

    @RisServiceMethod(MethodType.QUERY)
    public String doPrint(final Rl07300DTO rl07300dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public String doDownload(final Rl07300DTO rl07300dto, final ExecutantType executantType)
            throws RisBusinessException;

}
