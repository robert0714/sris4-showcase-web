package tw.gov.moi.rl.rl04100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04140NewSaveDTO;

/**
 * 行政區域調整 生效
 * 
 * @author Andy
 * 
 */
public interface Rl04140SaveCompment {

    final String DS_NAME_413W = "Rl04140.getRlde413w";

    final String DS_NAME_401W = "Rl04140.getRlde401w";

    final String DS_NAME_406W = "Rl04140.getRlde406w";

    final String DS_NAME_407W = "Rl04140.getRlde407w";

    final String DS_NAME_001M = "Rl04140.getRldf001m";

    final String DS_NAME_004M = "Rl04140.getRldf004m";

    final String DS_NAME_004D = "Rl04140.getRldf004d";

    final String DS_NAME_020M = "Rl04140.getRldf020m";

    final String DS_NAME_019M = "Rl04140.getRldf019m";

    final String NOTICE_TYPE = "38";

    final String APPLY_CODE = "401";

    final String L49C = "L49C";

    final String SUB_TYPE = "0Z4";

    final String REGISTER_CODE = "Z0Z4000003";

    final String REGISTER_HHMMSS = "000100";

    final String FUNCTION_NAME = "行政區域調整生效與還原";

    public void doWork(final Rl04140NewSaveDTO rl04140DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
