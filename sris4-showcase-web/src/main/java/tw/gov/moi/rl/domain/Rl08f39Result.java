/*
 * Copyright (final c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import tw.gov.moi.rl.domain.vote.VoterCounter;

/**
 * 選舉人人數初步確定統計表(選委會)結果.
 * 
 * @author DAXIONG
 * 
 */
public class Rl08f39Result implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 投票所. */
    private String votePoint;

    /** 村里鄰清單. */
    private List<String> villageNeighborList = new ArrayList<String>();

    /** 選舉人數統計物件清單. */
    private VoterCounter voterCounter = new VoterCounter("");

    /**
     * constructor. 
     */
    public Rl08f39Result() {
    }

    public Rl08f39Result(String votePoint, List<String> villageNeighborList) {
        super();
        this.votePoint = votePoint;
        this.villageNeighborList = villageNeighborList;
    }

    public String getVotePoint() {
        return this.votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public List<String> getVillageNeighborList() {
        return this.villageNeighborList;
    }

    public void setVillageNeighborList(List<String> villageNeighborList) {
        this.villageNeighborList = villageNeighborList;
    }

    public VoterCounter getVoterCounter() {
        return this.voterCounter;
    }

    public void setVoterCounter(VoterCounter voterCounter) {
        if (voterCounter != null) {
            this.voterCounter = voterCounter;
        }
    }

}
