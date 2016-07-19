package tw.gov.moi.rl.rl0d100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0d120DTO;

/**
 * 例行列印國民身分證服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl0d120Service {

    public final String ID_FILE_EMPTY = "IDFileEmpty";

    /** 全形空白 */
    String SPACE = "　";

    /** 女 */
    String FEMALE = "女";

    /** 男 */
    String MALE = "男";

    /**
     * 查詢例行列印國民身分證資料
     * 
     * @param rl0d120DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0d120DTO rl0d120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存例行列印國民身分證資料
     * 
     * @param rl0d120DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0d120DTO rl0d120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印國民身分證資料
     * 
     * @param rl0d120DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl0d120DTO rl0d120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除影像掃瞄的檔案
     * 
     * @param rl0d120DTO
     * @param executantType
     */
    public void doDeletImageHistoryFile(final ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證資料
     * 
     * @param rl0d120DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl0d120DTO rl0d120DTO, final ExecutantType executantType) throws RisBusinessException;

}
