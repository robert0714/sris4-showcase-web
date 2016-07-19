package tw.gov.moi.rl.rl01000.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01000DTO;
import tw.gov.moi.rs.dto.ObnfDTO;


public interface Rl01000Service {
    /**
     * 發送通報測試
     * 
     * @param rl01000dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.QUERY)
    void doTest(final Rl01000DTO rl01000dto, final ExecutantType executantType) throws RisBusinessException;
    
    @RisServiceMethod(value = MethodType.QUERY)
    List<ObnfDTO> getNoticeTestDatas(final Rl01000DTO rl01000dto, final ExecutantType executantType);
    
    @RisServiceMethod(value = MethodType.SAVE)
    void doConsumeTest(final Rl01000DTO rl01000dto, final ExecutantType executantType) throws RisBusinessException;
    
    
    void doSendRldf004n(final Rl01000DTO rl01000dto, final ExecutantType executantType) throws RisBusinessException;

}
