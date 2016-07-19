/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;


public interface Rl08120LogRedf23mComponent {
    void doLogRedf023mFor8120Log(Rl08120LogRedf23mService_Action action, ExecutantType executantType);
    
    public interface Rl08120LogRedf23mService_Action{
        void action();
    }
}
