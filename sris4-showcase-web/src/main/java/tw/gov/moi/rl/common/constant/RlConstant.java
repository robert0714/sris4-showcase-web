/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.constant;

public interface RlConstant {

    /** ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓CONSTANTS↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ */

    /** 戶籍大簿的人 */
    enum ApplyPerson {
        /** 當事人 */
        TXN_PERSON,

        /** 申請人1 */
        APPLICANT_1,

        /** 申請人2 */
        APPLICANT_2,

        /** 受委託人 */
        DELEGATED_PERSON
    }

    public enum Operator {
        AND, OR
    }

    enum ReportFormat {
        CSV, XLS, PDF, DOC, ODF
    }

    /** RL系統存取Global變數Context */
    public String RL_TEMP_GLOBAL = "rlTempClobalVariable";

    public int FIRST_INDEX = 0;

    /** 身分證號碼合法長度 */
    static final int PERSON_ID_LENGTH = 10;

    /** 戶號合法長度 */
    static final int HOUSEHOLD_ID_LENGTH = 8;

    /** 其他免收規費原因代碼 */
    String OTHER_FREE_REASON_CODE = "10";

    /** 系統代碼-鄉鎮市區戶政資訊系統 */
    public String SYSTEM_CODE_RL = "RL";

    /** 系統代碼-直轄市、縣(市)戶政資訊系統 */
    public String SYSTEM_CODE_RR = "RR";

    /** 系統代碼-內政部戶政資訊系統 */
    public String SYSTEM_CODE_RC = "RC";

    /** 系統代碼-鄉鎮市區役政資訊系統 */
    String SYSTEM_CODE_ML = "ML";

    /** 系統代碼-全球資訊網系統 */
    String SYSTEM_CODE_AW = "AW";

    /** 作業點代碼-內政部戶政資訊系統 */
    public String SITE_ID_RC = "00000000";

    /** 補登作業對團體所使用的國民統一編號 */
    public String ORG_PERSON_ID = "Y100000000";

    /** 作業點代碼-內政部戶政資訊系統 */
    // public String SITE_ID_RR = "65000000";

    /** 戶籍大簿現戶查詢首頁L1 URL */
    String RL00001_URL = "/pages/func/rl00001/rl00001.xhtml";

    /** 戶籍大簿除戶查詢首頁L1 URL */
    String RL00002_URL = "/pages/func/rl00002/rl00002.xhtml";

    /** 戶籍大簿逕為登記查詢首頁L1 URL */
    String ENFORCE_PAGE = "/pages/func/rl0x003/rl0x003.xhtml";

    /** 戶籍大簿文件核發查詢首頁L1 URL */
    String CERTIFICATE_PAGE = "/pages/func/rl00004/rl00004.xhtml";

    /** 戶籍大簿現戶查詢首頁L1 URL */
    String RL00001_URL_REDIRECT = "/pages/func/rl00001/rl00001.xhtml";

    /** 戶籍大簿現戶L2 URL */
    String HOUSEHOLD_MAINTAIN_URL = "/pages/func/rl00001/householdMaintain.xhtml?faces-redirect=true";

    /** 戶籍大簿除戶L2 URL */
    String HOUSEHOLD_REMOVE_DATA_MAINTAIN_URL = "/pages/func/rl00002/householdRemoveDataMaintain.xhtml?faces-redirect=true";

    /** 戶籍大簿外籍者 URL */
    String HOUSEHOLD_MAINTAIN_FOREIGN_URL = "/pages/func/rl00001/householdMaintain_foreign.xhtml?faces-redirect=true";

    /** 現戶書證謄本 URL */
    String CERTIFICATE_MAINTAIN_URL = "/pages/func/rl00001/certificateMaintain.xhtml?faces-redirect=true";

    /** 除戶書證謄本 URL */
    String HOUSEHOLD_REMOVE_DATA_CERTIFICATE_MAINTAIN_URL = "/pages/func/rl00002/householdRemoveDataCertificateMaintain.xhtml?faces-redirect=true";

    /** 未成年子女權利義務行使負擔登記 URL */
    String RL012F0_URL = "/pages/func/rl00001/_rl12F0/rl012F0.xhtml?faces-redirect=true";

    String HOUSEHOLD_DETAIL_URL = "/pages/func/rl00001/householdDetail.xhtml?faces-redirect=true";

    /** 遷入者個人基本資料補登 */
    String RL01910_URL = "/pages/func/rl00001/_rl01910/rl01910_list.xhtml";

    /** 非遷入者資料補登 */
    String RL01920_URL = "/pages/func/rl00001/_rl01920/rl01920_list.xhtml";

    public String SEQ_ID = "sequenceId";

    public String SERIAL_NO = "serialNo";

    /** 空字串 */
    public String EMPTY_STRING = "";

    /** _URL */
    public String STRING_URL = "_URL";

    /** 外來申請書-處理註記(「一個空白格」表未處理) */
    public String PROCESS_MAR = " ";

    /** 現戶 */
    public String CURRENT_HOUSEHOLD = "現戶";

    /** 除戶 */
    public String REMOVED_HOUSEHOLD = "除戶";

    /** 國外 */
    public String FOREIGN_ADDRESSGN = "國外";

    /** 88t neighborChar塞鄰字 */
    public static final String NEIGHBOR_CHAR = "鄰";

    /** 申請書類別_T(非當日) */
    public String APPLICATION_TYPE_T = "T";

    /** 申請書類別_S(當日) */
    public String APPLICATION_TYPE_S = "S";

    /** 跟個人基本資料相關的 Table Name 正規表示法 XLDF004SERIES統 */
    public String XLDF004SERIES_REG = "XLDF004(M|MT|H)";

    /** 約定 */
    public String PROMISE = "約定";

    /** 除戶簿頁旗標 */
    public String BOOK_FLAG_H = "H";

    /** 現戶簿頁旗標 */
    public String BOOK_FLAG_M = "M";
    /** 補登簿頁旗標 */
    public String BOOK_FLAG_T = "T";
    /** 日期格式化:TW */
    public String DATE_FORMAT_TWY = "twyMMddHHmmss";
    public String STYLE_FOR_SITE_ID = "width:200px";
    public String STYLE_FOR_PERSON_ID = "width:100px";

    public String ELLIPSIS_STYLE_FOR_LAST_NAME = "width:60px";

    public String ELLIPSIS_STYLE_FOR_FIRST_NAME = "width:90px";

    public String ELLIPSIS_STYLE_FOR_PERSON_NAME = "width:130px";
    final public String HOUSEHOLD_REGISTRATION_OFFICE = "戶政事務所";
    final static String[] OTHER = new String[] { "其他", "其它" };
    /** 其他附繳證件 */
    final static String OTHER_CERTIFICATE_CONTENT = "otherCertificateContent";
    /** 附繳證件代碼檔名 */
    final static String CERTIFICATE_PROPERTIES_NAME = "certificatePropertiesName";
    /** 其他附繳證件代碼 */
    final static String OTHER_CERTIFICATE_CODE = "otherCertificateCode";

    /** 附繳證件清單 */
    final static String CERTIFICATE_LIST = "certificateList";

    /** 作業代碼 */
    final static String OPERATION_CODE = "operationCode";

    /** 申請書類別 */
    final static String APPLY_CODE = "applyCode";

    /** 須法定代理人同意:是 */
    public String YES = "是";

    /** 須法定代理人同意:否(全形空白) */
    public String SPACE = "　";

    /** 半形空白 */
    public String SPACE2 = " ";

    /** 【0】String */
    public String STRING_ZERO = "0";

    /** 【1】String */
    public String STRING_ONE = "1";

    /** 【2】String */
    public String STRING_TWO = "2";

    /** 【3】String */
    public String STRING_THREE = "3";

    /** 【4】String */
    public String STRING_FOUR = "4";

    /** 【5】String */
    public String STRING_FIVE = "5";

    /** 【6】String */
    public String STRING_SIX = "6";

    /** 【7】String */
    public String STRING_SEVEN = "7";

    /** 【8】String */
    public String STRING_EIGHT = "8";

    /** 【9】String */
    public String STRING_NINE = "9";

    /** 【10】String */
    public String STRING_TEN = "10";

    /** 【11】String */
    public String STRING_ELEVEN = "11";

    /** 【12】String */
    public String STRING_TWELVE = "12";

    /** 【13】String */
    public String STRING_THIRTEEN = "13";

    /** 【14】String */
    public String STRING_FOURTEEN = "14";

    /** 【15】String */
    public String STRING_FIFTEEN = "15";

    /** 【16】String */
    public String STRING_SIXTEEN = "16";

    /** 【17】String */
    public String STRING_SEVENTEEN = "17";

    /** 【18】String */
    public String STRING_EIGHTEEN = "18";

    /** 【20】String */
    public String STRING_TWENTY = "20";

    /** 【01】String */
    public String STRING_ZERO_ONE = "01";

    /** 【02】String */
    public String STRING_ZERO_TWO = "02";

    /** 【03】String */
    public String STRING_ZERO_THREE = "03";

    /** 【04】String */
    public String STRING_ZERO_FOUR = "04";

    /** 【06】String */
    String STRING_ZERO_SIX = "06";

    /** 【07】String */
    String STRING_ZERO_SEVEN = "07";

    /** 【08】String */
    public String STRING_ZERO_EIGHT = "08";

    /** 【000】String */
    public String STRING_ZERO_ZERO_ZERO = "000";

    /** 【001】String */
    public String STRING_ZERO_ZERO_ONE = "001";

    /** 【002】String */
    public String STRING_ZERO_ZERO_TWO = "002";

    /** 【003】String */
    public String STRING_ZERO_ZERO_THREE = "003";

    /** 【004】String */
    public String STRING_ZERO_ZERO_FOUR = "004";

    /** 【077】String */
    public String STRING_ZERO_SEVEN_SEVEN = "077";

    /** 【082】String */
    public String STRING_ZERO_EIGHT_TWO = "082";

    /** 【005】String */
    public String STRING_ZERO_ZERO_FIVE = "005";

    /** 【090】String */
    public String STRING_ZERO_NINE_ZERO = "090";

    /** 【091】String */
    public String STRING_ZERO_NINE_ONE = "091";

    /** 【0D1】String */
    public String STRING_ZERO_D_ONE = "0D1";

    /** 請選擇 */
    static final String PLEASE_SELECT = "請選擇";

    /** 【請選擇】代碼 */
    static final String PLEASE_SELECT_CODE = "00";

    /** Y */
    public String YES_CHAR = "Y";

    /** N */
    public String NO_CHAR = "N";

    /** * */
    static final String STRING_STAR = "*";

    public String SELECT_MODE_FIELD = "selectMode";

    public boolean ACCESSIBLE = true;

    public boolean FALSE = false;

    public String XLDFMT_CLASS_REG = "[XLDF.{3}MT]";

    /** 異動模式-A */
    public String CHANGE_TYPE_A = "A";

    /** 異動模式-M */
    public String CHANGE_TYPE_M = "M";

    /** 異動模式-D */
    public String CHANGE_TYPE_D = "D";

    /** 異動模式-E */
    public String CHANGE_TYPE_E = "E";

    /** 異動模式-L */
    public String CHANGE_TYPE_L = "L";
    /** 異動模式-U */
    public String CHANGE_TYPE_U = "U";

    /** 異動模式-9 */
    public String CHANGE_TYPE_9 = "9";

    /** 通報類別 */
    public String NOTICE_TYPE = "L003";

    /** 通報類別 43 */
    public String NOTICE_TYPE_43 = "43";

