/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.xldf.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import tw.gov.moi.ae.checker.annotation.FieldName;
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
 
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFM02H", propOrder = {
        "keys","xldfClass"
})
@XmlRootElement(name = "XLDFM02H") 
public class XLDFM02HID implements XLDFDomainKey, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /** The keys. */
    
    @XmlElement(name = "Keys")
    @FieldName("XLDF鍵值")
    private List<String> keys = new ArrayList<String>();

    /** The xldf class. */
    @XmlElement(name = "XldfClass")
    @FieldName("xldf型別變數")
    private Class<? extends XLDFDomainObject> xldfClass = XLDFM02H.class;

    /**
     * Instantiates a new obj
     * 
     */
    public XLDFM02HID(String personId ,String siteId ,String spouseId ,String updateYyymmdd ,String updateHhmmss ,String removeYyymmdd ,String removeTime ) {
        super();
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(personId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(siteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(spouseId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(updateYyymmdd, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(updateHhmmss, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(removeYyymmdd, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(removeTime, StringUtils.EMPTY)));

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
