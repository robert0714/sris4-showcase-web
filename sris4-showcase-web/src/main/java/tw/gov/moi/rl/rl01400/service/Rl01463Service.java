package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01463DTO;

public interface Rl01463Service {

    /**
     * 列印逕遷戶政事務所人口通報單
     * 
     * @param rl01463DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl01463DTO rl01463DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載列印逕遷戶政事務所人口通報單
     * 
     * @param rl01463DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl01463DTO rl01463DTO, final ExecutantType executantType) throws RisBusinessException;

}
