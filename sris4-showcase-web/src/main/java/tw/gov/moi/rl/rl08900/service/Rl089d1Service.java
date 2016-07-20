package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089d1DTO;

/**
 * 列印應清查人口名冊處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl089d1Service {

    /**
     * 列印應清查人口名冊
     * 
     * @param Rl089d1DTO
     *            ,ExecutantType
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl089d1DTO rl089d1DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載應清查人口名冊
     * 
     * @param Rl089d1DTO
     *            ,ExecutantType
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl089d1DTO rl089d1DTO, final ExecutantType executantType) throws RisBusinessException;

}
