package tw.gov.moi.rl.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.gov.moi.domain.Rldfv001Type;
import tw.gov.moi.domain.Rldfv002Type;

/**
 * 職權更正設定資料介面
 * 
 * @author Andy
 * 
 */
public interface Rl0xSetComponentConstant {

    public final static String YES = "Y";
    public final static String SITE_ID = "siteId";
    public final static String RCDF001MRL = "RCDF001MRL";
    public final static String NEW_WORD = "new";
    public final static String OLD_WORD = "old";
    public final static String TYPE = "Type";
    public final static String RSCD3552 = "RSCD3552";// 附繳證件
    public final static String RSCD3545 = "RSCD3545";// QTABLE 處理
    public final static String RSCD3548 = "RSCD3548";// rldfv002資料檔

    // RSCD9019 0:否 1:是
    public final static String TEMPLATE = " select  * from %s where  %s";
    public final static String DOMAINTYPE_PATH = "tw.gov.moi.domain.%sType";
    public final static String Type = "Type";
    public final static String RLDF = "RLDF";

    public final static String ADD = "A";
    public final static String DELETE = "D";
    public final static String MODIFY = "M";

    // 戶籍員畫面
    public final static String TO_MAIN = "../rl0x001.xhtml?faces-redirect=true";

    // 驗證畫面
    public final static String TO_VERFITY = "/pages/func/rl0x002/rl0x002.xhtml?faces-redirect=true";

    /**
     * RLdfv001設定黨
     * 
     * @author Andy
     * 
     */
    public enum RLDFV001 {

        /**
         * tableCode, // tableName, // tableType, // mainType,// funcCode, //
         * recordTable, hasBusinessTypeA, hasBusinessTypeM, hasBusinessTypeD,
         * isDeclare
         */

        Rcdf001mRL(RCDF001MRL, "全國個人資料摘要檔", "3", "", "RL0X326", "RLDFS226", "Y", "Y", "Y", "");

        /**
         * --------------------------------------------------------------------
         * 
         * 
         * --------------------------------------------------------------------
         */

        private String tableCode = "";
        private String tableName = "";
        private String tableType = "";
        private String mainType = "";
        private String funcCode = "";
        private String recordTable = "";
        private String hasBusinessTypeA = "";
        private String hasBusinessTypeM = "";
        private String hasBusinessTypeD = "";
        private String isDeclare = "";
        private static final Map<String, List<Rldfv001Type>> MAP;

        private RLDFV001(String tableCode, String tableName, String tableType, String mainType, String funcCode,
                String recordTable, String hasBusinessTypeA, String hasBusinessTypeM, String hasBusinessTypeD,
                String isDeclare) {
            this.tableCode = tableCode;
            this.tableName = tableName;
            this.tableType = tableType;
            this.mainType = mainType;
            this.funcCode = funcCode;
            this.recordTable = recordTable;
            this.hasBusinessTypeA = hasBusinessTypeA;
            this.hasBusinessTypeM = hasBusinessTypeM;
            this.hasBusinessTypeD = hasBusinessTypeD;
            this.isDeclare = isDeclare;
        }

        public String getFuncCode() {
            return funcCode;
        }

        public void setFuncCode(String funcCode) {
            this.funcCode = funcCode;
        }

        public Rldfv001Type getRldfv001() {
            final Rldfv001Type type = new Rldfv001Type();
            type.setFuncCode(funcCode);
            type.setHasBusinessTypeA(hasBusinessTypeA);
            type.setHasBusinessTypeD(hasBusinessTypeD);
            type.setHasBusinessTypeM(hasBusinessTypeM);
            type.setIsDeclare(isDeclare);
            type.setMainType(mainType);
            type.setRecordTable(recordTable);
            type.setTableCode(tableCode);
            type.setTableName(tableName);
            type.setTableType(tableType);
            return type;
        }

