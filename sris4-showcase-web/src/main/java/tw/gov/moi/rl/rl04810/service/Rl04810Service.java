package tw.gov.moi.rl.rl04810.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl04810DTO;

/**
 * RL04810 戶政事務所調整登錄與更正
 * 
 * @author Jason Huang
 */
public interface Rl04810Service {

    public void doSaveMain(Rl04810DTO rl04810DTO, ExecutantType executantType);

    /**
     * 儲存
     * 
     * @param rl04810DTO
     *            {@link tw.gov.moi.rl.domain.Rl04810DTO}
     * @param executantType
     *            {@link tw.gov.moi.ae.domain.ExecutantType}
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(Rl04810DTO rl04810DTO, ExecutantType executantType);

    /**
     * 查詢
     * 
     * @param rl04810DTO
     *            {@link tw.gov.moi.rl.domain.Rl04810DTO}
     * @param executantType
     *            {@link tw.gov.moi.ae.domain.ExecutantType}
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(Rl04810DTO rl04810DTO, ExecutantType executantType);

    /**
     * 刪除
     * 
     * @param rl04810DTO
     * @param executantType
     * @param siteId
     * @param oldAdminofficeCode
     * @param modifyDate
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDel(Rl04810DTO rl04810DTO, ExecutantType executantType);
}
