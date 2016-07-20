package tw.gov.moi.rl.rl01a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01a20DTO;

public interface Rl01a20Service {

    /**
     * 檢核個人基本資料是否為現住人口
     * 
     * @param rl01a20DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldf001004m(final Rl01a20DTO rl01a20dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存所內記事資料至DB並通報
     * 
     * @param rl01a20DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSaveToDB(final Rl01a20DTO rl01a20dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得樣板文字
     * 
     * @param rl01a20dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getTemplateWording(final Rl01a20DTO rl01a20dto, final ExecutantType executantType)
            throws RisBusinessException;

}
