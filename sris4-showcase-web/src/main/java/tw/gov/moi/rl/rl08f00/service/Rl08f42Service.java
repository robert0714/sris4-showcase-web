package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f42DTO;

/**
 * 選舉人名冊資料新增服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl08f42Service {
    /**
     * 前端UI資料驗證
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doValidDataForUI(Rl08f42DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證查詢
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doQuery(Rl08f42DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 加入清單
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void addQuery(Rl08f42DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doSave(Rl08f42DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
