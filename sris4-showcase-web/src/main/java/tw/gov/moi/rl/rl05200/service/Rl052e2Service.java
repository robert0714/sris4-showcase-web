package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052e2DTO;

public interface Rl052e2Service {

    String COUNT_SQL = "SELECT COUNT(1) FROM RLDF055M WHERE SITE_ID = ? and prison_notice_date >= ? and prison_notice_date <= ? ";

    /**
     * 重製入出矯正機關人口通報處理表
     * 
     * @param rl052e2DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl052e2DTO rl052e2DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載重製入出矯正機關人口通報處理表
     * 
     * @param rl052e2DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl052e2DTO rl052e2DTO, final ExecutantType executantType) throws RisBusinessException;

}
