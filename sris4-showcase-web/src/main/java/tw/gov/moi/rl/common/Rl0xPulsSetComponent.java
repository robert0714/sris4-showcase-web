package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rldfv006Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;
import tw.gov.moi.rl.domain.Rl0x001DTOResult;

public interface Rl0xPulsSetComponent {

    /**
     * 建立附繳證件(舊)紀錄
     * 
     * @param tracsactionId
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public void insertRldfv005s(DBSMain dbs, Rl0x001DTO mainDTO, Object oldData,
            List<Rl0x001DTOResult> rl0x001dtoResults, ExecutantType exe) throws RisBusinessException;

    public boolean isAddLeft(Rl0x001DTOResult rl0x001DTOResult) throws RisBusinessException;

    public boolean isAddRight(Rl0x001DTOResult rl0x001DTOResult) throws RisBusinessException;

    /**
     * 填滿(更改前的)
     * 
     * @param dbs
     * @param obj
     *            (來源檔案)
     * @param rl0x001DTOResults
     * @param exe
     * @throws RisBusinessException
     */
    public void fillBeoforeRl0x001DTOResults(DBSMain dbs, final Object obj,
            final List<Rl0x001DTOResult> rl0x001DTOResults, final ExecutantType exe) throws RisBusinessException;

    /**
     * 填滿(更改後的)
     * 
     * @param dbs
     * @param record
     *            (記錄檔)
     * @param rl0x001DTOResults
     * @param exe
     * @throws RisBusinessException
     */
    public void fillAfterDTOResults(DBSMain dbs, String transaction, final List<Rl0x001DTOResult> rl0x001DTOResults,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得附繳證件記錄檔
     * 
     * @param dbs
     * @param transaction
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List<Rldfv006Type> getRldfv006(DBSMain dbs, String transaction, final ExecutantType exe)
            throws RisBusinessException;

    /**
     * 建立新的RLDFV006 建立之前會先刪除之前紀錄
     * 
     * @param dbs
     * @param mainDTO
     * @param rl0x001DTOResults
     * @param exe
     * @throws RisBusinessException
     */
    public void createNewRldfv006(DBSMain dbs, Rl0x001DTO mainDTO, Object sourceData,
            List<Rl0x001DTOResult> rl0x001dtoResults, ExecutantType exe) throws RisBusinessException;

}
