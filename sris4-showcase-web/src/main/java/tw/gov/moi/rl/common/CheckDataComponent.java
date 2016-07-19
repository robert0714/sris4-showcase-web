package tw.gov.moi.rl.common;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 資料檢核共用元件介面.
 * 
 * @author weiren.jheng
 * 
 */
public interface CheckDataComponent {

    /**
     * 檢核戶籍地址是否為合法的門牌資料
     * 
     * @param village
     *            村里
     * @param neighbor
     *            鄰
     * @param streetDoorplate
     *            街路門牌
     * @return 檢核結果
     * @throws RisBusinessException
     *             「檢核戶籍地址是否為合法的門牌資料」失敗
     */
    public String checkValidDoorPlate(final String village, final String neighbor, final String streetDoorplate,
            final ExecutantType type) throws RisBusinessException;

}
