package tw.gov.moi.rl.rl08100.service;

/**
 * 戶籍人口統計月報表案件數清查表控制器.
 * 
 * @author KenFC
 * 
 */
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08190DTO;

public interface Rl08190Service {

    /**
     * 戶籍人口統計月報表案件數清查表列印
     * 
     * @param rl08190DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08190DTO rl08190DTO, final ExecutantType executantType);

    /**
     * 取得並下載戶籍人口統計月報表案件數清查表
     * 
     * @param rl08190DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl08190DTO rl08190DTO, final ExecutantType executantType);

    // @RisServiceMethod(MethodType.QUERY)
    // public Rl08190DTO doQueryVillage(Rl08190DTO rl08190DTO, ExecutantType
    // executantType) throws RisBusinessException;

}
