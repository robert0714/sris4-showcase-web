package tw.gov.moi.rl.component.rl08210;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 轉錄申請書處理服務共用元件介面
 */
public interface Rl08210ConvertComponent {

    /**
     * 設定轉錄申請書資料 Do convert.
     * 
     * @param rl08210DTO
     *            the rl08210 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    void doConvert(final Rl08210DTO rl08210DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得各Table對應功能中文名稱
     * 
     * @param Class
     *            <T> target
     * @param person
     * @return message
     */
    public <T> String getRegisterChName(Class<T> target);

    /**
     * 取得勾選項目對應功能中文名稱
     * 
     * @param certificate
     * @return String
     */
    public String getCertificateChName(String certificate);

    /**
     * 檢查各轉錄檔案_Rldfxxxs
     * 
     * @param dto
     * @param DS_NAME
     * @param message
     * @param recordType
     * @param executantType
     * 
     */
    public <T> void checkRldfxxxs(final DBSMain dbi, Rl08210DTO dto, String DS_NAME, Class<T> target, String message,
            String recordType, final ExecutantType executantType);

    /**
     * 
     * 取得各轉錄申請書資料_Rldftxxx
     * 
     * @param dto
     * @param dsName
     * @param targert
     * @param message
     * @param recordType
     * @param executantType
     * @return
     */
    public <T> List<T> getRldtxxx(final DBSMain dbi, Rl08210DTO dto, String dsName, Class<T> targert, String message,
            String recordType, final ExecutantType executantType);

    /**
     * 
     * 拋出錯誤
     * 
     * @param code
     * @param message
     * @throws RisBusinessException
     */
    // public void error(String code, String message);

    /**
     * 
     * 組合共用錯誤TX6397E
     * 
     * @param message
     */
    public void errorFor6397(String message, Throwable e);

    /**
     * 修改流水號
     * 
     * @param waterNo
     *            流水號
     * @param no
     *            編號
     * @param executantType
     * @param errorMsg
     */
    public void mofdiy10s(final DBSMain dbi, String exeSiteId, String waterNo, String no, ExecutantType executantType,
            String errorMsg);

    /**
     * 分配出生登記或離婚登記申請書結婚期間資料分類與排序
     * 
     * @param obj
     *            非list
     * @param executantType
     */
    public <T> void doClassifyMarryDate(final DBSMain dbi, Rl08210DTO dto, List<T> obj, ExecutantType executantType);

    /**
     * insertTldf834w(暫時存放按比例分配運算使用)
     * 
     * @param target
     * @param yyy
     * @param statOr
     * @param dataNo
     * @param transactionId
     * @param sequence
     * @param yyymmdd
     * @param time
     * @param message
     * @param classifytype
     * @param result
     * @param resulttype
     * @param realdata
     *            (原始資料)
     * @param errorMsg
     * @param executant
     */
    public <T> void insertTldf834w(List<T> target, String exeSiteId, String yyy, String statOr, String dataNo,
            String transactionId, Integer sequence, String yyymmdd, String time, String classifytype, String result,
            String resulttype, String realdata, String errorMsg, ExecutantType executant);

    /**
     * 新增Rldf0834w 未詳動態申請書分類未詳資料
     * 
     * @param afterObj
     * @param beforeObj
     * @param executant
     * @param changeTableName
     * @param columnCHName
     */
    public <T> void insertRldf834w(List<T> beforeObj, String exeSiteId, ExecutantType executant,
            String changeTableName, String columnCHName, String yyy, String statOr);

    /**
     * 新增Rldf0835w 未詳動態申請書重新分配紀錄資料
     * 
     * @param afterObj
     * @param beforeObj
     * @param executant
     * @param changeTableName
     * @param classifyTypeCode
     * @param columnCHName
     */
    public <T> void insertRldf835w(List<T> afterObj, String exeSiteId, List<T> beforeObj, ExecutantType executant,
            String changeTableName, String classifyTypeCode, String columnCHName, String yyy, String statOr);

