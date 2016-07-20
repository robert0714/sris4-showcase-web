package tw.gov.moi.rl.rl04920.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04920DTO;

/**
 * Rl4920製作新舊里鄰門牌對照表
 * 
 * @author Jason Huang
 */
public interface Rl04920Service {

    /**
     * 列印
     * 
     * @param rl04920DTO
     * @param executantType
     * @return
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public String doPrint(Rl04920DTO rl04920DTO, ExecutantType executantType);

    /**
     * 另存電子檔
     * 
     * @param rl04920DTO
     * @param executantType
     * @return
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public String doDownload(Rl04920DTO rl04920DTO, ExecutantType executantType);

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04920DTO rl04920DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl04920DTO rl04920DTO, ExecutantType executantType) throws RisBusinessException;

}
