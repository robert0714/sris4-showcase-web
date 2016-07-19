package tw.gov.moi.rl.component.xldf.facade.mapper;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.domain.Xldf001hType;
import tw.gov.moi.domain.Xldf001mType;
import tw.gov.moi.domain.Xldf001mtType;

public class SimpleMemberMapperTownCode extends SimpleMemberMapper {
    private static final long serialVersionUID = 1L;

    public Object getMember(Object dataOwner) throws Throwable {

        String result = StringUtils.EMPTY;
        String areaCode = StringUtils.EMPTY;

        if (dataOwner instanceof Xldf001mType) {
            areaCode = ((Xldf001mType) dataOwner).getAreaCode();
        } else if (dataOwner instanceof Xldf001hType) {
            areaCode = ((Xldf001hType) dataOwner).getAreaCode();
        } else if (dataOwner instanceof Xldf001mtType) {
            areaCode = ((Xldf001mtType) dataOwner).getAreaCode();
        }

        if (StringUtils.isNotBlank(areaCode) && areaCode.length() > 4) {
            result = areaCode.substring(areaCode.length() - 3, areaCode.length());
        }

        return result;
    }


}