    /** 通報類別 43 */
    public String NOTICE_TYPE_44 = "44";

    /** 通報類別 45 */
    public String NOTICE_TYPE_45 = "45";

    /** 通報類別 46 */
    public String NOTICE_TYPE_46 = "46";

    /** 通報類別C601 */
    public String NOTICE_TYPE_C601 = "C601";

    /** 通報類別L003 */
    public String NOTICE_TYPE_L003 = "L003";

    /** 通報類別L004 */
    public String NOTICE_TYPE_L004 = "L004";

    /** 通報類別L005 */
    public String NOTICE_TYPE_L005 = "L005";

    /** 通報類別L006 */
    public String NOTICE_TYPE_L006 = "L006";

    /** 通報類別L007 */
    public String NOTICE_TYPE_L007 = "L007";

    /** 通報類別L010 */
    public String NOTICE_TYPE_L010 = "L010";

    /** 通報類別L012 */
    public String NOTICE_TYPE_L012 = "L012";

    /** 通報類別L019 */
    public String NOTICE_TYPE_L019 = "L019";

    /** 通報類別L017 */
    public String NOTICE_TYPE_L017 = "L017";

    /** 通報類別LB17 */
    public String NOTICE_TYPE_LB17 = "LB17";

    /** 通報類別 L42C */
    public String NOTICE_TYPE_L42C = "L42C";

    /** 通報類別 L42R */
    public String NOTICE_TYPE_L42R = "L42R";

    /** 通報類別 L49C */
    public String NOTICE_TYPE_L49C = "L49C";

    /** 通報類別 L49R */
    public String NOTICE_TYPE_L49R = "L49R";

    /** 通報類別L507 */
    public String NOTICE_TYPE_L507 = "L507";

    /** 通報類別LHRM */
    public String NOTICE_TYPE_LHRM = "LHRM";

    /** 通報類別LC09 */
    public final String NOTICE_TYPE_LC09 = "LC09";

    /** 通報類別LC11 */
    public final String NOTICE_TYPE_LC11 = "LC11";

    /** 通報類別C001 */
    String NOTICE_TYPE_C001 = "C001";

    /** 通報類別C007 */
    public String NOTICE_TYPE_C007 = "C007";

    /** 通報類別C008 */
    public final String NOTICE_TYPE_C008 = "C008";

    /** 通報類別C009 */
    public final String NOTICE_TYPE_C009 = "C009";

    /** 通報類別C011 */
    public final String NOTICE_TYPE_C011 = "C011";

    /** 通報類別C411 */
    public final String NOTICE_TYPE_C411 = "C411";

    /** 通報類別C412 */
    public final String NOTICE_TYPE_C412 = "C412";

    /** 通報類別R008 */
    public String NOTICE_TYPE_R008 = "R008";

    /** 通報類別R019 */
    public String NOTICE_TYPE_R019 = "R019";

    /** 通報類別R018 */
    public String NOTICE_TYPE_R018 = "R018";

    /** 通報類別R017 */
    public String NOTICE_TYPE_R017 = "R017";

    /** 通報類別C014 */
    public String NOTICE_TYPE_C014 = "C014";

    /** 通報類別C242 */
    public String NOTICE_TYPE_C242 = "C242";

    /** 通報類別R211 */
    public String NOTICE_TYPE_R211 = "R211";

    /** 通報類別R242 */
    public String NOTICE_TYPE_R242 = "R242";

    /** 通報類別Z228 */
    public String NOTICE_TYPE_Z228 = "Z228";

    /** 通報類別R002 */
    String NOTICE_TYPE_R002 = "R002";

    /** 通報類別ML02 */
    String NOTICE_TYPE_ML02 = "ML02";

    /** 通報類別11(撤銷廢止戶籍) */
    String NOTICE_TYPE_11 = "11";

    /** 通報類別19(初設戶籍) */
    String NOTICE_TYPE_19 = "19";

    /** 通報類別41(個人遷出) */
    String NOTICE_TYPE_41 = "41";

    /** 通報類別06(撤銷戶籍) */
    String NOTICE_TYPE_06 = "06";

    /** 通報類別-RSND */
    String NOTICE_TYPE_RSND = "RSND";

    /** 通報類別-AW */
    String NOTICE_TYPE_AW = "AWMQ07090";

    /** 資料區名稱 */
    public String RLRPA0000 = "RLRPA0000";

    /** 資料區名稱 */
    public String RLRP04500 = "RLRP04500";

    /** (原屬)國籍為"其它"代碼 */
    public String ZZZ = "ZZZ";

    /** 空白日期 */
    public String BLANK_DATE = "0000000";

    /** 通報序號 */
    public String NOTICE_NO = "0000000";

    /** 旗標 - 大簿當事人角色為「夫」 */
    public String HFLAG = "h";

    /** 旗標 - 大簿當事人角色為「妻」 */
    public String WFLAG = "w";

    /** 【-1】Integer */
    public Integer INTEGER_MINUS_ONE = -1;

    /** 【0】Integer */
    public Integer INTEGER_ZERO = 0;

    /** 【1】Integer */
    public Integer INTEGER_ONE = 1;

    /** 【2】Integer */
    public Integer INTEGER_TWO = 2;

    /** 【3】Integer */
    public Integer INTEGER_THREE = 3;

    /** 【4】Integer */
    public Integer INTEGER_FOUR = 4;

    /** 【5】Integer */
    public Integer INTEGER_FIVE = 5;

    /** 【6】Integer */
    public Integer INTEGER_SIX = 6;

    /** 【7】Integer */
    public Integer INTEGER_SEVEN = 7;

    /** 【8】Integer */
    public Integer INTEGER_EIGHT = 8;

    /** 【9】Integer */
    public Integer INTEGER_NINE = 9;

    /** 【10】Integer */
    public Integer INTEGER_TEN = 10;

    /** 【11】Integer */
    public Integer INTEGER_ELEVEN = 11;

    /** 【12】Integer */
    public Integer INTEGER_TWELVE = 12;

    /** 【13】Integer */
    public Integer INTEGER_THIRTEEN = 13;

    /** 【14】Integer */
    public Integer INTEGER_FOURTEEN = 14;

    /** 【15】Integer */
    public Integer INTEGER_FIFTEEN = 15;

    /** 【16】Integer */
    public Integer INTEGER_SIXTEEN = 16;

    /** 【17】Integer */
    public Integer INTEGER_SEVENTEEN = 17;

    /** 【18】Integer */
    public Integer INTEGER_EIGHTEEN = 18;

    /** 【19】Integer */
    public Integer INTEGER_NINETEEN = 19;

    /** 【20】Integer */
    public Integer INTEGER_TWENTY = 20;

    /** 【21】Integer */
    public Integer INTEGER_TWENTY_ONE = 21;

    /** 【22】Integer */
    public Integer INTEGER_TWENTY_TWO = 22;

    /** 【23】Integer */
    public Integer INTEGER_TWENTY_THREE = 23;

    /** 【24】Integer */
    public Integer INTEGER_TWENTY_FOUR = 24;

    /** 【25】Integer */
    public Integer INTEGER_TWENTY_FIVE = 25;

    /** 【26】Integer */
    public Integer INTEGER_TWENTY_SIX = 26;

    /** 【27】Integer */
    public Integer INTEGER_TWENTY_SEVEN = 27;

    /** 【28】Integer */
    public Integer INTEGER_TWENTY_EIGHT = 28;

    /** 【29】Integer */
    public Integer INTEGER_TWENTY_NINE = 29;

    /** 【30】Integer */
    public Integer INTEGER_THIRTY = 30;

    /** 【51】Integer */
    public Integer INTEGER_FIFTY_ONE = 51;

    /** [A] String */
    public String STRING_A = "A";

    /** [B] String */
    public String STRING_B = "B";

    /** [C] String */
    public String STRING_C = "C";

    /** [D] String */
    public String STRING_D = "D";

    /** [E] String */
    public String STRING_E = "E";

    /** [F] String */
    public String STRING_F = "F";

    /** [G] String */
    public String STRING_G = "G";

    /** [H] String */
    public String STRING_H = "H";

    /** [I] String */
    public String STRING_I = "I";

    /** [J] String */
    public String STRING_J = "J";

    /** [K] String */
    public String STRING_K = "K";

    /** [L] String */
    public String STRING_L = "L";

    /** [M] String */
    public String STRING_M = "M";

    /** [N] String */
    public String STRING_N = "N";

    /** [O] String */
    public String STRING_O = "O";

    /** [P] String */
    public String STRING_P = "P";

    /** [Q] String */
    public String STRING_Q = "Q";

    /** [R] String */
    public String STRING_R = "R";

    /** [S] String */
    public String STRING_S = "S";

    /** [T] String */
    public String STRING_T = "T";

    /** [U] String */
    public String STRING_U = "U";

    /** [Z] String */
    public String STRING_Z = "Z";

    /** [Z] String */
    public String STRING_Y = "Y";

    /** [ZZ] String */
    public String STRING_ZZ = "ZZ";

    /** [a] String */
    public String STRING_LOWER_A = "a";

    /** [b] String */
    public String STRING_LOWER_B = "b";

    /** personId. */
    public final static String OBJ_TYPE_PERSON_ID = "personId";

    /** personName. */
    public final static String OBJ_TYPE_PERSON_NAME = "personName";

    /** personalMark. */
    public final static String OBJ_TYPE_PERSONAL_MARK = "personalMark";

    /** siteId. */
    public final static String OBJ_TYPE_SITE_ID = "siteId";

    /** siteId. */
    public final static String OBJ_TYPE_RELATION_PID = "relatedPersonId";

    /** adminOfficeCode. */
    public final static String OBJ_TYPE_ADMIN_OFFICE_CODE = "adminOfficeCode";

    /** gender. */
    public final static String OBJ_TYPE_GENDER = "gender";

    /** areaCode. */
    public final static String OBJ_TYPE_AREA_CODE = "areaCode";

    /** householdHeadId. */
    public final static String OBJ_TYPE_HEAD_ID = "householdHeadId";

    /** householdId. */
    public final static String OBJ_TYPE_HOUSE_ID = "householdId";

    /** removeYyymmdd. */
    public final static String OBJ_TYPE_REMOVE_DATE = "removeYyymmdd";

    /** removeTime. */
    public final static String OBJ_TYPE_REMOVE_TIME = "removeTime";

    /** processDate. */
    public final static String OBJ_TYPE_PROC_DATE = "processDate";

    /** processTime. */
    public final static String OBJ_TYPE_PROC_TIME = "processTime";

    /** removeYyymmdd. */
    public final static String OBJ_TYPE_REGISTER_DATE = "registerYyymmdd";

    /** removeTime. */
    public final static String OBJ_TYPE_REGISTER_TIME = "registerHhmmss";

    /** removeTime. */
    public final static String OBJ_TYPE_REGISTER_ID = "registerId";

    /** birthYyymmdd. */
    public final static String OBJ_TYPE_BIRTH = "birthYyymmdd";

    /** relationship. */
    public final static String OBJ_TYPE_RELATION = "relationship";

    /** victimId. */
    public final static String OBJ_TYPE_VICTIM_ID = "victimId";

    /** householdStatus. */
    public final static String OBJ_TYPE_HOUSEHOLD_STATUS = "householdStatus";

    /** cellPhoneNumber. */
    public final static String OBJ_TYPE_CELL_PHONE = "cellPhoneNumber";

    /** dayPhoneNumber. */
    public final static String OBJ_TYPE_DAY_NUMBER = "dayPhoneNumber";

