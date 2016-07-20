package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05291DTO;

/**
 * 全民健保資料登錄通報作業處理服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl05291Service {
    /**
     * 查詢全民健保資料登錄通報作業
     * 
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void query(Rl05291DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增全民健保資料登錄通報作業
     * 
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void add(Rl05291DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 通報全民健保資料登錄
     * 
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doSendNotice(Rl05291DTO dto, ExecutantType executantType) throws RisBusinessException;

}
