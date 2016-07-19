package tw.gov.moi.rl.component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rlde214wType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.AdminOfficePeriodDto;

public interface AdminOfficePeriodComponent extends Serializable {

      
    /**
     * 取得戶所中文名稱
     * 
     * @param siteId 作業點
     * @param registerYyyMMdd
     * @return 戶所中文名稱
     */
    @Deprecated
    public String retrieveCityChtName(final String siteId, final String registerYyyMMdd ,final ExecutantType executantType)throws RisBusinessException;

    /**
     * @param adminOfficeCode
     * @param registerYyyMMdd
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public Rlde214wType retrieveRlde214wOldInfoByAdminOfficeCode(final String adminOfficeCode, final String registerYyyMMdd, final ExecutantType executantType)
	    throws RisBusinessException;
    
    /**
     * 取得指定日期,指定作業點當時的戶所代碼
     * @param siteId
     * @param registerYyyMMdd
     * @return 戶所代碼
     */
    public String  getAdminOfficeCode(final String siteId, final String registerYyyMMdd ,final ExecutantType executantType)throws RisBusinessException;
    
    /**
     * 取得省市縣市中文名稱
     * 
     * @param siteId
     * @param registerYyyMMdd
     * @return 省市縣市中文名稱
     */
    public String retrieveOfficeChtNameBySiteId(final String siteId, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;

    /**
     * 取得省市縣市中文名稱
     * 
     * @param adminOfficeCode
     * @param registerYyyMMdd
     * @return 省市縣市中文名稱
     */
    public String retrieveOfficeChtNameByAdminOfficeCode(final String adminOfficeCode, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;
    
    /**
     * 取得省市縣市英文名稱-漢語
     * @param siteId
     * @param registerYyyMMdd
     * @return 省市縣市英文名稱-漢語
     */
    public String retrieveCityEngName1(final String siteId, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;

    /**
     * 取得戶所英文名稱-漢語
     * @param siteId
     * @param registerYyyMMdd
     * @return 戶所英文名稱-漢語
     */
    public String retrieveOfficeEngName1(final String siteId, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;

    /**
     * 取得省市縣市英文名稱-通用
     * @param siteId
     * @param registerYyyMMdd
     * @return 省市縣市英文名稱-通用
     */
    public String retrieveCityEngName2(final String siteId, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;

    /**
     * 取得戶所英文名稱-通用
     * @param siteId
     * @param registerYyyMMdd
     * @return 戶所英文名稱-通用
     */
    public String retrieveOfficeEngName2(final String siteId, final String registerYyyMMdd,final ExecutantType executantType)throws RisBusinessException;
    
    public Map<String, List<AdminOfficePeriodDto>> getAdminOfficePeriodRecordByAdminOfficeCode() ;
}
