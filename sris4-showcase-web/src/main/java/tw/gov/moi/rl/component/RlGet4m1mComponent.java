/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */

package tw.gov.moi.rl.component;

import java.io.Serializable;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.rl.domain.Rldf004mAndRldf001mDTO;

/**
 * 資料讀取共用元件介面.
 * 
 * @author cf.lin
 */
public interface RlGet4m1mComponent {

    public static class Rl4m1mDTO implements Serializable {
        private static final long serialVersionUID = 1L;
        private Rldf004mType rldf004mType;
        private Rldf004mType rldf004mType2;
        private Rldf001mType rldf001mType;

        public Rldf004mType getRldf004mType2() {
            return rldf004mType2;
        }

        public void setRldf004mType2(Rldf004mType rldf004mType2) {
            this.rldf004mType2 = rldf004mType2;
        }

        public Rldf004mType getRldf004mType() {
            return rldf004mType;
        }

        public void setRldf004mType(Rldf004mType rldf004mType) {
            this.rldf004mType = rldf004mType;
        }

        public Rldf001mType getRldf001mType() {
            return rldf001mType;
        }

        public void setRldf001mType(Rldf001mType rldf001mType) {
            this.rldf001mType = rldf001mType;
        }
    }

    Rl4m1mDTO getRl4m1m(String personId, String siteId, ExecutantType executant);

    Rldf004mAndRldf001mDTO getRldf001mAndRldf004m(String personId, String siteId, ExecutantType executant);

    Rldf004mType getRldf004mType(String personId, String siteId, ExecutantType executant);

    Rldf001mType getRldf001mType(String householdHeadId, String householdId, String siteId, ExecutantType executant);

    Rldf004mType getRldf004mOrRdd5x01m(String personId, String siteId, ExecutantType executant);
}
