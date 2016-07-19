package tw.gov.moi.rl.component;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public interface XLDFDomainFilterComparator extends XLDFFilterComparator {
    boolean compare(XLDFDomainObject xldfDomainObject);
}