    /** dayPhoneExtension. */
    public final static String OBJ_TYPE_DAY_EXT = "dayPhoneExtension";

    /** dayPhoneAreacode. */
    public final static String OBJ_TYPE_DAY_AREA = "dayPhoneAreacode";

    /** nightPhoneNumber. */
    public final static String OBJ_TYPE_NIG_NUMBER = "nightPhoneNumber";

    /** nightPhoneExtension. */
    public final static String OBJ_TYPE_NIG_EXT = "nightPhoneExtension";

    /** nightPhoneAreacode. */
    public final static String OBJ_TYPE_NIG_AREA = "nightPhoneAreacode";

    /** village. */
    public final static String OBJ_TYPE_VILLAGE = "village";

    /** neighbor. */
    public final static String OBJ_TYPE_NEIGHBOR = "neighbor";

    /** streetDoorplate. */
    public final static String OBJ_TYPE_STREET_DOO = "streetDoorplate";

    /** H */
    public final static String USE_TYPE_H = "H";
    /** P. */
    public final static String USE_TYPE_P = "P";
    int TIMEOUT = 3600;
    /** The Constant OBJ_F_T_ID=transactionId. */
    final static String OBJ_F_T_ID = "transactionId";
    /** The Constant OBJ_F_SEQ_ID=sequenceId. */
    final static String OBJ_F_SEQ_ID = "sequenceId";
    /** The Constant OBJ_F_KEY=domainKey. */
    final static String OBJ_F_KEY = "domainKey";
    /** The Constant OBJ_F_S_N=serialNo. */
    final static String OBJ_F_S_N = "serialNo";
    /** The Constant OBJ_F_D_O=domainObj. */
    final static String OBJ_F_D_O = "domainObj";
    /** The Constant OBJ_F_A=action. */
    final static String OBJ_F_A = "action";
    /** The Constant OBJ_F_S=state. */
    final static String OBJ_F_S = "state";
    /** The Constant OBJ_F_L_M=lockMode. */
    final static String OBJ_F_L_M = "lockMode";
    /** The Constant XLDF_ACTION_R = R. */
    final static String XLDF_ACTION_R = "R";
    /** The Constant XLDF_ACTION_U = U. */
    final static String XLDF_ACTION_U = "U";
    /** The Constant XLDF_ACTION_I = I. */
    final static String XLDF_ACTION_I = "I";
    /** The Constant XLDF_ACTION_D = D. */
    final static String XLDF_ACTION_D = "D";
    /** The Constant XLDF_ACTION_C = C. */
    final static String XLDF_ACTION_C = "C";
    /** The Constant XLDF_ACTION_E = E. */
    final static String XLDF_ACTION_E = "E";
    /** The Constant XLDF_STATE_O = O. */
    final static String XLDF_STATE_O = "O";

    /** The Constant XLDF_STATE_C = C. */
    final static String XLDF_STATE_C = "C";

    /** I|C|U|D. */
    final static String XLDF_ACTION_CHANGE = "I|C|U|D";
    /** I|C|U */
    final static String XLDF_ACTION_UCI = "I|C|U";
    /** [RIUC]+ */
    final static String XLDF_ACTION_RIUC = "[RIUC]+";
    /** The Constant XLDF_LOCK_MODE_T = true. */
    final static boolean XLDF_LOCK_MODE_T = Boolean.TRUE;
    /** The Constant XLDF_LOCK_MODE_F = false. */
    final static boolean XLDF_LOCK_MODE_F = Boolean.FALSE;
    /** The Constant AREA_REGEX1 = 8{8} */
    final static String AREA_REGEX1 = "8{8}";
    /** The Constant TLDF_SITE_ID = 88888888 */
    final static String TLDF_SITE_ID = "88888888";
    /** The Constant ACTION_REGEX1 = .*R+.* */
    final static String ACTION_REGEX1 = ".*R+.*";
    /** The Constant ACTION_REGEX2 = .*D+.* */
    final static String ACTION_REGEX2 = ".*D+.*";
    /** The Constant ACTION_REGEX3 = .+I+.* (I前面須有至少1個任一字元) */
    final static String ACTION_REGEX3 = ".+I+.*";
    /** The Constant ACTION_REGEX4 = [^RCI]*(R|C|I)$ */
    final static String ACTION_REGEX4 = "[^RCI]*(R|C|I)$";
    /** The Constant ACTION_REGEX5 = .*C+.* */
    final static String ACTION_REGEX5 = ".*C+.*";
    /** The Constant ACTION_REGEX6 = [^R]*(R)$ */
    final static String ACTION_REGEX6 = "[^R]*(R)$";
    /** The Constant ACTION_REGEX2 = .*U+.* (只要有U->true) */
    final static String ACTION_REGEX7 = ".*U+.*";

    /** The Constant ACTION_REGEX8 = .+C+.* (C前面有任意自元) */
    final static String ACTION_REGEX8 = ".+C+.*";

    /** The Constant ACTION_REGEX9 = .*I+.* (只要有I->true) */
    final static String ACTION_REGEX9 = ".*I+.*";

    /** The Constant ACTION_REGEX10 = .*C+.* (只要有C->true) */
    final static String ACTION_REGEX10 = ".*C+.*";

    /** The Constant ACTION_REGEX12 = .*[RIC]+.* (只要有ICR->true) */
    final static String ACTION_REGEX12 = ".*[RIC]+.*";
    /** The Constant LOCK_REGEX2 = *.(true)+.* */
    final static String LOCK_REGEX2 = "*.(true)+.*";
    /** The Constant 通報模式 A */
    final static String CHG_TYPE_A = "A";
    /** The Constant 通報模式 E */
    final static String CHG_TYPE_E = "E";
    /** The Constant 通報模式 L */
    final static String CHG_TYPE_L = "L";
    /** The Constant 通報模式 M */
    final static String CHG_TYPE_M = "M";

    /** The Constant 通報模式 U */
    final static String CHG_TYPE_U = "U";

    /** The Constant 通報模式 D */
    final static String CHG_TYPE_D = "D";
    /** The Constant 通報模式 9 */
    final static String CHG_TYPE_9 = "9";
    /** The Constant 通報模式 8 */
    final static String CHG_TYPE_8 = "8";

    /** 身分角色:無戶籍外籍者 */
    public final static String ROLE1 = "1";

    /** 身分角色:國人 */
    public final static String ROLE2 = "2";

    /** 身分角色:有統號之外國人 */
    public final static String ROLE3 = "3";

    /** 身分角色:無統號之國人 */
    public final static String ROLE4 = "4";

    /** 無戶籍外籍者 */
    public final static String RETURN_TYPE1 = "1";

    /** 國人 */
    public final static String RETURN_TYPE2 = "2";

    /** 有統號之外國人 */
    public final static String RETURN_TYPE3 = "3";

    /** 無統號之國人 */
    public final static String RETURN_TYPE4 = "4";

    /** A OR 2 OR D OR E OR F */
    public final static String SPECIAL_MARK_REGEX_CODE_1 = "A|2|D|E|F";

    /** 88888888 */
    public final static String ADMIN_OFFICE_CODE_REGEX_CODE_1 = "8{8}";

    /** 77777777 */
    public final static String ADMIN_OFFICE_CODE_REGEX_CODE_2 = "7{8}";

    /** 空白國民身分證/膠膜號碼格式 10位數字 */
    public final static String CELLOPHANE_NO_REG = "^([0-9]{10})$";

    /** 兼任戶長的國民身份證 第1碼為*字 後9碼為數字 */
    public final static String CONCURRENT_HEAD_ID = "^\\*{1}\\d{9}";

    /** 統號第一碼為數字 */
    public final static String PERSION_ID_REGEX_CODE_1 = ".{0}[0-9].*";
    /** 統號第三碼是為6、7、8、9 */
    public final static String PERSION_ID_REGEX_CODE_2 = ".{2}(6|7|8|9).*";
    /** 統號第一碼為英文字母A-Z */
    public final static String PERSION_ID_REGEX_CODE_3 = ".{0}[A-Z].*";
    /** 無法判斷. **/
    public final static String GET_HOUSEHOLD_TYPE_4 = "無法判斷";
    /** 共同生活戶. **/
    public final static String GET_HOUSEHOLD_TYPE_3 = "1";
    /** 單獨生活戶. **/
    public final static String GET_HOUSEHOLD_TYPE_2 = "3";
    /** 共同事業戶. **/
    public final static String GET_HOUSEHOLD_TYPE_1 = "2";

    /** 國內無戶籍者. **/
    public final static String CHECK_HOUSEHOLD_STATUS_3 = "3";
    /** 曾有戶籍者. **/
    public final static String CHECK_HOUSEHOLD_STATUS_2 = "2";
    /** 現有戶籍者. **/
    public final static String CHECK_HOUSEHOLD_STATUS_1 = "1";

    /** 個人註記(現戶) **/
    public final static String PERSONAL_MARK_0 = "0";
    /** 個人註記(死亡) **/
    public final static String PERSONAL_MARK_1 = "1";
    /** 個人註記(除口) **/
    public final static String PERSONAL_MARK_2 = "2";

    /** 遷出類別(遷出國內) **/
    public final static String MOVE_OUT_TYPE_1 = "1";
    /** 遷出類別(遷出國外) **/
    public final static String MOVE_OUT_TYPE_2 = "2";
    /** 遷出類別(喪失國籍) **/
    public final static String MOVE_OUT_TYPE_3 = "3";

    /** 戶別代碼(共同生活戶) **/
    public final static String HOUSEHOLD_TYPE_1 = "1";

    /** 戶別代碼(共同事業戶) **/
    public final static String HOUSEHOLD_TYPE_2 = "2";

    /** 戶別代碼(單獨生活戶) **/
    public final static String HOUSEHOLD_TYPE_3 = "3";

    /** xldftrnstn. **/
    public final static String XLDFTRNSTN_TABLE_NAME = "xldftrnstn";

    /** current_person_index. **/
    public final static String TABLE_F_CPI = "current_person_index";

    /** transaction_id = ?. **/
    public final static String WHERE_RULE1 = "transaction_id = ?";

    /** L006. **/
    public final static String L006 = "L006";

    /**
     * "personId", "siteId"
     */
    public final static String[] H_B_C_4M_KEY = new String[] { OBJ_TYPE_PERSON_ID, OBJ_TYPE_SITE_ID };

    /**
     * "personId"
     */
    public final static String[] H_B_C_PERSON_ID_KEY = new String[] { OBJ_TYPE_PERSON_ID };

    /**
     * "personId", "siteId"
     */
    public final static String[] H_B_C_4H_KEY = new String[] { OBJ_TYPE_PERSON_ID, OBJ_TYPE_SITE_ID,
            OBJ_TYPE_REMOVE_DATE, OBJ_TYPE_REMOVE_TIME };

    /**
     * "householdHeadId", "householdId", "siteId"
     */
    public final static String[] H_B_C_1M_KEY = new String[] { OBJ_TYPE_HEAD_ID, OBJ_TYPE_HOUSE_ID, OBJ_TYPE_SITE_ID };

    /** removeDate. */
    final static String REMOVE_PARAMS_R_D = "removeDate";
    /** removeTime. */
    final static String REMOVE_PARAMS_R_T = "removeTime";

    /** compare action. */
    final static String[] COMPARE_STRS = new String[] { XLDF_ACTION_R, XLDF_ACTION_C, XLDF_ACTION_I, XLDF_ACTION_U,
            XLDF_ACTION_D };

