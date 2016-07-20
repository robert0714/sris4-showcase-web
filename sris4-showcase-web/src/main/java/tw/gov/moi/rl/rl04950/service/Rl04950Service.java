package tw.gov.moi.rl.rl04950.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04950DTO;

/**
 * Rl4950製作跨行政區域調整通報單
 * 
 * @author Jason Huang
 */
public interface Rl04950Service {

    /**
     * 列印
     * 
     * @param rl04920DTO
     * @param executantType
     * @return
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public String doPrint(Rl04950DTO rl04920DTO, ExecutantType executantType);

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04950DTO rl04950DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl04950DTO rl04950DTO, ExecutantType executantType) throws RisBusinessException;

}
