package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class Rlrp08993PersonBean implements Serializable {

    private static final long serialVersionUID = -1891713391094821753L;

    /** 統一編號 */
    @FieldName("統一編號")
    private String personId;

    /** 姓名 */
    @FieldName("姓名")
    private String personName;

    /** 出生日期 */
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 稱謂 */
    @FieldName("稱謂")
    private String relationship;

    /** 遷入日期 */
    @FieldName("遷入日期")
    private String moveInYyymmdd;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getMoveInYyymmdd() {
        return moveInYyymmdd;
    }

    public void setMoveInYyymmdd(String moveInYyymmdd) {
        this.moveInYyymmdd = moveInYyymmdd;
    }
}
