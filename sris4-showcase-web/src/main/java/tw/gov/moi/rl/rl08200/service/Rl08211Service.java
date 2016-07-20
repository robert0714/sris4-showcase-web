/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08211DTO;

/**
 * 製作未詳動態申請書資料清冊處理服務 Rl08211Service.
 */
public interface Rl08211Service {

    String DS_NAME_BornQuery = "rl08211.getRldft001";

    String DS_NAME_DeathQuery = "rl08211.getRldft002";

    String DS_NAME_MarriageQuery = "rl08211.getRldft003";

    String DS_NAME_DivorceQuery = "rl08211.getRldft004";

    String DS_NAME_GuardianshipQuery = "rl08211.getRldft079";

    String DS_NAME_MinorChildrenQuery = "rl08211.getRldft080";

    String DS_NAME_NoHouRegMGRQuery = "rl08211.getRldft0z4";

    String DS_NAME_NoHouRegDevQuery = "rl08211.getRldft0z5";

    /**
     * 設定製作未詳動態申請書資料清冊資料.
     * 
     * @param rl08211DTO
     *            the rl08211 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doQuery(final Rl08211DTO rl08211DTO, final ExecutantType executantType) throws RisBusinessException;

    // /**
    // * 製作未詳出生登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doBornQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
    //
    // /**
    // * 轉錄死亡登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doDeathQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
    //
    // /**
    // * 製作未詳結婚登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doMarriageQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
    //
    // /**
    // * 製作未詳離婚登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doDivorceQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
    //
    // /**
    // * 製作未詳監護登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doGuardianshipQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType)
    // throws RisBusinessException;
    //
    // /**
    // * 製作未詳未成年子女權利義務行使負擔登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doMinorChildrenQuery(final Rl08211DTO rl08211DTO, final
    // ExecutantType executantType)
    // throws RisBusinessException;
    //
    // /**
    // * 製作未詳現無戶籍者結婚登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doNoHouRegMGRQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
    //
    // /**
    // * 製作未詳現無戶籍者離婚登記申請書資料.
    // *
    // * @param rl08211DTO
    // * the rl08211 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // void doNoHouRegDevQuery(final Rl08211DTO rl08211DTO, final ExecutantType
    // executantType) throws RisBusinessException;
}
