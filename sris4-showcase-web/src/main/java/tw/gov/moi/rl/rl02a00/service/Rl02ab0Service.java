package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ab0DTO;

public interface Rl02ab0Service {

    /**
     * 執行「重製國民身分證再送件聯單」
     * 
     * @param rl02ab0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl02ab0DTO rl02ab0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 下載「重製國民身分證再送件聯單」
     * 
     * @param rl02ab0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl02ab0DTO rl02ab0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 篩選符合條件之新式新式國民身分證請領記錄
     * 
     * @param rl02ab0DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl02ab0DTO rl02ab0DTO, final ExecutantType executantType) throws RisBusinessException;

}
