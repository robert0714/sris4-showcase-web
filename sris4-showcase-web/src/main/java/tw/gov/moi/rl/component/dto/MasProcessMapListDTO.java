/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author marcus
 * 
 */
public class MasProcessMapListDTO {

    private Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> outHousehold;

    private Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> inHousehold;

    public MasProcessMapListDTO() {
        super();
        this.outHousehold = new HashMap<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>>();
        this.inHousehold = new HashMap<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>>();
    }

    /**
     * @return the outHousehold
     */
    public Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> getOutHousehold() {
        return outHousehold;
    }

    /**
     * @param outHousehold
     *            the outHousehold to set
     */
    public void setOutHousehold(Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> outHousehold) {
        this.outHousehold = outHousehold;
    }

    /**
     * @return the inHousehold
     */
    public Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> getInHousehold() {
        return inHousehold;
    }

    /**
     * @param inHousehold
     *            the inHousehold to set
     */
    public void setInHousehold(Map<MasMovHouseholdIdDTO, List<MasMovPersonldIdDTO>> inHousehold) {
        this.inHousehold = inHousehold;
    }

}
