package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.domain.Rlde800wType;
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.domain.VoterRollsInputDTO;

/**
 * 
 * 選舉共用元件
 * 
 * @author Andy
 * 
 */
public interface VotePartitionCopomnet {

    /**
     * 動態調整分區與不分區之調整狀況
     * 
     * @param target
     * @param rlde800w
     * @throws RisBusinessException
     */
    public void setRlde806wVoteBy800w(Rlde806wType target, Rlde800wType rlde800w, Rldf004mType rldf004m,

    List<VoterRollsInputDTO> rollDTOs) throws RisBusinessException;
}
