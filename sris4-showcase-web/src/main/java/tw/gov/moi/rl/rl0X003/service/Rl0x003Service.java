package tw.gov.moi.rl.rl0X003.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x003DTO;

/**
 * 職權更正歷史行政區域維護服務
 * 
 * @author Andy
 * 
 */
public interface Rl0x003Service {

    public void doCheck(Rl0x003DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢關聯職權更正歷史行政行政區
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void doQuery(Rl0x003DTO dto, ExecutantType exe) throws RisBusinessException;

    public void modifyIitem(Rl0x003DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 新增紀錄
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void doSave(Rl0x003DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除紀錄
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void delete(Rl0x003DTO dto, ExecutantType exe) throws RisBusinessException;

}
