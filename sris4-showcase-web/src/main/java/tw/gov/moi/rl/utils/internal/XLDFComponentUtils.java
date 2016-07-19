/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.utils.internal;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.RedfobsdlgType;
import tw.gov.moi.domain.XldfaplcexType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.XldfhdrmType;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.domain.XldfspecialnoticeType;
import tw.gov.moi.domain.XldftrnstnType;
import tw.gov.moi.domain.XldftxnoprType;
import tw.gov.moi.domain.XldftxnprsType;
import tw.gov.moi.rl.component.dto.XLDFAction;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFTransaction;
import tw.gov.moi.rl.component.dto.XLDFTransactionParams;
import tw.gov.moi.rl.domain.XLDFTxnPersonDTO;

/**
 * The Interface XLDFComponentUtils.
 */
public interface XLDFComponentUtils {

    /**
     * Group by xldfopracs type and seq id.
     *
     * @param access the access
     * @return the map
     */
    Map<Integer, Map<String, Map<String, List<XldfopracsType>>>> groupByXldfopracsTypeAndSeqId(
            final List<XldfopracsType> access);

    /**
     * Gets the err msg person not found.
     *
     * @param xldfType the xldf type
     * @param domainKey the domain key
     * @param pPerson the person
     * @return the err msg person not found
     */
    String getErrMsgPersonNotFound(final Class<? extends XLDFDomainObject> xldfType, final String domainKey,
            final String pPerson);

    /**
     * Query rldf access data.
     *
     * @param dbsmain the dbsmain
     * @param seqId the seq id
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param filterReg the filter reg
     * @return the list
     */
    List<XldfopracsType> queryRldfAccessData(final DBSMain dbsmain, final Integer seqId, final String siteId,
            final String transactionId, final String userId, final String filterReg);

    /**
     * Gets the err msg master not found.
     *
     * @param xldfType the xldf type
     * @param params the params
     * @return the err msg master not found
     */
    String getErrMsgMasterNotFound(final Class<? extends XLDFDomainObject> xldfType, final XLDFTransactionParams params);

    /**
     * Gets the action history b map by type and key.
     *
     * @param dbsmain the dbsmain
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @return the action history b map by type and key
     */
    Map<String, Map<String, String>> getactionHistoryBMapByTypeAndKey(final DBSMain dbsmain, final String siteId,
            final String transactionId, final String userId, final Integer sequenceId);

