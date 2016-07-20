package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class Rlrp08991Bean implements Serializable {

    private static final long serialVersionUID = -3270892544918764226L;

    /** 村里 */
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @FieldName("鄰別")
    private String neighbor;

    /** 街路門牌 */
    @FieldName("街　　　路　　　門　　　牌")
    private String streetDoorplate;

    /** 戶長統號 */
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶長姓名 */
    @FieldName("戶長姓名")
    private String householdHeadName;

    /** 戶號 */
    @FieldName("戶號")
    private String householdId;

    /** 人口數 */
    @FieldName("人口數")
    private String count;

    /** 標準門牌. */
    private String standardStreetDoorplate;

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getStandardStreetDoorplate() {
        return standardStreetDoorplate;
    }

    public void setStandardStreetDoorplate(String standardStreetDoorplate) {
        this.standardStreetDoorplate = standardStreetDoorplate;
    }
}