    /** XLDF_STORE_T = true. */
    final static boolean XLDF_STORE_T = Boolean.TRUE;

    /** XLDF_STORE_F = false. */
    final static boolean XLDF_STORE_F = Boolean.FALSE;

    /** XLDF_STORE_F = false. */
    final static String STORE_FALSE = "false";

    /** 記事例代碼 201000001 */
    final static String NOTE_CODE_201000001 = "201000001";

    /** 記事例代碼201000002 */
    final static String NOTE_CODE_201000002 = "201000002";

    /** 記事例代碼201000003 */
    final static String NOTE_CODE_201000003 = "201000003";

    /** 記事例代碼201000004 */
    final static String NOTE_CODE_201000004 = "201000004";

    /** 記事例代碼201000005 */
    final static String NOTE_CODE_201000005 = "201000005";

    /** 記事例代碼 201000006 */
    final static String NOTE_CODE_201000006 = "201000006";

    /** 記事例代碼 2003000001 */
    public String NOTE_CODE_2003000001 = "2003000001";

    /** 記事例代碼 2003000001 */
    public String NOTE_CODE_2003000002 = "2003000002";

    /** 記事例代碼 2003000003 */
    public String NOTE_CODE_2003000003 = "2003000003";

    /** 記事例代碼 2003000004 */
    public String NOTE_CODE_2003000004 = "2003000004";

    /** 記事例代碼 2004000001 */
    public String NOTE_CODE_2004000001 = "2004000001";

    /** 記事例代碼 2004000002 */
    public String NOTE_CODE_2004000002 = "2004000002";

    /** 記事例代碼 2004000003 */
    public String NOTE_CODE_2004000003 = "2004000003";

    /** 記事例代碼 2004000004 */
    public String NOTE_CODE_2004000004 = "2004000004";

    /** 記事例代碼 2004000005 */
    public String NOTE_CODE_2004000005 = "2004000005";

    /** 記事例代碼 2004000006 */
    public String NOTE_CODE_2004000006 = "2004000006";

    /** 記事例代碼 2004000007 */
    public String NOTE_CODE_2004000007 = "2004000007";

    /** 記事例代碼 2004000008 */
    public String NOTE_CODE_2004000008 = "2004000008";

    /** 記事例代碼 2004000009 */
    public String NOTE_CODE_2004000009 = "2004000009";

    /** 記事例代碼 2004000010 */
    public String NOTE_CODE_2004000010 = "2004000010";

    /** 記事例代碼 2004000011 */
    public String NOTE_CODE_2004000011 = "2004000011";

    /** 記事例代碼 2004000012 */
    public String NOTE_CODE_2004000012 = "2004000012";

    /** 記事例代碼 2004000013 */
    public String NOTE_CODE_2004000013 = "2004000013";

    /** 記事例代碼 2004000014 */
    public String NOTE_CODE_2004000014 = "2004000014";

    /** 記事例代碼 2004000015 */
    public String NOTE_CODE_2004000015 = "2004000015";

    /** 記事例代碼 2004000016 */
    public String NOTE_CODE_2004000016 = "2004000016";

    /** 記事例代碼 2004000017 */
    public String NOTE_CODE_2004000017 = "2004000017";

    /** 記事例代碼 2004000018 */
    public String NOTE_CODE_2004000018 = "2004000018";

    /** 記事例代碼 2004000019 */
    public String NOTE_CODE_2004000019 = "2004000019";

    /** 記事例代碼 2004000020 */
    public String NOTE_CODE_2004000020 = "2004000020";

    /** 記事例代碼 3077000001 */
    public String NOTE_CODE_3077000001 = "3077000001";

    /** 記事例代碼 3077000002 */
    public String NOTE_CODE_3077000002 = "3077000002";

    /** 記事例代碼 3077000003 */
    public String NOTE_CODE_3077000003 = "3077000003";

    /** 記事例代碼 3077000004 */
    public String NOTE_CODE_3077000004 = "3077000004";

    /** 記事例代碼 3077000005 */
    public String NOTE_CODE_3077000005 = "3077000005";

    /** 記事例代碼 3077000006 */
    public String NOTE_CODE_3077000006 = "3077000006";

    /** 記事例代碼 3077000007 */
    public String NOTE_CODE_3077000007 = "3077000007";

    /** 記事例代碼 3077000008 */
    public String NOTE_CODE_3077000008 = "3077000008";

    /** 記事例代碼 2080000001 */
    public String NOTE_CODE_2080000001 = "2080000001";

    /** 記事例代碼 2080000002 */
    public String NOTE_CODE_2080000002 = "2080000002";

    /** 記事例代碼 2080000003 */
    public String NOTE_CODE_2080000003 = "2080000003";

    /** 記事例代碼 2080000004 */
    public String NOTE_CODE_2080000004 = "2080000004";

    /** 記事例代碼 2080000005 */
    public String NOTE_CODE_2080000005 = "2080000005";

    /** 記事例代碼 2080000006 */
    public String NOTE_CODE_2080000006 = "2080000006";

    /** 記事例代碼 2080000007 */
    public String NOTE_CODE_2080000007 = "2080000007";

    /** 記事例代碼 8090000001 */
    public String NOTE_CODE_8090000001 = "8090000001";

    /** 記事例代碼 8090000002 */
    public String NOTE_CODE_8090000002 = "8090000002";

    /** 記事例代碼 8090000003 */
    public String NOTE_CODE_8090000003 = "8090000003";

    /** 記事例代碼 809I000001 */
    public String NOTE_CODE_809I000001 = "809I000001";

    /** 記事例代碼 809I000002 */
    public String NOTE_CODE_809I000002 = "809I000002";

    /** 記事例代碼 809I000003 */
    public String NOTE_CODE_809I000003 = "809I000003";

    /** 記事例代碼 809I000004 */
    public String NOTE_CODE_809I000004 = "809I000004";

    /** 記事例代碼 809I000005 */
    public String NOTE_CODE_809I000005 = "809I000005";

    /** 記事例代碼 809I000004 */
    public String NOTE_CODE_809I000006 = "809I000006";

    /** 記事例代碼 809Q000001 */
    public String NOTE_CODE_809Q000001 = "809Q000001";

    /** 記事例代碼 809Q000002 */
    public String NOTE_CODE_809Q000002 = "809Q000002";

    /** 記事例代碼 809Q000003 */
    public String NOTE_CODE_809Q000003 = "809Q000003";

    /** 記事例代碼 G0D1000001 */
    public String NOTE_CODE_G0D1000001 = "G0D1000001";

    /** 記事例代碼 G0D1000002 */
    public String NOTE_CODE_G0D1000002 = "G0D1000002";

    /** 記事例代碼 G0D1000003 */
    public String NOTE_CODE_G0D1000003 = "G0D1000003";

    /** 記事例代碼 G09J000001 */
    public String NOTE_CODE_G09J000001 = "G09J000001";

    /** 記事例代碼 G09J000002 */
    public String NOTE_CODE_G09J000002 = "G09J000002";

    /** 記事例代碼 G09J000003 */
    public String NOTE_CODE_G09J000003 = "G09J000003";

    /** 記事例代碼 G09J000004 */
    public String NOTE_CODE_G09J000004 = "G09J000004";

    /** 記事例代碼 G09J000005 */
    public String NOTE_CODE_G09J000005 = "G09J000005";

    /** 記事例代碼 G09J000006 */
    public String NOTE_CODE_G09J000006 = "G09J000006";

    /** 記事例代碼 G09J000007 */
    public String NOTE_CODE_G09J000007 = "G09J000007";

    /** 記事例代碼 G09J000008 */
    public String NOTE_CODE_G09J000008 = "G09J000008";

    /** 記事例代碼 G09J000009 */
    public String NOTE_CODE_G09J000009 = "G09J000009";

    /** 記事例代碼 G09J000010 */
    public String NOTE_CODE_G09J000010 = "G09J000010";

    /** 記事例代碼 G09J000011 */
    public String NOTE_CODE_G09J000011 = "G09J000011";

    /** 記事例代碼 G09J000012 */
    public String NOTE_CODE_G09J000012 = "G09J000012";

    /** 記事例代碼 G09J000013 */
    public String NOTE_CODE_G09J000013 = "G09J000013";

    /** 記事例代碼 G09J000014 */
    public String NOTE_CODE_G09J000014 = "G09J000014";

    /** 記事例代碼 G09J999999 */
    public String NOTE_CODE_G09J999999 = "G09J999999";

    /** 記事例代碼 8091000001 */
    public String NOTE_CODE_H8091000001 = "8091000001";

    /** 記事例代碼 8091000002 */
    public String NOTE_CODE_H8091000002 = "8091000002";

    /** 記事例代碼 8091000003 */
    public String NOTE_CODE_H8091000003 = "8091000003";

    /** 記事例代碼 8091000001 */
    public String NOTE_CODE_W8091000001 = "8091000001";

    /** 記事例代碼 8091000002 */
    public String NOTE_CODE_W8091000002 = "8091000002";

    /** 記事例代碼 8091000003 */
    public String NOTE_CODE_W8091000003 = "8091000003";

    /** 記事例代碼 G0D2000001 */
    public String NOTE_CODE_HG0D2000001 = "G0D2000001";

    /** 記事例代碼 G0D2000002 */
    public String NOTE_CODE_HG0D2000002 = "G0D2000002";

    /** 記事例代碼 G0D2000003 */
    public String NOTE_CODE_HG0D2000003 = "G0D2000003";

    /** 記事例代碼 G0D2000001 */
    public String NOTE_CODE_WG0D2000001 = "G0D2000001";

    /** 記事例代碼 G0D2000002 */
    public String NOTE_CODE_WG0D2000002 = "G0D2000002";

    /** 記事例代碼 G0D2000003 */
    public String NOTE_CODE_WG0D2000003 = "G0D2000003";

    /** 記事例代碼 809E000001 */
    public String NOTE_CODE_809E000001 = "809E000001";

    /** 記事例代碼 809E000002 */
    public String NOTE_CODE_809E000002 = "809E000002";

    /** 記事例代碼 809E000003 */
    public String NOTE_CODE_809E000003 = "809E000003";

    /** targetNamespace = http://tw.gov.moi/ris/domain. **/
    final static String Namespace_RIS = "http://tw.gov.moi/ris/domain";

    /** targetNamespace = http://tw.gov.moi/rs/wsclient. **/
    final static String Namespace_RL = "http://tw.gov.moi/rl/wsclient";

    /** targetNamespace = http://tw.gov.moi/ae/domain. **/
    final static String Namespace_AE = "http://tw.gov.moi/ae/domain";

    final static String Namespace_RL_DOMAIN = "http://tw.gov.moi/rl/domain";

    /** RS DTO namespace */
    final static String Namespace_RS_DOMAIN = "http://tw.gov.moi/rs/domain";

    /** HandlerChain = ../../../../../chain.xml. **/
    final static String HandlerChain_PATH = "chain.xml";

    /** The Constant Name_GetData. */
    final static String Name_GetData = "RlGetDataWS";

    /** The Constant Name_GetData. */
    final static String Name_HouseHoldData = "RlGetPersonalHouseHoldDataWS";

    /** The Constant Name_GetData. */
    final static String Name_PersonalHouseData = "RlPersonalHouseErasedDataWS";

    /** The Constant Name_GetData. */
    final static String Name_AllHouseData = "RlAllHouseErasedDataWS";

    final static String RcHouseholdVerifyWS = "RcHouseholdVerifyWS";

    /** The Constant Name_GetData. */
    final static String Name_Household = "RlAllHouseErasedDataWS";

