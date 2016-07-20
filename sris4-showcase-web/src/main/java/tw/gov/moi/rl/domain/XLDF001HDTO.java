package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf001hType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF001H;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF001HDTO", propOrder = { "removeYyymmdd", "removeTime" })
public class XLDF001HDTO extends XLDFHouseholdDataDTO {

    private static final long serialVersionUID = 1L;

    /** 除戶日期 */
    @XmlElement(name = "RemoveYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間 */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /**
     * @return the removeYyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * @param removeYyymmdd
     *            the removeYyymmdd to set
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF001H result = new XLDF001H();
        result.setDomainObj(new Xldf001hType());
        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.dto.rl00001.XLDFHouseholdDataDTO#getRemoveDTO()
     */
    @Override
    public XLDFRemoveDTO getRemoveDTO() {
        return new XLDFSimpleRemoveDTO(removeYyymmdd, removeTime);
    }

}