        static {
            Map<String, List<Rldfv001Type>> map = new HashMap<String, List<Rldfv001Type>>();

            for (RLDFV001 rldv001 : values()) {
                final String funCode = rldv001.getFuncCode();

                List<Rldfv001Type> rldfv001Typess = map.get(funCode);

                if (rldfv001Typess == null) {
                    rldfv001Typess = new ArrayList<Rldfv001Type>();
                    rldfv001Typess.add(rldv001.getRldfv001());
                    map.put(funCode, rldfv001Typess);

                } else {

                    rldfv001Typess.add(rldv001.getRldfv001());
                    map.put(funCode, rldfv001Typess);
                }

            }
            MAP = Collections.unmodifiableMap(map);

        }

        public static List<Rldfv001Type> getRldfv001s() {
            List<Rldfv001Type> rldfv001s = new ArrayList<Rldfv001Type>();
            for (String key : MAP.keySet()) {
                rldfv001s.addAll(MAP.get(key));
            }
            return rldfv001s;

        }

        public static List<Rldfv001Type> getRldfv001sByFunCode(String funcCode) {
            return MAP.get(funcCode);
        }
    }

    public enum RLDFV002 {

        PERSON_ID(//
                RCDF001MRL, "personId", "統號", "1", "10", "", "Y", "Y", "Y", "Y", "Y", ""), //

        SITE_ID(//
                RCDF001MRL, "siteId", "作業點代碼", "3", "8", "RSCD0118", "N", "N", "Y", "Y", "N", ""), //

        FATHER_ID(//
                RCDF001MRL, "fatherId", "父統號", "1", "10", "", "N", "N", "Y", "Y", "N", ""), //

        FATHER_ID_FLAG(//
                RCDF001MRL, "fatherIdFlag", "父虛擬統號註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        MOTHER_ID(//
                RCDF001MRL, "motherId", "母統號", "1", "10", "", "N", "N", "Y", "Y", "N", ""), //

        MOTHER_ID_FLAG(//
                RCDF001MRL, "motherIdFlag", "母虛擬統號註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        SPOUSE_ID(//
                RCDF001MRL, "spouseId", "配偶統號", "1", "10", "", "N", "N", "Y", "Y", "N", ""), //

        SPOUSE_ID_FLAG(//
                RCDF001MRL, "spouseIdFlag", "配偶虛擬統號註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        FOSTER_FATHER_ID(//
                RCDF001MRL, "fosterFatherId", "養父統號", "1", "10", "", "N", "N", "Y", "Y", "N", ""), //

        FOSTER_FATHER_ID_FLAG(//
                RCDF001MRL, "fosterFatherIdFlag", "養父虛擬統號註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        FOSTER_MOTHER_ID(//
                RCDF001MRL, "fosterMotherId", "養母統號", "1", "10", "", "N", "N", "Y", "Y", "N", ""), //

        FOSTER_MOTHER_ID_FLAG(//
                RCDF001MRL, "fosterMotherIdFlag", "養母虛擬統號註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        ID_CARD_APPLY_MARK(//
                RCDF001MRL, "idCardApplyMark", "國民身分證請領註記", "1", "1", "", "N", "N", "Y", "Y", "N", ""), //

        ID_CARD_LOST_APPLY_MARK(//
                RCDF001MRL, "idCardLostApplyMark", "國民身分證掛失註記", "3", "1", "RSCD3539", "N", "N", "Y", "Y", "N", ""), //

        SPECIAL_INCI_CODE(//
                RCDF001MRL, "specialInciCode", "特殊記事代碼", "3", "1", "RSCD0212", "N", "N", "Y", "Y", "N", ""), //

        INCIDENT_YYYMMDD(//
                RCDF001MRL, "incidentYyymmdd", "記事發生日期", "4", "7", "", "N", "N", "Y", "Y", "N", ""), //
        ;

        private String tableCode = "";
        private String columnCode = "";
        private String columnName = "";
        private String dataType = "";
        private String dataMaxLength = "";
        private String referName = "";
        private String isPk = "";
        private String isQueryCondition = "";
        private String state = "";
        private String permitModify = "";
        private String isNecessary = "";
        private String defaultValue = "";

