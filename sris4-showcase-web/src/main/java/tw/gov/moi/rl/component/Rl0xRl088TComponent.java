package tw.gov.moi.rl.component;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.domain.RisDateTimeType;
import tw.gov.moi.domain.Rldf088tType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.xldf.dto.XLDF088T;
import tw.gov.moi.rs.dto.ObnfDTO;

public interface Rl0xRl088TComponent {
    /**
     * @param personId
     * @param executantType
     * @return
     */
    public abstract String findSettleSiteIdByPersonId(final String personId, final ExecutantType executantType);

    /**
     * @param rldft004ORrldfs004Type
     *            根據職權更正確定要修改的離婚登記申請書...進行更新Rldf088T
     */
    public abstract void updateRldf088tByRl0x404(final Serializable rldft004ORrldfs004Type);
    /**
     * @param rldft003ORrldfs003Type
     *            根據職權更正確定要修改的結婚登記申請書...進行更新Rldf088T
     */
    public abstract void updateRldf088tByRl0x403(final Serializable rldft003ORrldfs003Type);
    
    /**
     * @param personId
     * @param siteId
     * @param executantType
     * @return
     */
    public abstract List<Rldf088tType> findRldf088TListFromRL(final String personId, final String siteId, final ExecutantType executantType);

    /**
     * @param personName
     * @param birthYyymmdd
     * @param executant
     * @return
     */
    public abstract List<Rldf088tType> findRldf088TListFromRC(final String personName, final String birthYyymmdd, final ExecutantType executant);
    
    @Transactional(timeout=RlConstant.TIMEOUT)
    public void updateRldf088tType(final Rldf088tType unit , final ExecutantType executantType);

    public abstract List<ObnfDTO> processApplicationInSameHost(final List<Object> siteIdInSameHostList, final  ExecutantType executantType);

    /***
     * 根據xldf088t上的資訊進行更新RC,RL資料
     * ***/
    public List<ObnfDTO> generateObnfListForupdateCancelMark(final RisDateTimeType wkNoticeDateTime,final XLDF088T   xldfdata, final ExecutantType executantType);
}
