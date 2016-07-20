package tw.gov.moi.rl.component.xldf.facade;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

public interface XLDFDomainFacadeFactory {
    public XLDFPersonDataDomainObject getPersonDataFacade(XLDFDomainObject xldfDomainObject);

    public XLDFHouseholdDataDomainObject getHouseholdDataFacade(XLDFDomainObject xldfDomainObject);

    public XLDFHouseholdNoteDomainObject getHouseholdNoteFacade(XLDFDomainObject xldfDomainObject);

    public XLDFPersonNoteDomainObject getPersonNoteFacade(XLDFDomainObject xldfDomainObject);
}
