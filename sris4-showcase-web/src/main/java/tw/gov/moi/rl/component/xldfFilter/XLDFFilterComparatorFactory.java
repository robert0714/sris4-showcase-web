package tw.gov.moi.rl.component.xldfFilter;

import tw.gov.moi.rl.component.XLDFFilterComparator;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public interface XLDFFilterComparatorFactory {
    public XLDFFilterComparator getPartialKeyFilterComparator(XLDFTypeFilterComparator typeFilterComparator,
            String keyPartial);

    public XLDFFilterComparator getRegexKeyFilterComparator(XLDFTypeFilterComparator typeFilterComparator,
            String keyPattern);

    public XLDFFilterComparator getXLDFTypeFilterComparator(Class<? extends XLDFDomainObject> xldfType);

    public XLDFFilterComparator getRegexTypeFilterComparator(String regexType);

}
