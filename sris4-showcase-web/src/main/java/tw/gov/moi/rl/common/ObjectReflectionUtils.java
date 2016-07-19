package tw.gov.moi.rl.common;

import java.lang.reflect.Field;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;

public final class ObjectReflectionUtils {
    public static Object getFieldValue(final Object obj, final String fieldName) {
        Object result = null;
        Field fld;
        try {
            fld = obj.getClass().getDeclaredField(fieldName);
            fld.setAccessible(RlConstant.ACCESSIBLE);
            result = fld.get(obj);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6091E);
        }
        return result;
    }

    public static void setFieldValue(final Object obj, final String fieldName, final Object value) {
        Field fld;
        try {
            fld = obj.getClass().getDeclaredField(fieldName);
            fld.setAccessible(RlConstant.ACCESSIBLE);
            fld.set(obj, value);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6091E);
        }
    }
}
