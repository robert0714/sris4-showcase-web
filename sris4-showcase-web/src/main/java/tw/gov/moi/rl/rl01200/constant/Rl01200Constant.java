/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.constant;

/**
 * Rl01200 package's Constant
 * 
 * @author JL
 */
public interface Rl01200Constant {

    /** 國民身分證統一編號(1:1)= "$" */
    final static String PERSION_ID_REGEX_CODE_1 = "\\$.*";

    /** 國民身分證統一編號(3:1)="6"、"7"、"8"、"9" */
    final static String PERSION_ID_REGEX_CODE_2 = ".{2}[6-9].*";

    /** 國民身分證統一編號(3:1)="6" */
    final static String PERSION_ID_REGEX_CODE_3 = ".{2}[6].*";

    /** 國民身分證統一編號(3:1)="7" */
    final static String PERSION_ID_REGEX_CODE_4 = ".{2}[7].*";

    /** 國民身分證統一編號(3:1)="8" */
    final static String PERSION_ID_REGEX_CODE_5 = ".{2}[8].*";

    /** 國民身分證統一編號(3:1)="9" */
    final static String PERSION_ID_REGEX_CODE_6 = ".{2}[9].*";

    /** 國民身分證統一編號(3:1)="7~9" */
    final static String PERSION_ID_REGEX_CODE_7 = ".{2}[7-9].*";

    /** 國民身分證統一編號(1:1)="0~9" */
    final static String PERSION_ID_REGEX_CODE_8 = ".{0}[0-9].*";

    /** 國籍代碼="001"、"002"、"003"、"004"、"005" */
    final static String NATIONALITY_CODE_REGEX_CODE_1 = "0{2}[1-5]";

    /** 國籍代碼 = "004" or "005" */
    final static String NATIONALITY_CODE_REGEX_CODE_2 = "0{2}[4|5]";

    /** 國籍代碼="002" */
    final static String NATIONALITY_CODE_002 = "002";

    /** 國籍代碼="003" */
    final static String NATIONALITY_CODE_003 = "003";

    /** 國籍代碼="ZZZ"(其他) */
    final static String NATIONALITY_CODE_ZZZ = "ZZZ";

    /** 國籍代碼="其他" */
    final static String NATIONALITY_CODE_OTHER = "其他";

    /** 特殊註記 = 5 */
    final static String SPECIAL_MARK_TYPE_CODE_5 = "5";

    /** 終止收養類別 = 0 */
    final static String TERMINATE_ADOPT_TYPE_CODE_0 = "0";

    /** 終止收養類別 = 1 */
    final static String TERMINATE_ADOPT_TYPE_CODE_1 = "1";

    /** 終止收養類別 = 2 */
    final static String TERMINATE_ADOPT_TYPE_CODE_2 = "2";

    /** 婚姻狀況 = 有偶 */
    final static String MARRIAGE_CODE_1 = "有偶";

    /** 婚姻狀況 = 離婚 */
    final static String MARRIAGE_CODE_2 = "離婚";

    /** 婚姻狀況 = 婚姻關係消滅 */
    final static String MARRIAGE_CODE_3 = "婚姻關係消滅";

    /** 原住民身分=0 */
    final static String LIVING_STYLE_CODE_0 = "0";

    /** 88888888 */
    final static String ADMIN_OFFICE_CODE_REGEX_CODE_1 = "8{8}";

    /** 共同事業戶. **/
    final static String HOUSEHOLD_TYPE_1 = "共同事業戶";

    /** 生活戶. **/
    final static String HOUSEHOLD_TYPE_2 = "生活戶";

    /** A OR 2 OR D OR E OR F */
    final static String SPECIAL_MARK_REGEX_CODE_1 = "A|2|D|E|F";

    /** 新增 **/
    final static String PROGRAM_ID_CODE_I = "I";

    /** 修改 **/
    final static String PROGRAM_ID_CODE_M = "M";

    /** 刪除 **/
    final static String PROGRAM_ID_CODE_D = "D";

    /** 9999 */
    final static String APPLY_KIND_CODE_REGEX_CODE_1 = "9{4}";

}
