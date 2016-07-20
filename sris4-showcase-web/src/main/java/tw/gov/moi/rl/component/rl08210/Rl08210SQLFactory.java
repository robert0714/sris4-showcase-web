package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210SQLFactory {
    /**
     * 取得正確組合
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public R08210SQLComponet getCorrect(Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得錯誤組合
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public R08210SQLComponet getNotCorrect(Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

}
