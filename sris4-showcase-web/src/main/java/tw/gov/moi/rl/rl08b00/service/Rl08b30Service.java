package tw.gov.moi.rl.rl08b00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08b30DTO;


/**
 * 動態資料造冊─結婚服務介面
 */
public interface Rl08b30Service {

    byte[] doPrint(Rl08b30DTO rl08b30DTO) throws RisBusinessException;

    List<?> query(Rl08b30DTO rl08b30DTO) throws RisBusinessException;

    String doPrint(Rl08b30DTO rl08b30dto, ExecutantType executantType) throws RisBusinessException;

    void doVerify(Rl08b30DTO rl08b30dto) throws RisBusinessException;
}
