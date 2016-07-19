/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07100.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl07130DTO;

/**
 * 製作辦理巡迴查對戶籍成果統計表處理服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl07130Service {

    String INSERT_RLDF006E_SQL = new StringBuilder() //
            .append("INSERT ") //
            .append("INTO") //
            .append("    RLDF006E") //
            .append("    (") //
            .append("        AREA_CODE,") //
            .append("        ADMIN_OFFICCE_CODE,") //
            .append("        ACCEPT_SITE_ID,") //
            .append("        INVESTIGATE_YYY,") //
            .append("        INVESTIGATE_MM,") //
            .append("        VILLAGE,") //
            .append("        INVESTIGATE_DAYS,") //
            .append("        SOMEBODY_HOME_QTY,") //
            .append("        NOBODY_HOME_QTY,") //
            .append("        CASE_QTY1,") //
            .append("        CASE_QTY2,") //
            .append("        CASE_QTY3,") //
            .append("        CASE_QTY4,") //
            .append("        CASE_QTY5,") //
            .append("        CASE_QTY6,") //
            .append("        CASE_QTY7,") //
            .append("        CASE_QTY8,") //
            .append("        CASE_QTY9,") //
            .append("        CASE_QTY10,") //
            .append("        CASE_QTY11,") //
            .append("        CASE_QTY12,") //
            .append("        CASE_QTY13,") //
            .append("        CASE_QTY14,") //
            .append("        CASE_QTY15,") //
            .append("        CASE_QTY16,") //
            .append("        CASE_QTY17,") //
            .append("        CASE_QTY18,") //
            .append("        CASE_QTY19,") //
            .append("        CASE_QTY20,") //
            .append("        CASE_QTY21,") //
            .append("        CASE_QTY22,") //
            .append("        CASE_QTY23,") //
            .append("        FIELD") //
            .append("    ) ") //
            .append("SELECT") //
            .append("    AREA_CODE,") //
            .append("    ADMIN_OFFICCE_CODE,") //
            .append("    SITE_ID,") //
            .append("    '%s',") //
            .append("    '%s',") //
            .append("    VILLAGE,") //
            .append("    (") //
            .append("        SELECT") //
            .append("            COUNT(*)") //
            .append("        FROM") //
            .append("            (") //
            .append("                SELECT DISTINCT") //
            .append("                    PROCESS_YYYMMDD") //
            .append("                FROM") //
            .append("                    RLDF052M") //
            .append("                WHERE") //
            .append("                    SITE_ID = ?") //
            .append("                AND PROCESS_YYYMMDD >= ?") //
            .append("                AND PROCESS_YYYMMDD <= ?") //
            .append("                AND VILLAGE = A.VILLAGE") //
            .append("            )") //
            .append("    )") //
            .append("    ,") //
            .append("    SUM(") //
            .append("        CASE") //
            .append("            WHEN HOME_YN = '1'") //
            .append("            THEN 1") //
            .append("            ELSE 0") //
            .append("        END),") //
            .append("    SUM(") //
            .append("        CASE") //
            .append("            WHEN HOME_YN = ''") //
            .append("            THEN 1") //
            .append("            ELSE 0") //
            .append("        END),") //
            .append("    NVL(SUM(CAST(case_qty1 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty2 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty3 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty4 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty5 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty6 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty7 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty8 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty9 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty10 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty11 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty12 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty13 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty14 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty15 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty16 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty17 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty18 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty19 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty20 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty21 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty22 AS INT)), '0'),") //
            .append("    NVL(SUM(CAST(case_qty23 AS INT)), '0'),") //
            .append("    '' ") //
            .append("FROM") //
            .append("    (") //
            .append("        SELECT") //
            .append("            area_code,") //
            .append("            admin_officce_code,") //
            .append("            site_id,") //
            .append("            process_yyymmdd,") //
            .append("            home_yn,") //
            .append("            village,") //
            .append("            case_qty1,") //
            .append("            case_qty2,") //
            .append("            case_qty3,") //
            .append("            case_qty4,") //
            .append("            case_qty5,") //
            .append("            case_qty6,") //
            .append("            case_qty7,") //
            .append("            case_qty8,") //
            .append("            case_qty9,") //
            .append("            case_qty10,") //
            .append("            case_qty11,") //
            .append("            case_qty12,") //
            .append("            case_qty13,") //
            .append("            case_qty14,") //
            .append("            case_qty15,") //
            .append("            case_qty16,") //
            .append("            case_qty17,") //
            .append("            case_qty18,") //
            .append("            case_qty19,") //
            .append("            case_qty20,") //
            .append("            case_qty21,") //
            .append("            case_qty22,") //
            .append("            case_qty23") //
            .append("        FROM") //
            .append("            rldf052m") //
            .append("        WHERE") //
            .append("            site_id = ?") //
            .append("        AND process_yyymmdd >= ?") //
            .append("        AND process_yyymmdd <= ?") //
            .append("    )") //
            .append("    A ") //
            .append("GROUP BY") //
            .append("    village,") //
            .append("    area_code,") //
            .append("    admin_officce_code,") //
            .append("    site_id") //
            .toString();

    String SELECT_RLDF006E_SQL = new StringBuilder() //
            .append("SELECT") //
            .append("    investigate_yyy as statistic_yyy,") //
            .append("    investigate_mm as statistic_mm,") //
            .append("    NVL(SUM(CAST(case_qty1 AS INT)), 0) as case_no_01,") //
            .append("    NVL(SUM(CAST(case_qty2 AS INT)), 0) as case_no_02,") //
            .append("    NVL(SUM(CAST(case_qty3 AS INT)), 0) as case_no_03,") //
            .append("    NVL(SUM(CAST(case_qty4 AS INT)), 0) as case_no_04,") //
            .append("    NVL(SUM(CAST(case_qty5 AS INT)), 0) as case_no_05,") //
            .append("    NVL(SUM(CAST(case_qty6 AS INT)), 0) as case_no_06,") //
            .append("    NVL(SUM(CAST(case_qty7 AS INT)), 0) as case_no_07,") //
            .append("    NVL(SUM(CAST(case_qty8 AS INT)), 0) as case_no_08,") //
            .append("    NVL(SUM(CAST(case_qty9 AS INT)), 0) as case_no_09,") //
            .append("    NVL(SUM(CAST(case_qty10 AS INT)), 0) as case_no_10,") //
            .append("    NVL(SUM(CAST(case_qty11 AS INT)), 0) as case_no_11,") //
            .append("    NVL(SUM(CAST(case_qty12 AS INT)), 0) as case_no_12,") //
            .append("    NVL(SUM(CAST(case_qty13 AS INT)), 0) as case_no_13,") //
            .append("    NVL(SUM(CAST(case_qty14 AS INT)), 0) as case_no_14,") //
            .append("    NVL(SUM(CAST(case_qty15 AS INT)), 0) as case_no_15,") //
            .append("    NVL(SUM(CAST(case_qty16 AS INT)), 0) as case_no_16,") //
            .append("    NVL(SUM(CAST(case_qty17 AS INT)), 0) as case_no_17,") //
            .append("    NVL(SUM(CAST(case_qty18 AS INT)), 0) as case_no_18,") //
            .append("    NVL(SUM(CAST(case_qty19 AS INT)), 0) as case_no_19,") //
            .append("    NVL(SUM(CAST(case_qty20 AS INT)), 0) as case_no_20,") //
            .append("    NVL(SUM(CAST(case_qty21 AS INT)), 0) as case_no_21,") //
            .append("    NVL(SUM(CAST(case_qty22 AS INT)), 0) as case_no_22,") //
            .append("    NVL(SUM(CAST(case_qty23 AS INT)), 0) as case_no_23,") //
            .append("    NVL(SUM(CAST(nobody_home_qty AS INT)), 0) as not_checked_qty,") //
            .append("    NVL(SUM(CAST(somebody_home_qty AS INT)), 0) as checked_qty,") //
            .append("    'R216' as notify_code,") //
            .append("    accept_site_id as original_code,") //
            .append("    accept_site_id as site_id,") //
            .append("    area_code ") //
            .append("FROM") //
            .append("    rldf006e ") //
            .append("WHERE") //
            .append("    investigate_yyy = ?") //
            .append("AND investigate_mm = ?") //
            .append("AND accept_site_id = ? ") //
            .append("GROUP BY") //
            .append("    investigate_yyy,") //
            .append("    investigate_mm,") //
            .append("    area_code,") //
            .append("    accept_site_id").toString();

    /**
     * Do print.
     * 
     * @param rl07130DTO
     *            the rl07130 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl07130DTO rl07130DTO, final ExecutantType executantType);

    /**
     * Do download.
     * 
     * @param rl07130DTO
     *            the rl07130 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl07130DTO rl07130DTO, final ExecutantType executantType);

    /**
     * Prerocess.
     * 
     * @param rl07130DTO
     *            the rl07130 dto
     * @param executantType
     *            the executant type
     */
    void preprocess(final Rl07130DTO rl07130DTO, final ExecutantType executantType);
}
