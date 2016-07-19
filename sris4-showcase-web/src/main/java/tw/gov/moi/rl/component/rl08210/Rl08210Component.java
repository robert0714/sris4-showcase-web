package tw.gov.moi.rl.component.rl08210;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;
import tw.gov.moi.rl.domain.Rl08210UseDTO;

public interface Rl08210Component {

    /**
     * 更新欄位
     * 
     * @param dto
     * @throws RisBusinessException
     */
    public void upDataRecord(List<Rl08210UseDTO> dto, String exeSiteId, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * 取得未使用次數
     * 
     * @param dto
     * @return
     * @throws RisBusinessException
     */
    public int getNotUseNum(List<Rl08210UseDTO> dto) throws RisBusinessException;

    public void insertRldf834w(Rl08210DTO dto, List<Rl08210UseDTO> useDTOs, ExecutantType exe)
            throws RisBusinessException;

    public void insertRldf835w(Rl08210DTO dto, List<Rl08210UseDTO> useDTOs, ExecutantType exe)
            throws RisBusinessException;

    public void insertTldf834w(Rl08210DTO dto, List useDTOs, String fieldName1, String fieldName2, String result,
            String resultType, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得舊值
     * 
     * @param useDTO
     * @return
     * @throws RisBusinessException
     */
    public String getOldValue(Rl08210UseDTO useDTO) throws RisBusinessException;

    /**
     * 取得舊值
     * 
     * @param useDTO
     * @return
     * @throws RisBusinessException
     */
    public String getNewValue(Rl08210UseDTO useDTO) throws RisBusinessException;

    // public List getQueryResult(R08210SQLComponet componet, ExecutantType exe)
    // throws RisBusinessException;

    // public List getQueryResult(Rl08210DTO dto, R08210SQLComponet componet,
    // ExecutantType exe)
    // throws RisBusinessException;

    public List<Object> getProbability(final DBSMain dbi, Rl08210DTO dto, R08210SQLComponet componet, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 取得分配結果.
     * 
     * @param <T>
     *            the generic type
     * @param properList
     *            =>List<[]Object>{類别,數量}
     * @param wrongLists
     *            =>有錯資料
     * @return the map
     */
    public void assignNumAndKind(List properList, List<Rl08210UseDTO> wrongLists) throws RisBusinessException;

}
