package tw.gov.moi.rl.rl08b00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08b40DTO;


/**
 * 動態資料造冊─離婚服務介面
 */
public interface Rl08b40Service {

    byte[] doPrint(Rl08b40DTO rl08b40DTO) throws RisBusinessException;

    List<?> query(Rl08b40DTO rl08b40DTO) throws RisBusinessException;

    String doPrint(Rl08b40DTO rl08b40dto, ExecutantType executantType) throws RisBusinessException;

    void doVerify(Rl08b40DTO rl08b40dto) throws RisBusinessException;
}
