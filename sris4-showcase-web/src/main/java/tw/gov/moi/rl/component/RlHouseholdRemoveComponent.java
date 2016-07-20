/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfhdrmType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.dto.XLDFRemoveHouseholdDTO;
import tw.gov.moi.rl.component.dto.RlHouseholdRemoveDTO;
import tw.gov.moi.rl.component.dto.RlHouseholdRemoveResultDTO;
import tw.gov.moi.rl.component.dto.RlHouseholdRemoveType;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 
 * 處理RLDF的下除戶
 * 
 * @author marcus
 * 
 */
public interface RlHouseholdRemoveComponent {

    /**
     * 處理RLDF個人相關資料的下除戶
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    RlHouseholdRemoveResultDTO processPerson(final DBSMain conn1, final RlHouseholdRemoveDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 處理RLDF全戶相關資料的下除戶
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    RlHouseholdRemoveResultDTO processHousehold(final DBSMain conn1, final RlHouseholdRemoveDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 註冊DeleteType
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    void registerDeleteType(final DBSMain conn1, final XLDFRemoveHouseholdDTO param, final ExecutantType exe)
            throws RisBusinessException;

    /**
     * 註冊RlHouseholdRemoveType
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    void registerRemoveType(final DBSMain conn1, final XLDFRemoveHouseholdDTO param, RlHouseholdRemoveType removeType,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 產生通報檔
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    RlHouseholdRemoveResultDTO createObnfForEandL(final DBSMain conn1, final RlHouseholdRemoveDTO param,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 產生通報檔
     * 
     * @param conn1
     *            DBSMain
     * @param dto
     *            RlHouseholdRemoveDTO
     * @param exe
     *            ExecutantType
     * @return RlHouseholdRemoveResultDTO
     * @throws RisBusinessException
     */
    ObnfDTO create01804MoveinPersonObnfForE(final DBSMain conn1, final XldfhdrmType param, final ExecutantType exe)
            throws RisBusinessException;
}
