package tw.gov.moi.rl.component;

import java.util.HashMap;
import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * RL層級選舉名冊元件介面.
 * 
 * @author DAXIONG
 * 
 */
public interface RlVoterRollsComponent {

    /**
     * 送出列印.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     * @param executantType
     *            使用者資訊
     * @param reportParameterList
     *            報表參數清單
     * @throws RisBusinessException
     */
    void doBatchPrint(final VoterRollsInfoDTO voterRollsInfoDTO, final ExecutantType executantType,
            final List<HashMap<String, String>> reportParameterList) throws RisBusinessException;

    /**
     * 另存電子檔.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     * @param executantType
     *            使用者資訊
     * @param reportParameterList
     *            報表參數清單
     * @throws RisBusinessException
     * 
     */
    void doDownload(final VoterRollsInfoDTO voterRollsInfoDTO, final ExecutantType executantType,
            final List<HashMap<String, String>> reportParameterList) throws RisBusinessException;

    /**
     * 初始化.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     * @param executantType
     *            使用者資訊
     * @param serviceClass
     *            服務類別
     * @param operationName
     *            作業名稱
     * @throws RisBusinessException
     */
    void doInit(final VoterRollsInfoDTO voterRollsInfoDTO, final ExecutantType executantType,
            final Class<?> serviceClass, final String operationName) throws RisBusinessException;

    /**
     * 預覽.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     * @param executantType
     *            使用者資訊
     * @param reportParameterList
     *            報表參數清單
     * @throws RisBusinessException
     */
    void doPreview(final VoterRollsInfoDTO voterRollsInfoDTO, final ExecutantType executantType,
            final List<HashMap<String, String>> reportParameterList) throws RisBusinessException;

    /**
     * 處理報表參數.
     * 
     * @param parameter
     *            報表參數
     * @param isVotePoint
     *            是否為投票所
     * @return 報表參數
     * @throws RisBusinessException
     */
    String processParameter(final String parameter, final boolean isVotePoint) throws RisBusinessException;

}
