package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05261DTO;

public interface Rl05261Service {

    boolean doExecute(ExecutantType executantType) throws RisBusinessException;

    void doPrint(Rl05261DTO dto, ExecutantType executantType) throws RisBusinessException;
}
