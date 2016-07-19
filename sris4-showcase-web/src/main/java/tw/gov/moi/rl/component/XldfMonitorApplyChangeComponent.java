package tw.gov.moi.rl.component;

import java.io.Serializable;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.XLDF2RLDFInfoDTO;

public interface XldfMonitorApplyChangeComponent extends Serializable {
    public void ifErrorRecord(final XLDF2RLDFInfoDTO XLDF2RLDFInfoDTO, final ExecutantType executantType);
    public void ifErrorRecordforTest(final XLDF2RLDFInfoDTO sample, final ExecutantType executantType);
}
