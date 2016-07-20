/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.HouseholdRemovedDataDTO;
import tw.gov.moi.rl.domain.PersonRemovedDataDTO;

public interface RlRemoveDataComponent {

    int BATCH_SIZE = 1000;

    String[] RLDFY0XXDM_TYPES = { "079", "081" };

    /** The COMMA. */
    String COMMA = ",";

    /** The QUESTION_MARK. */
    String QUESTION_MARK = "?";

    String AND = " and ";

    String RLDFYXXXM_FORMAT = "tw.gov.moi.domain.Rldfy%smType";

    String RLDFY0XXDM_FORMAT = "tw.gov.moi.domain.Rldfy%sdmType";

    String RLDFYXXXH_FORMAT = "tw.gov.moi.domain.Rldfy%shType";

    String RLDFY0XXDH_FORMAT = "tw.gov.moi.domain.Rldfy%sdhType";

    String RLDFXXXXM_FORMAT = "tw.gov.moi.domain.Rldfx%smType";

    String RLDFXXXXH_FORMAT = "tw.gov.moi.domain.Rldfx%shType";

    String CONDITION_FORMAT = "%s = ?";

    String REMOVE_YYYMMDD = "REMOVE_YYYMMDD";

    String REMOVE_TIME = "REMOVE_TIME";

    String SUB_TYPE = "SUB_TYPE";

    String[] PERSON_CONDITION = { "person_id", "site_id" };

    String[] HOUSEHOLD_CONDITION = { "household_head_id", "household_id", "site_id" };

    String[] HOUSEHOLD_NOTE_CONDITION = { "register_content", "household_head_id", "household_id", "register_yyymmdd",
            "register_hhmmss", "site_id" };

    String[] HOUSEHOLD_NOTE_COL_CONDITION = { "household_head_id", "household_id", "register_yyymmdd",
            "register_hhmmss", "site_id" };

    String[] PERSON_NOTE_CONDITION = { "register_content", "person_id", "register_yyymmdd", "register_hhmmss",
            "site_id" };

    String[] PERSON_NOTE_COL_CONDITION = { "person_id", "register_yyymmdd", "register_hhmmss", "site_id" };

    String[] PERSON_NOTE_DM_COL_CONDITION = { "person_id", "register_yyymmdd", "register_hhmmss", "site_id",
            "related_person_id" };

    String[] RLDF049M_CONDITION = { "victim_id", "site_id" };

    String[] RLDFM03M_CONDITION = { "person_id", "site_id", "change_yyymmdd", "change_hhmmss",
            "accept_admin_office_code" };

    String SELECT_SQL_FORMAT = "SELECT %s FROM %s WHERE %s";

    String INSERT_SELECT_SQL_FORMAT = "INSERT INTO %s (%s) SELECT %s FROM %s WHERE %s";

    String INSERT_SQL_FORMAT = "INSERT INTO %s (%s) VALUES (%s)";

