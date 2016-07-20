package tw.gov.moi.rl.rl06a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06A00DTO;
/**
 * 查詢未配賦戶號服務介面
 * @author 1109001
 *
 */
public interface Rl06a00Service {
	/**
	 * 查詢未配賦戶號狀況
	 * @param dto
	 * @param executantType
	 * @return
	 */
	@RisServiceMethod(MethodType.QUERY)
	public Rl06A00DTO doQuery(Rl06A00DTO dto, ExecutantType executantType)throws RisBusinessException;
}
