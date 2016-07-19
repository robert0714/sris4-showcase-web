package tw.gov.moi.rl.rl02c20.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02c20DTO;

public interface Rl02c20Service {

    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final Rl02c20DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl02c20DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void initQueryList(final Rl02c20DTO dto, final ExecutantType executantType);
}
