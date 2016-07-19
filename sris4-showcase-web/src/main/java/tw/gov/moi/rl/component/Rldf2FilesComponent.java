/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.RlGetFileWsDTO;

public interface Rldf2FilesComponent {

    /**
     * 取得個人基本相關資料的file並上傳至發送request端的主機
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            執行資訊
     */

    void rldf2Files_Person(String personId, String siteId, ExecutantType executantType);

    /**
     * 取得個人基本相關資料的file並上傳至發送request端的主機(包含全戶基本資料、個人基本資料、戶下成員)
     * 
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            執行資訊
     */

    boolean rldf2Files_PersonAll(String personId, String siteId, ExecutantType executantType);

    /**
     * 取得相關資料的File 根據DTO內容
     * 
     * 
     * @param RlGetFileWsDTO
     * @param executantType
     *            執行資訊
     */

    boolean rldf2Files(RlGetFileWsDTO wsDTO, ExecutantType executantType);

    /**
     * 取得個人基本相關資料的file並上傳至發送request端的主機(包含全戶基本資料、個人基本資料、戶長基本資料)
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            執行資訊
     */

    void rldf2Files_PersonLight(String personId, String siteId, ExecutantType executantType);

    /**
     * 取得全戶基本相關資料的file並上傳至發送request端的主機
     * 
     * @param householdHeadId
     *            戶長統號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            執行資訊
     */
    @RisServiceMethod(MethodType.QUERY)
    void rldf2Files_Household(String householdHeadId, String householdId, String siteId, ExecutantType executantType);

    /**
     * 取得全戶個人基本資料資料的file並上傳至發送request端的主機
     * 
     * @param householdHeadId
     * @param householdId
     * @param siteId
     * @param execuldeBigHousehold
     * @param executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    boolean rldf2Files_HouseholdMember(String householdHeadId, String householdId, String siteId,
            boolean execuldeBigHousehold, ExecutantType executantType);

    /**
     * 刪除本次交易所產生的RldfData資料
     * 
     * @param executantType
     */

    void delDataFilesAsTxnEnds(final ExecutantType executantType);

    /**
     * 刪除這個交易序號所產生的RldfData資料
     * 
     * @param transactionId
     */

    void delDataFilesAsTxnEnds(final String transactionId, final String accpetedSiteId);

    /**
     * 
     * @param personId
     * @param siteId
     * @param executantType
     */

    void rldf2Files(String personId, String siteId, ExecutantType executantType);

    /**
     * 
     * @param personId
     * @param siteId
     * @param executantType
     */

    boolean checkIfMoveDataFileExist(String personId, String siteId, ExecutantType executantType);

    <T> List<T> files2Rldfs(String personId, String siteId, Class<T> clz, ExecutantType executantType);

    <T> List<T> files2RldfsMoveData(String personId, String siteId, Class<T> clz, ExecutantType executantType);

    /**
     * 從file取得RLDF 資料 給遷徙用的
     * 
     * @param personId
     * @param siteId
     * @param clz
     * @param executantType
     * @return
     */
    <T> List<T> file2DataMove(String personId, String siteId, Class<T> clz, ExecutantType executantType);

    @RisServiceMethod(MethodType.QUERY)
    <T> List<T> files2Rldfs(String householdHeadId, String householdId, String siteId, Class<T> clz,
            ExecutantType executantType);

    /**
     * 取出戶下成員的4M(個人基本資料)
     * 
     * @param householdHeadId
     * @param siteId
     * @param executantType
     * @return List<T> 戶下成員的4M(個人基本資料)
     */
    public <T> List<T> files2RldfsMember(String householdHeadId, String siteId, ExecutantType executantType);

}
