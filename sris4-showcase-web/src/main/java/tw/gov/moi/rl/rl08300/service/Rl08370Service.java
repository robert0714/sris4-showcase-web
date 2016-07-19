package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08370DTO;

/**
 * 列印年終人口靜態資料名冊處理服務介面
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl08370Service {

    /**
     * 列印年終人口靜態資料名冊
     * 
     * @param rl08370DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     *             執行列印作業失敗（TX-6350-E）
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl08370DTO rl08370DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載年終人口靜態資料名冊
     * 
     * @param rl08370DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 下載檔案URL
     * @throws RisBusinessException
     *             執行下載作業失敗（TX-6351-E）
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doDownload(final Rl08370DTO rl08370DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印年終人口靜態資料名冊
     * 
     * @param rl08370DTO
     *            the rl08370dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl08370DTO rl08370DTO, final ExecutantType executantType) throws RisBusinessException;

}
