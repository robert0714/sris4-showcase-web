package tw.gov.moi.rl.component.rl08210;

import java.util.List;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210UseDTO;

public interface Rl08210CommonUtil {
    /**
     * 設定新值
     * 
     * @param dto
     */
    public void setNewValue(Rl08210UseDTO dto) throws RisBusinessException;

    public void setNewValue(List<Rl08210UseDTO> dtoList) throws RisBusinessException;

    public String getValue(Rl08210UseDTO dto) throws RisBusinessException;

    /**
     * 取得未使用到資料數量
     * 
     * @param dtoList
     * @return
     * @throws RisBusinessException
     */
    public int getNotUseData(List<Rl08210UseDTO> dtoList) throws RisBusinessException;

    // /**
    // * 資料更新
    // *
    // * @param dtoList
    // * @throws RisBusinessException
    // */
    // public void upData(List<Rl08210UseDTO> dtoList, ExecutantType
    // executantType) throws RisBusinessException;
}
