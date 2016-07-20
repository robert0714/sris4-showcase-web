package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f43DTO;

public interface Rl08f43Service {
    /**
     * 前端UI資料驗證
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doValidDataForUI(final Rl08f43DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證查詢
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doQuery(final Rl08f43DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 加入清單
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void addQuery(final Rl08f43DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doUpdate(final Rl08f43DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doDelete(final Rl08f43DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
