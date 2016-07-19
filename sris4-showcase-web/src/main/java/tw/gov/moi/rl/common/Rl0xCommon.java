package tw.gov.moi.rl.common;

import tw.gov.moi.rl.domain.Rl0x001DTO;

public interface Rl0xCommon {

    final String ADD_ACTION = "A";
    final String MODIFY_ACTION = "M";
    final String DELETE_ACTION = "D";

    final String APPLY_KIND = "2";
    final String OTHER_KIND = "3";
    final String HOUSE_KIND = "1";

    /**
     * 是否新增
     * 
     * @param mainDTO
     * @return
     */
    boolean isAdded(Rl0x001DTO mainDTO);

    /**
     * 是否執行移除
     * 
     * @param mainDTO
     * @return
     */
    boolean isRemved(Rl0x001DTO mainDTO);

    /**
     * 是否執行
     * 
     * @param mainDTO
     * @return
     */
    boolean isModifyed(Rl0x001DTO mainDTO);

    /**
     * 是否為申請書作業
     * 
     * @param mainDTO
     * @return
     */
    boolean isApplicationTask(Rl0x001DTO mainDTO);

    /**
     * 是否為其他類
     * 
     * @param mainDTO
     * @return
     */
    boolean isOtherTask(Rl0x001DTO mainDTO);

    /**
     * 是否為戶籍類
     * 
     * @param mainDTO
     * @return
     */
    boolean isHouseTask(Rl0x001DTO mainDTO);

}
