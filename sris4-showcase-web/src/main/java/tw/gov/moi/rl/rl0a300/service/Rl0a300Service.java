/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a300DTO;
import tw.gov.moi.rl.domain.Rl0a300PhaseDTO;

/**
 * 規費處理服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl0a300Service {

    /** Service類別名稱. */
    public static final String CLASS_NAME = "Rl0a300ServiceImpl";

    /** Controller類別名稱. */
    public static final String CONTROLLER_NAME = "Rl0a300Controller";

    /** 服務名稱. */
    public static final String SERVICE_NAME = "規費處理";

    /** 函數名稱:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** 函數名稱:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 函數名稱:createApplicationOrgXLDF. */
    public static final String CREATEAPPLICATIONORGXLDF = SERVICE_NAME + " createApplicationOrgXLDF";

    /** 函數名稱:getFeePrice. */
    public static final String GETFEEPRICE = SERVICE_NAME + " getFeePrice";

    /** 函數名稱:rePrintApplication. */
    public static final String REPRINTAPPLICATION = SERVICE_NAME + " rePrintApplication";

    /** 函數名稱:printReceipt. */
    public static final String PRINTRECEIPT = SERVICE_NAME + " printReceipt";

    /** 函數名稱:createReceiptId. */
    public static final String CREATERECEIPTID = SERVICE_NAME + " createReceiptId";

    /** 函數名稱:deleteChange. */
    public static final String DELETECHANGE = SERVICE_NAME + " deleteChange";

    /** 函數名稱:saveRldf. */
    public static final String SAVERLDF = SERVICE_NAME + " saveRldf";

    /** 函數名稱:applyChange. */
    public static final String APPLYCHANGE = SERVICE_NAME + " applyChange";

    /** 函數名稱:createXldfarcp. */
    public static final String CREATEXLDFARCP = SERVICE_NAME + " createXldfarcp";

    /** 函數名稱:updateRldfu003. */
    public static final String UPDATERLDFU003 = SERVICE_NAME + " updateRldfu003";

    /** 函數名稱:updateAppFee. */
    public static final String UPDATEAPPFEE = SERVICE_NAME + " updateAppFee";

    /** 函數名稱:getOperationPhase. */
    public static final String GETOPERATIONPHASE = SERVICE_NAME + " getOperationPhase";

    /** 函數名稱:cancelApplication. */
    public static final String CANCELAPPLICATION = SERVICE_NAME + " cancelApplication";

    /** 函數名稱:revokeApplication. */
    public static final String REVOKEAPPLICATION = SERVICE_NAME + " revokeApplication";

    /** 函數名稱:updateApplicationReceipt. */
    public static final String UPDATEAPPLICATIONRECEIPT = SERVICE_NAME + " updateApplicationReceipt";

    /** 函數名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 函數名稱:doClose. */
    public static final String DOCLOSE = SERVICE_NAME + " doClose";

    /** 函數名稱:loadPage. */
    public static final String LOADPAGE = SERVICE_NAME + " loadPage";

    /** 函數名稱:openEditDialog. */
    public static final String OPENEDITDIALOG = SERVICE_NAME + " openEditDialog";

    /** 函數名稱:modifyFee. */
    public static final String MODIFYFEE = SERVICE_NAME + " modifyFee";

    /** 函數名稱:modifyDeFee. */
    public static final String MODIFYDEFEE = SERVICE_NAME + " modifyDeFee";

    /** 函數名稱:doPrint. */
    public static final String DOPRINT = SERVICE_NAME + " doPrint";

    /** 函數名稱:doCancel. */
    public static final String DOCANCEL = SERVICE_NAME + " doCancel";

    /**
     * 初始化規費處理.
     * 
     * @param dto
     *            規費處理DTO
     * @param execType
     *            使用者資訊
     * @return 規費處理DTO
     * @throws RisBusinessException
     *             初始化規費處理失敗
     */
    public Rl0a300DTO initOperationDTO(final Rl0a300DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 重印申請書.
     * 
     * @param dto
     *            規費處理DTO
     * @param execType
     *            使用者資訊
     * @return 規費處理DTO
     * @throws RisBusinessException
     *             重印申請書失敗
     */
    public Rl0a300DTO rePrintApplication(final Rl0a300DTO dto, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 列印收據.
     * 
     * @param dto
     *            規費處理DTO
     * @param execType
     *            使用者資訊
     * @return 規費處理DTO
     * @throws RisBusinessException
     *             列印收據失敗
     */
    public Rl0a300DTO printReceipt(final Rl0a300DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得收據號碼.
     * 
     * @param dto
     *            規費處理DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取得收據號碼失敗
     */
    public void createReceiptId(final Rl0a300DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 收據存檔.
     * 
     * @param rl0a300DTO
     *            規費處理DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             收據存檔失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf(Rl0a300DTO rl0a300DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得申請書作業層級.
     * 
     * @param rl0a300PhaseDTO
     *            Rl0a300PhaseDTO
     * @param execType
     *            使用者資訊
     * @return Rl0a300PhaseDTO
     * @throws RisBusinessException
     *             取得申請書作業層級失敗
     */
    public Rl0a300PhaseDTO getOperationPhase(final Rl0a300PhaseDTO rl0a300PhaseDTO, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 刪除規費處理資料.
     * 
     * @param dto
     *            規費處理DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除規費處理資料失敗
     */
    public void doDelete(final Rl0a300DTO dto, final ExecutantType exec) throws RisBusinessException;

}