    /**
     * Gets the redf obsdlg current row.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the redf obsdlg current row
     */
    Integer getRedfObsdlgCurrentRow(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the xldfaplcex type list.
     *
     * @param conn the conn
     * @param seqId the seq id
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfaplcex type list
     */
    List<XldfaplcexType> getXldfaplcexTypeList(final DBSMain conn, final Integer seqId, final String siteId,
            final String transactionId, final String userId);

    /**
     * Gets the xldfaplcex type.
     *
     * @param conn the conn
     * @param personId the person id
     * @param personRole the person role
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfaplcex type
     */
    XldfaplcexType getXldfaplcexType(final DBSMain conn, final String personId, final String personRole,
            final String siteId, final String transactionId, final String userId);

    /**
     * Gets the xldfefaplc type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfefaplc type
     */
    XldfefaplcType getXldfefaplcType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the xldf domain obj by keys.
     *
     * @param <E> the element type
     * @param access the access
     * @return the xldf domain obj by keys
     * @throws InstantiationException the instantiation exception
     * @throws IllegalAccessException the illegal access exception
     */
    <E extends XLDFDomainObject> E getXldfDomainObjByKeys(final XldfopracsType access) throws InstantiationException, IllegalAccessException;

    /**
     * Gets the xldf dto.
     *
     * @param <E> the element type
     * @param targetClass the target class
     * @param xldfObj the xldf obj
     * @param transactionId the transaction id
     * @return the xldf dto
     */
    <E extends XLDFDomainObject> E getXldfDto(final Class<? extends XLDFDomainObject> targetClass,
            final Object xldfObj, final String transactionId);

    /**
     * Gets the comparator order by action.
     *
     * @return the comparator order by action
     */
    Comparator<XldfopracsType> getComparatorOrderByAction();

    /**
     * Checks if is lock.
     *
     * @param <E> the element type
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @return true, if is lock
     */
    <E extends XLDFDomainObject> boolean isLock(final DBSMain conn, final String transactionId, final String siteId,
            final String userId, final Class<E> clazz, final String domainKey);

    /**
     * Gets the xldf entity.
     *
     * @param <E> the element type
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @param clazz the clazz
     * @param serialNo the serial no
     * @param domainKey the domain key
     * @return the xldf entity
     */
    <E extends XLDFDomainObject> Object getXldfEntity(final DBSMain conn, final String transactionId,
            final String siteId, final String userId, final Class<E> clazz, final Integer serialNo,
            final String domainKey);

    
    /**
     * Creates the xldftxnprs type number.
     *
     * @param transactionId the transaction id
     * @return the integer
     */
    Integer createXldftxnprsTypeNumber(String transactionId);

    /**
     * Creates the xldf serial no.
     *
     * @param transactionId the transaction id
     * @param clazz the clazz
     * @return the integer
     */
    Integer createXldfSerialNo(final String transactionId, final Class<?> clazz);

    /**
     * Gets the xldfopracs type last type and seq id.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @return the xldfopracs type last type and seq id
     */
    Map<Integer, XLDFAction> getXldfopracsTypeLastTypeAndSeqId(final DBSMain conn, final String siteId,
            final String transactionId, final String userId, final Class<?> clazz, final String domainKey);

    /**
     * Gets the xldfopracs type last type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param seqId the seq id
     * @param domainKey the domain key
     * @return the xldfopracs type last type
     */
    XLDFAction getXldfopracsTypeLastType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Class<?> clazz, final Integer seqId, final String domainKey);