    final static String Name_RlRetrieveRLDFTableData = "RlRetrieveRLDFTableDataWS";

    final static String Name_RlGetMultiData = "RlGetMultiDataWs";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_GetData = "RlGetDataWSService";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_HouseHoldData = "RlGetPersonalHouseHoldDataWSService";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_PersonalHouseData = "RlPersonalHouseErasedDataWSService";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_AllHouseData = "RlAllHouseErasedDataWSService";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_RcHouseholdVerifyWS = "RcHouseholdVerifyWSService";

    /** The Constant ServiceName_GetData. */
    final static String ServiceName_Household = "RlHouseholdWsService";

    final static String ServiceName_RlRetrieveRLDFTableData = "RlRetrieveRLDFTableDataWSService";

    final static String ServiceName_RlGetMultiData = "RlGetMultiDataWsService";

    /** The Constant Name_LockTable. */
    final static String Name_LockTable = "RlLockTableWS";

    /** The Constant ServiceName_LockTable. */
    final static String ServiceName_LockTable = "RlLockTableWSService";

    /** The Constant Name_LockTable. */
    final static String Name_BatchLockTable = "RlBatchLockTableWS";

    /** The Constant ServiceName_LockTable. */
    final static String ServiceName_BatchLockTable = "RlBatchLockTableWSService";

    /** The Constant Name_MultiLock. */
    final static String Name_MultiLock = "RlMultiLockWS";

    /** The Constant ServiceName_MultiLock. */
    final static String ServiceName_MultiLock = "RlMultiLockWSService";

    /** RlIdCardMaterialWS. */
    final static String Name_RlIdCardMaterialWS = "RlIdCardMaterialWS";

    /** RlIdCardMaterialWS. */
    final static String Name_RlHouseholdWs = "RlHouseholdWs";

    /** RlIdCardMaterialWSService. */
    final static String ServiceName_RlIdCardMaterialWS = "RlIdCardMaterialWSService";

    /** RlGetHouseholdRegistrationDataWS */
    String NAME_RlGetHouseholdRegistrationDataWS = "RlGetHouseholdRegistrationDataWS";

    /** RlGetHouseholdRegistrationDataWSService */
    String SERVICE_NAME_RlGetHouseholdRegistrationDataWS = "RlGetHouseholdRegistrationDataWSService";

    /** ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑CONSTANTS↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ */

    /** ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓作業代碼↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ */

    /** Constant */
    static final String START = "Start";

    /** Constant */
    static final String END = "End";

    /** LOCAL_IP. */
    String LOCAL_IP = "0:0:0:0:0:0:0:1";

    /** 作業代碼-出生登記 */
    public String OPERATION_CODE_01210 = "01210";

    /** 作業代碼-未成年子女權利義務行使負擔登記 */
    public String OPERATION_CODE_012F0 = "012F0";

    /** 作業代碼-離婚登記 */
    public String OPERATION_CODE_01240 = "01240";

    /** 作業代碼-結婚登記 */
    public String OPERATION_CODE_01230 = "01230";

    /** 作業代碼-認領登記 */
    public String OPERATION_CODE_01250 = "01250";

    /** 作業代碼-收養登記 */
    public String OPERATION_CODE_01263 = "01263";

    /** 作業代碼-終止收養登記 */
    public String OPERATION_CODE_01273 = "01273";

    /** 作業代碼-認領撤銷登記 */
    public String OPERATION_CODE_01812 = "01812";

    /** 作業代碼-收養撤銷登記 */
    public String OPERATION_CODE_01813 = "01813";

    /** 作業代碼-終止收養撤銷登記 */
    public String OPERATION_CODE_01826 = "01826";

    /** 作業代碼-監護撤銷登記 */
    public String OPERATION_CODE_01831 = "01831";

    /** 作業代碼-英文戶籍謄本 */
    public String OPERATION_CODE_02800 = "02800";

    /** 作業代碼-住變登記 */
    public String OPERATION_CODE_01330 = "01330";

    /** 作業代碼-分合登記 */
    public String OPERATION_CODE_01340 = "01340";

    /** 作業代碼-分合(撤銷)登記 */
    public String OPERATION_CODE_01830 = "01830";

    /** 作業代碼-輔助撤銷登記 */
    public String OPERATION_CODE_01833 = "01833";

    /** 作業代碼-原住民身分及族別登記 */
    public String OPERATION_CODE_012B0 = "012B0";

    /** 作業代碼-監護登記 */
    public String OPERATION_CODE_012E0 = "012E0";

    /** 作業代碼-輔助登記 */
    public String OPERATION_CODE_012G0 = "012G0";

    /** 作業代碼-歸化國籍姓名羅馬拼音控制器 */
    public String OPERATION_CODE_012H0 = "012H0";

    /** 作業代碼-原住民傳統姓名羅馬拼音控制器 */
    public String OPERATION_CODE_012C0 = "012C0";

    /** 作業代碼-初設戶籍登記 */
    public String OPERATION_CODE_01390 = "01390";

    /** 作業代碼-印鑑登記申請 */
    public String OPERATION_CODE_01510 = "01510";

    /** 作業代碼-印鑑變更申請 */
    public String OPERATION_CODE_01520 = "01520";

    /** 作業代碼-結婚撤銷登記 */
    public String OPERATION_CODE_01801 = "01801";

    /** 作業代碼-撤銷戶籍登記 */
    public String OPERATION_CODE_01819 = "01819";

    /** 作業代碼-撤銷廢止戶籍登記 */
    public String OPERATION_CODE_01827 = "01827";

    /** 作業代碼-原住民身分及族別撤銷登記 */
    public String OPERATION_CODE_01828 = "01828";

    /** 作業代碼-結婚廢止登記 */
    public String OPERATION_CODE_01G01 = "01G01";

    /** 作業代碼-廢止戶籍登記 */
    public String OPERATION_CODE_01G19 = "01G19";

    /** 作業代碼-監護廢止登記 */
    public String OPERATION_CODE_01G21 = "01G21";

    /** 作業代碼-未成年子女權利義務行使負擔廢止登記 */
    public String OPERATION_CODE_01G22 = "01G22";

    /** 作業代碼-輔助廢止登記 */
    public String OPERATION_CODE_01G23 = "01G23";

    /** 作業代碼-國民身分證請領 */
    public String OPERATION_CODE_02A10 = "02A10";

    /** 作業代碼-姓名更正登記 */
    public String OPERATION_CODE_0171D = "0171D";

    /** 作業代碼-姓名變更/冠姓/從姓登記 */
    public String OPERATION_CODE_0172B = "0172B";

    /** 作業代碼-稱謂更正登記 */
    public String OPERATION_CODE_0171F = "0171F";

    /** 作業代碼-未成年子女權利義務行使負擔撤銷登記 */
    public String OPERATION_CODE_01832 = "01832";

    /** 作業代碼-現無戶籍者結(離)婚登記 */
    public String OPERATION_CODE_0W100 = "0W100";

    /** 作業代碼-出生撤銷登記 */
    public String OPERATION_CODE_01815 = "01815";

    /** 作業代碼-結離婚證明書核發 */
    public String OPERATION_CODE_02D00 = "02D00";

    public static final String OPERATION_CODE_01110 = "01110";

    public static final String OPERATION_CODE_01120 = "01120";

    /** ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑作業代碼↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ */

    /** ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓代碼檔名稱↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ */

    public static final String OPERATION_CODE_01130 = "01130";

    public static final String OPERATION_CODE_01140 = "01140";

    /** 作業代碼-姓名更改紀錄證明 */
    public String OPERATION_CODE_02E00 = "02E00";

    /** 作業代碼-婚姻更改紀錄證明 */
    public String OPERATION_CODE_02G00 = "02G00";

    /** 作業代碼-遷徙更改紀錄證明 */
    public String OPERATION_CODE_02H00 = "02H00";

    /** 作業代碼-戶口名簿請領 */
    public String OPERATION_CODE_02510 = "02510";

    /** 省市縣市-代碼檔名稱 */
    public String RSCD0101 = "RSCD0101";

    /** 縣市-代碼檔名稱 */
    public String RSCD0102 = "RSCD0102";

    /** 原申請設籍行政區域-代碼檔名稱 */
    public String RSCD0103 = "RSCD0103";

    /** 出生地點-代碼檔名稱 */
    public String RSCD0104 = "RSCD0104";

    /** 受理地戶政事務所名稱-代碼檔名稱 */
    public String RSCD0106 = "RSCD0106";

    /** 行政區域-代碼檔名稱 */
    public String RSCD0107 = "RSCD0107";

    /** 離婚種類-代碼檔名稱 */
    public String RSCD3014 = "RSCD3014";

    /** 是否自立新戶-代碼檔名稱 */
    public String RSCD3216 = "RSCD3216";

    /** 出生場所名稱-代碼檔名稱 */
    public String RSCD3219 = "RSCD3219";

    /** 遷入事由-代碼檔名稱 */
    public String RSCD3251 = "RSCD3251";

    /** 遷入統計註記-代碼檔名稱 */
    public String RSCD3252 = "RSCD3252";

    /** 出生撤銷原因-代碼檔名稱 */
    public String RSCD3292 = "RSCD3292";

    /** 遷入發生時期-代碼檔名稱 */
    public String RSCD3253 = "RSCD3253";

    /** 作業點-代碼檔名稱 */
    public String RSCD0118 = "RSCD0118";

    /** 戶政事務所-代碼檔名稱 */
    String RSCD0116 = "RSCD0116";

    /** 稱謂-代碼檔名稱 */
    public String RSCD3532 = "RSCD3532";

    /** 戶別代碼 */
    public String RSCD0201 = "RSCD0201";

    /** 個人註記代碼 */
    public String RSCD0217 = "RSCD0217";

    /** 戶別代碼(英文版) */
    public String RSCD3459 = "RSCD3459";

    /** (撤銷戶籍登記)附繳證件代碼 */
    public String RSCD3464 = "RSCD3464";

    /** (撤銷戶籍登記)撤銷原因代碼 */
    public String RSCD3466 = "RSCD3466";

    /** 遷入登記附繳證件代碼 */
    public String RSCD3478 = "RSCD3478";

    /** 住址變更登記附繳證件代碼 */
    public String RSCD3479 = "RSCD3479";

    /** 撤銷廢止戶籍登記附繳證件代碼 */
    public String RSCD3483 = "RSCD3483";

    /** 出生別-代碼檔名稱 */
    public String RSCD0205 = "RSCD0205";

    /** 出生日期型態-代碼檔名稱 */
    public String RSCD3469 = "RSCD3469";

    /** 出生別-代碼檔名稱 */
    public String RSCD3460 = "RSCD3460";

    /** 教育程度-代碼檔名稱 */
    public String RSCD0207 = "RSCD0207";

    /** 原住民身份-代碼檔名稱 */
    public String RSCD0208 = "RSCD0208";

    /** 出生身分-代碼檔名稱 */
    public String RSCD0209 = "RSCD0209";

    /** 印登代碼-代碼檔名稱 */
    public String RSCD3002 = "RSCD3002";

    /** 胎別-代碼檔名稱 */
    public String RSCD3004 = "RSCD3004";

    /** 接生者身份-代碼檔名稱 */
    public String RSCD3030 = "RSCD3030";

    /** 出生場所性質-代碼檔名稱 */
    public String RSCD3031 = "RSCD3031";

    public String RSCD3045 = "RSCD3045";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3049 = "RSCD3049";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3052 = "RSCD3052";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3054 = "RSCD3054";