    /**
     * 取得{類型,數量}藉由Tldf834w
     * 
     * @param classifyType
     * @param domainType
     * @param executantType
     * @param errorMsg
     * @param first
     * @return
     */
    public List<Object> getKindAndNumFromTldf834w(final DBSMain dbi, Rl08210DTO rl08210dto, String classifyType,
            String domainType, ExecutantType executantType, String errorMsg, String first);

    /**
     * 取得{類型,數量}藉由Tldf834w
     * 
     * @param classifyType
     * @param domainType
     * @param executantType
     * @param errorMsg
     * @return
     */
    public List<Object> getKindAndNumFromTldf834w(final DBSMain dbi, Rl08210DTO rl08210dto, String classifyType,
            String domainType, ExecutantType executantType, String errorMsg);

    /**
     * 取得{類型,數量}藉由Tldf834w(有特別排序)
     * 
     * @param classifyType
     * @param domainType
     * @param executantType
     * @param errorMsg
     * @param first
     * @return
     */
    public List<Object> getKindAndNumFromTldf834w(final DBSMain dbi, Rl08210DTO rl08210dto, String classifyType,
            String domainType, ExecutantType executantType, String errorMsg, String first, String sortCondition);

    /**
     * 加入共用SQL 標頭*
     * 
     * @param rl08210dto
     * @param sql
     * @param executantType
     * @param table
     */
    public void appendSqlComTitle(Rl08210DTO rl08210dto, StringBuilder sql, ExecutantType executantType, String table);

    /**
     * getFreeData(List<T>)
     * 
     * @param sql
     * @param parmsList
     * @param targetClass
     * @param executantType
     * @param errorMsg
     * @return List<T>
     */
    public <T> List<T> getFreeData(final DBSMain dbi, String exeSiteId, String sql, List<String> parmsList,
            Class<T> targetClass, ExecutantType executantType, String errorMsg);

    /**
     * getFreeData(List<Object>)
     * 
     * @param sql
     * @param parmsList
     * @param executantType
     * @param errorMsg
     * @return List<Object>
     */
    public List<Object> getFreeData(final DBSMain dbi, String exeSiteId, String sql, List<String> parmsList,
            ExecutantType executantType, String errorMsg);

    // /**
    // * getOneData
    // *
    // * @param dsName
    // * @param parmsList
    // * @param targetClass
    // * @param executantType
    // * @return <T> T
    // */
    // public <T> T getOneData(String dsName, List<String> parmsList, Class<T>
    // targetClass, ExecutantType executantType);

    /**
     * getOneData
     * 
     * @param rl08210dto
     * @param certificate
     * @param executantType
     * @return String MAX(APPLY_NO)
     */

    public String getOneData(final DBSMain dbi, Rl08210DTO rl08210dto, String certificate, ExecutantType executantType);

    /**
     * 共用-複製已分配完成的Rldfxxxs Table(R)資料至Rldfxxxs Table(O)
     * 
     * @param Rl08210DTO
     * @param ExecutantType
     * @param target
     *            (Rldf011sType.class,Rldf012sType.class....)
     */
    public <T> void doConvertRtoO(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType, Class<T> target);

    /**
     * saveOrUpdate
     * 
     * @param Object
     *            (O) (Rldf035sType,Redf023mType....)
     * @param ExecutantType
     * @param message
     */
    public void saveOrUpdate(Object o, String exeSiteId, ExecutantType executantType, String message);

    /**
     * saveOrUpdate
     * 
     * @param Object
     *            (O) (Rldf011sType,Rldf012sType....)
     * @param ExecutantType
     * @param message
     */
    public void upData(Object o, String exeSiteId, ExecutantType executantType, String message);

    /**
     * UpData(List<T>)
     * 
     * @param List
     *            <T>
     * @param executantType
     * @param message
     */
    public <T> void upData(List<T> o, String exeSiteId, ExecutantType executantType, String message);

    /**
     * insert
     * 
     * @param Object
     *            (O) (Rldf011sType,Rldf012sType....)
     * @param ExecutantType
     * @param message
     */
    public void insert(Object o, String exeSiteId, ExecutantType executantType, String message);

