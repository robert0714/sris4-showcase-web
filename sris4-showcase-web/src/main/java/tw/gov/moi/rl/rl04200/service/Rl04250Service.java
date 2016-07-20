package tw.gov.moi.rl.rl04200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04250DTO;

/**
 * 製作門牌整編通報單服務介面
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl04250Service {

    /**
     * 列印門牌整編通報單書
     * 
     * @param rl04250DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     *             執行列印作業失敗（TX-6350-E）
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl04250DTO rl04250DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04250DTO rl04250DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl04250DTO rl04250DTO, ExecutantType executantType) throws RisBusinessException;

}