    /**
     * Gets the xldfopracs type last type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @return the xldfopracs type last type
     */
    XLDFAction getXldfopracsTypeLastType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Class<?> clazz, final String domainKey);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @param seqId the seq id
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Class<?> clazz, final String domainKey, final Integer seqId);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Class<?> clazz, final String domainKey);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the xldfspecial notice type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @return the xldfspecial notice type
     */
    List<XldfspecialnoticeType> getXldfspecialNoticeType(final DBSMain conn, final String siteId,
            final String transactionId, final String userId, final Integer sequenceId);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param xldfType the xldf type
     * @param seqId the seq id
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Class<? extends XLDFDomainObject> xldfType, final Integer seqId);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param xldfType the xldf type
     * @param likeDomainKey the like domain key
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final String xldfType, final String likeDomainKey);

    /**
     * Gets the access type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @param excludeAction the exclude action
     * @return the access type
     */
    Set<String> getAccessType(final DBSMain conn, final String siteId, final String transactionId, final String userId,
            final Integer sequenceId, final XLDFAction excludeAction);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @param excludeAction the exclude action
     * @return the xldfopracs type
     */
    Map<String, List<XldfopracsType>> getXldfopracsType(final DBSMain conn, final String siteId,
            final String transactionId, final String userId, final Integer sequenceId, final XLDFAction excludeAction);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @return the xldfopracs type
     */
    List<XldfopracsType> getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final Integer sequenceId);

    /**
     * Gets the xldfopracs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param sequenceId the sequence id
     * @param classType the class type
     * @param serialNo the serial no
     * @return the xldfopracs type
     */
    XldfopracsType getXldfopracsType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId, final String sequenceId, final String classType, final String serialNo);

    /**
     * Gets the xldfhdrm type by seq id.
     *
     * @param conn the conn
     * @param seqId the seq id
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfhdrm type by seq id
     */
    List<XldfhdrmType> getXldfhdrmTypeBySeqId(final DBSMain conn, final Integer seqId, final String siteId,
            final String transactionId, final String userId);

    /**
     * Gets the xldfhdrm type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldfhdrm type
     */
    List<XldfhdrmType> getXldfhdrmType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the xldftxnopr type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldftxnopr type
     */
    List<XldftxnoprType> getXldftxnoprType(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the copy xldfopracs type.
     *
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @param serialNo the serial no
     * @param sequenceId the sequence id
     * @param classType the class type
     * @return the copy xldfopracs type
     * @throws Exception the exception
     */
    XldfopracsType getCopyXldfopracsType(final DBSMain conn, final String transactionId, final String siteId,
            final String userId, final String serialNo, final String sequenceId, final String classType) throws Exception;

    /**
     * Gets the merge xldf entity.
     *
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @param domainKey the domain key
     * @param clazz the clazz
     * @param sequenceId the sequence id
     * @return the merge xldf entity
     * @throws Exception the exception
     */
    Object getMergeXLDFEntity(final DBSMain conn, final String transactionId, final String siteId, final String userId,
            final String domainKey, final Class<? extends XLDFDomainObject> clazz, final Integer sequenceId) throws Exception;

    /**
     * Filter max seq xldf entities.
     *
     * @param srcList the src list
     * @param specificSeqId the specific seq id
     * @return the list
     */
    List<Object> filterMaxSeqXldfEntities(final List<Object> srcList, final Integer specificSeqId);

    /**
     * Gets the rome object.
     *
     * @param <E> the element type
     * @param <X> the generic type
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @param clazz the clazz
     * @param domainKey the domain key
     * @param romeClass the rome class
     * @return the rome object
     */
    <E extends XLDFDomainObject, X extends XLDFDomainObject> E getRomeObject(final DBSMain conn, final String siteId,
            final String transactionId, final String userId, final Class<X> clazz, final String domainKey,
            Class<E> romeClass);

    /**
     * Gets the xldftxnprs type by serail no.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param personSerialNo the person serial no
     * @param userId the user id
     * @return the xldftxnprs type by serail no
     */
    XldftxnprsType getXldftxnprsTypeBySerailNo(final DBSMain conn, final String siteId, final String transactionId,
            final Integer personSerialNo, final String userId);

    /**
     * Gets the xldftxnprs types.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldftxnprs types
     */
    List<XldftxnprsType> getXldftxnprsTypes(final DBSMain conn, final String siteId, final String transactionId,
            final String userId);

    /**
     * Gets the xldftxnprs type.
     *
     * @param conn the conn
     * @param siteId the site id
     * @param transactionId the transaction id
     * @param userId the user id
     * @return the xldftxnprs type
     */
    Map<Integer, XLDFTxnPersonDTO> getXldftxnprsType(final DBSMain conn, final String siteId,
            final String transactionId, final String userId);

    /**
     * Ds query.
     *
     * @param <E> the element type
     * @param conn the conn
     * @param dsName the ds name
     * @param params the params
     * @param userId the user id
     * @param siteId the site id
     * @param transactionId the transaction id
     * @return the list
     */
    <E extends Object> List<E> dsQuery(final DBSMain conn, final String dsName, final List<String> params,
            final String userId, final String siteId, final String transactionId);

    /**
     * Gets the redfobsdlg.
     *
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @return the redfobsdlg
     */
    List<RedfobsdlgType> getRedfobsdlg(final DBSMain conn, final String transactionId, final String siteId,
            final String userId);

    /**
     * Gets the xldftrnstn type.
     *
     * @param conn the conn
     * @param transactionId the transaction id
     * @param siteId the site id
     * @param userId the user id
     * @return the xldftrnstn type
     */
    XldftrnstnType getXldftrnstnType(final DBSMain conn, final String transactionId, final String siteId,
            final String userId);

    /**
     * Process xldf transaction to xldftrnstn type.
     *
     * @param source the source
     * @return the xldftrnstn type
     */
    XldftrnstnType processXLDFTransactionToXldftrnstnType(final XLDFTransaction source);

}
