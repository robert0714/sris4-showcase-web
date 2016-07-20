package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210AllocateComponent {

    /**
     * 共用邏輯分配
     * 
     * @param rl08210dto
     * @param className
     *            <Class<T>>
     * @param columnName
     *            分配欄位
     * @param columnCHName
     *            分配欄位中文名稱
     * @param NormalRange
     *            資料級距
     * @param HalfNum
     *            半數值(百分比分配時，依取筆數多至少取前幾個級距進行分配)
     * @param rarticularNum
     *            特定值(無已詳資料特定分配的級距值)
     * @param executantType
     * @throwsRisBusinessException
     */
    <T> void doAllocate(final DBSMain dbi, Rl08210DTO rl08210dto, Class<T> className, String columnName,
            String classifyTypeCode, String columnCHName, String NormalRange, String HalfNum, String rarticularNum,
            ExecutantType executantType) throws RisBusinessException;

}
