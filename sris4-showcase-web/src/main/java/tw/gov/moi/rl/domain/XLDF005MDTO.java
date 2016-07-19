package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.domain.Xldf005mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF005M;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF005MDTO")
public class XLDF005MDTO extends XLDFPersonNoteDTO {

    private static final long serialVersionUID = 1L;

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF005M result = new XLDF005M();
        result.setDomainObj(new Xldf005mType());

        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }
        return result;
    }

}
