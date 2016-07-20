package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.domain.Xldf001mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF001MDTO")
public class XLDF001MDTO extends XLDFHouseholdDataDTO {

    private static final long serialVersionUID = 1L;

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF001M result = new XLDF001M();
        result.setDomainObj(new Xldf001mType());
        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }

}
