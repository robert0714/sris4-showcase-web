package tw.gov.moi.rl.component;


import org.springframework.transaction.annotation.Transactional;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.HP02F20DTO;
import tw.gov.moi.rl.domain.HouseholdTransactionDTO;

public interface HouseholdProcessRL02F0Component {
    /***
     *<p>產生Y100000000的TLDF系列資料(以確保存在產生)</p> 
     *@param hp02F20DTO 用途為大宗戶籍謄本(RL02F0)轉向戶籍謄本(RL02100)之用的DTO{@link #HP02F20DTO}
     *
     * ****/
    @Transactional(timeout = RlConstant.TIMEOUT)
    public void keepTldfSeriesY100000000Exist(final HP02F20DTO hp02F20DTO) throws RisBusinessException;
    
    /***
     *<p>產生交易主檔以及Y100000000的XLDF系列資料</p> 
     *@param hp02F20DTO 用途為大宗戶籍謄本(RL02F0)轉向戶籍謄本(RL02100)之用的DTO{@link #HP02F20DTO}
     *
     * ****/
    @Transactional(timeout = RlConstant.TIMEOUT)
    public HouseholdTransactionDTO createTransactionAndCurrentPerson(final HP02F20DTO hp02F20DTO)throws RisBusinessException;
    
    
    public HP02F20DTO retrieveHP02F20DTO(final ExecutantType rl02100ExecutantType)throws RisBusinessException;
    
   public void storeHP02F20DTO(final ExecutantType rl02100ExecutantType ,final HP02F20DTO dto) throws RisBusinessException;
}