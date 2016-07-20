package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f41DTO;

/**
 * 選舉人名冊資料查詢服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl08f41Service {

    final static String[] CHINES_NUM = new String[] { "一", "二", "三", "四", "五", "六", "七", "八" };

    final static String[] DS_NAME_806w = { "rl06b00.getRlde806w001", "rl06b00.getRlde806w002",
            "rl06b00.getRlde806w003", "rl06b00.getRlde806w004", "rl06b00.getRlde806w005", "rl06b00.getRlde806w006",
            "rl06b00.getRlde806w007" };

    final static String DS_NAME_004m = "rl08f41.getRldf004m";

    final static String DS_NAME_004h = "rl08f41.getRldf004h";

    /**
     * 開啟表單
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doInitPage(final Rl08f41DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 前端UI資料驗證
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doValidDataForUI(final Rl08f41DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證查詢
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doQuery(final Rl08f41DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
