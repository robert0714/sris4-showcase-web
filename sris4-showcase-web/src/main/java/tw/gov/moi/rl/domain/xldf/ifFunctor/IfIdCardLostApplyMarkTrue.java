package tw.gov.moi.rl.domain.xldf.ifFunctor;

import java.io.Serializable;
import java.lang.reflect.Field;

import tw.gov.moi.rl.common.IfFunctor;
import tw.gov.moi.rl.common.constant.RlConstant;

public class IfIdCardLostApplyMarkTrue implements Serializable, IfFunctor {
    private static final long serialVersionUID = 1L;

    private static final String MARK_YES = "Y";

    @Override
    public boolean evaluate(Object obj) {
        boolean result = false;
        try {
            Field markField = obj.getClass().getDeclaredField("idCardLostApplyMark");
            markField.setAccessible(RlConstant.ACCESSIBLE);
            if (markField.get(obj) != null) {
                result = markField.get(obj).equals(MARK_YES);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}
