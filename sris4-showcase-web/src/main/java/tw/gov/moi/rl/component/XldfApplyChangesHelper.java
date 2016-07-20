package tw.gov.moi.rl.component;

import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisException;

/**
 * The Interface XldfApplyChangesHelper.
 */
public interface XldfApplyChangesHelper {
    

    /**
     * 設計用來使XLDF domain object進行update時是使用部份欄位更新....因此方方法會將不更新的欄位進行移除屬性的值
     *
     * @param destRldf the destination rldf
     * @param xldfDomainObejctActionIsR the xldf domain object action is R
     * @param excludePropertyis  排除操作的屬性名單
     */
    void removeEqualValue(final Object destRldf ,final  Object xldfDomainObejctActionIsR ,String[] excludePropertyis);
    
    
   
    /**
     * 為了避免dirty write 而寫出來的進行部份欄位更新.
     *
     * @param bean the bean
     * @param dsman the dsman
     * @param executantType the executant type
     * @return the int
     * @throws RisException the ris exception
     */
    int modifyBean(final Object bean ,final DBSMain dsman ,final ExecutantType executantType)throws RisException;
    
    /**
     * Retrieve primary key values.
     *
     * @param bean the bean
     * @return the map
     */
    Map<String, String> retrievePkvalues(final Object bean);
    
    
    /**
     * Gets the null properties of bean.
     *
     * @param <T> the generic type
     * @param clazz the class
     * @return the null properties bean
     */
    <T extends Object> T getNullPropertiesBean(final Class<T> clazz);
}
