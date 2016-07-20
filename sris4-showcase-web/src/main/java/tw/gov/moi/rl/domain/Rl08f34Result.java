/*
 * Copyright (final c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.rl.domain.vote.VoterCountByVotePoint;

/**
 * 製作選舉人數初步／確定統計表結果.
 * 
 * @author DAXIONG
 * 
 */
public class Rl08f34Result implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 投票所. */
    private String votePoint;

    /** 選舉人數統計物件清單. */
    private VoterCountByVotePoint voterCounters;

    public Rl08f34Result(final String votePoint) {
        super();
        this.votePoint = votePoint;
    }

    public String getVotePoint() {
        return this.votePoint;
    }

    public VoterCountByVotePoint getVoterCounters() {
        return this.voterCounters;
    }

    public void setVotePoint(final String votePoint) {
        this.votePoint = votePoint;
    }

    public void setVoterCounters(final VoterCountByVotePoint voterCounters) {
        this.voterCounters = voterCounters;
    }

}
