package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07250DTO", propOrder = { "CorrectYear", "CorrectMonth", "CorrectDay", "CorrectVillage",
		"CorrectNeighbor", "FoundOverDueNotReportBorn", "FoundOverDueNotReportDead", "CorrectMarriage",
		"FoundOverDueNotReportImmigration", "FoundOverDueNotReportMigrationOut", "FoundOverDueNotReportAddressChanged",
		"EducationLookUp", "CorrectName", "CorrectDateOfBirth", "FoundNoRegisteredPeople", "FoundDuplicatedPeople",
		"OtherCorrections", "CorrectNumberOfPeople", "ReCorrectNumberOfPeople" })
@XmlRootElement(name = "Rl07250DTO")
public class Rl07250DTO {

	/** 校正日期年 */
	@XmlElement(name = "CorrectYear", required = true)
	@FieldName(" 校正日期年")
	private String correctYear;

	/** 校正日期年 */
	@XmlElement(name = "CorrectMonth", required = true)
	@FieldName("校正日期年")
	private String correctMonth;

	/** 校正日期日 */
	@XmlElement(name = "CorrectDay", required = true)
	@FieldName("校正日期日")
	private String correctDay;

	/** 村里 */
	@XmlElement(name = "CorrectVillage", required = true)
	@FieldName("村里")
	private String correctVillage;

	/** 鄰 */
	@XmlElement(name = "CorrectNeighbor", required = true)
	@FieldName("鄰")
	private String correctNeighbor;

	/** 發現出生逾期未報人數 */
	@XmlElement(name = "FoundOverDueNotReportBorn", required = true)
	@FieldName("發現出生逾期未報人數")
	private String foundOverDueNotReportBorn;

	/** 發現死亡逾期未報人數 */
	@XmlElement(name = "FoundOverDueNotReportDead", required = true)
	@FieldName("發現死亡逾期未報人數")
	private String foundOverDueNotReportDead;

	/** 變更或更正婚姻狀況件數 */
	@XmlElement(name = "CorrectMarriage", required = true)
	@FieldName("變更或更正婚姻狀況件數")
	private String correctMarriage;

	/** 發現遷入逾期未報人數 */
	@XmlElement(name = "FoundOverDueNotReportImmigration", required = true)
	@FieldName("發現遷入逾期未報人數")
	private String foundOverDueNotReportImmigration;

	/** 發現遷入逾期未報人數 */
	@XmlElement(name = "FoundOverDueNotReportMigrationOut", required = true)
	@FieldName("發現遷入逾期未報人數")
	private String foundOverDueNotReportMigrationOut;

	/** 住址變更未報人數 */
	@XmlElement(name = "FoundOverDueNotReportAddressChanged", required = true)
	@FieldName("住址變更未報人數")
	private String foundOverDueNotReportAddressChanged;

	/** 查記教育程度件數 */
	@XmlElement(name = "EducationLookUp", required = true)
	@FieldName("查記教育程度件數")
	private String educationLookUp;

	/** 變更或更正姓名件數 */
	@XmlElement(name = "CorrectName", required = true)
	@FieldName("變更或更正姓名件數")
	private String correctName;

	/** 更正出生年月日件數 */
	@XmlElement(name = "CorrectDateOfBirth", required = true)
	@FieldName("更正出生年月日件數")
	private String correctDateOfBirth;

	/** 發現無戶籍人數 */
	@XmlElement(name = "FoundNoRegisteredPeople", required = true)
	@FieldName("發現無戶籍人數")
	private String foundNoRegisteredPeople;

	/** 發現重複戶籍人數 */
	@XmlElement(name = "FoundDuplicatedPeople", required = true)
	@FieldName("發現重複戶籍人數")
	private String foundDuplicatedPeople;

	/** 其他校正事項 */
	@XmlElement(name = "OtherCorrections", required = true)
	@FieldName("其他校正事項")
	private String otherCorrections;

	/** 校正人數 */
	@XmlElement(name = "CorrectNumberOfPeople", required = true)
	@FieldName("校正人數")
	private String correctNumberOfPeople;

	/** 補校正人數 */
	@XmlElement(name = "ReCorrectNumberOfPeople", required = true)
	@FieldName("補校正人數")
	private String reCorrectNumberOfPeople;

	/** ReCorrectNumberOfPeople */
	@XmlElement(name = "ReCorrectNumberOfPeople", required = true)
	@FieldName("ReCorrectNumberOfPeople")
	private String revisionPerson;

	/** ReCorrectNumberOfPeople */
	@XmlElement(name = "ReCorrectNumberOfPeople", required = true)
	@FieldName("ReCorrectNumberOfPeople")
	private String addRevisionPerson;

