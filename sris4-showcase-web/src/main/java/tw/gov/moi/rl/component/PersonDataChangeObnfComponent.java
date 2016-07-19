/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 個人資料更新業務共用Obnf元件介面.
 * 
 * @author Jay Kan
 */
public interface PersonDataChangeObnfComponent {

    String MAKE_PERSON_DATA_OBNF_DTO = "製作個人資料通報[RL]或[RR及RC]的ObnfDTO";

    String MAKE_NAME_CHANGE_OBNF_DTO = "製作姓名更改紀錄通報[RL]或[RR及RC]的ObnfDTO";

    /**
     * 製作個人資料通報[RL]或[RR及RC]的ObnfDTO.
     * 
     * @param pXLDF004M
     *            Xldf004m
     * @param pIsSameHost
     *            是否本地辦理
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    List<ObnfDTO> makePersonDataObnfDTO(final XLDF004M pXLDF004M, final boolean pIsSameHost, final ExecutantType pExecutantType);

    /**
     * 製作個人資料通報[RL]或[RR及RC]的ObnfDTO (不送XLDFYEntity).
     * 
     * @param pXLDF004M
     *            Xldf004m
     * @param pIsSameHost
     *            是否本地辦理
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    List<ObnfDTO> makePersonDataObnfDTONoSendXLDFYEntity(final XLDF004M pXLDF004M, final boolean pIsSameHost, final ExecutantType pExecutantType);

    /**
     * 製作姓名更改紀錄通報[RL]或[RR及RC]的ObnfDTO.
     * 
     * @param pXLDF004M
     *            Xldf004m
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    List<ObnfDTO> makeNameChangeObnfDTO(final XLDF004M pXLDF004M, final ExecutantType pExecutantType);

    /**
     * 製作關係人個人資料通報[RL]或[RR及RC]的ObnfDTO.
     * 
     * @param pXLDF004M
     *            Xldf004m
     * @param pRegisterYyymmdd
     *            登記日期
     * @param pRegisterHhmmss
     *            登記時間
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    List<ObnfDTO> makeRelatedPersonDataObnfDTO(final XLDF004M pXLDF004M, final String pRegisterYyymmdd, final String pRegisterHhmmss, final ExecutantType pExecutantType);
}
