package tw.gov.moi.rl.job;

import java.util.List;
import java.util.Set;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.HouseholdtransrecType;

public interface Rl00001JobInterface {
    public void record(final HouseholdtransrecType entity,ExecutantType execute);
    public List<HouseholdtransrecType> findData(final ExecutantType executant);
    public abstract void deleteByTxId(final String txId, final ExecutantType executantType);
    public abstract Set<String> findQualitedData(final ExecutantType executantType);
}
