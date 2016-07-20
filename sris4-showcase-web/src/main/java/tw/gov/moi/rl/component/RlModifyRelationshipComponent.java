/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01e10DTO.RlModifyRelationshipDTO;

/**
 * 修改教育程度註記共用元件介面.
 * 
 * @author 1119253
 */
public interface RlModifyRelationshipComponent {

    /**
     * 傳入多筆教育程度的 DTO 更新教育程度
     * 
     * @param modifyList
     * @param executantType
     * @throws RisBusinessException
     */
    public void modifyRelationship(final List<RlModifyRelationshipDTO> modifyList, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 傳入單筆教育程度的 DTO 更新教育程度
     * 
     * @param rlModifyEducationDTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void modifyRelationship(final RlModifyRelationshipDTO rlModifyEducationDTO, final ExecutantType executantType)
            throws RisBusinessException;
}