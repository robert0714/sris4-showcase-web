package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class DistinguishNameDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1681618985882580651L;
    @FieldName("統號")
    private String personId;
    @FieldName("姓")
    private String lastName;
    @FieldName("名")
    private String firstName;
    @FieldName("姓名")
    private String fullName;
    
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
}
