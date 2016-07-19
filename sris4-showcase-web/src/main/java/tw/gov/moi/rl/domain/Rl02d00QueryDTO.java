package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlRootElement(name = "Rl02d00QueryDTO")
public class Rl02d00QueryDTO implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -1987273174904105584L;

    @FieldName("查詢國籍")
    @XmlElement(name = "queryNationalityCode", required = true)
    private String queryNationalityCode = "";

    @FieldName("查詢出生地")
    @XmlElement(name = "queryBirthPlace", required = true)
    private String queryBirthPlace = "";

    @FieldName("查詢街路門牌")
    @XmlElement(name = "queryStreet", required = true)
    private String queryStreet = "";

    @FieldName("查詢村里")
    @XmlElement(name = "queryVillage", required = true)
    private String queryVillage = "";

    @FieldName("查詢街路門牌")
    @XmlElement(name = "queryAreaCode", required = true)
    private String queryAreaCode = "";

    @FieldName("查詢國結果")
    @XmlElement(name = "queryNationalityCodeResult", required = true)
    private String queryNationalityCodeResult = "";

    @FieldName("查詢出生地結果")
    @XmlElement(name = "queryBirthPlaceResult", required = true)
    private String queryBirthPlaceResult = "";

    @FieldName("查詢街路門牌結果")
    @XmlElement(name = "queryStreetResult", required = true)
    private String queryStreetResult = "";

    @FieldName("查詢村里結果")
    @XmlElement(name = "queryVillageResult", required = true)
    private String queryVillageResult = "";

    @FieldName("查詢街路門牌結果")
    @XmlElement(name = "queryAreaCodeResult", required = true)
    private String queryAreaCodeResult = "";

    public String getQueryNationalityCode() {
	return queryNationalityCode;
    }

    public void setQueryNationalityCode(String queryNationalityCode) {
	this.queryNationalityCode = queryNationalityCode;
    }

    public String getQueryBirthPlace() {
	return queryBirthPlace;
    }

    public void setQueryBirthPlace(String queryBirthPlace) {
	this.queryBirthPlace = queryBirthPlace;
    }

    public String getQueryStreet() {
	return queryStreet;
    }

    public void setQueryStreet(String queryStreet) {
	this.queryStreet = queryStreet;
    }

    public String getQueryVillage() {
	return queryVillage;
    }

    public void setQueryVillage(String queryVillage) {
	this.queryVillage = queryVillage;
    }

    public String getQueryAreaCode() {
	return queryAreaCode;
    }

    public void setQueryAreaCode(String queryAreaCode) {
	this.queryAreaCode = queryAreaCode;
    }

    public String getQueryNationalityCodeResult() {
	return queryNationalityCodeResult;
    }

    public void setQueryNationalityCodeResult(String queryNationalityCodeResult) {
	this.queryNationalityCodeResult = queryNationalityCodeResult;
    }

    public String getQueryBirthPlaceResult() {
	return queryBirthPlaceResult;
    }

    public void setQueryBirthPlaceResult(String queryBirthPlaceResult) {
	this.queryBirthPlaceResult = queryBirthPlaceResult;
    }

    public String getQueryStreetResult() {
	return queryStreetResult;
    }

    public void setQueryStreetResult(String queryStreetResult) {
	this.queryStreetResult = queryStreetResult;
    }

    public String getQueryVillageResult() {
	return queryVillageResult;
    }

    public void setQueryVillageResult(String queryVillageResult) {
	this.queryVillageResult = queryVillageResult;
    }

    public String getQueryAreaCodeResult() {
	return queryAreaCodeResult;
    }

    public void setQueryAreaCodeResult(String queryAreaCodeResult) {
	this.queryAreaCodeResult = queryAreaCodeResult;
    }
}
