/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Set;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 資料鎖定與解除鎖定服務介面.
 * 
 * @author morris.jou
 */
public interface RlLockTableCompone {
    /**
     * 資料鎖定.
     * <b> 由於lock 的connection是獨立transaction,尤其table lock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b> 
     * @param destSiteId
     *            目的端作業點代碼
     * @param dataEntity
     *            欲鎖定資料的資料物件
     * @param executantType
     *            執行環境設定參數
     * @param actionIp
     *            the action ip
     * @throws RisBusinessException
     *             the dB exception
     *          
     */
    public void lock(String destSiteId, Object dataEntity, ExecutantType executantType, String actionIp)
            throws RisBusinessException;

   

    /**
     * 資料鎖定.
     * <b> 由於lock 的connection是獨立transaction,尤其table lock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param destSiteId
     *            目的端作業點代碼
     * @param dataEntity
     *            欲鎖定資料的資料物件
     * @param conn
     *            DB連線物件
     * 
     * @param executantType
     *            執行環境設定參數
     * @param actionIp
     *            the action ip
     * @throws RisBusinessException
     *             the dB exception
     */
    @Deprecated
    public void lock(String destSiteId, Object dataEntity, DBSMain conn, ExecutantType executantType, String actionIp)
            throws RisBusinessException;

    /**
     * 資料鎖定.
     * <b> 由於lock 的connection是獨立transaction,尤其table lock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param dataEntity
     *            欲鎖定資料的資料物件
     * @param executantType
     *            執行環境設定參數
     * @param actionIp
     *            the action ip
     * @throws RisBusinessException
     *             the dB exception
     */
    public void lock(Object dataEntity, ExecutantType executantType, String actionIp) throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * <b> 由於unlock 的connection是獨立transaction,尤其table unlock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            欲解除鎖定資料的資料物件
     * @throws RisBusinessException
     *             the dB exception
     */
    public void unlock(final ExecutantType executantType, Object dataEntity) throws RisBusinessException;

    /**
     * 檢查鎖定.
     * 
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            the data entity
     * @return true 已有相同鎖定資料，false 未有相同鎖定資料
     * @throws RisBusinessException
     *             the ris business exception
     */
    public boolean checkLock(final ExecutantType executantType, Object dataEntity) throws RisBusinessException;

    /**
     * 檢查鎖定的型態，判別是否有相同鎖定資料.
     * 
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            鎖定的資料的資料物件
     * @return the int 回傳鎖定型態，0 表示未有相同的鎖定資料，1 被自己鎖定，2 被其他人鎖定
     * @throws RisBusinessException
     *             the ris business exception
     */
    public int checkLockType(final ExecutantType executantType, Object dataEntity) throws RisBusinessException;

    /**
     * token unLock.
     * 
     * @param actionId
     *            交易序號
     * @param siteId
     *            作業點代碼
     * @throws RisBusinessException
     *             the ris business exception
     */
    void returnPersonToken(final ExecutantType executantType, final String siteId) throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * <b> 由於unlock 的connection是獨立transaction,尤其table unlock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param executantType
     *            執行環境設定參數
     * @param dataEntitys
     *            欲解除鎖定資料的資料物件
     * @throws RisBusinessException
     *             the dB exception
     */
    void unlock(final ExecutantType executantType, List<?> dataEntitys) throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * <b> 由於unlock 的connection是獨立transaction,尤其table unlock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param executantType
     *            執行環境設定參數
     * @param dataEntitySet
     *            欲解除鎖定資料的資料Set
     * @throws RisBusinessException
     *             the dB exception
     */
    void unlock(final ExecutantType executantType, Set<Object> dataEntitySet) throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * <b> 由於unlock 的connection是獨立transaction,尤其table unlock在執行完結束會close connection,如果有共用connection情形會造成Hibernate session is closed 的exception發生</b>
     * @param destSiteId
     *            目的端作業點代碼
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            欲解除鎖定資料的資料物件
     * @throws RisBusinessException
     *             the dB exception
     */
    public void unlock(String destSiteId, final ExecutantType executantType, Object dataEntity)
            throws RisBusinessException;

    /**
     * 檢查鎖定.
     * 
     * @param destSiteId
     *            目的端作業點代碼
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            the data entity
     * @return true 已被鎖定資料(不論是否被同一筆交易序號鎖住)，false 未有相同鎖定資料
     * @throws RisBusinessException
     *             the ris business exception
     */
    public boolean checkLock(String destSiteId, final ExecutantType executantType, Object dataEntity)
            throws RisBusinessException;

    /**
     * 檢查鎖定的型態，判別是否有相同鎖定資料.
     * 
     * @param destSiteId
     *            目的端作業點代碼
     * @param executantType
     *            執行環境設定參數
     * @param dataEntity
     *            鎖定的資料的資料物件
     * @return the int 回傳鎖定型態，0 表示未有相同的鎖定資料，1 被自己鎖定，2 被其他人鎖定
     * @throws RisBusinessException
     *             the ris business exception
     */
    public int checkLockType(String destSiteId, final ExecutantType executantType, Object dataEntity)
            throws RisBusinessException;

    /**
     * token unLock.
     * 
     * @param destSiteId
     *            目的端作業點代碼
     * @param actionId
     *            交易序號
     * @throws RisBusinessException
     *             the ris business exception
     */
    void returnPersonToken(String destSiteId, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * 
     * @param destSiteId
     *            目的端作業點代碼
     * @param executantType
     *            執行環境設定參數
     * @param dataEntitys
     *            欲解除鎖定資料的資料物件
     * @throws RisBusinessException
     *             the dB exception
     */
    void unlock(String destSiteId, final ExecutantType executantType, List<?> dataEntitys) throws RisBusinessException;

//    void returnPersonToken(final String destSiteId, final DBSMain conn, final ExecutantType info)
//            throws RisBusinessException;

//    void unlock(final DBSMain conn, final ExecutantType executantType, Object dataEntity) throws RisBusinessException;

//    void unlock(final String destSiteId, final DBSMain conn, final ExecutantType info, final Object dataEntity)
//            throws RisBusinessException;

    /***
     * 針對職權更正而做的產生lock方法...預設不留下lock紀錄
     * */
    public void lockForWaAddi(final Object dataEntity, final ExecutantType info) throws RisBusinessException;

    /***
     * lock本地,給取得遠端主機所有資料的file的method使用
     * */
    public void lockLocal(final String destSiteId, final Object dataEntity, final ExecutantType fromRequestSiteInfo)
            throws RisBusinessException;

    /***
     * 寫unlockrecord
     * */
    public void writeUnlockRecord(final DBSMain conn, final Object dataEntity, final String tableName,
            final String key, final String dSiteId, final ExecutantType exe) throws RisBusinessException;

}
