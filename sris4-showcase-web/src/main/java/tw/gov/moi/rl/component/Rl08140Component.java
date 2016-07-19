/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08140DTO2;
import tw.gov.moi.rl.domain.Rldf016sDTO;

public interface Rl08140Component {
    public void addData(Rldf016sDTO dto, ExecutantType executantType) throws RisBusinessException;

    void deleteThreeMonthAgoData(ExecutantType executantType);

    void doWork(Rl08140DTO2 dto, ExecutantType executantType);
}
