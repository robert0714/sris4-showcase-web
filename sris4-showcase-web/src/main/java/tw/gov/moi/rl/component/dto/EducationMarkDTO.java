package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class EducationMarkDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8595754750468475827L;
    @FieldName("統號")
    private String personId;
    @FieldName("教育程度注記")
    private String educationMark;
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getEducationMark() {
        return educationMark;
    }
    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }
   

}
