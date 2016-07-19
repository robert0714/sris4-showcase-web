/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain.vote;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import tw.gov.moi.rl.domain.VoterNumber;
import tw.gov.moi.util.AeMapUtils;

/**
 *
 */
public class VoterCounter implements Serializable {
    //================================================
    //== [Enumeration types] Block Start

    /**
    * SEX
    */
    public enum SEX {
        M, F, BOTH
    }

    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start

    /**  */
    private static final long serialVersionUID = 1L;

    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start

    /** TITLE */
    private final String text;

    private final Map<String, VoterNumber> voters = AeMapUtils.newLazyMapToPrototype(new VoterNumber());

    public VoterCounter(String text) {
        super();
        this.text = text;
    }

    //== [instance variables] Block Stop 
    //================================================
    //== [static Constructor] Block Start
    //== [static Constructor] Block Stop 
    //================================================
    //== [Constructors] Block Start (含init method)
    //== [Constructors] Block Stop 
    //================================================
    //== [Static Method] Block Start
    //== [Static Method] Block Stop 
    //================================================
    //== [Accessor] Block Start

    /**
     * @return the text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return the voters
     */
    public List<String> getVoterKeys() {
        return new ArrayList<String>(this.voters.keySet());
    }

    /**
     * @return the voters
     */
    public Map<String, VoterNumber> getVoters() {
        return this.voters;
    }

    //== [Accessor] Block Stop 
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################    

    /**
     * Sets the {@link value}.
     *
     * @param voteType 選舉權類別.
     * 
     */
    public void setValue(SEX sex, String voteType, int count) {
        final VoterNumber voterNumber = this.voters.get(voteType);
        switch (sex) {
            case F:
                voterNumber.setFemale(count);
                break;
            case M:
                voterNumber.setMale(count);
                break;
            case BOTH:
                break;
        }
    }

    /**
     * Sets the {@link value}.
     *
     * @param voteType 選舉權類別.
     * 
     */
    public int getCount(SEX sex, String... voteTypes) {
        if (voteTypes == null) {
            return 0;
        }
        int sum = 0;
        for (String voteType : voteTypes) {
            if (this.voters.containsKey(voteType)) {
                final VoterNumber voterNumber = this.voters.get(voteType);
                switch (sex) {
                    case F:
                        sum += voterNumber.getFemale();
                        break;
                    case M:
                        sum += voterNumber.getMale();
                        break;
                    case BOTH:
                    default:
                        sum += voterNumber.getMale();
                        sum += voterNumber.getFemale();
                }
            }
        }
        return sum;
    }

    /**
     * @param vm
     */
    public void addCount(VoterCounter vm) {
        final List<String> voterKeys = vm.getVoterKeys();
        for (String key : voterKeys) {
            final VoterNumber my = this.voters.get(key);
            final VoterNumber other = vm.voters.get(key);
            final int male = my.getMale() + other.getMale();
            final int female = my.getFemale() + other.getFemale();
            my.setMale(male);
            my.setFemale(female);
        }
    }

    //== [Method] Block Stop 
    //================================================
    //== [Inner Class] Block Start
    //== [Inner Class] Block Stop 
    //================================================

}