    /**
     * InserRedf023m
     * 
     * @param executant
     * @param status
     * @param apoRtnCode
     * @param msg
     * @return
     */
    // public void inser23m(final DBSMain dbi, Rl08210DTO dto, ExecutantType
    // executantType, String status,
    // String apoRtnCode, String msg);

    /**
     * InserSpecial23m
     * 
     * @param executant
     * @param status
     * @param apoRtnCode
     * @param msg
     * @return
     */
    public void inserSpecial23m(Rl08210DTO dto, ExecutantType executantType, String status, String apoRtnCode,
            String msg);

    /**
     * InserRldf027s
     * 
     * @param Rl08210DTO
     * @param apply_code
     * @param executant
     * @return
     */
    public void inser27s(final DBSMain dbi, Rl08210DTO dto, String apply_code, ExecutantType executantType);

    /**
     * 檢查批次是否執行中
     * 
     * @param rl08210dto
     * @param certificate
     * @param executantType
     * @return
     */
    public boolean isBatchRunning(final DBSMain dbi, Rl08210DTO rl08210dto, String certificate,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 判斷是否已完成當日資料庫備份作業
     * 
     * @param rl08210dto
     * @param executantType
     * @return
     */
    public boolean doQueryEsetflag(final DBSMain dbi, Rl08210DTO rl08210dto, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存批次執行紀錄(執行中)
     * 
     * @param rl08210dto
     * @param certificate
     * @param executantType
     * @return
     */
    public void saveRedfrptf(Rl08210DTO rl08210dto, String certificate, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 刪除批次執行紀錄(執行完畢或發生Exception)
     * 
     * @param rl08210dto
     * @param certificate
     * @param executantType
     * @return
     */
    public void deleteRedfrptf(final DBSMain dbi, Rl08210DTO rl08210dto, String certificate, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 補齊日期欄位年分:'0'YYMMDD(民國)
     * 
     * @param rl08210dto
     * @param target
     * @param colName
     * @param siteIdcolName
     * @param executantType
     * @return
     */
    public <T> void updateDayLength(Rl08210DTO rl08210dto, Class<T> target, String colName, String siteIdcolName,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 補齊日期欄位月日:'000'或' '或日為'00'或' '
     * 
     * @param rl08210dto
     * @param target
     * @param colName
     * @param siteIdcolName
     * @param executantType
     * @return
     */
    public <T> void updateErrMonthDay(Rl08210DTO rl08210dto, Class<T> target, String colName, String siteIdcolName,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 補齊男＜18 或　女　＜16 婚姻狀況或婚前婚姻狀況為"1:未婚"
     * 
     * @param rl08210dto
     * @param target
     * @param mrgColName
     * @param ageColName
     * @param executantType
     * @return
     */
    public <T> void updateErrMrgCode(Rl08210DTO rl08210dto, Class<T> target, String mrgColName, String gender,
            String ageColName, ExecutantType executantType) throws RisBusinessException;

    /**
     * 通報FTP Zxxx Table(SITE_ID)
     * 
     * @param rl08210dto
     * @param TableName
     * @param executantType
     * @return
     */
    public void sendDumpZxxxFtpNotice(Rl08210DTO rl08210dto, final String TableName, final ExecutantType executantType);

    /**
     * 通報FTP Zxxx Table(SETTLE_SITE_ID)
     * 
     * @param rl08210dto
     * @param TableName
     * @param executantType
     * @return
     */
    public void sendDumpZxxxFtpNotice_1(Rl08210DTO dto, final String TableName, final ExecutantType executantType);

    /**
     * 通報FTP xxxS Table
     * 
     * @param rl08210dto
     * @param RlTableName
     * @param RcTableName
     * @param executantType
     * @return
     */
    public void sendDumpxxxSFtpNotice(Rl08210DTO dto, final String RlTableName, final String RcTableName,
            final ExecutantType executantType);

    /**
     * 取得勾選項目對應功能XXXS Table代碼
     * 
     * @param certificate
     * @return String
     */
    public String getCertificateXXXSCode(String certificate);

    /**
     * 左邊補"0"
     * 
     * @param source
     * @param allLength
     * 
     * @return String
     */
    public String addLeft0(String source, int allLength);
}