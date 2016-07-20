/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01623DTO;

/**
 * 門牌改編服務介面.
 * 
 * @author Alan Lo
 */
public interface Rl01623Service {

    /**
     * 顯示門牌改編.
     * 
     * @param rl01623DTO
     *            the rl01623 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(final Rl01623DTO rl01623DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌改編.
     * 
     * @param rl01623DTO
     *            the rl01623 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01623DTO rl01623DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do store.
     * 
     * @param rl01623DTO
     *            the rl01623 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doStore(final Rl01623DTO rl01623DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void checkAfterStreetDoor(final Rl01623DTO rl01623DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
