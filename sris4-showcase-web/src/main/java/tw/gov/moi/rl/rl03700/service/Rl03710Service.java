package tw.gov.moi.rl.rl03700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03710DTO;

/**
 * 查詢本地申請書資料服務介面
 * 
 * @author Alan Lo
 */
public interface Rl03710Service {

    final String REPORT_NAME = "RLRP03710";

    /**
     * 查詢本地申請書資料
     * 
     * @param dto
     * @param exec
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void queryLocalApp(final Rl03710DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 報表列印
     * 
     * @param dto
     * @param exec
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public Rl03710DTO doPrint(final Rl03710DTO dto, final ExecutantType exec) throws RisBusinessException;
}
