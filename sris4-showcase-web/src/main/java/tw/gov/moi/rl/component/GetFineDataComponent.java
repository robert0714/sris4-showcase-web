/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rlde009eType;
import tw.gov.moi.domain.Rldf009eType;
import tw.gov.moi.domain.Rldfd008Type;
import tw.gov.moi.domain.Rldfd009Type;
import tw.gov.moi.domain.Xlde009eType;
import tw.gov.moi.domain.Xldf004mType;
import tw.gov.moi.domain.Xldf009eType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 罰鍰共用元件介面.
 * 
 * @author CK Lin
 */
public interface GetFineDataComponent {

    /** The Constant ERR_MSG_getFineClauseByType */
    final static String ERR_MSG_getFineClauseByType = "getFineClauseByType 取得罰鍰條文";

    /** The Constant ERR_MSG_replaceClause */
    final static String ERR_MSG_replaceClause = "replaceClause 取代罰款催告條文變數";

    /** The Constant ERR_MSG_replaceClause */
    final static String ERR_MSG_getParamMap = "getParamMap 取得變數集合";

    /** The Constant ERR_MSG_getFineClause */
    final static String ERR_MSG_getFineClause = "getFineClause 取得罰鍰催告條文";

    /** The Constant ERR_MSG_getFinePrice */
    final static String ERR_MSG_getFinePrice = "getFinePrice 取得罰鍰金額";

    /** The Constant ERR_MSG_getOverdue */
    final static String ERR_MSG_getOverdue = "getOverdue 取得逾期天數";

    /** The Constant ERR_MSG_getLegalDataStart */
    final static String ERR_MSG_getLegalDataStart = "getLegalDataStart 取得法定期間起日";

    /** The Constant ERR_MSG_getLegalDataEnd */
    final static String ERR_MSG_getLegalDataEnd = "getLegalDataEnd 取得法定期間迄";

    /** The Constant ERR_MSG_isFine */
    final static String ERR_MSG_isFine = "isFine 是否需要罰鍰";

    /** The Constant ERR_MSG_getRlde009e */
    final static String ERR_MSG_getRlde009e = "getXldfd009Error: getRldf009e 取得罰鍰催告個案資料檔";

    /** The Constant ERR_MSG_convertRldf009eToXldf009e */
    final static String ERR_MSG_convertRldf009eToXldf009e = "convertRlde009eToXlde009e 將Rldf009e轉換為Xldf009e";

    /** The Constant ERR_MSG_convertRlde009eToXlde009e */
    final static String ERR_MSG_convertRlde009eToXlde009e = "convertRlde009eToXlde009e 將Rlde009e轉換為Xlde009e";

    /** The Constant ERR_MSG_getSummonDate */
    final static String ERR_MSG_getSummonDate = "getSummonDate 取得催告日期";
    
    /** The Constant ERR_MSG_getRldfd014 */
    final static String ERR_MSG_getRldfd014 = "取出申請書代碼對應的罰鍰催告申登案別失敗";
    
    /** The Constant ERR_MSG_getRldfd014IsNotExist */
    final static String ERR_MSG_getRldfd014IsNotExist = "申請書代碼對應的罰鍰催告申登案別不存在";
    
    /** The Constant householdFineMasterId */
    final static String  HOUSEHOLD_FINE_MASTER_ID= "01";
    /** The Constant householdFineId */
    final static String  HOUSEHOLD_FINE_ID= "01";

