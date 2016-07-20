package tw.gov.moi.rl.dto.rl00001;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;

public class XLDFEmptyForeignRoleDTO implements XLDFForeignRoleDTO {

    private static XLDFEmptyForeignRoleDTO _instance;

    @Override
    public String getPassportId() {
        return RlConstant.EMPTY_STRING;
    }

    @Override
    public void setPassportId(String passportId) {
        throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E);
    }

    @Override
    public String getResidentNo() {
        return RlConstant.EMPTY_STRING;
    }

    @Override
    public void setResidentNo(String residentNo) {
        throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E);
    }

    @Override
    public String getOtherId() {
        return RlConstant.EMPTY_STRING;
    }

    @Override
    public void setOtherId(String otherId) {
        throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6097E);
    }

    private XLDFEmptyForeignRoleDTO() {

    }

    public static XLDFEmptyForeignRoleDTO getInstance() {
        if (_instance == null) {
            _instance = new XLDFEmptyForeignRoleDTO();
        }
        return _instance;
    }

}
