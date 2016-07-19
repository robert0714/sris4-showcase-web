package tw.gov.moi.rl.rl04100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04140RestoreNewDTO;

/**
 * 行政區域調整 還原
 * 
 * @author Andy
 * 
 */
public interface Rl04140RestoreCompment {

    final String DS_NAME_004M = "Rl04140.getRldf004m";

    public void doWork(final Rl04140RestoreNewDTO rl04140DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
