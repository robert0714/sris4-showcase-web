/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl00001.service;

import java.util.List;

import org.apache.commons.lang.math.NumberUtils;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.BooleanDTO;
import tw.gov.moi.rl.domain.HouseholdQueryDTO;
import tw.gov.moi.rl.domain.HouseholdTransactionDTO;
import tw.gov.moi.rl.domain.PersonDataNoteDTO;
import tw.gov.moi.rl.domain.PersonOperationDTO;
import tw.gov.moi.rl.domain.PersonValidationDTO;
import tw.gov.moi.rl.domain.Rl00001DTO;
import tw.gov.moi.rl.domain.SpecialHouseholdOperationDTO;
import tw.gov.moi.rl.domain.StringDTO;
import tw.gov.moi.rl.domain.TxnPersonPrintDataDTO;
import tw.gov.moi.rl.domain.UploadedCertificateFileDTO;
import tw.gov.moi.rl.domain.ValidationMessageDTO;
import tw.gov.moi.rl.domain.XLDFCertificationFeeDTO;
import tw.gov.moi.rl.domain.XLDFHouseholdNoteDTO;
import tw.gov.moi.rl.domain.XLDFPersonNoteDTO;
import tw.gov.moi.rl.domain.XLDFTxnPersonDTO;

/**
 * HouseholdMaintainService Interface
 * 
 * @author Jay Kan
 */
public interface HouseholdMaintainService {

    /** The Constant INIT_OPERATIONS. */
    Integer INIT_OPERATIONS = NumberUtils.INTEGER_ZERO;

    /** The Constant IMG_PATH. */
    String IMG_PATH = "/personImage/rl010000/%s";

    /** getXldfapplcom. */
    String GET_XLDFAPPLCOM = "getXldfapplcom";

    /** getXldfapplcomBySeqId. */
    String GET_XLDFAPPLCOMBYSEQID = "getXldfapplcomBySeqId";

    /** JSF 重導字串. */
    String JSF_REDIRECT_PARAM = "%s?faces-redirect=true";

    /** The Constant COMMON_PAGE_TEMPLATE. */
    String COMMON_PAGE_TEMPLATE = "/pages/func/rl%s/rl%s.xhtml";

    String HOUSEHOLD_PAGE_TEMPLATE = "/pages/func/rl00001/%s";

    String XLDF_ENTITY_PACKAGE = "tw.gov.moi.rl.component.xldf.dto.%s";

    String[] EMPTY_NOTE_OPERATION_CODE = { "01310" };

    /** 錯誤訊息. */
    String EXT_MESSAGE = "須為死亡、宣告死亡、喪失國籍、遷出國外、喪失身分的除戶人口";

    /**
     * 建立戶籍交易
     * 
     * @param householdQueryDTO
     * @param executantType
     *            執行環境設定參數
     */
    HouseholdTransactionDTO createTransaction(final HouseholdQueryDTO householdQueryDTO,
            final ExecutantType executantType);

    /**
     * 重新讀取資料
     * 
     * @param householdTransactionDTO
     * @param pExecutantType
     *            執行環境設定參數
     */
    void readTransaction(final HouseholdTransactionDTO householdTransactionDTO, final ExecutantType pExecutantType);

    /**
     * 刪除在Edit mode當中點選刪除按鈕的戶籍登記之後戶籍登記
     * 
     * @param pExecutantType
     *            執行環境設定參數
     */
    void deleteSubsequentOperations(final ExecutantType pExecutantType);

    /**
     * 加一交易序號.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param executantType
     *            the executant type
     */
    void plusOneOperationSequence(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType executantType);

    /**
     * 取得個人記事清單.
     * 
     * @param pPersonDataNoteDTO
     *            the person data note dto
     * @param executantType
     *            執行環境設定參數
     * @return the person notes
     */
    List<XLDFPersonNoteDTO> getPersonNotes(final PersonDataNoteDTO pPersonDataNoteDTO, final ExecutantType executantType);

    /**
     * 取得全戶記事清單.
     * 
     * @param pPersonDataNoteDTO
     *            the person data note dto
     * @param executantType
     *            執行環境設定參數
     * @return the household notes
     */
    List<XLDFHouseholdNoteDTO> getHouseholdNotes(final PersonDataNoteDTO pPersonDataNoteDTO,
            final ExecutantType executantType);

    /**
     * 取得作業規費清單.
     * 
     * @param pPersonDataNoteDTO
     *            the person data note dto
     * @param executantType
     *            執行環境設定參數
     * @return the certification fees
     */
    List<XLDFCertificationFeeDTO> getCertificationFees(final PersonDataNoteDTO pPersonDataNoteDTO,
            final ExecutantType executantType);

