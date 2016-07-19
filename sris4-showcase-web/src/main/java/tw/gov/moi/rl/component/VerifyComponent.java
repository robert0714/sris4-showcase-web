package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public interface VerifyComponent {

    final String SPECIAL_INCI_CODE_REG = "3|4|5";

    /**
     * 檢核現戶登記當事人身分狀態
     * 
     * @param xLDFPersonDataDomainObject
     * @param xCDF001MRL
     * @param executantType
     */
    public void verifyMPersonStatus(final XLDFPersonDataDomainObject xLDFPersonDataDomainObject,
            final XCDF001MRL xCDF001MRL, final ExecutantType executantType);

    /**
     * 檢核除戶登記當事人身分狀態
     * 
     * @param xLDFPersonDataDomainObject
     * @param xCDF001MRL
     * @param executantType
     */
    public void verifyHPersonStatus(final XLDFPersonDataDomainObject xLDFPersonDataDomainObject,
            final XCDF001MRL xCDF001MRL, final ExecutantType executantType);

}
