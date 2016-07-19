package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210ReportingCompont {
    /**
     * 列印報表
     * 
     * @param dto
     * @param pExecutantType
     * @throws RisBusinessException
     */
    public void doPrint(Rl08210DTO dto, final ExecutantType pExecutantType) throws RisBusinessException;
}
