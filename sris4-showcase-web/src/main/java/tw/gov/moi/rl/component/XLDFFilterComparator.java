package tw.gov.moi.rl.component;

import tw.gov.moi.rl.component.dto.XLDFOperationAccess;

public interface XLDFFilterComparator {
    boolean compare(XLDFOperationAccess xldfOperationAccess);
}
