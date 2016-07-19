/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFTransactionOperation;
import tw.gov.moi.rl.domain.XLDFHouseholdDataDTO;
import tw.gov.moi.rs.common.constant.RsCDMesg;

/**
 * 個人的戶籍登記共用元件介面.
 * 
 * @author CK Lin
 * 
 */
public interface PersonOperationComponent {

    /** The Constant 當事人. */
    String TXN_PERSON = "當事人";

    /** The Constant DOCUMENT. */
    String DOCUMENT = "文件核發";

    /** The Constant OTHER. */
    String OTHER = "其他";

    /** The Constant ERR_MSG_GET_PERSON_OPERATION. */
    String ERR_MSG_GET_PERSON_OPERATION = "取得個人的戶籍登記作業失敗";

    String[] EXPECTED = { RsCDMesg.TX6086E.getCode(), RsCDMesg.TX6214W.getCode() };

    /**
     * 依當事人條件取得戶籍登記作業清單.
     * 
     * @param pPersonData
     *            個人基本資料
     * @param pXLDFHouseholdDataDTO
     *            全戶基本資料
     * @return the txn person operation
     */
    Map<String, Boolean> getTxnPersonOperation(final XLDFDomainObject pPersonData,
            final XLDFHouseholdDataDTO pXLDFHouseholdDataDTO);

    /**
     * Gets the dependency operation.
     * 
     * @param pOperations
     *            the operations
     * @param pExecutantType
     *            the executant type
     * @return the dependency operation
     */
    List<String> getDependencyOperation(final List<XLDFTransactionOperation> pOperations,
            final ExecutantType pExecutantType);

    /**
     * 以作業代碼檢查當事人是否可辦理.
     * 
     * @param pOperationCode
     *            作業代碼
     * @param pPersonData
     *            個人基本資料
     * @param pXLDFHouseholdDataDTO
     *            全戶基本資料
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    void validateTxnPersonByOperationCode(final String pOperationCode, final XLDFDomainObject pPersonData,
            final XLDFHouseholdDataDTO pXLDFHouseholdDataDTO) throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException;
}
