package tw.gov.moi.rl.domain.xldf;

public interface FosterParents {

    public String getFosterParentMark();

    public void setFosterParentMark(String fosterParentMark);

    public RelPerson getFosterFather();

    public void setFosterFather(RelPerson father);

    public RelPerson getFosterMother();

    public void setFosterMother(RelPerson mother);

}
