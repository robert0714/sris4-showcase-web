package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052f2DTO;

public interface Rl052f2Service {

    String RLRP052F1 = "RLRP052F1";
    String RLRP052F2 = "RLRP052F2";
    String COUNT_SQL_52F1 = "select COUNT(1) from rldf060m where site_id = ? and print_mark=' '";
    String COUNT_SQL_52F2 = "select COUNT(1) from rldf060m where site_id = ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ? ";
    String QUERY_RLDF060M = "select * from rldf060m where site_id = ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ?  and print_mark <> 'Y'";

    /**
     * 列印司法院索引清冊
     * 
     * @param rl052f2DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052f2DTO rl052f2DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載司法院索引清冊
     * 
     * @param rl052f2DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doDownload(final Rl052f2DTO rl052f2DTO, final ExecutantType executantType) throws RisBusinessException;

}
