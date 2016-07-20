package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.HouseholdTransactionDTO;

public interface HouseholdReturnPage {
    public String redirectPageWhenSave(final String operationCode,final HouseholdTransactionDTO householdTransactionDTO, final ExecutantType executantType);
}
