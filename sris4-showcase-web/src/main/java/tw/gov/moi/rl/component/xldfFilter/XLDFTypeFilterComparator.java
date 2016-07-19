package tw.gov.moi.rl.component.xldfFilter;

import tw.gov.moi.rl.component.XLDFFilterComparator;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFOperationAccess;

public class XLDFTypeFilterComparator implements XLDFFilterComparator {

    private Class<? extends XLDFDomainObject> filterXLDFType;

    public boolean compare(XLDFOperationAccess xldfOperationAccess) {
        boolean result = false;

        if (xldfOperationAccess != null && filterXLDFType != null
                && xldfOperationAccess.getXldfType().equals(filterXLDFType)) {
            result = true;
        }

        return result;
    }

    public Class<? extends XLDFDomainObject> getFilterXLDFType() {
        return filterXLDFType;
    }

    public void setFilterXLDFType(Class<? extends XLDFDomainObject> filterXLDFType) {
        this.filterXLDFType = filterXLDFType;
    }

}