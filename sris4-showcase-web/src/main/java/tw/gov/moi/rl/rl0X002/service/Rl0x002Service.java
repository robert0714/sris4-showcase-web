/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0X002.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x002DTO;

/**
 * 職權更正審核處理服務介面.
 * 
 * @author Dan Tsai
 */
public interface Rl0x002Service {

    String TEMPLATE = " select  * from %s where  %s ";

    String DOMAIN_TYPE_HBM = "tw/gov/moi/domain/%sType.hbm.xml";

    /**
     * 初始化
     * 
     * @param rl0x002dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void init(final Rl0x002DTO rl0x002dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢取得職權更正索引資料檔列表.
     * 
     * @param rl0X002DTO
     *            the rl0 x002 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQueryList(final Rl0x002DTO rl0x002DTO, final ExecutantType executantType) throws RisBusinessException;;

    /**
     * 選擇資料並導頁至進行審核之頁面.
     * 
     * @param rl0X002DTO
     *            the rl0 x002 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    String toSelectedDataPage(final Rl0x002DTO rl0x002DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.NOTICE)
    void doSendNotice(final Rl0x002DTO rl0x002DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化畫面.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    // @RisServiceMethod(MethodType.QUERY)
    // void initWebUI(final Rl0x002DTO rl0x002DTO, final ExecutantType
    // executantType) throws RisBusinessException;

}
