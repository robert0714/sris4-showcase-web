package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
/**
 * 戶籍登記...取得最申請人、當事人最新的XLDF004M...等相關資料。
 * 
 * 
 * @author derlin
 *
 */
public interface XLDFTxComponent {
	/**
	 *  取得最新的申請人1
	 * @param operationSequence
	 * @param executantType
	 * @return
	 * @throws Exception 
	 */
	XLDFPersonBriefDataDTO getLatestApplicant1(final Integer operationSequence,final ExecutantType executantType) throws Exception;

	/**
	 *  取得最新的申請人2
	 * @param operationSequence
	 * @param executantType
	 * @return
	 */
	XLDFPersonBriefDataDTO getLatestApplicant2(final Integer operationSequence,final ExecutantType executantType) throws Exception;

	/**
	 *  取得最新的委託人
	 * @param operationSequence
	 * @param executantType
	 * @return
	 */
	XLDFPersonBriefDataDTO getLatestDelegatedPerson(final Integer operationSequence,final ExecutantType executantType) throws Exception;
}
