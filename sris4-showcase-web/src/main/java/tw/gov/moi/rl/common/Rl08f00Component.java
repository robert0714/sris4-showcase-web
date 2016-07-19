package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rlde808wType;
import tw.gov.moi.domain.Rlde809wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08fXXLivingVoteDTO;

/**
 * 選舉共用資料取得
 * 
 * @author Andy
 * 
 */
public interface Rl08f00Component {
    /**
     * 取得最大數編號Rlde808w
     * 
     * @param voteCode
     * @param voteDate
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public Rlde808wType getMaxNumFrome808w(String voteCode, String voteDate, final ExecutantType executantType)
            throws RisBusinessException;

    public Rlde806wType getMaxNumFrome806w(String voteCode, String voteDate, String village, String neighbor,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得投票所資料
     * 
     * @param voteCode
     * @param voteDate
     * @param village
     * @param neighbor
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public List<Rlde808wType> getRlde808w(String voteCode, String voteDate, String village, String neighbor,
            final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得投票所資料 Kind1
     * 
     * @param voteCode
     * @param voteDate
     * @param village
     * @param neighbor
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public List<Rlde808wType> getRlde808wKind1(String voteCode, String voteDate, String village, String neighbor,
            final ExecutantType executantType) throws RisBusinessException;

    public List<Rlde808wType> getRlde808wKind3(String voteCode, String voteDate, String village, String neighbor,
            final ExecutantType executantType) throws RisBusinessException;

    /**
     * 
     * 
     * @param voteCode
     * @param voteDate
     * @param village
     * @param neighbor
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public Rlde809wType getRlde809w(String voteCode, String voteDate, String personId, final ExecutantType executantType)
            throws RisBusinessException;

    public Rlde808wType getRlde808wKind1(String votePoint, String voteCode, String voteDate, String village,
            String neighbor, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得選舉人資料
     * 
     * @param siteId
     * @param voteCode
     * @param voteData
     * @param personId
     * @return
     * @throws RisBusinessException
     */
    public Rlde806wType getRlde806w(String siteId, String voteCode, String voteData, String personId,
            ExecutantType executantType) throws RisBusinessException;

    /**
     * 
     * @param siteId
     * @param voteCode
     * @param voteData
     * @param village
     * @param neghbor
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public List<Rlde806wType> getRlde806w(String siteId, String voteCode, String voteData, String village,
            String neghbor, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得個人資料
     * 
     * @param personId
     * @param siteId
     * @return
     * @throws RisBusinessException
     */
    public Rldf004mType getRldf004m(String personId, String siteId, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 
     * @param personId
     * @param siteId
     * @return
     * @throws RisBusinessException
     */
    public Rldf008mType getRldf008m(String personId, String siteId, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得全戶資料
     * 
     * @param HouseholdHeadId
     * @param houseHoldId
     * @param siteId
     * @return
     * @throws RisBusinessException
     */
    public Rldf001mType getRldf001m(String HouseholdHeadId, String houseHoldId, String siteId,
            final ExecutantType executantType) throws RisBusinessException;

    public void addOneSerialNoByRlde808w(Rlde806wType rlde806wType, Rlde808wType rlde808wType)
            throws RisBusinessException;

    public void addOneSerialNoByRlde806w(Rlde806wType rlde806wType, Rlde808wType rlde808wType)
            throws RisBusinessException;

    /**
     * 調整原住民投票權
     * 
     * @param rl08fXXLivingVoteDTO
     * @param target
     * @throws RisBusinessException
     */
    public void fitRlde806wLivingVote(Rl08fXXLivingVoteDTO rl08fXXLivingVoteDTO, Rlde806wType target)
            throws RisBusinessException;

    /**
     * 設定rlde806w資料
     * 
     * @param type
     * @param rldf001mType
     * @param rldf004m
     * @throws RisBusinessException
     */
    Rlde806wType getRlde806w(Rlde806wType type, final Rldf001mType rldf001mType, final Rldf004mType rldf004m,
            final ExecutantType executant) throws RisBusinessException;

}
