/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.OperationMaintainMode;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFCreationValidator;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFOperationCreationParams;
import tw.gov.moi.rl.component.dto.XLDFTxnPersonCreationParams;
import tw.gov.moi.rl.domain.HouseholdAppDataDTO;
import tw.gov.moi.rl.domain.HouseholdOperationDTO;
import tw.gov.moi.rl.domain.XLDFForeignPersonDTO;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 戶籍登記共用元件介面.
 * 
 * @author Jay Kan
 */
public interface HouseholdOperationComponent {

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /** APP_DATA_DTO_FORMAT. */
    String APP_DATA_DTO_FORMAT = "rl%sAppDataDTO";

    /** The CERTIFICATE. */
    String CERTIFICATE = "certificate";

    /** The NAME. */
    String NAME = "Name";

    /** 是否有附繳證件. */
    String IS_CERTIFICATE = "isCertificate";

    /** 附繳證件內容. */
    String CERTIFICATE_CHT = "certificateCht";

    /** 附繳證件代碼. */
    String CERTIFICATE_CODE = "certificateCode";

    /** 作業序號. */
    String APPLY_SEQUENCE_ID = "applySequenceId";

    /** 請輸入（原屬）國籍. */
    String NATIONALITY_CODE_EMPTY_MSG = "請輸入（原屬）國籍";

    /** 請輸入(原屬)國籍其他內容. */
    String NATIONALITY_EMPTY_MSG = "請輸入(原屬)國籍其他內容";

    /** 請輸入記事內容. */
    String REGISTER_CONTENT_EMPTY_MSG = "請輸入記事內容";

    /** 附繳證件共同欄位. */
    String[] XLDFS0XXB_COLUMNS = { RlConstant.OBJ_TYPE_SITE_ID, APPLY_SEQUENCE_ID, "applyTransactionId", "applySeq" };

    /** 作業新增模式. */
    String OPERATION_APPEND_MODE = OperationMaintainMode.APPEND.name();

    /** 作業編輯模式. */
    String OPERATION_EDIT_MODE = OperationMaintainMode.EDIT.name();

    /** 作業複查模式. */
    String OPERATION_REVIEW_MODE = OperationMaintainMode.REVIEW.name();

    /**
     * Inits the load page.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pExecutantType
     *            the executant type
     */
    void initLoadPage(final DBSMain pDBSMain, final HouseholdOperationDTO pHouseholdOperationDTO,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final ExecutantType pExecutantType);

    /**
     * 初始化登記.
     * 
     * @param pOperationCode
     *            作業代碼
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pXLDFCreationValidator
     *            the xLDF creation validator
     * @param pExecutantType
     *            the executant type
     */
    void initOperation(final String pOperationCode, final HouseholdOperationDTO pHouseholdOperationDTO,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final XLDFCreationValidator pXLDFCreationValidator,
            final ExecutantType pExecutantType);

    /**
     * 建立登記之「交易作業紀錄」資料.
     * 
     * @param pXLDFOperationCreationParams
     *            the xLDF operation creation params
     * @param pExecutantType
     *            the executant type
     */
    void createOperation(final XLDFOperationCreationParams pXLDFOperationCreationParams,
            final ExecutantType pExecutantType);

    /**
     * 取得當事人資料.
     * 
     * @param pXLDFTxnPersonCreationParams
     *            the xLDF txn person creation params
     * @param pExecutantType
     *            the executant type
     * @return the xLDF domain object
     */
    XLDFDomainObject createOriginTxnPersonXLDF(final XLDFTxnPersonCreationParams pXLDFTxnPersonCreationParams,
            final ExecutantType pExecutantType);

    /**
     * 建立作業的原始狀態之XLDF.
     * 
     * @param pXLDFCreationParams
     *            the xLDF creation params
     * @param pExecutantType
     *            the executant type
     * @return the xLDF domain object
     */
    XLDFDomainObject createOriginXLDF(final XLDFCreationParams pXLDFCreationParams, final ExecutantType pExecutantType);

    /**
     * 取得作業原始狀態之XLDF.
     * 
     * @param pXLDFCreationParams
     *            the xLDF creation params
     * @param pExecutantType
     *            the executant type
     * @return the origin xldf
     */
    XLDFDomainObject getOriginXLDF(final XLDFCreationParams pXLDFCreationParams, final ExecutantType pExecutantType);

    /**
     * 載入登記.
     * 
     * @param <T>
     *            the generic type
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pDtoClass
     *            the dto class
     * @param pExecutantType
     *            the executant type
     * @return the t
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    <T extends Serializable> T loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO,
            final Class<T> pDtoClass, final ExecutantType pExecutantType) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException;

    /**
     * 再次驗證狀態時載入登記DTO.
     * 
     * @param <T>
     *            the generic type
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pDtoClass
     *            the dto class
     * @param pExecutantType
     *            the executant type
     * @return the t
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    <T extends Serializable> T reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO,
            final Class<T> pDtoClass, final ExecutantType pExecutantType) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException;

    /**
     * 驗證申請資料.
     * 
     * @param pPersonId
     *            the person id
     * @param pXLDFForeignPersonDTO
     *            the xLDF foreign person dto
     */
    void verifyData(final String pPersonId, final XLDFForeignPersonDTO pXLDFForeignPersonDTO);

