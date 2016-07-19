package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ah0DTO;

public interface Rl02ah0Service {

    /**
     * 製作國民身分證申請書(索引)冊
     * 
     * @param rl02ah0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl02ah0DTO rl02ah0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載製作國民身分證申請書(索引)冊
     * 
     * @param rl02ah0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl02ah0DTO rl02ah0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得最後收妥時間
     * 
     * @param rl02ah0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getLastReceiveDate(final Rl02ah0DTO rl02ah0DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