    /**
     * 取得罰鍰跟催告主旨、事實、法令依據、附註
     * 
     * @param fineId
     *            罰鍰類別序號
     * @param type
     *            催告或罰鍰類型
     * @param paramMap
     *            動態參數
     * @param ex
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得罰鍰催告條文失敗
     */
    List<Rldfd009Type> getFineClause(String fineId, String type, Map<String, String> paramMap,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得罰鍰金額
     * 
     * @param fineMasterId
     *            罰鍰主類別代號
     * @param fineId
     *            罰鍰詳細類別序號
     * @param registrationsDate
     *            申登日期
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @param noticeCount
     *            通知次數
     * @param ex
     *            使用者資訊
     * @return the fine price
     * 
     * @throws RisBusinessException
     *             取得罰鍰金額失敗
     */
    public String getFinePrice(String fineMasterId, String fineId, String registrationsDate, String hasTheDate,
            String applyCaseNo, String noticeCount, ExecutantType executantType) throws RisBusinessException;

    /**
     * 判斷是否需要罰鍰
     * 
     * @param registrationsDate
     *            申登日期
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @param ex
     *            使用者資訊
     * @return boolean
     * 
     * @throws RisBusinessException
     *             判斷是否需要罰鍰失敗
     */
    public boolean isFine(String registrationsDate, String hasTheDate, String applyCaseNo, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 依類別取得罰鍰跟催告主旨、事實、法令依據、附註
     * 
     * @param fineId
     *            罰鍰詳細類別序號
     * @param type
     *            催告或罰鍰類型
     * @param clauseType
     *            條文類別
     * @param paramMap
     *            動態參數
     * @return List
     * 
     * @throws RisBusinessException
     *             取得罰鍰條文失敗
     */
    public List<Rldfd009Type> getFineClauseByType(String fineId, String type, String clauseType,
            Map<String, String> paramMap, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得逾期天數
     * 
     * @param registrationsDate
     *            申登日期
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @param ex
     *            使用者資訊
     * @return String
     * 
     * @throws RisBusinessException
     *             取得逾期天數失敗
     */
    public String getOverdue(String registrationsDate, String hasTheDate, String applyCaseNo, ExecutantType ex)
            throws RisBusinessException;

    /**
     * 取得變數集合
     * 
     * @param registrationsDate
     *            申登日期
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @param legalDueDate
     *            法定申報期限
     * @param otherPlace
     *            異地辦理
     * @param fineMoney
     *            罰鍰金額
     * @param legalStart
     *            法定期間起
     * @param legalEnd
     *            法定期間迄
     * @param overDay
     *            逾時日
     * @param noticeCount
     *            通知次數
     * @param summonDate
     *            催告日期
     * @param ex
     *            使用者資訊
     * @return Map
     * 
     * @throws RisBusinessException
     *             取得變數集合失敗
     */
    public Map<String, String> getParamMap(String registrationsDate, String hasTheDate, String applyCaseNo,
            String legalDueDate, String otherPlace, String fineMoney, String legalStart, String legalEnd,
            String overDay, String noticeCount, String summonDate, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得法定期間起日
     * 
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @return String legalDataStart
     * 
     * @throws RisBusinessException
     *             取得法定期間起日失敗
     */
    public String getLegalDataStart(String hasTheDate, String applyCaseNo) throws RisBusinessException;

    /**
     * 取得法定期間迄
     * 
     * @param hasTheDate
     *            發生日期
     * @param applyCaseNo
     *            申登案別
     * @param ex
     *            使用者資訊
     * @return String legalDataEnd
     * 
     * @throws RisBusinessException
     *             取得法定期間迄失敗
     */
    public String getLegalDataEnd(String hasTheDate, String applyCaseNo, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 依統號登記別取得最後催告日期.
     * 
     * @param applyCaseNo
     *            申登案別
     * @param persionId
     *            統一編號
     * @param hasTheDate
     *            發生日期
     * @param ex
     *            使用者資訊
     * @return String summonDate
     * 
     * @throws RisBusinessException
     *             取得催告日期失敗
     */
    public String getSummonDate(String applyCaseCode, String persionId, String hasTheDate, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得罰鍰催告個案資料檔條文
     * 
     * @param transactionId
     *            罰鍰催告個案交易序號
     * @param acceptSiteId
     *            受理地作業點代碼
     * @param clauseType
     *            條文類別
     * @param ex
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得罰鍰催告個案資料檔條文失敗
     */
    public List<Rlde009eType> getRlde009e(String transactionId, String acceptSiteId, String clauseType,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 將Rldf009e轉換為Xldf009e
     * 
     * @param rldf009e
     *            催告罰鍰個案紀錄檔
     * @param ex
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             轉換為催告罰鍰個案紀錄檔失敗
     * @throws Exception
     */

    public Xldf009eType convertRldf009eToXldf009e(Rldf009eType rldf009e, ExecutantType executantType)
            throws RisBusinessException, Exception;

    /**
     * 將Rldf009e轉換為Xldf009e
     * 
     * @param rlde009eList
     *            催告罰鍰個案紀錄檔
     * @param ex
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             轉換為催告罰鍰個案紀錄檔失敗
     */
    public List<Xlde009eType> convertRlde009eToXlde009e(List<Rlde009eType> rlde009eList, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得罰鍰類別明細.
     * 
     * @param fineMasterId
     *            the fine master id
     * @param type
     *            the type
     * @param executantType
     *            the executant type
     * @return the fine detial by fine master id
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldfd008Type> getFineDetialByFineMasterId(String fineMasterId, String type, ExecutantType executantType)
            throws RisBusinessException;
    
    /**
     * 判斷大簿登記是否需要罰緩
     * 
     * @param String
     *           申請書代碼
     * @throws RisBusinessException
     */
    public boolean isHouseholdFine(String registrationsDate, String hasTheDate, String applyCaseNo, ExecutantType executantType);
    
    /**
     * 取得大簿罰鍰法令依據條文
     * 
     * @param String
     *           登記日期
     * @param String
     *           發生日期
     * @param String
     *           申請書代碼     
     * @throws RisBusinessException
     */
    public List<Rldfd009Type> getHouseholdFineDeatil(String registrationsDate, String hasTheDate, String applyCaseNo, ExecutantType executantType);
    /**
     * 取得大簿罰鍰金額
     * 
     * @param String
     *           登記日期
     * @param String
     *           發生日期
     * @param String
     *           申請書代碼     
     * @throws RisBusinessException
     */
    public String getHouseholdFineAmount(String registrationsDate, String hasTheDate, String applyCaseNo, ExecutantType executantType);
    
    /**
     * 刪除大簿登記罰緩
     * 
     * @param Integer
     *           大簿作業編號
     * @param String       
     *           申請書資料儲存地SiteId
     * @param Integer       
     *           申請書流水號
     * @param String       
     *           申請書交易序號
     * @param String       
     *           siteId
     * @param DBSMain       
     *           交易連線物件
     * @param ExecutantType       
     *           ExecutantType
     * @throws RisBusinessException
     */
    public void doDeleteHouseholdFine(Integer operationSequenceID,String applySiteId,Integer applySeq,String fineTransactionId,String acceptSiteId,DBSMain con,ExecutantType executantType );
    /**
     * 取出申請書代碼對應的罰鍰催告申登案別
     * 
     * @param String
     *           申請書代碼
     * @throws RisBusinessException
     */
    public String getFineApplyCaseNo(String applyCaseNo, ExecutantType executantType); 
    
    /**
     * /取得作業最後一個XLDF004m 如取出之資料跟personId不一致,取RLDF004m
     * 
     * @param String
     *           personId
     * @throws RisBusinessException
     */
    public Object[] filterXLDF004m(String personId,ExecutantType executantType,String personsiteId,String removeYyymmdd,String removeTime);
}
