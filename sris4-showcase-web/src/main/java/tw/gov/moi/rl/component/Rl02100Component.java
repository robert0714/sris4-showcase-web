package tw.gov.moi.rl.component;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.Rl02100ApplyHouseholdDTO;
import tw.gov.moi.rl.domain.Rl02100HDTOResult;
import tw.gov.moi.rl.domain.Rl02100MDTOResult;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public interface Rl02100Component {

    final String OTHER_PLACE_REG = "99998|99999";

    /**
     * 初始化 Rl02100ApplyHouseholdDTO
     * 
     * @param isExistHousehold
     * @param xldfDomainObjectm
     * @param mresult
     * @param hresult
     * @param relationMap
     * @param pExecutantType
     * @return Rl02100ApplyHouseholdDTO
     */
    public Rl02100ApplyHouseholdDTO initRl02100ApplyHouseholdDTO(final boolean isExistHousehold,
            final XLDFDomainObject xldfDomainObjectm, final Rl02100MDTOResult mresult, final Rl02100HDTOResult hresult,
            final Map<String, String> relationMap, final ExecutantType pExecutantType);

    /**
     * 取得稱謂代碼
     * 
     * @param executantType
     * @return HashMap<String, String>
     */
    public HashMap<String, String> getRelationCode(final ExecutantType executantType);

    /**
     * 將 R 檔轉為 XLDFDomainObject，只有 1M, 1H, 4M, 4H, 5M, 5H
     * 
     * @param pObject
     * @return XLDFDomainObject
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public XLDFDomainObject copyRldfEntityToXldfDomainObject(final Object pObject) throws IllegalAccessException,
            InvocationTargetException;

    /**
     * 取得出生地.
     * 
     * @param personData
     * @param executantType
     * @return String
     */
    public void getHouseholdPersonBirthContent(final Rl02100ApplyHouseholdDTO applyHouseholdDTO,
            final XLDFPersonDataDomainObject personData, final ExecutantType executantType);

    /**
     * 取得 RisFile
     * 
     * @param reportName
     * @param executantType
     * @return RisFile
     */
    // public RisFile getRisFile(final String reportName, final ExecutantType
    // executantType);

    /**
     * 依相對人統號、作業點代碼取得家暴資料
     * 
     * @param violatorId
     *            相對人統號
     * @param siteId
     *            作業點代碼
     * @param pExecutantType
     * @return
     * @throws Exception
     */
    public List<String> getViolence(final String violatorId, final String siteId, final ExecutantType pExecutantType);

    /**
     * 取得 特殊註記代碼
     * 
     * @param specialInciCode
     * @return String
     */
    // public String getSpecialInciContent(final String specialInciCode);

    /**
     * 取得作業順序
     * 
     * @param methodName
     * @param pOpeningOperationDTO
     * @param executantType
     * @return Integer
     */
    public Integer getOperationSequenceId(final String methodName, final OpeningOperationDTO pOpeningOperationDTO,
            final ExecutantType executantType);

    /**
     * 依 RSCD3110 取得役別名稱
     * 
     * @param militaryCode
     * @return String
     */
    // public String getMilitaryName(final String militaryCode);

    /**
     * 依 living style code (RSCD0208) 和 living race type (RSCD0220) 組成原住民身分及族別
     * 
     * @param livingStyleCode
     * @param livingRaceType
     * @return String
     */
    // public String getLivingName(final String livingStyleCode, final String
    // livingRaceType);
}
