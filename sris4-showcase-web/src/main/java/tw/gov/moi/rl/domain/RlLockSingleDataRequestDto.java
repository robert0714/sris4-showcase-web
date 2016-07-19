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
 * The Class RlLockSingleDataRequestDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlLockSingleDataRequestDto", propOrder = { "destSiteId", "targetClassTypeCanonicalName", "keys", "values",
        "actionIp" })
@XmlRootElement(name = "RlLockSingleDataRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlLockSingleDataRequestDto implements Serializable {

    /**  */
    private static final long serialVersionUID = 1348035271770326911L;

    /**  目的端作業點代碼. */
    @FieldName("目的端作業點代碼")
    @XmlElement(name = "DestSiteId", required = true)
    private String destSiteId;

    /**  鎖定的資料的資料物件名稱. */
    @FieldName("鎖定的資料的資料物件名稱")
    @XmlElement(name = "TargetClassTypeCanonicalName", required = true)
    private String targetClassTypeCanonicalName;

    /**  鎖定的資料的資料物件 keys. */
    @FieldName("鎖定的資料的資料物件屬性名稱 keys")
    @XmlElement(name = "Keys", required = true)
    private String[] keys;

    /**  鎖定的資料的資料物件 keys's values. */
    @FieldName("鎖定的資料的資料物件 keys's values")
    @XmlElement(name = "Values", required = true)
    private String[] values;

    /**  the action ip. */
    @FieldName("the action ip")
    @XmlElement(name = "ActionIp", required = true)
    private String actionIp;

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
     * Gets the target class type canonical name.
     *
     * @return the target class type canonical name
     */
    public String getTargetClassTypeCanonicalName() {
        return this.targetClassTypeCanonicalName;
    }

    /**
     * Sets the target class type canonical name.
     *
     * @param targetClassTypeCanonicalName the new target class type canonical name
     */
    public void setTargetClassTypeCanonicalName(String targetClassTypeCanonicalName) {
        this.targetClassTypeCanonicalName = targetClassTypeCanonicalName;
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

    /**
     * Gets the action ip.
     *
     * @return the action ip
     */
    public String getActionIp() {
        return this.actionIp;
    }

    /**
     * Sets the action ip.
     *
     * @param actionIp the new action ip
     */
    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

}
