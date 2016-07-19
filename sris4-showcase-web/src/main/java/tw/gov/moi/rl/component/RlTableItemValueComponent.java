package tw.gov.moi.rl.component;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.RsdfitemType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 將單純的DTO進行轉存,復原等操作至雙向的單一table中
 * **/
public interface RlTableItemValueComponent {
    final String TX_ID = "transactionId";// 交易序號
    final String USER_ID ="userId";// 作業人員編號
    final String SITE_ID = "siteId";// 作業單位
    final String HASH_CODE = "hashcode";
    final String SEQUENCE_ID = "sequenceId";
    
    public  <T extends Serializable> void    convertToTable(final T clazzObject,final ExecutantType executantType,final Integer sequenceId) throws RisBusinessException;
    public  Collection<?>    recoverObjectFromTable(final ExecutantType executantType,final Integer sequenceId) throws RisBusinessException;
    public <T extends Serializable> void convertToTable(final T clazzObject, final DBSMain conn,final ExecutantType executantType,final  Integer sequenceId) throws RisBusinessException;

    /****
     * 根據transactionId,sequenceId 清除Rsdfitem資料
     * ****/
    public void cleanRsdfitemTypeByTxId(final DBSMain conn, final ExecutantType executantType, final Integer sequenceId) throws RisBusinessException ;
    
    public Collection<?> recoverObjectFromTable(final DBSMain conn,final ExecutantType executantType, final Integer sequenceId) throws RisBusinessException ;
    
    public <T extends Serializable> List<RsdfitemType> convertToRsdfitemTypeList(final T clazzObject, final ExecutantType executantType, final Integer sequenceId)
	    throws RisBusinessException;
}
