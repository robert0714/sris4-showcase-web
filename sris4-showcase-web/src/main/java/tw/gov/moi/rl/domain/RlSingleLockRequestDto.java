package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class RlSingleLockRequestDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlSingleLockRequestDto", propOrder = { "destSiteId", "classTypeCanonicalName", "keys", "values" })
@XmlRootElement(name = "RlSingleLockRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlSingleLockRequestDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1318961171129863863L;

    /**  目的端作業點代碼. */
    @FieldName("目的端作業點代碼")
    @XmlElement(name = "DestSiteId")
    private String destSiteId;

    /** The class type canonical name. */
    @FieldName("指定物件中的型別名稱")
    @XmlElement(name = "ClassTypeCanonicalName", required = true)
    private String classTypeCanonicalName;

    /**  鎖定的資料的資料物件 keys. */
    @FieldName("鎖定的資料的資料物件 keys")
    @XmlElement(name = "Keys")
    private String[] keys;

    /**  鎖定的資料的資料物件 keys's values. */
    @FieldName("鎖定的資料的資料物件 keys's values")
    @XmlElement(name = "Values")
    private String[] values;

    /**
     * Gets the dest site id.
     *
     * @return the dest site id
     */
    public String getDestSiteId() {
        return this.destSiteId;
    }

    /**
     * Sets the dest site id.
     *
     * @param destSiteId the new dest site id
     */
    public void setDestSiteId(String destSiteId) {
        this.destSiteId = destSiteId;
    }

    /**
     * Gets the class type canonical name.
     *
     * @return the class type canonical name
     */
    public String getClassTypeCanonicalName() {
        return this.classTypeCanonicalName;
    }

    /**
     * Sets the class type canonical name.
     *
     * @param classTypeCanonicalName the new class type canonical name
     */
    public void setClassTypeCanonicalName(String classTypeCanonicalName) {
        this.classTypeCanonicalName = classTypeCanonicalName;
    }

    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public String[] getKeys() {
        return this.keys;
    }

    /**
     * Sets the keys.
     *
     * @param keys the new keys
     */
    public void setKeys(String[] keys) {
        if (keys != null) {
            this.keys = keys.clone();
        } else {
            this.keys = null;
        }
    }

    /**
     * Gets the values.
     *
     * @return the values
     */
    public String[] getValues() {
        return this.values;
    }

    /**
     * Sets the values.
     *
     * @param values the new values
     */
    public void setValues(String[] values) {
        if (values != null) {
            this.values = values.clone();
        } else {
            this.values = null;
        }
    }

}
