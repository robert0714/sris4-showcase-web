package tw.gov.moi.rl.component;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFMultiCreationIntermeidateData;
import tw.gov.moi.rl.component.dto.XLDFMultiCreationParams;
import tw.gov.moi.rl.component.dto.XLDFTransaction;
import tw.gov.moi.rl.component.mutltiDataPocess.AppendGetMultiDatalogic;
import tw.gov.moi.rl.domain.RlWsRule;

/**
 * The Interface XLDFManipulationPlusComponent.
 */
public interface XLDFManipulationPlusComponent {
    
    /**
     * Creates the multi origin xldf select step.
     *
     * @param <E> the element type
     * @param params the params
     * @param executantType the executant type
     * @param transMaster the trans master
     * @return the XLDF multi creation intermeidate data
     */
    <E extends XLDFDomainObject> XLDFMultiCreationIntermeidateData createMultiOriginXLDFSelectStep(
            final XLDFMultiCreationParams params, final ExecutantType executantType, 
            final XLDFTransaction transMaster)  ;

    /**
     * Creates the multi origin xldf insert step.
     *
     * @param <E> the element type
     * @param params the params
     * @param xldfMultiCreationIntermeidateData the xldf multi creation intermeidate data
     * @param executantType the executant type
     * @return the map< class<? extends xldf domain object>, map< string, xldf domain object>>
     */
    <E extends XLDFDomainObject> Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> 
    createMultiOriginXLDFInsertStep(
            final XLDFMultiCreationParams params,
            final XLDFMultiCreationIntermeidateData xldfMultiCreationIntermeidateData, 
            final ExecutantType executantType) ;

    /**
     * Creates the single origin xldf.
     *
     * @param <E> the element type
     * @param executantType the executant type
     * @param params the params
     * @param transMaster the trans master
     * @return the e
     */
    <E extends XLDFDomainObject> E createSingleOriginXLDF(final ExecutantType executantType,
            final XLDFCreationParams params, final XLDFTransaction transMaster) ;

    /**
     * Insert xldf hibernate object.
     *
     * @param operationSequenceId the operation sequence id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param siteId the site id
     * @param unit the unit
     * @param xldfMultiCreationIntermeidateData the xldf multi creation intermeidate data
     * @throws IllegalAccessException the illegal access exception
     * @throws InvocationTargetException the invocation target exception
     * @throws NoSuchMethodException the no such method exception
     */
    void insertXldfHibernateObject(final Integer operationSequenceId, final String transactionId, final String userId,
            final String siteId, final XLDFDomainObject unit,
            final XLDFMultiCreationIntermeidateData xldfMultiCreationIntermeidateData) 
                    throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;

    /**
     * Check convert existed xldf domain obj.
     *
     * @param params the params
     * @param operationSequenceId the operation sequence id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param siteId the site id
     * @param unit the unit
     * @return the XLDF domain object
     * @throws Exception the exception
     */
    XLDFDomainObject checkConvertExistedXLDFDomainObj(final XLDFMultiCreationParams params,
            final Integer operationSequenceId, final String transactionId, final String userId, final String siteId,
            XLDFDomainObject unit) throws Exception;

    /**
     * Post process xldfmt series.
     *
     * @param result the result
     * @param executantType the executant type
     * @return the map< class<? extends xldf domain object>, map< string, xldf domain object>>
     */
    Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> postProcessXLDFMTSeries(
            final Map<Class<? extends XLDFDomainObject>, Map<String, XLDFDomainObject>> result,
            final ExecutantType executantType) ;

    /**
     * Find data by xldf type.
     *
     * @param xldfType the xldf type
     * @param executantType the executant type
     * @return the list
     */
    List<Object[]> findDataByXldfType(final String xldfType, final ExecutantType executantType);

    /**
     * Gets the xldf hibernate object.
     *
     * @param operationSequenceId the operation sequence id
     * @param xldfType the xldf type
     * @param domainKey the domain key
     * @param executantType the executant type
     * @return the xldf hibernate object
     * @throws Exception the exception
     */
    Object getXldfHibernateObject(final Integer operationSequenceId, final String xldfType, final String domainKey,
            final ExecutantType executantType) throws Exception;

    /**
     * Creates the single origin xld fwith tx.
     *
     * @param <E> the element type
     * @param executantType the executant type
     * @param params the params
     * @param logic the logic
     * @param domainDTOExport the domain dto export
     * @return the list<? extends rl ws rule>
     */
    <E extends XLDFDomainObject> List<? extends RlWsRule> createSingleOriginXLDFwithTX(
            final ExecutantType executantType, final XLDFCreationParams params,
            final Class<? extends AppendGetMultiDatalogic> logic, final boolean domainDTOExport) ;

    /**
     * Creates the multi origin xld fwith tx.
     *
     * @param <E> the element type
     * @param executantType the executant type
     * @param params the params
     * @param logic the logic
     * @param domainDTOExport the domain dto export
     * @return the list<? extends rl ws rule>
     */
    <E extends XLDFDomainObject> List<? extends RlWsRule> createMultiOriginXLDFwithTX(
            final ExecutantType executantType, final XLDFCreationParams[] params,
            final Class<? extends AppendGetMultiDatalogic> logic, final boolean domainDTOExport) ;

    /**
     * Creates the single origin xld fwith tx.
     *
     * @param <E> the element type
     * @param executantType the executant type
     * @param params the params
     * @param transMaster the trans master
     * @return the e
     */
    <E extends XLDFDomainObject> E createSingleOriginXLDFwithTX(final ExecutantType executantType,
            final XLDFCreationParams params, final XLDFTransaction transMaster);
}
