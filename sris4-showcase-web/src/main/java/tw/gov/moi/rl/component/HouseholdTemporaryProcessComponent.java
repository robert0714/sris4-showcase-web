/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.io.Serializable;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 登記資料序列化元件介面.
 * 
 * @author cklin ,Jay Kan, robert
 * 
 */
public interface HouseholdTemporaryProcessComponent {

   

    /**
     * 儲存序列化資料.
     * 
     * @param <T>
     *            the generic type
     * @param pTempFileDTO
     *            the temp file dto
     * @param pExecutantType
     *            the executant type
     */
    public  <T> void saveTempFile(final TempFileDTO<T> pTempFileDTO, final ExecutantType pExecutantType)throws RisBusinessException;

    /**
     * 載入反序列化登記資料.
     * 
     * @param <T>
     *            the generic type
     * @param pTempFileDTO
     *            the temp file dto
     * @param pExecutantType
     *            the executant type
     * @return the t
     */
    public <T> T loadTempFile(final TempFileDTO<T> pTempFileDTO, final ExecutantType pExecutantType)throws RisBusinessException;
    
    public void prepareForReviewMode(final Integer operationSequenceId ,  final ExecutantType executantType)throws RisBusinessException;
    
    public  <T extends Serializable> void updateDTOForReviewMode(T l3DTO ,final Integer operationSequenceId , final ExecutantType executantType)throws RisBusinessException;
    
    /**
     * 專門為交易登記中有domainkey改變得登記而留下來的紀錄...用於戶籍大簿L2頁面執行L3登記使用Edit mode....目地是在Edit mode改變xldfopracsType之前....留下有domain key改變的紀錄資料,並且回傳此次Edit mode開始前所留
     * 下的關鍵HashCode
     * **/
    public String recordSpecialXldfopracsTypeWhenEditModeBegin(final DBSMain conn, final ExecutantType executantType) throws RisBusinessException ;

    public void prepareForReviewMode(final Integer operationSequenceId,final DBSMain dbsMain,final ExecutantType pExecutantType);
    
    public  <T extends Serializable> void updateDTOForReviewMode(T l3DTO ,final Integer operationSequenceId, final DBSMain dbsMain, final ExecutantType executantType)throws RisBusinessException;
}
