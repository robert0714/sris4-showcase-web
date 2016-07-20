package tw.gov.moi.rl.component.mutltiDataPocess;

import java.util.List;
import java.util.Map;

import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.XLDFDomainDTOFactory;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.mutltiDataPocess.modules.RlGetMultiDataAppendLogicModuleParams;
import tw.gov.moi.rl.component.xldf.facade.XLDFDomainFacadeFactory;
import tw.gov.moi.rl.domain.RlWsRule;

/**
 * The Interface AppendGetMultiDatalogic.
 */
public interface AppendGetMultiDatalogic {

    /**
     * Run.
     *
     * @return the list
     */
    List<Object> run();

    /**
     * Export facade result.
     *
     * @param initData the init data
     * @param xldfDomainFacadeFactory the xldf domain facade factory
     * @return the list<? extends rl ws rule>
     */
    List<? extends RlWsRule> exportFacadeResult(
            final Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> initData,
            final XLDFDomainFacadeFactory xldfDomainFacadeFactory);

    /**
     * Export dto result.
     *
     * @param initData the init data
     * @param domainDTOFactory the domain dto factory
     * @return the list<? extends rl ws rule>
     */
    List<? extends RlWsRule> exportDTOResult(
            final Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> initData,
            final XLDFDomainDTOFactory domainDTOFactory);

    //傳回需補充的DomainTypes
    /**
    * Gets the all need domain types.
    *
    * @return the all need domain types
    */
    String[] getAllNeedDomainTypes();

    /**
     * Sets the ref domain types.
     *
     * @param refDomainTypes the new ref domain types
     */
    void setRefDomainTypes(Class<? extends XLDFDomainObject>[] refDomainTypes);

    /**
     * Sets the ref domain keys.
     *
     * @param refDomainKeys the new ref domain keys
     */
    void setRefDomainKeys(String[] refDomainKeys);

    /**
     * @param conn1
     */
    void setConn(DBSMain conn1);

    /**
     * @param appendLogicModules
     */
    void setParam(RlGetMultiDataAppendLogicModuleParams appendLogicModules);

    /**
     * @param firstQueryResult
     */
    void setGetfirstQueryResult(List<Object> firstQueryResult);
    
    
    
}
