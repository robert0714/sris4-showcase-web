package tw.gov.moi.rl.rl04400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04400DTO;

/**
 * 製作村里鄰及街路門牌變更資料表服務.
 * 
 * @author Mego Pegn
 * 
 */

public interface Rl04400Service {

    final String DOORPLATE_O = "O";

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl04400DTO rl04400DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 批次作業 **/
    @RisServiceMethod(MethodType.GENREPORT)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl04400DTO rl04400DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 預覽列印 **/
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl04400DTO rl04400DTO, final ExecutantType executantType) throws RisBusinessException;

}