	public String getCorrectVillage() {
		return correctVillage;
	}

	public void setCorrectVillage(String correctVillage) {
		this.correctVillage = correctVillage;
	}

	public String getCorrectNeighbor() {
		return correctNeighbor;
	}

	public void setCorrectNeighbor(String correctNeighbor) {
		this.correctNeighbor = correctNeighbor;
	}

	public String getFoundOverDueNotReportBorn() {
		return foundOverDueNotReportBorn;
	}

	public void setFoundOverDueNotReportBorn(String foundOverDueNotReportBorn) {
		this.foundOverDueNotReportBorn = foundOverDueNotReportBorn;
	}

	public String getFoundOverDueNotReportDead() {
		return foundOverDueNotReportDead;
	}

	public void setFoundOverDueNotReportDead(String foundOverDueNotReportDead) {
		this.foundOverDueNotReportDead = foundOverDueNotReportDead;
	}

	public String getCorrectMarriage() {
		return correctMarriage;
	}

	public void setCorrectMarriage(String correctMarriage) {
		this.correctMarriage = correctMarriage;
	}

	public String getFoundOverDueNotReportImmigration() {
		return foundOverDueNotReportImmigration;
	}

	public void setFoundOverDueNotReportImmigration(String foundOverDueNotReportImmigration) {
		this.foundOverDueNotReportImmigration = foundOverDueNotReportImmigration;
	}

	public String getFoundOverDueNotReportMigrationOut() {
		return foundOverDueNotReportMigrationOut;
	}

	public void setFoundOverDueNotReportMigrationOut(String foundOverDueNotReportMigrationOut) {
		this.foundOverDueNotReportMigrationOut = foundOverDueNotReportMigrationOut;
	}

	public String getFoundOverDueNotReportAddressChanged() {
		return foundOverDueNotReportAddressChanged;
	}

	public void setFoundOverDueNotReportAddressChanged(String foundOverDueNotReportAddressChanged) {
		this.foundOverDueNotReportAddressChanged = foundOverDueNotReportAddressChanged;
	}

	public String getEducationLookUp() {
		return educationLookUp;
	}

	public void setEducationLookUp(String educationLookUp) {
		this.educationLookUp = educationLookUp;
	}

	public String getCorrectName() {
		return correctName;
	}

	public void setCorrectName(String correctName) {
		this.correctName = correctName;
	}

	public String getCorrectDateOfBirth() {
		return correctDateOfBirth;
	}

	public void setCorrectDateOfBirth(String correctDateOfBirth) {
		this.correctDateOfBirth = correctDateOfBirth;
	}

	public String getFoundNoRegisteredPeople() {
		return foundNoRegisteredPeople;
	}

	public void setFoundNoRegisteredPeople(String foundNoRegisteredPeople) {
		this.foundNoRegisteredPeople = foundNoRegisteredPeople;
	}

	public String getFoundDuplicatedPeople() {
		return foundDuplicatedPeople;
	}

	public void setFoundDuplicatedPeople(String foundDuplicatedPeople) {
		this.foundDuplicatedPeople = foundDuplicatedPeople;
	}

	public String getOtherCorrections() {
		return otherCorrections;
	}

	public void setOtherCorrections(String otherCorrections) {
		this.otherCorrections = otherCorrections;
	}

	public String getCorrectNumberOfPeople() {
		return correctNumberOfPeople;
	}

	public void setCorrectNumberOfPeople(String correctNumberOfPeople) {
		this.correctNumberOfPeople = correctNumberOfPeople;
	}

	public String getReCorrectNumberOfPeople() {
		return reCorrectNumberOfPeople;
	}

	public void setReCorrectNumberOfPeople(String reCorrectNumberOfPeople) {
		this.reCorrectNumberOfPeople = reCorrectNumberOfPeople;
	}

	public String getCorrectYear() {
		return correctYear;
	}

	public void setCorrectYear(String correctYear) {
		this.correctYear = correctYear;
	}

	public String getCorrectMonth() {
		return correctMonth;
	}

	public void setCorrectMonth(String correctMonth) {
		this.correctMonth = correctMonth;
	}

	public String getCorrectDay() {
		return correctDay;
	}

	public void setCorrectDay(String correctDay) {
		this.correctDay = correctDay;
	}

	public String getRevisionPerson() {
		return revisionPerson;
	}

	public void setRevisionPerson(String revisionPerson) {
		this.revisionPerson = revisionPerson;
	}

	public String getAddRevisionPerson() {
		return addRevisionPerson;
	}

	public void setAddRevisionPerson(String addRevisionPerson) {
		this.addRevisionPerson = addRevisionPerson;
	}

}
