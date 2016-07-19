package tw.gov.moi.rl.rl01a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01a40DTO;

public interface Rl01a40Service {

    String DS_NAME = "Rl01a40.getRedfrptf";

    String REPORT_NAME = "RLRP01A40";

    /**
     * 列印行政協助案件清冊統計資料
     * 
     * @param rl01a40DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl01a40DTO rl01a40DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得並下載行政協助案件清冊統計資料
     * 
     * @param rl01a40DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl01a40DTO rl01a40DTO, final ExecutantType executantType) throws RisBusinessException;

}
