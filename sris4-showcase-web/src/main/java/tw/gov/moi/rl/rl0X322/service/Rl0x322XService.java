package tw.gov.moi.rl.rl0X322.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x323XDTO;

public interface Rl0x322XService {
    public void getStdDoorPlace(Rl0x323XDTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 修改所有rldf020m
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    void modify20mStandDoorPlate(Rl0x323XDTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 修改所有rldf019m
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    void modify19mStandDoorPlate(Rl0x323XDTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 修改所有rldf019m
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    void modify18mStandDoorPlate(Rl0x323XDTO dto, final ExecutantType exe) throws RisBusinessException;
}
