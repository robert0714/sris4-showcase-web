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
@XmlType(name = "XLDFM10MT", propOrder = {
        "keys","xldfClass"
})
@XmlRootElement(name = "XLDFM10MT") 
public class XLDFM10MTID implements XLDFDomainKey, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /** The keys. */
    
    @XmlElement(name = "Keys")
    @FieldName("XLDF鍵值")
    private List<String> keys = new ArrayList<String>();

    /** The xldf class. */
    @XmlElement(name = "XldfClass")
    @FieldName("xldf型別變數")
    private Class<? extends XLDFDomainObject> xldfClass = XLDFM10MT.class;

    /**
     * Instantiates a new obj
     * 
     */
    public XLDFM10MTID(String personId ,String siteId ,String dataSiteId ,String applyTransactionId ,Integer applySequenceId ,Integer applySeq ,String applyType,String applyCode ,String registerDate,String registerTime) {
        super();
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(personId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(siteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(dataSiteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applyTransactionId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applySequenceId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applySeq, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applyType, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applyCode, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(registerDate, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(registerTime, StringUtils.EMPTY)));
    }
    /**
     * Instantiates a new obj
     * 
     */
    public XLDFM10MTID(String personId ,String siteId ,String dataSiteId ,String applyTransactionId ,Integer applySequenceId ,Integer applySeq ,String applyType ) {
        super();
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(personId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(siteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(dataSiteId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applyTransactionId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applySequenceId, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applySeq, StringUtils.EMPTY)));
        keys.add(String.valueOf(ObjectUtils.defaultIfNull(applyType, StringUtils.EMPTY)));
         
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
