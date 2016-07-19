package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08fa0DTO;

public interface Rl08fa0Service {

    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl08fa0DTO rl08fa0DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.DELETE)
    @WorkStatus(FinalType.FINAL)
    public void doDelete(final Rl08fa0DTO rl08fa0DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void getRlde804wAllData(final Rl08fa0DTO rl08fa0DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void getRlde804wData(final Rl08fa0DTO rl08fa0DTO, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void regionCodeRepeat(final Rl08fa0DTO rl08fa0DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
