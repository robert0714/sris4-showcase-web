package tw.gov.moi.aeweb.showcase.common;

public class PeopleVO {

	private String id;
	private String name;
	private java.util.Date birthday;
	private String birthplace;
	private String address;
	private String spouse;
	private String father;
	private String mother;
	
	public PeopleVO(String id, String name, java.util.Date birthday, String birthplace,
			String address, String spouse, String father, String mother) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.address = address;
		this.spouse = spouse;
		this.father = father;
		this.mother = mother;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}
	
	
	
	
}
