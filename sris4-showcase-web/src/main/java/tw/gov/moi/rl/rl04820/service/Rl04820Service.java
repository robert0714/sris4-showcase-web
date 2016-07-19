package tw.gov.moi.rl.rl04820.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl04820DTO;


/**
 * Rl04820戶政事務所調整生效與還原
 * @author Jason Huang
 */
public interface Rl04820Service {
	
	/**
	 * 驗證
	 * @param rl04810DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.QUERY)
	public String vefifyData(Rl04820DTO rl04820DTO, ExecutantType executantType);
	
	/**
	 * 生效
	 * @param rl04820DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.SAVE)
	@WorkStatus(FinalType.FINAL)
	public void saveRLDF(Rl04820DTO rl04820DTO, ExecutantType executantType);
	
	
	/**
	 * 還原
	 * @param rl04820DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.SAVE)
	public void restoreRLDF(Rl04820DTO rl04820DTO, ExecutantType executantType);
	
	/**
	 * 測試JOB
	 * @param rl04820dto
	 * @param executantType
	 */
	@RisServiceMethod(MethodType.QUERY)
	public void execute(Rl04820DTO rl04820dto, ExecutantType executantType);
	
	/**
	 * RLDF019M通報測試
	 * @param rl04820dto
	 * @param executantType
	 */
	@RisServiceMethod(MethodType.QUERY)
	public void testRLDF019M(Rl04820DTO rl04820dto, ExecutantType executantType);
}
