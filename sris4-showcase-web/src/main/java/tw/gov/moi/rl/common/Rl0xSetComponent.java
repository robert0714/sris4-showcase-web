/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rldfv001Type;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.domain.Rldfv003Type;
import tw.gov.moi.domain.Rldfv005Type;
import tw.gov.moi.domain.Rldfv006Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;
import tw.gov.moi.rl.domain.Rl0x001DTOResult;
import tw.gov.moi.rl.domain.Rl0xColumnAndValueDTO;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 職權更正共用元件介面.
 */
public interface Rl0xSetComponent extends Rl0xSetComponentConstant {

    public <T1> ObnfDTO makeRecodeObnfDTO(T1 type, ExecutantType executantType) throws RisBusinessException;

    public ObnfDTO makeIndexObnfDTO(Rldfv003Type type, ExecutantType executantType) throws RisBusinessException;

    /**
     * 發送通報附繳證件記錄檔
     * 
     * @param rldfv005s
     * @param rldfv006s
     * @param mainDto
     * @param exe
     * @throws RisBusinessException
     */
    public void doSenddCertNotice(List<Rldfv005Type> rldfv005s, List<Rldfv006Type> rldfv006s, Rl0x001DTO mainDto,
            ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param mainDto
     * @param obj
     * @param exe
     * @throws RisBusinessException
     */
    public void checkLcok(Rl0x001DTO mainDto, Object obj, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param mainDto
     * @param objs
     * @param exe
     * @throws RisBusinessException
     */
    public void checkLcok(Rl0x001DTO mainDto, List objs, ExecutantType exe) throws RisBusinessException;

    /**
     * 基本驗證
     * 
     * @param ui
     * @param mainDTO
     * @param exe
     * @throws RisBusinessException
     */
    public void baseVerify(List<Rl0x001DTOResult> ui, Rl0x001DTO mainDTO, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 必填欄位驗證
     * 
     * @param uis
     * @param mainDTO
     * @param exe
     * @throws RisBusinessException
     */
    public void doCheckNeeedValue(List<Rl0x001DTOResult> uis, Rl0x001DTO mainDTO, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 附繳證件驗證
     * 
     * @param uis
     * @param mainDTO
     * @param exe
     * @throws RisBusinessException
     */
    public void doCheckCertificate(List<Rl0x001DTOResult> uis, Rl0x001DTO mainDTO, ExecutantType exe)
            throws RisBusinessException;

    final String EQANDEQ = "%s='%s' ";

    String AND = " AND ";
    String PASS = "P";
    String REJECT = "R";
    String ACTION = "A";

    /**
     * 設定新舊值.
     * 
     * @param newData
     *            the new data
     * @param oldData
     *            the old data
     * @param target
     *            the target
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void serBean(Object newData, Object oldData, Object target) throws RisBusinessException;

    /**
     * 除去new名稱.
     * 
     * @param name
     *            the name
     * @return the removes the new word
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getRemoveNewWord(String name) throws RisBusinessException;

    /**
     * 加上new 名稱.
     * 
     * @param name
     *            the name
     * @return the adds the new word
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getAddNewWord(String name) throws RisBusinessException;

    /**
     * 移除old名稱.
     * 
     * @param name
     *            the name
     * @return the removes the old word
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getRemoveOldWord(String name) throws RisBusinessException;

    /**
     * 加上old名稱.
     * 
     * @param name
     *            the name
     * @return the adds the old word
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getAddOldWord(String name) throws RisBusinessException;

    /**
     * 取得動態資料.
     * 
     * @param partSql
     *            the part sql
     * @param tableCode
     *            the table code
     * @param targetClass
     *            the target class
     * @param exe
     *            the exe
     * @return the query result
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List getQueryResult(String partSql, String tableCode, Class targetClass, ExecutantType exe)
            throws RisBusinessException;

    /**
     * Gets the rldv002.
     * 
     * @param tableCode
     *            the table code
     * @param exe
     *            the exe
     * @return the rldv002
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldfv002Type> getRldv002(String tableCode, ExecutantType exe) throws RisBusinessException;

    /**
     * 判斷是否有相同pk資料.
     * 
     * @param <T>
     *            the generic type
     * @param t
     *            the t
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @return the boolean
     * @throws RisBusinessException
     *             the ris business exception
     */
    public <T> void checkThePkValue(T t, Rl0x001DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 判斷是否有相同pk資料.
     * 
     * @param t
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public <T> void doCheckThePkValue(T t, Rl0x001DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * Sets the rl0x001 dto result to domain type.
     * 
     * @param <T>
     *            the generic type
     * @param results
     *            輸入畫面資料
     * @param t
     *            記錄檔
     * @throws RisBusinessException
     *             the ris business exception
     */
    public <T> void setRl0x001DTOResultToDomainType(List<Rl0x001DTOResult> results, T t) throws RisBusinessException;

    /**
     * 取得RLDFV001資料表中文名稱欄位值.
     * 
     * @param exe
     *            the exe
     * @return the table name
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getTableName(final String recordTable, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得RLDFV001之職權更正功能代碼欄位值.
     * 
     * @param exe
     *            the exe
     * @return the func code by table code
     * @throws RisBusinessException
     *             the ris business exception
     */
    public String getFuncCodeByTableCode(final String recordTable, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得RLDFV001職權更正功能代碼欄位值.
     * 
     * @param exe
     *            the exe
     * @return the func code by record table
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rldfv001Type getFuncCodeByRecordTable(final String recordTable, final ExecutantType exe)
            throws RisBusinessException;

    /**
     * 設定畫面參數透過記錄檔
     * 
     * @param results
     *            畫面
     * @param tarObj
     *            資料來源
     * @param exe
     * @return
     */
    public <T> void setEditViewbyDomainType(List<Rl0x001DTOResult> results, T tarObj, final ExecutantType exe);

    /**
     * 設定畫面參數透過記錄檔
     * 
     * @param results
     *            畫面
     * @param tarObj
     *            資料來源
     * @param exe
     * @return
     */
    public <T1, T2> void setEditViewbyDomainType(List<Rl0x001DTOResult> results, T1 field1, T2 field2,
            final ExecutantType exe);

    /**
     * 設定記錄檔透過畫面參數
     * 
     * @param results
     *            目標畫面資料 Rl0x001DTOResults
     * @param tarObj
     *            來源:記錄檔 ex:Rldfs022m
     * @param exe
     * @return
     */
    public <T> void setDomainTypeByEditView(List<Rl0x001DTOResult> results, T source, final ExecutantType exe);

    /**
     * 會先把原有資料檔copy到紀錄檔然後再存記錄檔
     * 
     * 
     * @param source
     * 
     * @param targer
     *            rldfs211
     * 
     * @param dbi
     * @param exe
     */
    public <T1, T2> void saveRecord(final T1 source, final T2 targer, final DBSMain dbi, final ExecutantType exe);

    /**
     * 設定畫面到第一欄位與第二欄位
     * 
     * @param results
     * @param firstField
     * @param secondField
     * @param exe
     */
    public <T> void setDomainTypeByEditView(List<Rl0x001DTOResult> results, T firstField, T secondField,
            ExecutantType exe);

    /**
     * 初始化畫面樣式
     * 
     * @param mainDto
     * @param queryDto
     * @param editDto
     * @param commonType
     *            欄位預設值(每個作業不同)
     * @throws RisBusinessException
     */
    public <T> void initWebUI(Rl0x001DTO mainDto, List<Rl0x001DTOResult> queryDto, List<Rl0x001DTOResult> editDto,
            T commonType, ExecutantType exe) throws RisBusinessException;

    /**
     * saveRldfv001
     * 
     * @param function
     * @param tableType
     * @param mainType
     * @param mainDto
     * @param dbs
     * @param exe
     * @throws RisBusinessException
     */
    public void saveRldfv001(final String function, String tableType, String mainType, final Rl0x001DTO mainDto,
            final DBSMain dbs, final ExecutantType exe) throws RisBusinessException;

    /**
     * saveRldfv003
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public void saveRldfv003(final String status, Rl0x001DTO mainDto, DBSMain dbs, ExecutantType exe)
            throws RisBusinessException;

    public void catchRldfv003(final String status, Rl0x001DTO mainDto, DBSMain dbs, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 畫面資料查詢
     * 
     * @param ui
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List getQueryResult(Rl0x001DTO mainDto, List<Rl0x001DTOResult> ui, Class targetClass, ExecutantType exe)
            throws RisBusinessException;

    public List<?> getQueryResultV2(Rl0x001DTO mainDto, List<Rl0x001DTOResult> ui, Class<?> targetClass,
            ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面資料之domainType左邊
     * 
     * @param ui
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public <T> T getDomainTypeOneByEditView(List<Rl0x001DTOResult> ui, Class<T> targetClass, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 取得畫面資料之domainType右邊
     * 
     * @param ui
     * @param targetClass
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public <T> T getDomainTypeTwoByEditView(List<Rl0x001DTOResult> ui, Class<T> targetClass, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 取得資料檔
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public Object getData(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得記錄檔
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public Object getRecoredData(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得交易所引檔
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public Rldfv003Type getRldfv003(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定畫面右邊畫面
     * 
     * @param results
     * @param source
     * @param exe
     */
    public <T2> void setEditRightViewbyDomainType(List<Rl0x001DTOResult> results, T2 source, ExecutantType exe);

    /**
     * 清除畫面
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void cleanWebUI(List<Rl0x001DTOResult> ui, ExecutantType exe) throws RisBusinessException;

    /**
     * 重製頁面
     * 
     * @param quertUI
     *            查詢畫面
     * @param resultUI
     *            結果畫面
     * @param src
     *            預設值
     * @throws RisBusinessException
     */
    public void refreshUI(List<Rl0x001DTOResult> quertUI, List<Rl0x001DTOResult> resultUI, Object src, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 將資料塞進新的資料
     * 
     * @param target
     *            rldfs221
     * @param source
     *            rldfm021
     * @throws RisBusinessException
     */
    public <T1, T2> void setNewRecored(T1 target, T2 source) throws RisBusinessException;

    /**
     * 將資料塞進新的資料
     * 
     * @param target
     *            rldfs221
     * @param source
     *            rldfm021
     * @throws RisBusinessException
     */
    public <T1, T2> void setOldRecored(T1 target, T2 source) throws RisBusinessException;

    /**
     * 從記錄檔取得舊資料
     * 
     * @param source
     * @throws RisBusinessException
     */
    public <T1, T2> T2 getOldRecored(T1 source, Class<T2> targetClass) throws RisBusinessException;

    /**
     * 從記錄檔取得新資料
     * 
     * @param source
     * @throws RisBusinessException
     */
    public <T1, T2> T2 getNewRecored(T1 source, Class<T2> targetClass) throws RisBusinessException;

    // /**
    // * 用於修改部分處理 </br>其中將S更新資料帶進舊資料
    // *
    // * @param source
    // * @param target
    // */
    // @Deprecated
    // public <T1> T1 merger(T1 source, T1 target) throws RisBusinessException;

    /**
     * 二次merger
     * 
     * @param source
     * @param target
     * @param resultUI
     * @return
     * @throws RisBusinessException
     */
    public <T1> T1 secondMerger(T1 source, T1 target, List<Rl0x001DTOResult> resultUI) throws RisBusinessException;

    public <T1> void mergerWithNewIntance(T1 source, T1 target) throws RisBusinessException;

    public <T1, T2> T2 merger(T1 oldData, T1 newData, T2 recored) throws RisBusinessException;

    /**
     * 檢查是否修改
     * 
     * @param resultUI
     * @return
     * @throws RisBusinessException
     */
    public void chechIsChange(List<Rl0x001DTOResult> resultUI) throws RisBusinessException;

    /**
     * 檢查是否修改
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void chechIsChange(String dataType, Rl0x001DTOResult ui) throws RisBusinessException;

    /**
     * 檢查是否有相同pk記錄檔資料
     * 
     * @param mainDto
     * @param ui
     * @param targetClass
     * @param exe
     * @throws RisBusinessException
     */
    public void doCheckTheSameRecord(Rl0x001DTO mainDto, List<Rl0x001DTOResult> ui, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 設定代碼內容
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void setcodeLabel(Rl0x001DTOResult ui) throws RisBusinessException;

    /**
     * 檢查是否有輸入pk，否則將顯示請輸入 xxx
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void doCheckPkToThrowMessage(List<Rl0x001DTOResult> uis) throws RisBusinessException;

    /**
     * 判斷查詢條件，否則將顯示請輸入 xxx
     * 
     * @param ui
     * @throws RisBusinessException
     */
    public void doCheckQueryConToThrowMessage(List<Rl0x001DTOResult> uis) throws RisBusinessException;

    /**
     * 取得檢查碼
     * 
     * @param uis
     * @throws RisBusinessException
     */
    public String getCheckData(List<Rl0x001DTOResult> uis) throws RisBusinessException;

    /**
     * 傳送記錄檔通報
     * 
     * @param record
     * @param exe
     * @throws RisBusinessException
     */
    public <T1> void doSendRecordNotice(T1 record, Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 傳送申請書通報t檔(新增更正Q-table)
     * 
     * @param rldftxx
     *            --申請書T檔
     * @param mainDto
     * @param exe
     * @throws RisBusinessException
     */
    public void doSenddApplicationNotice(Object rldftxx, Rl0x001DTO mainDto, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 傳送Rldfv003通報
     * 
     * @param record
     * @param exe
     * @throws RisBusinessException
     */
    public void doSenddIndexNotice(Rldfv003Type record, Rl0x001DTO mainDto, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 檢查是否有變更
     * 
     * @param checkCode
     * @param uis
     * @param exe
     */
    public void doCheckCode(String checkCode, List<Rl0x001DTOResult> uis, ExecutantType exe);

    /**
     * 職權更正lock
     * 
     * @param mainDto
     * @param dataEntity
     * @param info
     * @throws RisBusinessException
     */
    public void lockData(Rl0x001DTO mainDto, final Object dataEntity, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 職權更正lock
     * 
     * @param mainDto
     * @param rTable
     *            資料檔-->ex :rldf004m or rldtxxx之類的
     * @param info
     * @throws RisBusinessException
     */
    public void unlockData(Rl0x001DTO mainDto, final Object rTable, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 回上一頁使用unlock方式
     * 
     * @param mainDto
     * @param rTable
     * @param info
     * @throws RisBusinessException
     */
    public void unlockDataToQuery(Rl0x001DTO mainDto, final Object rTable, final ExecutantType info)
            throws RisBusinessException;

    public <T1> void filterCetificate(T1 object);

    /**
     * 把被解鎖之來源table 重新鎖住或是解鎖--2013/05/02新增----未來使用
     * 
     * @throws RisBusinessException
     */
    public void autoLockAndUnLock(final Rl0x001DTO mainDTO, final ExecutantType info) throws RisBusinessException;

    /**
     * 額外增加的存儲資料(Rldf002s,Rldf008s)2013/05/08新增
     * 
     * @param mainDto
     *            職權更正共用DTO
     * @param rldfsss
     *            記錄檔
     * @param rldftxx
     *            (申請書) or RLDFXXXX (其他或戶籍類的) 來源檔(最新的)
     * @param rldfv003Type
     * @throws RisBusinessException
     */
    public void insertOtherRecord(Rl0x001DTO mainDto, Object rldfsss, Object source, Rldfv003Type rldfv003Type,
            ExecutantType exe) throws RisBusinessException;

    // /**
    // * 取得職權更正ExecutantType
    // *
    // * @param mainDto
    // * @param exe
    // * @return
    // */
    // public ExecutantType getSyncTransactionId(Rl0x001DTO mainDto,
    // ExecutantType exe);

    /**
     * 手動Ui塞值
     * 
     * @param uis
     * @param Rl0xColumnAndValueDTOs
     */
    public void manualSetUIValue(List<Rl0x001DTOResult> uis, List<Rl0xColumnAndValueDTO> Rl0xColumnAndValueDTOs);

    /**
     * 根據欄位英文名稱取得Rl0x001DTOResult
     * 
     * @param columnCode
     * @return
     * @throws RisBusinessException
     */
    public Rl0x001DTOResult getUiItemByColumnCode(List<Rl0x001DTOResult> editResult, String columnCode)
            throws RisBusinessException;

    /**
     * 申請書do-apply 2013/08/13<br>
     * ------------------------------------ <li>新增Rldfv003<br> <li>新增各申請紀錄檔<br>
     * ----------------------------------<br>
     * 
     * @param dbs
     * @param mainDTO
     * @param templateObj
     *            基本資料->尚未更新
     * @param editResult
     *            畫面
     * @param exe
     * @throws RisBusinessException
     */
    public void doApplyForApply(DBSMain dbs, Object record, Rl0x001DTO mainDTO, Object templateObj,
            List<Rl0x001DTOResult> editResult, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請書do-apply 送出
     * 
     * @throws RisBusinessException
     */
    public void doSumitForApply(DBSMain dbs, Rl0x001DTO mainDTO, List<Rl0x001DTOResult> editResult,
            final ExecutantType executantType) throws RisBusinessException;

    public void doEditApplyForApply(DBSMain dbs, Rl0x001DTO mainDTO, Object templateObj,
            List<Rl0x001DTOResult> editResult, ExecutantType exe) throws RisBusinessException;

    public void modifyCertificate(Rl0x001DTO mainDTO, Object templateObj, List<Rl0x001DTOResult> editResult,
            ExecutantType exe) throws RisBusinessException;

    public void deleteRldfv006(DBSMain dbs, Rl0x001DTO mainDTO, final ExecutantType info);

    /**
     * 紀錄來源檔案
     * 
     * @param source
     * @param info
     * @throws RisBusinessException
     */
    <T> void catchSourceData(T source, Rl0x001DTO mainDTO, final ExecutantType info) throws RisBusinessException;

    /**
     * 紀錄修改後資料
     * 
     * @param source
     * @param mainDTO
     * @param info
     * @throws RisBusinessException
     */
    <T> void catchModifyData(T source, Rl0x001DTO mainDTO, final ExecutantType info) throws RisBusinessException;
}
