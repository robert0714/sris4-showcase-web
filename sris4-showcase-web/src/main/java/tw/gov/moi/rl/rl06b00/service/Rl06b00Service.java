package tw.gov.moi.rl.rl06b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06B00DTO;

/**
 * 查詢未配賦統號服務
 * 
 * @author 1109001
 * 
 */
public interface Rl06b00Service {
    String[] codes = { "1", "6", "7", "8", "9" };

    /**
     * 查詢未配賦統號狀況
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl06B00DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void getDetilaFromMan(Rl06B00DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void getDetilaFromWoman(Rl06B00DTO dto, ExecutantType executantType) throws RisBusinessException;
}