    /**
     * 執行戶籍登記交易存檔.
     * 
     * @param pUnlock
     *            the unlock
     * @param executantType
     *            執行環境設定參數
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void saveHouseholdContext(final BooleanDTO pUnlock, final ExecutantType executantType);

    /**
     * 取消戶籍登記交易
     * 
     * @param executantType
     *            執行環境設定參數
     */
    @RisServiceMethod(MethodType.DELETE)
    void cancelHouseholdContext(final ExecutantType executantType);

    /**
     * 列印戶籍申請書.
     * 
     * @param pRl00001DTO
     *            the rl00001 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void printHouseholdApplication(final Rl00001DTO pRl00001DTO, final ExecutantType executantType);

    /**
     * 列印書證申請書.
     * 
     * @param pRl00001DTO
     *            the rl00001 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void printHouseholdCertificationApplication(final Rl00001DTO pRl00001DTO, final ExecutantType executantType);

    /**
     * Query images.
     * 
     * @param pRl00001DTO
     *            the rl00001 dto
     * @param pExecutantType
     *            the executant type
     * @return the string
     */
    void queryImages(final Rl00001DTO pRl00001DTO, final ExecutantType pExecutantType);

    /**
     * Prepare for printing data.
     * 
     * @param executantType
     *            the executant type
     */
    void prepareForPrintingData(final ExecutantType executantType);

    /**
     * 附繳證件檔案上傳.
     * 
     * @param pUploadedCertificateFileDTO
     *            the uploaded certificate file dto
     * @param pExecutantType
     *            the executant type
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    @RisServiceMethod(MethodType.SAVE)
    void uploadFile(final UploadedCertificateFileDTO pUploadedCertificateFileDTO, final ExecutantType pExecutantType)
            throws Exception;

    /**
     * 取得個人戶籍登記作業清單
     * 
     * @param householdTransactionDTO
     *            the householdTransaction dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    PersonOperationDTO getPersonOperation(final HouseholdTransactionDTO householdTransactionDTO,
            final ExecutantType executantType);

    /**
     * Gets the special household operation.
     * 
     * @param pSpecialHouseholdOperationDTO
     *            the special household operation dto
     * @param pExecutantType
     *            the executant type
     * @return the special household operation
     */
    StringDTO getSpecialHouseholdOperation(final SpecialHouseholdOperationDTO pSpecialHouseholdOperationDTO,
            final ExecutantType pExecutantType);

    /**
     * Validate person data.
     * 
     * @param pXLDFTxnPersonDTO
     *            the xLDF txn person dto
     * @param pExecutantType
     *            the executant type
     * @return the map
     */
    ValidationMessageDTO validatePersonData(final XLDFTxnPersonDTO pXLDFTxnPersonDTO, final ExecutantType pExecutantType);

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.rl00001.service.HouseholdMaintainService#
     * recordSpecialXldfopracsTypeWhenEditModeBegin
     * (tw.gov.moi.rl.component.dto.OpeningOperationDTO,
     * tw.gov.moi.ae.domain.ExecutantType)
     */
    @RisServiceMethod(MethodType.SAVE)
    void recordSpecialXldfopracsTypeWhenEditModeBegin(final OpeningOperationDTO pOpeningOperationDTO,
            final ExecutantType executantType);

    /**
     * Gets the dependency operation.
     * 
     * @param pHouseholdTransactionDTO
     *            the household transaction dto
     * @param pExecutantType
     *            the executant type
     * @return the dependency operation
     */
    List<String> getDependencyOperation(final HouseholdTransactionDTO pHouseholdTransactionDTO,
            final ExecutantType pExecutantType);

    /**
     * 以作業代碼檢查當事人是否可辦理.
     * 
     * @param pPersonValidationDTO
     *            the person validation dto
     * @param pExecutantType
     *            the executant type
     */
    void validateTxnPersonByOperationCode(final PersonValidationDTO pPersonValidationDTO,
            final ExecutantType pExecutantType);

    /**
     * 將初步當事人、申請人資訊整理出來.
     * 
     * @param pTxnPersonPrintDataDTO
     *            the txn person print data dto
     * @param pExecutantType
     *            the executant type
     */
    void readyTxnPersonPrintData(final TxnPersonPrintDataDTO pTxnPersonPrintDataDTO, final ExecutantType pExecutantType);

    public void recordPdf(final Rl00001DTO pRl00001DTO, final ExecutantType executantType);

    public HouseholdTransactionDTO recoverTx(final String txId, final ExecutantType pExecutantType);

    public void recordPdfForPhase2(final Rl00001DTO pRl00001DTO, final ExecutantType executantType);

}