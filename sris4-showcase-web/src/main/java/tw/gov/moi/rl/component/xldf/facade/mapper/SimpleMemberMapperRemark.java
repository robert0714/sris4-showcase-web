package tw.gov.moi.rl.component.xldf.facade.mapper;

import java.util.Arrays;

import tw.gov.moi.domain.Xldf001hType;
import tw.gov.moi.domain.Xldf001mType;
import tw.gov.moi.domain.Xldf002hType;
import tw.gov.moi.domain.Xldf002mType;
import tw.gov.moi.domain.Xldf004hType;
import tw.gov.moi.domain.Xldf004mType;
import tw.gov.moi.domain.Xldf005hType;
import tw.gov.moi.domain.Xldf005mType;
import tw.gov.moi.rl.common.constant.RlConstant;

public class SimpleMemberMapperRemark extends SimpleMemberMapper {
    private static final long serialVersionUID = 1L;
    private final Class<?>[] mTypes = { Xldf001mType.class, Xldf002mType.class, Xldf004mType.class, Xldf005mType.class };
    private final Class<?>[] hTypes = { Xldf001hType.class, Xldf002hType.class, Xldf004hType.class, Xldf005hType.class };


    public Object getMember(Object dataOwner) throws Throwable {
        String result = "";

        if (Arrays.asList(mTypes).contains(dataOwner.getClass())) {
            result = RlConstant.CURRENT_HOUSEHOLD;
        } else if (Arrays.asList(hTypes).contains(dataOwner.getClass())) {
            result = RlConstant.REMOVED_HOUSEHOLD;
        }
        return result;
    }

}
