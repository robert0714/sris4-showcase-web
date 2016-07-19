package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08272DTO;

/**
 * 製作死亡動態統計申請書資料清冊處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl08272Service {

    /** Report Name. */
    public static final String REPORT_NAME = "RLRP08272";

    /**
     * 製作死亡動態統計申請書資料清冊
     * 
     * @param rl08272dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    public Rl08272DTO doPrint(final Rl08272DTO rl08272dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得並下載死亡動態統計申請書資料清冊
     * 
     * @param rl08272dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public Rl08272DTO doDownload(final Rl08272DTO rl08272dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 預覽死亡動態統計申請書資料清冊
     * 
     * @param rl08272dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl08272DTO doPreview(final Rl08272DTO rl08272dto, final ExecutantType executantType)
            throws RisBusinessException;
}
