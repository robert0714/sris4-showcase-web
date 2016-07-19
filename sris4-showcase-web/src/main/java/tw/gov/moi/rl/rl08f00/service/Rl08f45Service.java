package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f45DTO;

public interface Rl08f45Service {
    void doQuery(final Rl08f45DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doSave(final Rl08f45DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doPreview(Rl08f45DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doBatchPrint(Rl08f45DTO dto, ExecutantType executantType) throws RisBusinessException;
}