    /**
     * 自動組合記事.
     * 
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pAutoNoteId
     *            記事例代碼
     * @param pMainType
     *            主分類
     * @param pSubType
     *            次分類（申請書類別）
     * @param pObject
     *            DTO
     * @param pExecutantType
     *            the executant type
     */
    void autoNotes(final HouseholdAppDataDTO pHouseholdAppDataDTO, final HouseholdOperationDTO pHouseholdOperationDTO,
            final String pAutoNoteId, final String pMainType, final String pSubType, final Object pObject,
            final ExecutantType pExecutantType);

    /**
     * 自動組合記事與個人記事欄位化.
     * 
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pAutoNoteId
     *            記事例代碼
     * @param pMainType
     *            主分類
     * @param pSubType
     *            次分類（申請書類別）
     * @param pObject
     *            DTO
     * @param pXLDFYEntity
     *            the xLDFY entity
     * @param pExecutantType
     *            the executant type
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InstantiationException
     *             the instantiation exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     */
    void autoNotes(final HouseholdAppDataDTO pHouseholdAppDataDTO, final HouseholdOperationDTO pHouseholdOperationDTO,
            final String pAutoNoteId, final String pMainType, final String pSubType, final Object pObject,
            final XLDFDomainObject pXLDFYEntity, final ExecutantType pExecutantType) throws IllegalAccessException,
            InstantiationException, InvocationTargetException, NoSuchMethodException;

    /**
     * 進行判斷是否逾期需罰鍰及清除舊的罰鍰資料.
     * 
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pSubType
     *            the sub type
     * @param pExecutantType
     *            the executant type
     * @param pDBSMain
     *            the dBS main
     */
    void doFineCheckAndCleanOldFine(final HouseholdAppDataDTO pHouseholdAppDataDTO,
            final HouseholdOperationDTO pHouseholdOperationDTO, final String pSubType,
            final ExecutantType pExecutantType, final DBSMain pDBSMain);

    /**
     * 儲存申請資料至XLDF Table (含罰緩處理).
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pExecutantType
     *            the executant type
     */
    void saveXLDF(final DBSMain pDBSMain, final HouseholdOperationDTO pHouseholdOperationDTO,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final ExecutantType pExecutantType);

    /**
     * 儲存申請資料至XLDF Table (含罰緩處理及序列化DTO).
     * 
     * @param <T>
     *            the generic type
     * @param pDBSMain
     *            the dBS main
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pDtoObject
     *            the dto object
     * @param pExecutantType
     *            the executant type
     */
    <T extends Serializable> void saveXLDF(final DBSMain pDBSMain, final HouseholdOperationDTO pHouseholdOperationDTO,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final T pDtoObject, final ExecutantType pExecutantType);

    /**
     * 儲存申請資料至XLDF Table.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pExecutantType
     *            the executant type
     */
    void saveXLDF(final DBSMain pDBSMain, final HouseholdOperationDTO pHouseholdOperationDTO,
            final ExecutantType pExecutantType);

    /**
     * 更新當事人「個人基本資料」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pExecutantType
     *            the executant type
     */
    void updatePersonData(final DBSMain pDBSMain, final String pOperationCode,
            final HouseholdOperationDTO pHouseholdOperationDTO, final ExecutantType pExecutantType);

    /**
     * 新增當事人之「個人動態記事」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pExecutantType
     *            the executant type
     */
    void createXLDF005M(final DBSMain pDBSMain, final String pOperationCode,
            final HouseholdOperationDTO pHouseholdOperationDTO, final ExecutantType pExecutantType);

    /**
     * 新增「申請書索引資料」及「連線交易紀錄檔」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pSubType
     *            次分類（申請書類別）
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pExecutantType
     *            the executant type
     */
    void createAppData(final DBSMain pDBSMain, final String pOperationCode, final String pSubType,
            final HouseholdOperationDTO pHouseholdOperationDTO, final HouseholdAppDataDTO pHouseholdAppDataDTO,
            final ExecutantType pExecutantType);

    /**
     * 暫存「臨時－辦理他所申請書索引資料」至XLDF026S.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pSubType
     *            次分類（申請書類別）
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pExecutantType
     *            the executant type
     */
    void saveXLDF026S(final DBSMain pDBSMain, final String pOperationCode, final String pSubType,
            final HouseholdOperationDTO pHouseholdOperationDTO, final HouseholdAppDataDTO pHouseholdAppDataDTO,
            final ExecutantType pExecutantType);