    String INSERT_RLDF002M_SQL = "insert into rldf002m (household_head_id, household_id, register_yyymmdd, register_hhmmss, site_id, register_code, register_content, register_admin_office_code, registrar_name, main_type, sub_type, apply_transaction_id, apply_sequence_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String INSERT_RLDF002H_SQL = "insert into rldf002h (household_head_id, household_id, remove_yyymmdd, remove_time, register_yyymmdd, register_hhmmss, site_id, register_code, register_content, register_admin_office_code, registrar_name, main_type, sub_type, apply_transaction_id, apply_sequence_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String DELETE_SQL_TEMPLATE = "DELETE FROM %s where %s";

    String QUERY_RLDFM03M_SQL = "select * from Rldfm03m where person_id = ? and site_id = ? order by change_yyymmdd desc, change_hhmmss desc";

    /**
     * 以現戶簿頁之主要個人資料產生除戶簿頁(RLDFXXXM_CLASS_MAP).
     * 
     * @param pConnection
     *            the connection
     * @param pPersonRemovedDataDTO
     *            the person removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void copyCurrentToRemoveLight(final Connection pConnection, final PersonRemovedDataDTO pPersonRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * 以現戶簿頁之主要個人資料產生除戶簿頁(RLDFXXXM_CLASS_MAP).
     * 
     * @param pConnection
     *            the connection
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void copyCurrentToRemoveLight(final Connection pConnection, final String removeDate, final String removeTime,
            final List<String> personIds, final String siteId, final ExecutantType pExecutantType) throws SQLException;

    /**
     * 將現戶簿頁之個人資料搬到除戶簿頁(RLDFXXXM_CLASS_MAP).
     * 
     * @param pConnection
     *            the connection
     * @param pPersonRemovedDataDTO
     *            the person removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void moveCurrentToRemoveLight(final Connection pConnection, final PersonRemovedDataDTO pPersonRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * 將現戶簿頁之個人資料搬到除戶簿頁(RLDFXXXM_CLASS_MAP).
     * 
     * @param pConnection
     *            the connection
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void moveCurrentToRemoveLight(final Connection pConnection, final String removeDate, final String removeTime,
            final List<String> personIds, final String siteId, final ExecutantType pExecutantType) throws SQLException;

    /**
     * Move mxxm and 8xt to remove.
     * 
     * @param pConnection
     *            the connection
     * @param pPersonRemovedDataDTO
     *            the person removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    void moveMxxmAnd8xtToRemove(final Connection pConnection, final PersonRemovedDataDTO pPersonRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException;

    /**
     * Move mxxm and8xt to remove.
     * 
     * @param pConnection
     *            the connection
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    void moveMxxmAnd8xtToRemove(final Connection pConnection, final String removeDate, final String removeTime,
            final List<String> personIds, final String siteId, final ExecutantType pExecutantType) throws SQLException,
            IllegalAccessException, InvocationTargetException, NoSuchMethodException;

    /**
     * Delete mxxm and 8xt.
     * 
     * @param pConnection
     *            the connection
     * @param pPersonRemovedDataDTO
     *            the person removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void deleteMxxmAnd8xt(final Connection pConnection, final PersonRemovedDataDTO pPersonRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * Delete mxxm and8xt.
     * 
     * @param pConnection
     *            the connection
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void deleteMxxmAnd8xt(final Connection pConnection, final String removeDate, final String removeTime,
            final List<String> personIds, final String siteId, final ExecutantType pExecutantType) throws SQLException;

    /**
     * 刪除 Rldf049mType, Rldfm12mType, Rldf030mType, Rldf030tType.
     * 
     * @param pConnection
     *            the connection
     * @param pPersonRemovedDataDTO
     *            the person removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void deleteOtherTable(final Connection pConnection, final PersonRemovedDataDTO pPersonRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * 刪除 Rldf049mType, Rldfm12mType, Rldf030mType, Rldf030tType.
     * 
     * @param pConnection
     *            the connection
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void deleteOtherTable(final Connection pConnection, final String removeDate, final String removeTime,
            final List<String> personIds, final String siteId, final ExecutantType pExecutantType) throws SQLException;

    /**
     * 將全戶基本資料複製到除戶全戶基本資料.
     * 
     * @param pConnection
     *            the connection
     * @param pHouseholdRemovedDataDTO
     *            the household removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void copyRldf001mToRldf001h(final Connection pConnection, final HouseholdRemovedDataDTO pHouseholdRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * 將全戶記事複製到除戶全戶記事.
     * 
     * @param pConnection
     *            the connection
     * @param pHouseholdRemovedDataDTO
     *            the household removed data dto
     * @param pExecutantType
     *            the executant type
     * @throws SQLException
     *             the sQL exception
     */
    void copyRldf002mToRldf002h(final Connection pConnection, final HouseholdRemovedDataDTO pHouseholdRemovedDataDTO,
            final ExecutantType pExecutantType) throws SQLException;

    /**
     * Process delete.
     * 
     * @param pConnection
     *            the connection
     * @param pEntityClass
     *            the entity class
     * @param condiColumns
     *            the condi columns
     * @param condiValues
     *            the condi values
     * @throws SQLException
     *             the sQL exception
     */
    void processDelete(final Connection pConnection, final Class<? extends Serializable> pEntityClass,
            final List<String> condiColumns, final List<String> condiValues) throws SQLException;

    /**
     * Select data.
     * 
     * @param pConnection
     *            the connection
     * @param pEntityClass
     *            表格
     * @param pSelectColumns
     *            查詢欄位
     * @param pCondiColumns
     *            查詢條件欄位
     * @param pCondiValues
     *            查詢條件欄位值
     * @return the result set
     * @throws SQLException
     *             the sQL exception
     */
    ResultSet selectData(final Connection pConnection, final Class<? extends Serializable> pEntityClass,
            final List<String> pSelectColumns, final List<String> pCondiColumns, final List<String> pCondiValues)
            throws SQLException;
}
