package tw.gov.moi.rl.component.xldf.facade.mapper;

import java.io.Serializable;
import java.lang.reflect.Field;

import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.xldf.facade.CompositeMemberMapper;

public class SimpleMemberMapper implements Serializable, CompositeMemberMapper {
    private static final long serialVersionUID = 1L;

    private String dataOwnerFieldName;

    /**
     * @return the dataOwnerFieldName
     */
    public String getDataOwnerFieldName() {
        return dataOwnerFieldName;
    }

    /**
     * @param dataOwnerFieldName
     *            the dataOwnerFieldName to set
     */
    public void setDataOwnerFieldName(String dataOwnerFieldName) {
        this.dataOwnerFieldName = dataOwnerFieldName;
    }

    @Override
    public Object getMember(Object dataOwner) throws Throwable {
        Object result = null;
        Field field = dataOwner.getClass().getDeclaredField(dataOwnerFieldName);
        field.setAccessible(RlConstant.ACCESSIBLE);
        result = field.get(dataOwner);
        return result;
    }

    @Override
    public void setMember(Object dataOwner, Object value) throws Throwable {
        Field field = dataOwner.getClass().getDeclaredField(dataOwnerFieldName);
        field.setAccessible(RlConstant.ACCESSIBLE);
        field.set(dataOwner, value);
    }
}
