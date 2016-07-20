/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.xldf.dto;

import java.util.ArrayList;
import java.util.List;

import tw.gov.moi.rl.component.dto.XLDFDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.utils.XLDFDomainKeyFormatUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.ObjectUtils;

/**
 * Key obj.
 * 
 * @author JL
 */
public class XLDE009EID implements XLDFDomainKey, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /** The keys. */
    private List<String> keys = new ArrayList<String>();

    /** The xldf class. */
    private Class<? extends XLDFDomainObject> xldfClass = XLDE009E.class;

    /**
     * Instantiates a new obj
     * 
     */
    public XLDE009EID(String fineTransactionId ,String acceptSiteId ,String clauseType ,String clauseNo ) {
        super();
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(fineTransactionId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(acceptSiteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(clauseType, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(clauseNo, StringUtils.EMPTY)));

    }

    /**
     * Gets the keys.
     * 
     * @return the keys
     */
    public List<String> getKeys() {
        return keys;
    }

    /**
     * Sets the keys.
     * 
     * @param keys
     *            the new keys
     */
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    /**
     * Sets the key.
     * 
     * @param key
     *            the new key
     */
    public void addKey(String key) {
        getKeys().add(key);
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainKey#getKeyValue()
     */
    @Override
    public String getKeyValue() {
        return XLDFDomainKeyFormatUtils.getXldfKey(xldfClass, keys.toArray(new String[] {}));
    }

}