    /** 婚姻狀況-代碼檔名稱 */
    public String RSCD3065 = "RSCD3065";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3270 = "RSCD3270";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3275 = "RSCD3275";

    /** 附繳證件-代碼檔名稱 */
    public String RSCD3286 = "RSCD3286";

    /** 特殊註記代碼 For Rcdf001mrl.special_inci_code */
    public String RSCD0212 = "RSCD0212";

    /** 申請書類別-代碼檔名稱 */
    public String RSCD0213 = "RSCD0213";

    /** 身分證領補換代碼 */
    public String RSCD0214 = "RSCD0214";

    /** 性別識別代碼 */
    String RSCD3087 = "RSCD3087";

    /** 國籍-代碼檔名稱 */
    public String RSCD3095 = "RSCD3095";

    /** 原住民族別-代碼檔名稱 */
    public String RSCD3117 = "RSCD3117";

    /** 原住民族別-代碼檔名稱 part2 */
    public String RSCD0220 = "RSCD0220";

    /** 從姓-代碼檔名稱 */
    public String RSCD3147 = "RSCD3147";

    public String RSCD3150 = "RSCD3150";

    public String RSCD3118 = "RSCD3118";

    public String RSCD3181 = "RSCD3181";

    public String RSCD3413 = "RSCD3413";

    /** 附繳證件代碼 */
    public String RSCD3418 = "RSCD3418";

    /** 離婚廢止原因代碼 */
    public String RSCD3419 = "RSCD3419";

    /** 附繳證件代碼 */
    public String RSCD3420 = "RSCD3420";

    /** (原屬)國籍-代碼檔名稱 */
    public String RSCD3152 = "RSCD3152";

    /** 從姓方式-代碼檔名稱 */
    public String RSCD3153 = "RSCD3153";

    /** 姓名變更登記-變更項目-代碼檔名稱 */
    public String RSCD3149 = "RSCD3149";

    /** 鄉鎮市區-代碼檔名稱 */
    public String RSCD3215 = "RSCD3215";

    /** 姓名類別-代碼檔名稱 */
    public String RSCD3217 = "RSCD3217";

    /** 從姓決定者-代碼檔名稱 */
    public String RSCD3221 = "RSCD3221";

    /** 遷入與住變登記附繳證件代碼 -代碼檔名稱 */
    public String RSCD3225 = "RSCD3225";

    /*** 中文結婚證明書登記申請書 **/
    public String RSCD3487 = "RSCD3487";

    /*** 中文離婚證明書登記申請書 **/
    public String RSCD3523 = "RSCD3523";

    /*** 英文結婚證明書登記申請書 **/
    public String RSCD3488 = "RSCD3488";

    /*** 英文離婚證明書登記申請書 **/
    public String RSCD3524 = "RSCD3524";

    /** 廢止原因代碼檔:RSCD3553 */
    public String RSCD3553 = "RSCD3553";

    /** 廢止原因代碼檔:RSCD3554 */
    public String RSCD3554 = "RSCD3554";

    /** 廢止原因代碼檔:RSCD3555 */
    public String RSCD3555 = "RSCD3555";

    /** 規費項目名稱代碼 */
    final static String RSCD3237 = "RSCD3237";

    /** 免收規費原因代碼 */
    final static String RSCD3238 = "RSCD3238";

    String RSCDMESG = "RSCDMESG";

    /** 收養類型-代碼檔名稱 */
    public String RSCD3271 = "RSCD3271";

    /** 終止收養類型-代碼檔名稱 */
    public String RSCD3364 = "RSCD3364";

    /** 初設戶籍附繳證件代碼 */
    String RSCD3010 = "RSCD3010";

    /** 特殊註記代碼 */
    String RSCD3012 = "RSCD3012";

    /** 役別代碼 */
    String RSCD3110 = "RSCD3110";

    /** 役別代碼 */
    String RSCD0204 = "RSCD0204";

    /** 戶籍謄本申請種類 */
    String RSCD3040 = "RSCD3040";

    /** 配偶姓名更正廢止附繳證件 */
    String RSCD3259 = "RSCD3259";

    /** 出生日期更正附繳證件 */
    String RSCD3263 = "RSCD3263";

    /** 撤銷原因代碼 */
    String RSCD3269 = "RSCD3269";

    /** 登記誤報或誤錄 */
    String RSCD3254 = "RSCD3254";

    /** 權利義務行使負擔登記 */
    String RSCD3159 = "RSCD3159";

    /** 撤銷原因代碼 */
    String RSCD3417 = "RSCD3417";

    /** 是否型態代碼 */
    String RSCD3212 = "RSCD3212";

    /** 門牌編釘申請書代碼 */
    String RSCD3062 = "RSCD3062";

    /** 門牌編釘申請人身分代碼 */
    String RSCD3063 = "RSCD3063";

    /** 戶籍記事主分類代碼 */
    String RSCD3224 = "RSCD3224";

    /** 戶籍記事次分類代碼 */
    String RSCD3280 = "RSCD3280";

    /** 父母姓名更正-附繳證件 */
    String RSCD3284 = "RSCD3284";

    /** 父母姓名變更引用法條 */
    String RSCD3327 = "RSCD3327";

    /** 父姓名更正原因代碼 */
    String RSCD3324 = "RSCD3324";

    /** 婚姻狀況 */
    String RSCD3265 = "RSCD3265";

    /** 更正原因 */
    String RSCD3294 = "RSCD3294";

    String RSCD3295 = "RSCD3295";

    /** 附繳證件-遷出撤銷 */
    String RSCD3297 = "RSCD3297";

    /** 原住民身分及族別更正引用法條代碼 */
    String RSCD3337 = "RSCD3337";

    /** 原住民身分及族別更正附繳證件 */
    String RSCD3338 = "RSCD3338";

    /** 原住民身分及族別更正原因代碼 */
    String RSCD3352 = "RSCD3352";

    /** 行政區劃及門牌更正附繳證件 */
    String RSCD3255 = "RSCD3255";

    /** 申請資料-更正類別 */
    String RSCD3266 = "RSCD3266";

    /** 申請資料-更正原因 */
    String RSCD3261 = "RSCD3261";

    /** 申請資料-附繳證件 */
    String RSCD3257 = "RSCD3257";

    /** 戶籍謄本核發-附繳證件 */
    String RSCD3278 = "RSCD3278";

    /** 戶籍謄本核發-請領狀態 */
    String RSCD3283 = "RSCD3283";

    String RSCD3291 = "RSCD3291";

    /** 姓名更正引用法條 */
    String RSCD3325 = "RSCD3325";

    /** 養父養母姓名引用法條 */
    String RSCD3328 = "RSCD3328";

    /** 撤銷姓名引用法條 */
    String RSCD3329 = "RSCD3329";

    /** 養父姓名更正登記附繳證件 */
    String RSCD3347 = "RSCD3347";

    /** 養父姓名更正原因代碼 */
    String RSCD3348 = "RSCD3348";

    /** 養母姓名更正登記附繳證件 */
    String RSCD3350 = "RSCD3350";

    /** 養母姓名更正原因代碼 */
    String RSCD3351 = "RSCD3351";

    /** 戶籍謄本核發-申請事由 */
    String RSCD3361 = "RSCD3361";

    /** 英文戶籍謄本核發-附繳證件 */
    String RSCD3362 = "RSCD3362";

    /** 英文戶籍謄本核發-申請簿頁 */
    String RSCD3363 = "RSCD3363";

    /** 英文戶籍謄本核發-英文記事 */
    String RSCD3130 = "RSCD3130";

    /** 英文戶籍謄本核發-記事說明 */
    String RSCD3003 = "RSCD3003";

    /** 出生別變更登記附繳證件 */
    String RSCD3371 = "RSCD3371";

    /** 出生別變更原因代碼 */
    String RSCD3372 = "RSCD3372";

    /** 養母姓名變更附繳證件代碼 */
    String RSCD3377 = "RSCD3377";

    /** 養母姓名變更原因代碼 */
    String RSCD3378 = "RSCD3378";

    /** 養母姓名變更法條 */
    String RSCD3379 = "RSCD3379";

    /** 養父姓名變更附繳證件代碼 */
    String RSCD3380 = "RSCD3380";

    /** 養父姓名變更原因代碼 */
    String RSCD3381 = "RSCD3381";

    /** 養父姓名變更引用法條代碼 */
    String RSCD3382 = "RSCD3382";

    /** 母姓名變更附繳證件代碼 */
    String RSCD3383 = "RSCD3383";

    /** 母姓名變更原因代碼 */
    String RSCD3384 = "RSCD3384";

    /** 母姓名變更引用法條代碼 */
    String RSCD3385 = "RSCD3385";

    /** 父姓名變更附繳證件代碼 */
    String RSCD3386 = "RSCD3386";

    /** 父姓名變更原因代碼 */
    String RSCD3387 = "RSCD3387";

    /** 父姓名變更引用法條代碼 */
    String RSCD3388 = "RSCD3388";

    /** 配偶姓名變更登記附繳證件 */
    String RSCD3390 = "RSCD3390";

    /** 配偶姓名變更原因代碼 */
    String RSCD3391 = "RSCD3391";

    /** 配偶姓名變更法條 */
    String RSCD3392 = "RSCD3392";

    /** 親子關係更正父母姓名附繳證件 */
    String RSCD3393 = "RSCD3393";

    /** 親子關係更正父母姓名原因代碼 */
    String RSCD3394 = "RSCD3394";

    /** 親子關係更正父母姓名法條 */
    String RSCD3409 = "RSCD3409";

    /** 親子關係是否存在 */
    String RSCD3410 = "RSCD3410";

    /** 戶號變更登記附繳證件 */
    String RSCD3424 = "RSCD3424";

    /** 戶號變更原因代碼 */
    String RSCD3425 = "RSCD3425";

    /** 戶長變更附繳證件代碼 */
    String RSCD3427 = "RSCD3427";

    /** 戶長變更原因代碼 */
    String RSCD3428 = "RSCD3428";

    /** 父姓名更正撤銷附繳證件代碼 */
    String RSCD3433 = "RSCD3433";

    /** 父姓名更正撤銷原因代碼 */
    String RSCD3434 = "RSCD3434";

    /** 母姓名更正撤銷附繳證件代碼 */
    String RSCD3438 = "RSCD3438";

    /** 母姓名更正撤銷原因代碼 */
    String RSCD3439 = "RSCD3439";

    /** 養父姓名更正撤銷附繳證件代碼 */
    String RSCD3440 = "RSCD3440";

    /** 養父姓名更正撤銷原因代碼 */
    String RSCD3441 = "RSCD3441";

    /** 養母姓名更正撤銷附繳證件代碼 */
    String RSCD3442 = "RSCD3442";

    /** 養母姓名更正撤銷原因代碼 */
    String RSCD3443 = "RSCD3443";

    /** 離婚登記未成年子女權利義務行使負擔否之代碼 */
    String RSCD3444 = "RSCD3444";

    /** 配偶姓名更正撤銷附繳證件代碼 */
    String RSCD3446 = "RSCD3446";

    /** 配偶姓名更正撤銷原因代碼 */
    String RSCD3447 = "RSCD3447";

    /** 出生別更正撤銷附繳證件代碼 */
    String RSCD3449 = "RSCD3449";

    /** 廢止戶籍登記申請種類代碼 */
    String RSCD3462 = "RSCD3462";

    /** 廢止戶籍登記廢止原因代碼 */
    String RSCD3463 = "RSCD3463";

