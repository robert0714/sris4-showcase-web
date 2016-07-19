/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02g00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02g00DTO;

/**
 * 婚姻更改紀錄證 DTO.
 * 
 * @author Dan.Tsai
 * 
 */
public interface Rl02g00Service {

    /** 申請書類別 */
    String APPLY_CODE = "046";

    /** 申請書類別 */
    String OPERATION_CODE = "02G00";

    /**
     * Inits the load page.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initLoadPage(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * Inits the operation dto.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initOperationDTO(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * Load operation dto.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @return the rl02e00 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl02g00DTO loadOperationDTO(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * Review operation dto.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @return the rl02e00 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl02g00DTO reviewOperationDTO(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * Do delete.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印印鑑證明書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Save xldf.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do query rldf d003.
     * 
     * @param rl02e00DTO
     *            the rl02e00 dto
     * @param executantType
     *            the executant type
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRLDFm02m(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void getCertificateNumber(final Rl02g00DTO rl02g00DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
