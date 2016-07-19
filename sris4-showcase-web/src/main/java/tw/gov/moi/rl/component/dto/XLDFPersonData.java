package tw.gov.moi.rl.component.dto;

public class XLDFPersonData {

    private String personId;

    private String areaCode;

    private String name;

    private String birthday;

    private String relationWithTargetPerson;

    // private String removeYymmdd;
    //
    // private String removeTime;

    private Address address;

    public XLDFPersonData() {
        super();
    }

    public XLDFPersonData(String personId, String areaCode, String name, String birthday,
            String relationWithTargetPerson, String neighborhood, String street, String village) {
        super();
        this.personId = personId;
        this.areaCode = areaCode;
        this.name = name;
        this.birthday = birthday;
        this.relationWithTargetPerson = relationWithTargetPerson;
        this.address = new Address(neighborhood, street, village);
    }

    public XLDFPersonData(String personId, String areaCode, String name, String birthday,
            String relationWithTargetPerson, Address address) {
        super();
        this.personId = personId;
        this.areaCode = areaCode;
        this.name = name;
        this.birthday = birthday;
        this.relationWithTargetPerson = relationWithTargetPerson;
        this.address = address;
    }

    // public XLDFPersonData(String personId, String areaCode, String name,
    // String birthday,
    // String relationWithTargetPerson, String removeYymmdd, String removeTime,
    // String neighborhood,
    // String street, String village) {
    // super();
    // this.personId = personId;
    // this.areaCode = areaCode;
    // this.name = name;
    // this.birthday = birthday;
    // this.relationWithTargetPerson = relationWithTargetPerson;
    // this.removeYymmdd = removeYymmdd;
    // this.removeTime = removeTime;
    // this.address = new Address(neighborhood, street, village);
    // }
    //
    // public XLDFPersonData(String personId, String areaCode, String name,
    // String birthday,
    // String relationWithTargetPerson, String removeYymmdd, String removeTime,
    // Address address) {
    // super();
    // this.personId = personId;
    // this.areaCode = areaCode;
    // this.name = name;
    // this.birthday = birthday;
    // this.relationWithTargetPerson = relationWithTargetPerson;
    // this.removeYymmdd = removeYymmdd;
    // this.removeTime = removeTime;
    // this.address = address;
    // }

    // public String getRemoveYymmdd() {
    // return removeYymmdd;
    // }
    //
    // public void setRemoveYymmdd(String removeYymmdd) {
    // this.removeYymmdd = removeYymmdd;
    // }
    //
    // public String getRemoveTime() {
    // return removeTime;
    // }
    //
    // public void setRemoveTime(String removeTime) {
    // this.removeTime = removeTime;
    // }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRelationWithTargetPerson() {
        return relationWithTargetPerson;
    }

    public void setRelationWithTargetPerson(String relationWithTargetPerson) {
        this.relationWithTargetPerson = relationWithTargetPerson;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
