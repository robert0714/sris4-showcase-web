/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.MassMoveParamDTO;

/**
 * 行政區域調整、大戶遷徙 共用元件
 * 
 * @author marcus
 * 
 */
public interface MassMoveComponent {

    final String PRIORITY_ONE = "1";

    final String PRIORITY_TWO = "2";

    @RisServiceMethod(MethodType.SAVE)
    public void process(final DBSMain conn, MassMoveParamDTO param, ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    public void restore(final DBSMain conn, MassMoveParamDTO param, ExecutantType executantType)
            throws RisBusinessException;

}
