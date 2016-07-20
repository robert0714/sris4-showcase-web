package tw.gov.moi.rl.domain.xldf;

public interface PersonNameDetail {

    /**
     * @return the nameType
     */
    public String getNameType();

    /**
     * @return the firstName
     */
    public String getFirstName();

    /**
     * @return the lastName
     */
    public String getLastName();

    public void setNameType(final String nameType);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

}