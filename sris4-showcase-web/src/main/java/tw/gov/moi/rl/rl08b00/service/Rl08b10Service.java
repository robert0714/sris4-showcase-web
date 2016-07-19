package tw.gov.moi.rl.rl08b00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08b10DTO;


/**
 * 動態資料造冊─出生報表服務介面
 */
public interface Rl08b10Service {

    byte[] doPrint(Rl08b10DTO rl08b10DTO) throws RisBusinessException;

    List<?> query(Rl08b10DTO rl08b10DTO) throws RisBusinessException;

    String doPrint(Rl08b10DTO rl08b10dto, ExecutantType executantType) throws RisBusinessException;

    void doVerify(Rl08b10DTO rl08b10dto) throws RisBusinessException;
}
