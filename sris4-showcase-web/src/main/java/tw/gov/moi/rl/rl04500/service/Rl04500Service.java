package tw.gov.moi.rl.rl04500.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04500DTO;

public interface Rl04500Service {

    /**
     * 製作里鄰門牌資料表服務介面.
     * 
     * @param rl04500dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return String：報表檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl04500DTO rl04500dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04500DTO dto, ExecutantType executantType) throws RisBusinessException;

    public void doPreview(Rl04500DTO dto, ExecutantType executantType) throws RisBusinessException;

}
