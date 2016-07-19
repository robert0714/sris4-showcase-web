/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;


public interface FtpSendNoticeComponent {

    void doSendDumpNotice_RR(String selectSql, String deleteSql, String tableName, Map<String, Object> wkKeys,
            ExecutantType executantType);

    void doSendDumpNotice_RC(String selectSql, String deleteSql, String tableName, Map<String, Object> wkKeys,
            ExecutantType executantType);
}