    /** 廢止戶籍登記附繳證件代碼 */
    String RSCD3465 = "RSCD3465";

    /** 催告案別代碼 */
    String RSCD3070 = "RSCD3070";

    /** 英文稱謂代碼 */
    String RSCD3477 = "RSCD3477";

    /** 英文稱謂代碼 */
    String RSCD3467 = "RSCD3467";

    /** 戶籍謄本列印種類 */
    String RSCD3514 = "RSCD3514";

    /** 初設戶籍原因 */
    String RSCD3522 = "RSCD3522";

    /** 撤銷原因 */
    String RSCD3527 = "RSCD3527";

    /** 戶口名簿記事代碼 */
    public final String RSCD3044 = "RSCD3044";

    /** 戶口名簿申請事由代碼 */
    public final String RSCD3083 = "RSCD3083";

    /** 戶口名簿附繳證件代碼 */
    public final String RSCD3504 = "RSCD3504";

    /** 戶口名簿領取方式代碼 */
    public final String RSCD3505 = "RSCD3505";

    /** 印鑑證明使用目的代碼 */
    public final String RSCD3511 = "RSCD3511";

    /** 列印父姓名的代碼 */
    public final String RSCD3512 = "RSCD3512";

    /** 列印母姓名的代碼 */
    public final String RSCD3513 = "RSCD3513";

    /** 國民身分證申請事項代碼檔 */
    public final String RSCD3560 = "RSCD3560";

    /** 記事更正及登載登記用的主分類代碼檔 */
    public final String RSCD3561 = "RSCD3561";

    /** 記事更正及登載登記之次分類代碼 (共4碼 -> 1碼主分類+3碼次分類) */
    public final String RSCD3562 = "RSCD3562";

    /** 遷入登記 當補登時呈現的 原住地戶所代碼 */
    public String RSCD3470 = "RSCD3470";

    /** 遷出撤銷代碼 */
    String RSCD3481 = "RSCD3481";

    /** 個人記事(更正)申請書附繳證件代碼 */
    public static final String RSCD3490 = "RSCD3490";

    /** 全戶記事(更正)申請書附繳證件代碼 */
    public static final String RSCD3491 = "RSCD3491";

    /** 除戶全戶動態記事記事(更正)申請書附繳證件代碼 */
    public static final String RSCD3493 = "RSCD3493";

    /** 役別代碼 */
    public static final String RSCD3097 = "RSCD3097";

    /** 姓名更改紀錄證明代碼 */
    public static final String RSCD3595 = "RSCD3595";

    /** 婚姻更改紀錄證明代碼 */
    public static final String RSCD3596 = "RSCD3596";

    /** 遷徙更改紀錄證明代碼 */
    public static final String RSCD3597 = "RSCD3597";

    /** 核發機關 */
    public String RSCD3222 = "RSCD3222";

    /** 配偶姓名更正廢止登記引用法條 */
    String RSCD3520 = "RSCD3520";

    /** ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑代碼檔名稱↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ */

    /** ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓代碼內容↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ */

    /** 訪查方式 */
    public static final String RSCD3170 = "RSCD3170";

    /** 查對成果 */
    public static final String RSCD3171 = "RSCD3171";

    /** 居住現址原因 */
    public static final String RSCD3172 = "RSCD3172";

    /** 免收規費原因代碼(10) */
    final static String RSCD3238_10 = "10";

    /** RSCD3212(是否型態)代碼 : 1=是 */
    final static String RSCD3212_CODE_1 = "1";

    /** RSCD3212(是否型態)代碼 : 2=否 */
    final static String RSCD3212_CODE_2 = "2";

    /** RSCD3152(原屬國籍)代碼 : 001=中華民國 */
    final static String RSCD3152_CODE_001 = "001";

    /** RSCD3152(原屬國籍)代碼 : 002=無戶籍國民 */
    final static String RSCD3152_CODE_002 = "002";

    /** RSCD3152(原屬國籍)代碼 : 003=中國大陸 */
    final static String RSCD3152_CODE_003 = "003";

    /** RSCD3152(原屬國籍)代碼 : 004=香港 */
    final static String RSCD3152_CODE_004 = "004";

    /** RSCD3152(原屬國籍)代碼 : 005=澳門 */
    final static String RSCD3152_CODE_005 = "005";

    /** RSCD3152(原屬國籍)代碼 : ZZZ=其它 */
    final static String RSCD3152_CODE_ZZZ = "ZZZ";

    /** 前作業點代碼 */
    final static String FROM_SITE_ID = "99999995";

    /** RSCD3152(出生地點)代碼 : 99998=大陸其他省市 */
    final static String RSCD0104_CODE_99998 = "99998";

    /** RSCD3152(出生地點)代碼 : 99999=國外 */
    final static String RSCD0104_CODE_99999 = "99999";

    /** 鄉鎮市區代碼 : 995 */
    final static String CODE_995 = "995";

    /** 鄉鎮市區代碼 : 993 */
    final static String CODE_993 = "993";

    /** 鄉鎮市區代碼 : 998 */
    final static String CODE_998 = "998";

    /** 鄉鎮市區代碼 : 99Q */
    final static String CODE_99Q = "99Q";

    /** RSCD3159(未成年子女權利義務行使負擔原因)代碼 : 1=父母離婚 */
    final static String RSCD3159_CODE_1 = "1";

    /** RSCD3159(未成年子女權利義務行使負擔原因)代碼 : 2=父母一方死亡或失蹤 */
    final static String RSCD3159_CODE_2 = "2";

    /** RSCD3159(未成年子女權利義務行使負擔原因)代碼 : 3=父母不繼續共同生活達六個月以上 */
    final static String RSCD3159_CODE_3 = "3";

    /** RSCD3159(未成年子女權利義務行使負擔原因)代碼 : 4=其它 */
    final static String RSCD3159_CODE_4 = "4";

    /** RSCD3159(未成年子女權利義務行使負擔原因)代碼 : 5=認領 */
    final static String RSCD3159_CODE_5 = "5";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 1=未成年子女權利義務行使負擔約定書 */
    final static String RSCD3160_CODE_1 = "1";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 2=離婚協議書 */
    final static String RSCD3160_CODE_2 = "2";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 3=法院裁定書 */
    final static String RSCD3160_CODE_3 = "3";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 4=委託書 */
    final static String RSCD3160_CODE_4 = "4";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 5=其它 */
    final static String RSCD3160_CODE_5 = "5";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 6=法院調解文件 */
    final static String RSCD3160_CODE_6 = "6";

    /** RSCD3160(未成年子女權利義務行使負擔登記附繳證件)代碼 : 7=法院和解文件 */
    final static String RSCD3160_CODE_7 = "7";

    /** RSCD3054(離婚登記附繳證件)代碼 : 1=離婚協議書 */
    final static String RSCD3054_CODE_1 = "1";

    /** RSCD3054(離婚登記附繳證件)代碼 : 2=法院判決書及判決確定證明書 */
    final static String RSCD3054_CODE_2 = "2";

    /** RSCD3054(離婚登記附繳證件)代碼 : 3=委託書 */
    final static String RSCD3054_CODE_3 = "3";

    /** RSCD3054(離婚登記附繳證件)代碼 : 4=其它 */
    final static String RSCD3054_CODE_4 = "4";

    /** RSCD3054(離婚登記附繳證件)代碼 : 5=法院調解文件 */
    final static String RSCD3054_CODE_5 = "5";

    /** RSCD3054(離婚登記附繳證件)代碼 : 6=法院和解文件 */
    final static String RSCD3054_CODE_6 = "6";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 1= 結婚證書 */
    final static String RSCD3158_CODE_1 = "1";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 2= 結婚書約 */
    final static String RSCD3158_CODE_2 = "2";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 3= 離婚協議書 */
    final static String RSCD3158_CODE_3 = "3";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 4= 法院判決書及判決確定證明書 */
    final static String RSCD3158_CODE_4 = "4";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 5= 委託書 */
    final static String RSCD3158_CODE_5 = "5";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 6= 其他 */
    final static String RSCD3158_CODE_6 = "6";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 7= 法院調解文件 */
    final static String RSCD3158_CODE_7 = "7";

    /** RSCD3158(現無戶籍者結離婚登記附繳證件)代碼 : 8= 法院和解文件 */
    final static String RSCD3158_CODE_8 = "8";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 1=離婚協議書 */
    final static String RSCD3054_CODE_11 = "1";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 2=法院判決書及判決確定證明書 */
    final static String RSCD3054_CODE_21 = "2";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 3=委託書 */
    final static String RSCD3054_CODE_31 = "3";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 4=其它 */
    final static String RSCD3054_CODE_41 = "4";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 5=法院調解文件 */
    final static String RSCD3054_CODE_51 = "5";

    /** RSCD3054(出生撤銷登記附繳證件)代碼 : 6=法院和解文件 */
    final static String RSCD3054_CODE_61 = "6";

    /** RSCD3419(離婚撤銷登記附繳證件)代碼 : 1= */
    final static String RSCD3419_CODE_1 = "1";

    /** RSCD3419(離婚撤銷登記附繳證件)代碼 : 2= */
    final static String RSCD3419_CODE_2 = "2";

    /** RSCD3419(離婚撤銷登記附繳證件)代碼 : 3= */
    final static String RSCD3419_CODE_3 = "3";

    /** RSCD3419(離婚撤銷登記附繳證件)代碼 : 4= */
    final static String RSCD3419_CODE_4 = "4";

    /** RSCD3419(離婚撤銷登記附繳證件)代碼 : 5=其它 */
    final static String RSCD3419_CODE_5 = "5";

    /** RSCD3496(出生撤銷登記附繳證件)代碼 : 1=法院判決書及判決確定證明書 */
    final static String RSCD3496_CODE_1 = "1";

    /** RSCD3496(出生撤銷登記附繳證件)代碼 : 2=其它 */
    final static String RSCD3496_CODE_2 = "2";

    /** 選舉權代碼 08500 */
    final static String VOTE_CODE_08500 = "08500";

    /** 選舉權代碼 08E00 */
    final static String VOTE_CODE_08E00 = "08E00";

    /** 選舉權代碼 08F00 */
    final static String VOTE_CODE_08F00 = "08F00";

    /** 選舉權代碼 08G00 */
    final static String VOTE_CODE_08G00 = "08G00";

    /** ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑代碼內容↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ */

    /** 選舉權代碼 08H00 */
    final static String VOTE_CODE_08H00 = "08H00";

    /** 選舉權代碼 08I00 */
    final static String VOTE_CODE_08I00 = "08I00";

    /** 選舉權代碼 08J00 */
    final static String VOTE_CODE_08T00 = "08T00";

    /** ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓RL大簿登記Method Name↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ */

    final static String METHOD_INIT_OPERATION = "initOperationDTO";

    final static String METHOD_LOAD_OPERATION = "initOperationDTO";

    final static String METHOD_REVIEW_OPERATION = "reviewOperationDTO";

    final static String METHOD_VERIFY_APPDATA = "verifyAppData";

    final static String METHOD_CONVERT_DATA = "convertData";

    final static String METHOD_SAVE_XLDF = "saveXldf";

    final static String METHOD_DO_DELETE = "doDelete";

    final static String METHOD_GET_FINELIST = "getFineList";

    final static String METHOD_EDIT_FINE = "editFine";

    final static String METHOD_DELETE_FINE = "deleteFine";

    final static String PERSON = "person";

    /** ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ RL大簿登記Method Name ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ */

    final static String HOUSEHOLD = "household";

