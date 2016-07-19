package tw.gov.moi.rl.component.xldf.facade;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public class XLDFDomainInvocationHandler implements Serializable, InvocationHandler {

    private static final long serialVersionUID = 1L;

    private static final String GET_DOMAIN_OBJECT = "getDomainObject";

    private static final Object[] EMPTY_ARGS = new Object[] {};

    private static final Class<?>[] EMPTY_PARAMETER_TYPES = new Class[] {};

    private static final String GET_DOMAIN_OBJ_METHOD = "getDomainObj";

    private Map<String, CompositeMemberMapper> memberMappers;

    private XLDFDomainObject xldfDomainObject;

    public XLDFDomainInvocationHandler(XLDFDomainObject xldfDomainObject, Map<String, CompositeMemberMapper> mappers) {
        super();
        this.xldfDomainObject = xldfDomainObject;
        this.memberMappers = mappers;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        final String methodName = method.getName();

        if (GET_DOMAIN_OBJECT.equals(methodName)) {
            result = xldfDomainObject;
        } else {
            try {
                if (xldfDomainObject == null) {
                    throw new NoSuchMethodException();
                }
                Method xldfDomainObjectMethod = xldfDomainObject.getClass().getMethod(methodName, method.getParameterTypes());
                result = xldfDomainObjectMethod.invoke(xldfDomainObject, args);
            } catch (NoSuchMethodException e) {
                Object mappingDomainObject = null;
                Method mappingDomainObjectMethod = null;

                try {

                    if (xldfDomainObject != null) {
                        mappingDomainObject = xldfDomainObject.getClass().getMethod(GET_DOMAIN_OBJ_METHOD, EMPTY_PARAMETER_TYPES).invoke(xldfDomainObject, EMPTY_ARGS);
                    } else {
                        throw new NoSuchMethodException();
                    }

                    mappingDomainObjectMethod = mappingDomainObject.getClass().getMethod(methodName, method.getParameterTypes());
                    result = mappingDomainObjectMethod.invoke(mappingDomainObject, args);
                } catch (NoSuchMethodException e1) {
                    if (memberMappers != null) {
                        CompositeMemberMapper mapper = memberMappers.get(methodName);
                        Class<?> returnType = method.getReturnType();
                        try {
                            result = mapper.getMember(mappingDomainObject);
                        } catch (NoSuchFieldException e2) {
                            result = null;
                        }
                        if (result != null && !returnType.isInstance(result)) {
                            throw new ClassCastException();
                        }
                    } else {
                        throw new NoSuchMethodException();
                    }
                }
            }
        }

        return result;
    }

}
