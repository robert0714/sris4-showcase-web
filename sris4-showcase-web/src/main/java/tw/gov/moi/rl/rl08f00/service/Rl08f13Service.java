package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f13DTO;

public interface Rl08f13Service {

    void initPage(final Rl08f13DTO rl08f13DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl08f13DTO rl08f13DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    void doDownload(final Rl08f13DTO rl08f13DTO, final ExecutantType executantType) throws RisBusinessException;

}
