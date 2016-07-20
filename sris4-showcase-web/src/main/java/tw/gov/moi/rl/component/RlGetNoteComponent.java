/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfd003Type;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 取得記事樣板文字共用元件介面.
 * 
 * @author 1119253
 */
public interface RlGetNoteComponent {

    /**
     * @return
     * @throws RisBusinessException
     */
    public String getTemplateWording(final String registerCode, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得記事代碼
     * 
     * @param mainType
     *            主分類
     * @param subType
     *            次分類
     * @param executantType
     * @return
     */
    public List<Rldfd003Type> doQueryRldfd003(final String mainType, final String subType,
            final ExecutantType executantType) throws RisBusinessException;

    public List<Rldfd003Type> doQueryRldfd003forRL011x0(final String mainType, final String subType,
            final ExecutantType executantType) throws RisBusinessException;

}
