package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08942DTO;

/**
 * 逕遷至戶政事務所人數統計表處理服務介面
 * 
 * @author Alan Lo
 * 
 */
public interface Rl08942Service {

    final String REPORT_NAME = "RLRP08942";

    final String NOTICE_TYPE = "Z200";

    final String TOTAL = "Y";

    final String SQL = "SELECT * FROM RSDFZ200 WHERE SITE_ID = ? AND STATISTIC_YYYMM = ? ";

    final String STATISTIC_YYYMM_FORMAT = "%s%s";

    /**
     * 列印逕遷至戶政事務所人數統計表
     * 
     * @param rl08942DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08942DTO rl08942DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載逕遷至戶政事務所人數統計表
     * 
     * @param rl08942DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08942DTO rl08942DTO, final ExecutantType executantType) throws RisBusinessException;

}
