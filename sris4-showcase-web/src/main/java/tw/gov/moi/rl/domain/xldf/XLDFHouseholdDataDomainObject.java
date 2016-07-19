package tw.gov.moi.rl.domain.xldf;

import java.io.Serializable;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public interface XLDFHouseholdDataDomainObject extends Serializable {
    /**
     * 取得行政區域代碼前5碼
     * 
     * @return String
     */
    public String getCountyCode();

    /**
     * 取得行政區域代碼6-8碼
     * 
     * @return
     */
    public String getTownCode();

    public XLDFDomainObject getDomainObject();

    public String getAction();

    public String getAdminOfficeCode();

    public String getAreaCode();

    public String getConcurrentHeadMark();

    public String getHouseholdHeadId();

    public String getHouseholdId();

    public String getHouseholdType();

    public String getNeighbor();

    public String getRemoveTime();

    public String getRemoveYyymmdd();

    public String getReservedField();

    public Integer getSelectMode();

    public Integer getSequenceId();

    public Integer getSerialNo();

    public String getSiteId();

    public String getState();

    public String getStreetDoorplate();

    public String getTransactionId();

    public String getVillage();

    public boolean isLockMode();

    public void setAction(final String action);

    public void setAdminOfficeCode(final String adminOfficeCode);

    public void setAreaCode(final String areaCode);

    public void setConcurrentHeadMark(final String concurrentHeadMark);

    public void setHouseholdHeadId(final String householdHeadId);

    public void setHouseholdId(final String householdId);

    public void setHouseholdType(final String householdType);

    public void setLockMode(boolean lockMode);

    public void setNeighbor(final String neighbor);

    public void setRemoveTime(final String removeTime);

    public void setRemoveYyymmdd(final String removeYyymmdd);

    public void setReservedField(final String reservedField);

    public void setSelectMode(final Integer selectMode);

    public void setSequenceId(final Integer sequenceId);

    public void setSerialNo(final Integer serialNo);

    public void setSiteId(final String siteId);

    public void setState(final String state);

    public void setStreetDoorplate(final String streetDoorplate);

    public void setTransactionId(final String transactionId);

    public void setVillage(final String village);

}