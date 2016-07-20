/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.Map;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class PersonOperationDTO.
 */
public class PersonOperationDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3810666992091041136L;

    /** 作業清單. */
    @FieldName("作業清單")
    private Map<String, Boolean> personOperationMap;

    /** 是否重新起始作業清單. */
    @FieldName("是否重新起始作業清單")
    private boolean needRenewOperationMenu = false;

    /**
     * Instantiates a new person operation dto.
     * 
     * @param pPersonOperationMap
     *            the person operation map
     */
    public PersonOperationDTO(final Map<String, Boolean> pPersonOperationMap) {
        this.personOperationMap = pPersonOperationMap;
    }

    /**
     * Gets the person operation map.
     * 
     * @return the person operation map
     */
    public Map<String, Boolean> getPersonOperationMap() {
        return personOperationMap;
    }

    /**
     * Sets the person operation map.
     * 
     * @param personOperationMap
     *            the person operation map
     */
    public void setPersonOperationMap(final Map<String, Boolean> personOperationMap) {
        this.personOperationMap = personOperationMap;
    }

    /**
     * Checks if is need renew operation menu.
     * 
     * @return true, if is need renew operation menu
     */
    public boolean isNeedRenewOperationMenu() {
        return needRenewOperationMenu;
    }

    /**
     * Sets the need renew operation menu.
     * 
     * @param needRenewOperationMenu
     *            the new need renew operation menu
     */
    public void setNeedRenewOperationMenu(final boolean needRenewOperationMenu) {
        this.needRenewOperationMenu = needRenewOperationMenu;
    }
}
