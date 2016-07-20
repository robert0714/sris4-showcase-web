package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class BirthPlaceDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 609569295080531753L;
    @FieldName("統號")
    private String personId;
    @FieldName("出生地")
    private String birthPlace;
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getBirthPlace() {
        return birthPlace;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
}
