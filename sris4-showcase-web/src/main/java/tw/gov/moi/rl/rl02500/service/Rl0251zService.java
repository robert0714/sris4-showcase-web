package tw.gov.moi.rl.rl02500.service;

import org.springframework.stereotype.Service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0251zDTO;

@Service("rl0251zService")
public interface Rl0251zService {

    String COMMA_SPACE = ", ";

    String QUERY_RLDF018D = "select * from rldf018d where site_id = ? and household_head_id = ? and household_id = ? and seq_no = ? and apply_yyymmdd = ? ";

    String QUERY_RCDF001MRL = "select * from rcdf001mrl where person_id = ? ";

    /**
     * 取得驗證結果
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */

    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.VERIFY)
    void doVerify(Rl0251zDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 進階驗證
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.VERIFY)
    void doAdvVerify(Rl0251zDTO dto, ExecutantType executantType) throws RisBusinessException;

    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    void doQueryChangeDate(Rl0251zDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證戶內人口數
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    void doVerifyApplyCount(final Rl0251zDTO dto, final ExecutantType executantType) throws RisBusinessException;

}
