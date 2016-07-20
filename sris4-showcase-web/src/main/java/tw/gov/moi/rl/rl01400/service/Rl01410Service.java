package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01410DTO;

public interface Rl01410Service {

    /**
     * 取得個人資料
     * 
     * @param rl01410DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldf001004m(final Rl01410DTO rl01410dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存特殊註記列表並通報
     * 
     * @param rl01410DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void doSaveToDB(final Rl01410DTO rl01410dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢核註記是否重複存在DB
     * 
     * @param rl01410DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doCheckDuplicateMark(final Rl01410DTO rl01410dto, final ExecutantType executantType)
            throws RisBusinessException;

}
