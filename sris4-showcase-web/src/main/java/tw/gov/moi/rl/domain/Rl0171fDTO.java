package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 稱謂更正登記DTO
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171fDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171fAppDataDTO" })
@XmlRootElement(name = "Rl0171fDTO")
public class Rl0171fDTO implements Serializable {

    private static final long serialVersionUID = -4222450748995865352L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 稱謂更正登記 AppDataDTO. */
    @XmlElement(name = "Rl0171fAppDataDTO")
    @FieldName("稱謂更正登記 AppDataDTO")
    private Rl0171fAppDataDTO rl0171fAppDataDTO = new Rl0171fAppDataDTO();

    /**
     * Gets the household operation dto.
     * 
     * @return the household operation dto
     */
    public HouseholdOperationDTO getHouseholdOperationDTO() {
        return householdOperationDTO;
    }

    /**
     * Sets the household operation dto.
     * 
     * @param householdOperationDTO
     *            the new household operation dto
     */
    public void setHouseholdOperationDTO(final HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

    /**
     * Gets the household app data dto.
     * 
     * @return the household app data dto
     */
    public HouseholdAppDataDTO getHouseholdAppDataDTO() {
        return householdAppDataDTO;
    }

    /**
     * Sets the household app data dto.
     * 
     * @param householdAppDataDTO
     *            the new household app data dto
     */
    public void setHouseholdAppDataDTO(final HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }

    /**
     * Gets the rl0171f app data dto.
     * 
     * @return the rl0171f app data dto
     */
    public Rl0171fAppDataDTO getRl0171fAppDataDTO() {
        return rl0171fAppDataDTO;
    }

    /**
     * Sets the rl0171f app data dto.
     * 
     * @param rl0171fAppDataDTO
     *            the new rl0171f app data dto
     */
    public void setRl0171fAppDataDTO(final Rl0171fAppDataDTO rl0171fAppDataDTO) {
        this.rl0171fAppDataDTO = rl0171fAppDataDTO;
    }
}
