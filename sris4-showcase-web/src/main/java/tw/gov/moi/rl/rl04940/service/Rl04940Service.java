package tw.gov.moi.rl.rl04940.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl04940DTO;

/**
 * Rl4940跨行政區域調整生效還原
 * @author Jason Huang
 */
public interface Rl04940Service {
	

	/**
	 * 驗證
	 * @param rl04810DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.QUERY)
	public String vefifyData(Rl04940DTO rl04940DTO, ExecutantType executantType);
	
	/**
	 * 生效
	 * @param rl04940DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.SAVE)
	@WorkStatus(FinalType.FINAL)
	public void saveRLDF(Rl04940DTO rl04940DTO, ExecutantType executantType);
	
	
	/**
	 * 還原
	 * @param rl04940DTO {@link tw.gov.moi.rl.domain.Rl04810DTO}
	 * @param executantType {@link tw.gov.moi.ae.domain.ExecutantType}
	 */
	@RisServiceMethod(MethodType.SAVE)
	public void restoreRLDF(Rl04940DTO rl04940DTO, ExecutantType executantType);
	
	/**
	 * 測試JOB
	 * @param rl04940dto
	 * @param executantType
	 */
	@RisServiceMethod(MethodType.QUERY)
	public void execute(Rl04940DTO rl04940dto, ExecutantType executantType); 
	
	/**
	 	ex : 新北市	板橋區	中正里	001鄰	中正路100號
	 	         行政區域調整
	 		  新北市	中和區	中原里	001鄰	中正路100號
		1.遷徙動作(進行人員遷徙)
			修改下列table :
			RLDF001M	全戶基本資料檔
			RLDF002M	全戶動態記事檔
			RLDF004M	個人基本資料檔
			RLDF005M	個人記事檔
			RLDF006M	個人遷徙記錄檔
			RLDF007M	姓名更改紀錄檔
			RLDF008M	特殊人口資料檔
			RLDF030M	所內記事檔
			RLDF047M	姓名羅馬拼音記錄檔
			RLDF049M	保護家庭暴力資料檔
			RLDFM01M	出生資料檔
			RLDFM02M	婚姻記錄檔
			RLDFM03M	統號更改紀錄檔
			RLDFM04M	認領、收養記錄檔
			RLDFM05M	監護、輔助、未成年子女權利義務行使負擔資料檔
			RLDFM06M	國民身分證掛失紀錄檔
			RLDFM07M	重婚資料檔
			RLDFM08M	監護、輔助、未成年子女權利義務行使負擔紀錄檔
			RLDFM09M	出生日期更改紀錄檔
			RLDFM10M	個人申請書紀錄檔
			RLDF087T	登記婚前結(離)婚證明書資料檔
			RLDF088T	結(離)婚證明書資料檔
			RLDF089T	英文結(離)婚證明書資料檔
		2.板橋區產生的全戶除戶記事內容為何?
		3.中和區因為如4M資料已存在須將該戶下除戶，請問全戶除戶記事內容為何?			
		4.門牌如何處裡 :
		  1.中和區是否需先使用建立該門牌資料，還是由程式自動產生RLDF020M資料
		       門牌歷史資料RLDF019M該如何處理?
		  2.板橋區的門牌該如何處理(門牌廢止嗎)?
		5.通報AW(通報內容?)
		6.通報ML(通報內容?)
		7.RLDF004D行政區域調整及門牌整編轉錄資料檔
		8.複製一筆板橋區RLDF018D戶口名簿領補換記錄檔(流水後最大、控制號最大)資料到中和區
	 */
	
}
