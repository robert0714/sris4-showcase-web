package tw.gov.moi.rl.rl08800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08800DTO;

/**
 * 登錄應清查人口查對成果處理服務介面
 * 
 * @author Stanley.Li
 */
public interface Rl08800Service {

    /**
     * 通報發現及處理戶籍案件成果統計資料
     * 
     * @param rl08800DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SEND)
    @WorkStatus(FinalType.FINAL)
    public void doSend(final Rl08800DTO rl08800DTO, final ExecutantType executantType) throws RisBusinessException;

}