    final String MALE = "1";

    final String FEMALE = "2";

    /** XLDF型態 = %s, 鍵值=%s */
    final String XLDF_EXCEPTION = "XLDF型態 = %s, 鍵值=%s";

    /** %s的KEY值不完整,有缺漏,請確認暫存時是否有將此物件的key塞值進去, key=%s */
    final String XLDF_KEY_NOT_ENTIRE_EXCEPTION = "%s的KEY值不完整,有缺漏,請確認暫存時是否有將此物件的key塞值進去, key=%s";

    /** 初始化登記 */
    String INIT_OPERATION_DTO_EXT_MESSAGE = "初始化%s登記";

    /** 刪除登記XLDF資料 */
    String DO_DELETE_EXT_MESSAGE = "刪除%s登記XLDF資料";

    /** 自動組合記事 */
    String AUTO_NOTES_EXT_MESSAGE = "自動組合%s記事";

    /** 執行資料驗證並自動組合記事 */
    String VERIFY_APPDATA_EXT_MESSAGE = "執行資料驗證並自動組合記事";

    /** 更新當事人「個人基本資料」 */
    String UPDATE_PERSON_DATA_EXT_MESSAGE = "更新當事人「個人基本資料」";

    /** 新增當事人之「個人動態記事」失敗 */
    String CREATE_XLDF005M_EXT_MESSAGE = "新增當事人之「個人動態記事」失敗";

    /** 新增「申請書」及「申請書索引資料」 */
    String CREATE_APP_DATA_EXT_MESSAGE = "新增「%s申請書」及「申請書索引資料」";

    /** 暫存「臨時－辦理他所申請書索引資料」至XLDF026S 失敗 */
    String SAVE_XLDF026S_EXT_MESSAGE = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S 失敗";

    /** 暫存「暫存辦理他所－%s申請書歷史資料至%s失敗」 */
    String SAVE_XLDFWTYPE_EXT_MESSAGE = "暫存「暫存辦理他所－%s申請書歷史資料至%s失敗」";

    /** 新增「臨時─個人申請書紀錄資料」失敗 */
    String CREATE_XLDFM10M_EXT_MESSAGE = "新增「臨時─個人申請書紀錄資料」失敗";

    /** 新增「臨時─%s登記個人記事欄位化」失敗 */
    String CREATE_XLDFYXXXM_EXT_MESSAGE = "新增「臨時─%s登記個人記事欄位化」失敗";

    /** 新增「臨時─%s登記全戶動態記事欄位化」失敗 */
    String CREATE_XLDFXXXXM_EXT_MESSAGE = "新增「臨時─%s登記全戶動態記事欄位化」失敗";

    /** 請輸入「事件發生（確定）日期」 */
    String VERIFY_ERROR_MSG_EVENTDATE = "請輸入「事件發生（確定）日期」";
    /** 請輸入免罰原因 */
    String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";
    String E_MSG_METHOD_INIT_LOAD_PAGE = "執行Contoller loadPage() 的第一個Service之共用邏輯";
    String E_MSG_METHOD_GET_OBNF_LIST = "「產生ObnfDTO通報清單」失敗";
    String E_MSG_METHOD_VERIFY_APP_DATA = "執行verifyAppData失敗";
    String E_MSG_METHOD_AUTO_NOTES = "執行自動組合記事失敗";
    String E_MSG_METHOD_SAVE_KINSHIP_DATA_OBJECT = "暫存「通報親等系統或無戶籍資料庫之資料」失敗";
    String E_MSG_METHOD_REVIEW_OPERATION_DTO = "執行「再次驗證狀態時載入登記畫面初始值」失敗";
    String E_MSG_METHOD_LOAD_OPERATION_DTO = "執行「設定編輯登記畫面初始值」失敗";
    String E_MSG_REMOVE = "請確認%s之除戶日期及除戶時間";
    String E_MSG_REPEAT = "%s及%s不可為同一人";
    String E_MSG_REQUIRED_FOREIGN_ADDRESS = "請擇一輸入外籍者之國外地址或補登國內地址於%s資料";
    String E_MSG_REQUIRED_NATIONALITY = "請輸入(原屬)國籍於%s資料";
    String E_MSG_REQUIRED_FOREIGN_NAME = "請輸入英文姓名於%s資料";
    String E_MSG_REQUIRED_FOREIGN_BIRTH = "請輸入西元出生日期於%s資料";
    String E_MSG_REQUIRED_FOREIGN_ID = "請擇一輸入護照號碼、統一證號或其他證號於%s資料";
    String E_MSG_REQUIRED_OTHER_NATIONALITY = "請輸入(原屬)國籍其他內容於%s資料";
    String E_MSG_NATIONALITY_IS_NOT_AVAILABLE_FOR_THE_001_TO_005 = "(原屬)國籍代碼不可為001~005於%s資料";
    String E_MSG_NATIONALITY_NO_HOUSEHOLD_REGISTRATION = "(原屬)國籍須為無戶籍國民於%s資料";
    String E_MSG_NATIONALITY_HK_MO = "(原屬)國籍須為香港或澳門於%s資料";
    String E_MSG_NATIONALITY_CN = "(原屬)國籍須為中國大陸於%s資料";
    String E_MSG_NULL_001M = "%s之全戶基本資料不存在";
    String E_MSG_NULL_001H = "%s之除戶全戶基本資料不存在";
    String E_MSG_NULL_001MT = "%s之補登全戶基本資料不存在";
    String E_MSG_NULL_004M = "%s之個人基本資料不存在";
    String E_MSG_NULL_004H = "%s之除戶個人基本資料不存在";
    String E_MSG_NULL_004MT = "%s之補登個人基本資料不存在";
    String E_MSG_LOCK_004M = "%s之個人基本資料加鎖失敗";
    String E_MSG_LOCK_004H = "%s之除戶個人基本資料加鎖失敗";
    String E_MSG_LOCK_004MT = "%s之補登個人基本資料加鎖失敗";
    String E_MSG_GET_DATA = "取得%s資料失敗";
    String E_MSG_GET_1S = "取得擬撤銷之原登記1S申請書資料檔失敗";
    String E_MSG_GET_1T = "取得擬撤銷之原登記1T申請書資料檔失敗";
    String E_MSG_SELECT_APPLICATION = "選取擬撤銷的原登記申請書失敗";
    String E_MSG_VIEW_APPLICATION = "檢視擬撤銷之原登記申請書失敗";

    String E_MSG_CREATE_APPLICATION = "新增擬撤銷之原登記「臨時─登記申請書歷史資料檔」失敗";
    String E_MSG_REMOVE_FEE_REASON_IS_BLANK = "若有勾選目前有罰鍰改為不須罰鍰時，免罰原因需必填，不可空白";

    String E_MSG_IS_EMPTY_PERSON = "%s之個人資料不存在，請確認輸入值。<BR>統號:%s、作業點:%s(%s)";
    String E_MSG_IS_EMPTY_PERSON_H = "%s之個人資料不存在，請確認輸入值。<BR>統號:%s、作業點:%s(%s)、除戶日期:%s、除戶時間:%s";

    String E_MSG_IS_EMPTY_HOUSEHOLD = "%s之全戶資料不存在，請確認輸入值。<BR>戶長統號:%s、戶號:%s、作業點:%s(%s)";

    String E_MSG_IS_EMPTY_HOUSEHOLD_H = "%s之全戶資料不存在，請確認輸入值。<BR>戶長統號:%s、戶號:%s、作業點:%s(%s)、除戶日期:%s、除戶時間:%s";

    /** 儲存申請資料至XLDF Table */
    String SAVE_XLDF_EXT_MESSAGE = "儲存%s申請資料至XLDF Table";

    String ID_CARD_LOST = "國民身分證已辦理掛失，掛失日期及時間：　";

    String FEE_AMOUNT_ALREADY = "已";

    String CERTIFICATE_CODE = "certificateCode";

    String CERTIFICATE_CONTENT = "certificateContent";

    /** 非全戶遷出時，遷入戶戶號不可沿用，請重新選取是否自立新戶 */
    final String NOT_ALLMOVE_MOVEINＨOUSEHOLID = "非全戶遷出時，遷入戶戶號不可沿用，請重新選取是否自立新戶";
    /** 全戶遷出時，遷入戶戶號應沿用、戶長應為原住地戶長，請重新選取是否自立新戶 */
    final String ALLMOVE_MOVEINＨOUSEHOLID = "全戶遷出時，遷入戶戶號應沿用、戶長應為原住地戶長，請重新選取是否自立新戶";

    /** The Constant OTHER_CERTIFICATE. */
    String OTHER_CERTIFICATE = "利害關係人證明文件影本：";

    /** 戶長 稱謂 REG */
    String HEAD_RELATIONSHIP_REG = "(戶長){1}";

    String CSS_STYLE_COLOR_SKYBLUE = "skyblue";

    String SAVE_TEMP_FILE_EXT_MESSAGE = "執行暫存時，將DTO物件序列化成檔案時失敗";

    String LOAD_TEMP_FILE_EXT_MESSAGE = "執行暫存時，將DTO檔案反序列化成DTO物件時失敗";

    public final String BATCH_REPORTING_DTO = "BatchReportingDTO";

    /** twyMMdd. */
    public final String DATE_FORMAT = "twyMMdd";

    /** HHmmss. */
    public final String TIME_FORMAT = "HHmmss";

    /** HHmmss. */
    public final String APP_CANCEL_FLAG = "applyCancelFlag";

    public final String APP_CANCEL_DATE = "applyCancelDate";

    public final String APP_CANCEL_TIME = "applyCancelTime";

    public final int BIG_HOUSEHOLD_NUM = 20;
    public final int BIG_HOUSEHOLD_NUM_UPPER_LIMIT = 30;
    public final int MASS_QUERY_NUM = 30;
    final String REGI_CODE_Z0Z2_1 = "Z0Z2000001";

    final String REGI_CODE_Z0Z4_1 = "Z0Z4000001";

    final String REGI_CODE_Z0Z4_2 = "Z0Z4000002";

    final String newVersionRemoveOprCode = "01310|01320|01803|01804|01805|01220|01330|01340|01830|0172A|0172N|0171C|01819|01G19|01827|01815";

    public final String OTHER_BIRTH_PLACE_REG = "99998|99999$";

    String MEMORY_ID_DIALOG = "memoryIdDialog_%s.hide()";

    String PERSON_ID_REGEX = "^[\\*0-9A-Z][0-9A-Z]{9}";

    String[] OPERATION_CATEGORYS = { "身分登記", "初設戶籍登記", "遷徙登記", "分〈合〉戶登記", "出生地登記", "更正變更登記", "撤銷登記", "廢止登記",
            "印鑑登記／變更／廢止", "其他登記" };

    public String RSS00000 = "RSS00000";
    /** 自國外遷入的原住地戶所代碼正規表示式 前7碼為9 */
    public String FOREIGN_MOVEIN_CODE_REG = "9{7}.{1}";

    public final String RLRP01640 = "RLRP01640";

    public final String RSCD3489 = "RSCD3489";

    /** 國民身分證申請事由代碼 */
    public final String RSCD3075 = "RSCD3075";

    /** 國民身分證申請事由代碼 */
    public final String WARN_DO2700_FIRST = "大戶遷徙作業模式下只會產生[遷徙當事人與戶長之除戶簿頁]，為了保留一份最完整之除戶簿頁，請先執行簿頁改換寫(2700)，再執行遷徙登記，若已確認已有一份最完整之除戶簿頁，便可執行遷徙登記";
}
