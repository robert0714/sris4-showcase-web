package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08930DTO;

/**
 * 製作各鄰住戶人口統計表服務介面.
 * 
 * @author 劉嘉煒
 * 
 */
public interface Rl08930Service {

    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl08930DTO rl08930DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl08930DTO rl08930DTO, final ExecutantType executantType);

    void doPreview(Rl08930DTO dto, ExecutantType executantType) throws RisBusinessException;
}
