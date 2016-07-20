package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class RelationShipDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1682618985882580651L;
    @FieldName("統號")
    private String personId;
    @FieldName("稱謂")
    private String relationShip;
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getRelationShip() {
        return relationShip;
    }
    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

}
