/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a200.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a200DTO;

/**
 * 規費項目處理服務介面
 * 
 * @author neo
 */
public interface Rl0a200Service {
    String GET_MAX_FEECODE_SQL = "select max(fee_code) from rldfu001 where org='RL' and site_id = ? ";

    String QUERY_BY_FEE_ITEM_SQL = "select * from rldfu001 where site_id = ? and fee_item = ? ";

    String GET_FEE_ITEM_SQL = "select fee_item from rldfu001 where site_id = ? ";

    String QUERY_RLDFU004 = "select * from rldfu004 where site_id = ? ";

    String COUNT_OGR_CATEGORY = "select count(1) from rldfu001 where site_id = ? and org= 'RL' and category = ? ";

    String PRICE = "price";

    String STRING_99999 = "99999";

    /**
     * 規費項目存檔
     * 
     * Creates the application org xldf.
     * 
     * @param rl0a200DTO
     *            the rl0a200 dto
     * @param executantType
     *            the executant type
     * @return the rl0a200 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    public void doSaveU004(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    public void doModify(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 規費項目刪除
     * 
     * Gets the fee price.
     * 
     * @param rl0a200DTO
     *            the rl0a200 dto
     * @param executantType
     *            the executant type
     * @return the fee price
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢規費項目
     * 
     * Modify fee.
     * 
     * @param rl0a200DTO
     *            the rl0a200 dto
     * @param executantType
     *            the executant type
     * @return the rl0a200 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldfu004(Rl0a200DTO rl0a200DTO, ExecutantType executantType) throws RisBusinessException;
}