        private static final Map<String, List<Rldfv002Type>> TABLE_MAP;

        static {
            Map<String, List<Rldfv002Type>> tableMap = new HashMap<String, List<Rldfv002Type>>();
            for (RLDFV002 mesg : values()) {

                List<Rldfv002Type> rldfv002Typess = tableMap.get(mesg.getTableCode());

                if (rldfv002Typess == null) {
                    rldfv002Typess = new ArrayList<Rldfv002Type>();
                    rldfv002Typess.add(mesg.getRldfv002());
                    tableMap.put(mesg.getTableCode(), rldfv002Typess);
                } else {
                    rldfv002Typess.add(mesg.getRldfv002());
                    tableMap.put(mesg.getTableCode(), rldfv002Typess);
                }

            }

            TABLE_MAP = Collections.unmodifiableMap(tableMap);

        }

        /**
         * 是否再額外加入清單中
         * 
         * @param tableCode
         * @return
         */
        public static boolean isInSide(String tableCode) {
            if (TABLE_MAP.get(tableCode) == null) {
                return false;
            } else {
                return true;
            }
        }

        /**
         * 取得所有rldv002
         * 
         * @param tableCode
         * @return
         */
        public static List<Rldfv002Type> getRldfv002ByTableCode(String tableCode) {
            return TABLE_MAP.get(tableCode);

        }

        private RLDFV002(String tableCode, String columnCode, String columnName, String dataType, String dataMaxLength,
                String referName, String isPk, String isQueryCondition, String state, String permitModify,
                String isNecessary, String defaultValue) {
            this.tableCode = tableCode;
            this.columnCode = columnCode;
            this.columnName = columnName;
            this.dataType = dataType;
            this.dataMaxLength = dataMaxLength;
            this.referName = referName;
            this.isPk = isPk;
            this.isQueryCondition = isQueryCondition;
            this.state = state;
            this.permitModify = permitModify;
            this.isNecessary = isNecessary;
            this.defaultValue = defaultValue;
        }

        private Rldfv002Type getRldfv002() {
            final Rldfv002Type type = new Rldfv002Type();
            type.setColumnCode(this.columnCode);
            type.setColumnName(this.columnName);
            type.setDataMaxLength(this.dataMaxLength);
            type.setDataType(this.dataType);
            type.setDefaultValue(this.defaultValue);
            type.setIsNecessary(this.isNecessary);
            type.setIsPk(this.isPk);
            type.setIsQueryCondition(this.isQueryCondition);
            type.setPermitModify(this.permitModify);
            type.setReferName(this.referName);
            type.setState(this.state);
            this.setTableCode(this.tableCode);
            return type;

        }

        public String getTableCode() {
            return tableCode;
        }

        public void setTableCode(String tableCode) {
            this.tableCode = tableCode;
        }

        public String getColumnCode() {
            return columnCode;
        }

        public void setColumnCode(String columnCode) {
            this.columnCode = columnCode;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getDataMaxLength() {
            return dataMaxLength;
        }

        public void setDataMaxLength(String dataMaxLength) {
            this.dataMaxLength = dataMaxLength;
        }

        public String getReferName() {
            return referName;
        }

        public void setReferName(String referName) {
            this.referName = referName;
        }

        public String getIsPk() {
            return isPk;
        }

        public void setIsPk(String isPk) {
            this.isPk = isPk;
        }

        public String getIsQueryCondition() {
            return isQueryCondition;
        }

        public void setIsQueryCondition(String isQueryCondition) {
            this.isQueryCondition = isQueryCondition;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPermitModify() {
            return permitModify;
        }

        public void setPermitModify(String permitModify) {
            this.permitModify = permitModify;
        }

        public String getIsNecessary() {
            return isNecessary;
        }

        public void setIsNecessary(String isNecessary) {
            this.isNecessary = isNecessary;
        }
    }
}
