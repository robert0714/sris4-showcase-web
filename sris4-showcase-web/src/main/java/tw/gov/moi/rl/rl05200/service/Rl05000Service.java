package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05000DTO;

/**
 * 外籍(含大陸)配偶資料查詢服務介面
 * 
 * @author
 */
public interface Rl05000Service {
    String doExecute(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

    String doExecute2(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    void executeMassMove(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    void executeSendNotice(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    void executeRestore(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

    String doExecute3(Rl05000DTO dto, ExecutantType executantType) throws RisBusinessException;

}
