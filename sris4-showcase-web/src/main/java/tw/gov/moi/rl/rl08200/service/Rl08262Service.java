package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08262DTO;

public interface Rl08262Service {

    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl08262DTO rl08262DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl08262DTO rl08262DTO, final ExecutantType executantType) throws RisBusinessException;

}
