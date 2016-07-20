package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.RlGetSingleDataResponseDto;
import tw.gov.moi.rl.domain.RlRequestRetrieveTableDataBySQLDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;

/**
 * The Class XLDFMultiCreationIntermeidateData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFMultiCreationIntermeidateData", propOrder = { "indexAlreadyExistXLDFDomainObjectInRecordMap",
        "indexRLDFFromXLDFAccordingToSiteIdInSameHostResult", "indexRLDFHibernateMap", "lockByOtherInfos", "xldfopracsKeyDataSet" })
@XmlRootElement(name = "XLDFMultiCreationIntermeidateData")
public class XLDFMultiCreationIntermeidateData implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5840191353093379330L;

    /** The index already exist xldf domain object in record map. */
    @FieldName("現有merged好的XLDF資料")
    @XmlElement(name = "indexAlreadyExistXLDFDomainObjectInRecordMap", required = true)
    private Map<Integer, Object> indexAlreadyExistXLDFDomainObjectInRecordMap;

    /** The index parameters in order to get rldf from xldf according to site id in different host result. */
    @FieldName("依已存在的XLDF資料查詢不同主機點的RLDF相關資訊")
    @XmlElement(name = "indexRLDFHibernateMap", required = true)
    private Map<Integer, RlGetSingleDataResponseDto[]> indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;

    /** The index rldf from xldf according to site id in same host result. */
    @FieldName("依已存在的XLDF資料查詢相同主機點的RLDF相關資訊")
    @XmlElement(name = "indexRLDFFromXLDFAccordingToSiteIdInSameHostResult", required = true)
    private Map<Integer, List<? extends Object>> indexRLDFFromXLDFAccordingToSiteIdInSameHostResult;

    /** The index rldf hibernate map. */
    @FieldName("依查詢條件查詢而來的RLDF相關資訊")
    @XmlElement(name = "indexRLDFHibernateMap", required = true)
    private Map<Integer, MultiDataDto> indexRLDFHibernateMap;

    /** The lock by other infos. */
    @FieldName("被他人鎖定資訊")
    @XmlElement(name = "LockByOtherInfos", required = true)
    private RsLockInforDTO[] lockByOtherInfos;

    /** The xldfopracs key data set. */
    @FieldName("XLDF索引紀錄PK紀錄")
    @XmlElement(name = "xldfopracsKeyDataSet", required = true)
    private final Set<String> xldfopracsKeyDataSet = new HashSet<String>();

    /**
     * Gets the index already exist xldf domain object in record map.
     *
     * @return the index already exist xldf domain object in record map
     */
    public Map<Integer, Object> getIndexAlreadyExistXLDFDomainObjectInRecordMap() {
        return  this.indexAlreadyExistXLDFDomainObjectInRecordMap;
    }

    /**
     * Sets the index already exist xldf domain object in record map.
     *
     * @param indexAlreadyExistXLDFDomainObjectInRecordMap the index already exist xldf domain object in record map
     */
    public void setIndexAlreadyExistXLDFDomainObjectInRecordMap(Map<Integer, Object> indexAlreadyExistXLDFDomainObjectInRecordMap) {
        this.indexAlreadyExistXLDFDomainObjectInRecordMap = indexAlreadyExistXLDFDomainObjectInRecordMap;
    }

    /**
     * Gets the index parameters in order to get rldf from xldf according to site id in different host result.
     *
     * @return the index parameters in order to get rldf from xldf according to site id in different host result
     */
    public Map<Integer, RlGetSingleDataResponseDto[]> getIndexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult() {
        return  this.indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;
    }

    /**
     * Sets the index parameters in order to get rldf from xldf according to site id in different host result.
     *
     * @param indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult the index parameters in order to get rldf from xldf according to site id in different host result
     */
    public void setIndexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult(
            Map<Integer, RlGetSingleDataResponseDto[]> indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult) {
        this.indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult = indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;
    }

    /**
     * Gets the index rldf hibernate map.
     *
     * @return the index rldf hibernate map
     */
    public Map<Integer, MultiDataDto> getIndexRLDFHibernateMap() {
        return  this.indexRLDFHibernateMap;
    }

    /**
     * Sets the index rldf hibernate map.
     *
     * @param indexRLDFHibernateMap the index rldf hibernate map
     */
    public void setIndexRLDFHibernateMap(Map<Integer, MultiDataDto> indexRLDFHibernateMap) {
        this.indexRLDFHibernateMap = indexRLDFHibernateMap;
    }

    /**
     * Gets the index rldf from xldf according to site id in same host result.
     *
     * @return the index rldf from xldf according to site id in same host result
     */
    public Map<Integer, List<? extends Object>> getIndexRLDFFromXLDFAccordingToSiteIdInSameHostResult() {
        return  this.indexRLDFFromXLDFAccordingToSiteIdInSameHostResult;
    }

    /**
     * Sets the index rldf from xldf according to site id in same host result.
     *
     * @param indexRLDFFromXLDFAccordingToSiteIdInSameHostResult the index rldf from xldf according to site id in same host result
     */
    public void setIndexRLDFFromXLDFAccordingToSiteIdInSameHostResult(
            Map<Integer, List<? extends Object>> indexRLDFFromXLDFAccordingToSiteIdInSameHostResult) {
        this.indexRLDFFromXLDFAccordingToSiteIdInSameHostResult = indexRLDFFromXLDFAccordingToSiteIdInSameHostResult;
    }

    /**
     * Gets the lock by other infos.
     *
     * @return the lock by other infos
     */
    public RsLockInforDTO[] getLockByOtherInfos() {
        return  this.lockByOtherInfos;
    }

    /**
     * Sets the lock by other infos.
     *
     * @param lockByOtherInfos the new lock by other infos
     */
    public void setLockByOtherInfos(RsLockInforDTO[] lockByOtherInfos) {
        if (lockByOtherInfos != null) {
            final RsLockInforDTO[] dest = new RsLockInforDTO[lockByOtherInfos.length];
            System.arraycopy(lockByOtherInfos, 0, dest, 0, lockByOtherInfos.length);
            this.lockByOtherInfos = dest;
        } else {
            this.lockByOtherInfos = null;
        }
    }

    /**
     * Gets the xldfopracs key data set.
     *
     * @return the xldfopracs key data set
     */
    public Set<String> getXldfopracsKeyDataSet() {
        return this.xldfopracsKeyDataSet;
    }
}
