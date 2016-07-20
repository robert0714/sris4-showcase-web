package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f5aDTO;

/**
 * 工作地人員資料匯入作業介面.
 * 
 * @author kenfc
 */
public interface Rl08f5aService {

    /** 統號錯誤 */
    final String ERROR_CODE_1 = "1";

    /** 生日錯誤 */
    final String ERROR_CODE_2 = "2";

    /** 戶籍地錯誤 */
    final String ERROR_CODE_3 = "3";

    /** 戶籍地+生日錯誤 */
    final String ERROR_CODE_4 = "4";

    /** 資格不符(生日) */
    final String ERROR_CODE_5 = "5";

    /** 資格不符(死亡) */
    final String ERROR_CODE_6 = "6";

    /** 資格不符(受監護) */
    final String ERROR_CODE_7 = "7";

    /** 資格不符(除口) */
    final String ERROR_CODE_8 = "8";

    /**
     * 初始化頁面
     * 
     * @param rl08f5aDTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl08f5aDTO rl08f5aDTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 匯入
     * 
     * @param executantType
     * @param rl08f5aDTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doImport(final Rl08f5aDTO rl08f5aDTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f5aDTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl08f5aDTO rl08f5aDTO, final ExecutantType executantType) throws RisBusinessException;

}
