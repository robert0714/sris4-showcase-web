/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfaplcexType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * XLDF申請人處理元件介面
 * 
 * @author Marcus Chen
 * 
 */
public interface XLDFApplicantComponent {
    /**
     * 新增申請人
     * 
     * @param conn1
     *            交易連線
     * @param xldfaplce
     *            申請人領域物件
     * @param executant
     *            執行環境設定參數
     * @throws RisBusinessException
     */
    public void add(final DBSMain conn1, final XldfaplcexType xldfaplce, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 移除申請人
     * 
     * @param conn1
     *            交易連線
     * @param seqId
     *            作業順序
     * @param personId
     *            申請人統號
     * @param personRole
     *            申請人角色
     * @param executant
     *            執行環境設定參數
     * @throws RisBusinessException
     */
    public void remove(final DBSMain conn1, final Integer seqId, final String personId, final String personRole,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得申請人清單
     * 
     * @param conn1
     *            交易連線
     * @param seqId
     *            作業順序
     * @param executant
     *            執行環境設定參數
     * @return List<XldfaplcexType> 申請人領域物件的清單
     * @throws RisBusinessException
     */
    public List<XldfaplcexType> getList(final DBSMain conn1, final Integer seqId, final ExecutantType executant)
            throws RisBusinessException;
    
    /**
     * 移除特定作業順序下的外加申請人
     * 
     * @param conn1
     *            交易連線
     * @param sequenceId
     *            作業順序
     * @param executant
     *            執行環境設定參數
     * @throws RisBusinessException
     */
   
    public void remove(final DBSMain conn1, final Integer sequenceId,  
            final ExecutantType executant) throws RisBusinessException;
}
