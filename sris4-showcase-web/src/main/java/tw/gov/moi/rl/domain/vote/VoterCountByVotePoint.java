/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain.vote;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import tw.gov.moi.rl.domain.vote.VoterCounter.SEX;

/**
 *
 */
public class VoterCountByVotePoint implements Serializable {

    // ================================================
    // == [Enumeration types] Block Start
    // == [Enumeration types] Block End
    // ================================================
    // == [static variables] Block Start

    /**  */
    private static final long serialVersionUID = -4370989681546849198L;

    // == [static variables] Block Stop
    // ================================================
    // == [instance variables] Block Start

    private final VoterCounter vm = new VoterCounter("造冊人數");
    private final VoterCounter in = new VoterCounter("外來工投");
    private final VoterCounter out = new VoterCounter("他往工投");
    private final VoterCounter subtotal = new VoterCounter("增減後實數");

    // == [instance variables] Block Stop
    // ================================================
    // == [static Constructor] Block Start
    // == [static Constructor] Block Stop
    // ================================================
    // == [Constructors] Block Start (含init method)
    // == [Constructors] Block Stop
    // ================================================
    // == [Static Method] Block Start
    // == [Static Method] Block Stop
    // ================================================
    // == [Accessor] Block Start

    /**
     * @return the in
     */
    public VoterCounter getIn() {
        return this.in;
    }

    /**
     * @return the out
     */
    public VoterCounter getOut() {
        return this.out;
    }

    /**
     * @return the vm
     */
    public VoterCounter getVm() {
        return this.vm;
    }

    /**
     * @return the subtotal
     */
    public VoterCounter getSubtotal() {
        return this.subtotal;
    }

    // == [Accessor] Block Stop
    // ================================================
    // == [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    // == [Overrided Method] Block Stop
    // ================================================
    // == [Method] Block Start
    // ####################################################################
    // ## [Method] sub-block :
    // ####################################################################

    /**
     * 
     */
    public void resetSubtotal() {
        final Set<String> keys = new HashSet<String>();
        keys.addAll(this.vm.getVoterKeys());
        keys.addAll(this.in.getVoterKeys());
        keys.addAll(this.out.getVoterKeys());
        for (String key : keys) {
            {
                // 計算出增減後實數.
                final SEX sex = SEX.M;
                int count = this.vm.getCount(sex, key);
                count += this.in.getCount(sex, key);
                count -= this.out.getCount(sex, key);
                this.subtotal.setValue(sex, key, count);
            }
            {
                // 計算出增減後實數.
                final SEX sex = SEX.F;
                int count = this.vm.getCount(sex, key);
                count += this.in.getCount(sex, key);
                count -= this.out.getCount(sex, key);
                this.subtotal.setValue(sex, key, count);
            }
        }
    }

    // private VoterNumber count(final VoterNumber vm, final VoterNumber in,
    // final VoterNumber out) {
    // return //
    // new VoterNumber(vm.getMale() - in.getMale() + out.getMale(),
    // vm.getFemale() - in.getFemale() + out.getFemale());
    // }

    /**
     * 把其它 Counter 的結果加進來.
     * 
     * @param voterCounters
     */
    public void addCount(VoterCountByVotePoint voterCounters) {
        this.vm.addCount(voterCounters.vm);
        this.in.addCount(voterCounters.in);
        this.out.addCount(voterCounters.out);
        this.subtotal.addCount(voterCounters.subtotal);
    }

    // == [Method] Block Stop
    // ================================================
    // == [Inner Class] Block Start
    // == [Inner Class] Block Stop
    // ================================================
}
