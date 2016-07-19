package tw.gov.moi.rl.component.xldf.facade.mapper;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Map;

import tw.gov.moi.rl.common.IfFunctor;
import tw.gov.moi.rl.common.NullCheckable;
import tw.gov.moi.rl.component.xldf.facade.CompositeMemberMapper;

public class ComplexMemberMapper implements Serializable, CompositeMemberMapper {
    private static final long serialVersionUID = 1L;

    private static final Object[] NONE_ARGS = new Object[] {};

    private static final Class<?>[] NONE_PARAMETER_TYPES = new Class<?>[] {};

    private static final int FIRST_CHAR_INDEX = 0;

    private static final int SECOND_CHAR_INDEX = 1;

    private static final String GETTER_PREFIX = "get";

    private Class<?> memberInterface;

    private Map<String, CompositeMemberMapper> memberMappers;

    private IfFunctor memberPredicate;

    /**
     * @return the memberInterface
     */
    public Class<?> getMemberInterface() {
        return memberInterface;
    }

    /**
     * @param memberInterface
     *            the memberInterface to set
     */
    public void setMemberInterface(Class<?> memberInterface) {
        this.memberInterface = memberInterface;
    }

    /**
     * @return the memberMappers
     */
    public Map<String, CompositeMemberMapper> getMemberMappers() {
        return memberMappers;
    }

    /**
     * @param memberMappers
     *            the memberMappers to set
     */
    public void setMemberMappers(Map<String, CompositeMemberMapper> memberMappers) {
        this.memberMappers = memberMappers;
    }

    public IfFunctor getMemberPredicate() {
        return memberPredicate;
    }

    public void setMemberPredicate(IfFunctor memberPredicate) {
        this.memberPredicate = memberPredicate;
    }

    private void checkSubMembersExists(Object dataOwner) throws Throwable {
        Iterator<String> fieldIterator = memberMappers.keySet().iterator();
        while (fieldIterator.hasNext()) {
            memberMappers.get(fieldIterator.next()).getMember(dataOwner);
        }
    }

    private Method findGetter(Class<?> objType, String fieldName) throws Throwable {
        Method result = null;

        if (fieldName != null) {
            StringBuffer methodName = new StringBuffer(GETTER_PREFIX);

            if (Character.isLowerCase(fieldName.charAt(FIRST_CHAR_INDEX)) && Character.isLowerCase(fieldName.charAt(SECOND_CHAR_INDEX))) {
                methodName.append(fieldName.substring(FIRST_CHAR_INDEX, FIRST_CHAR_INDEX).toUpperCase());
                methodName.append(fieldName.substring(SECOND_CHAR_INDEX));
            } else {
                methodName.append(fieldName);
            }

            result = objType.getMethod(methodName.toString(), NONE_PARAMETER_TYPES);
        }

        return result;
    }

    @Override
    public Object getMember(Object dataOwner) throws Throwable {
        Object result = null;
        boolean isNull = false;

        try {
            checkSubMembersExists(dataOwner);
            if (memberPredicate != null) {
                if (!memberPredicate.evaluate(dataOwner)) {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            isNull = true;
        }

        InvocationHandler handler = new CompositeMemberInvocationHandler(dataOwner, memberMappers, isNull);
        result = Proxy.newProxyInstance(memberInterface.getClassLoader(), new Class<?>[] { memberInterface, NullCheckable.class }, handler);

        return result;
    }

    @Override
    public void setMember(Object dataOwner, Object value) throws Throwable {
        Iterator<String> fieldIterator = memberMappers.keySet().iterator();
        while (fieldIterator.hasNext()) {
            String fieldName = fieldIterator.next();
            Method fieldGetter = findGetter(value.getClass(), fieldName);

            CompositeMemberMapper mapper = memberMappers.get(fieldName);
            mapper.setMember(dataOwner, fieldGetter.invoke(value, NONE_ARGS));
        }
    }
}
