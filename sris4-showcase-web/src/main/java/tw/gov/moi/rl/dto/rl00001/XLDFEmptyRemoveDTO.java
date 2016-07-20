package tw.gov.moi.rl.dto.rl00001;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;


public class XLDFEmptyRemoveDTO implements XLDFRemoveDTO {

    // private static final String EMPTY_STRING = "";

    private static XLDFEmptyRemoveDTO _instance = null;

    public static synchronized XLDFEmptyRemoveDTO getInstance() {
        if (_instance == null) {
            _instance = new XLDFEmptyRemoveDTO();
        }
        return _instance;
    }

    private XLDFEmptyRemoveDTO() {

    }

    public String getRemoveYyymmdd() {
        return RlConstant.EMPTY_STRING;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E);
    }

    public String getRemoveTime() {
        return RlConstant.EMPTY_STRING;
    }

    public void setRemoveTime(String removeTime) {
        throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E);
    }

}
