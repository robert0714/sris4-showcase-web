package tw.gov.moi.rl.rl08b00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08b20DTO;


/**
 * 動態資料造冊─死亡報表服務介面
 */
public interface Rl08b20Service {

    byte[] doPrint(Rl08b20DTO rl08b20DTO) throws RisBusinessException;

    List<?> query(Rl08b20DTO rl08b20DTO) throws RisBusinessException;

    String doPrint(Rl08b20DTO rl08b20dto, ExecutantType executantType) throws RisBusinessException;

    void doVerify(Rl08b20DTO rl08b20dto) throws RisBusinessException;
}
