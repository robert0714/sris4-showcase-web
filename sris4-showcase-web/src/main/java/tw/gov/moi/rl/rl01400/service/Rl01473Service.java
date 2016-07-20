package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01473DTO;

/**
 * 遷出人口特殊註記查詢
 * 
 * @author 1109001
 * 
 */
public interface Rl01473Service {

    /**
     * 特殊註記清檔明細
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)   
    public void querySpecialCodeList(Rl01473DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