    /**
     * 暫存「辦理他所－申請書歷史資料」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pSequenceId
     *            作業序號
     * @param pXldfType
     *            the xldf type
     * @param pDomainClass
     *            the domain class
     * @param pExecutantType
     *            the executant type
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     */
    void saveXLDFWEntity(final DBSMain pDBSMain, final String pOperationCode, final Integer pSequenceId,
            final Object pXldfType, final Class<? extends XLDFDomainObject> pDomainClass,
            final ExecutantType pExecutantType) throws IllegalAccessException, InvocationTargetException;

    /**
     * 新增「臨時─個人申請書紀錄資料」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pSubType
     *            次分類（申請書類別）
     * @param pApplyType
     *            交代R或T
     * @param pHouseholdOperationDTO
     *            the household operation dto
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pExecutantType
     *            the executant type
     */
    void createXLDFM10M(final DBSMain pDBSMain, final String pOperationCode, final String pSubType,
            final String pApplyType, final HouseholdOperationDTO pHouseholdOperationDTO,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final ExecutantType pExecutantType);

    /**
     * 新增「臨時─個人記事欄位化」.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            the operation code
     * @param pHouseholdAppDataDTO
     *            the household app data dto
     * @param pOperationSequenceId
     *            the operation sequence id
     * @param pExecutantType
     *            the executant type
     */
    void createXLDFYEntity(final DBSMain pDBSMain, final String pOperationCode,
            final HouseholdAppDataDTO pHouseholdAppDataDTO, final Integer pOperationSequenceId,
            final ExecutantType pExecutantType);

    /**
     * Gets the obnf list.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOpertionSequence
     *            the opertion sequence
     * @param pXLDFSType
     *            the xLDFS type
     * @param pXLDFWType
     *            the xLDFW type
     * @param pExecutantType
     *            the executant type
     * @return the obnf list
     */
    List<ObnfDTO> getObnfList(final DBSMain pDBSMain, final String pOpertionSequence,
            final Class<? extends XLDFDomainObject> pXLDFSType, final Class<? extends XLDFDomainObject> pXLDFWType,
            final ExecutantType pExecutantType);

    /**
     * 處理附繳證件.
     * 
     * @param pCertificateList
     *            the certificate list
     * @param pCertificateCategory
     *            the certificate category
     * @param pOtherCertificateCode
     *            the other certificate code
     * @param pDomainType
     *            the domain type
     */
    @Deprecated
    void processCertificate(final List<String> pCertificateList, final String pCertificateCategory,
            final String pOtherCertificateCode, final Object pDomainType);

    /**
     * 處理附繳證件.
     * 
     * @param pCertificateList
     *            附繳證件清單
     * @param pOtherCertificate
     *            其他附繳證件
     * @param pCertificateCategory
     *            附繳證件代碼檔
     * @param pOtherCertificateCode
     *            其他附繳證件代碼
     * @param pDomainType
     *            申請書 domain type
     * @param pApplyCode
     *            申請書類別
     * @param pDBSMain
     *            the dBS main
     * @param pOperationCode
     *            作業代碼
     * @param pExecutantType
     *            the executant type
     * @return the list
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     * @throws ClassNotFoundException
     *             the class not found exception
     * @throws InstantiationException
     *             the instantiation exception
     */
    void processCertificate(final List<String> pCertificateList, final String pOtherCertificate,
            final String pCertificateCategory, final String pOtherCertificateCode, final Object pDomainType,
            final String pApplyCode, final DBSMain pDBSMain, final String pOperationCode,
            final ExecutantType pExecutantType) throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException, ClassNotFoundException, InstantiationException;

    /**
     * 處理附繳證件 (非戶籍登記功能使用).
     * 
     * @param <T>
     *            the generic type
     * @param pCertificateList
     *            附繳證件清單
     * @param pOtherCertificate
     *            其他附繳證件
     * @param pCertificateCategory
     *            附繳證件代碼檔
     * @param pOtherCertificateCode
     *            其他附繳證件代碼
     * @param pDomainType
     *            申請書 domain type
     * @param pApplyCode
     *            申請書類別
     * @param pDBSMain
     *            the dBS main
     * @param pExecutantType
     *            the executant type
     * @return the list
     * @throws IllegalAccessException
     *             the illegal access exception
     * @throws InvocationTargetException
     *             the invocation target exception
     * @throws NoSuchMethodException
     *             the no such method exception
     * @throws ClassNotFoundException
     *             the class not found exception
     * @throws InstantiationException
     *             the instantiation exception
     */
    <T extends Serializable> List<T> processCertificateNotHouseholdOperation(final List<String> pCertificateList,
            final String pOtherCertificate, final String pCertificateCategory, final String pOtherCertificateCode,
            final Object pDomainType, final String pApplyCode, final DBSMain pDBSMain,
            final ExecutantType pExecutantType) throws IllegalAccessException, InvocationTargetException,
            NoSuchMethodException, ClassNotFoundException, InstantiationException;
}
