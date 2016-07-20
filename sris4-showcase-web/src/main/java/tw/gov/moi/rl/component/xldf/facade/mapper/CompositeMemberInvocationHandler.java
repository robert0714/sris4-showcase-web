package tw.gov.moi.rl.component.xldf.facade.mapper;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tw.gov.moi.rl.component.xldf.facade.CompositeMemberMapper;

public class CompositeMemberInvocationHandler implements Serializable, InvocationHandler {
	private static final long serialVersionUID = 1L;

	private static final String METHOD_NAME_REGEX = "(get|is|set)(.*)";

	private static final String FIRST_UPPER_CASE_REGEX = "([A-Z])(.*)";

	private static final int FIRST_GROUP_INDEX = 1;

	private static final int SECOND_GROUP_INDEX = 2;

	private static final String GETTER = "get";

	private static final String SETTER = "set";

	private static final String BOOLEAN_GETTER = "is";

	private static final String DOT = ".";

	private static final String IS_NULL = "isNull";

	private static final int FIRST_ARG_INDEX = 0;

	private static final String BOOLEAN_TYPE = "boolean";

	private static final String INTEGER_TYPE = "integer";

	private static final String LONG_TYPE = "long";

	private static final String FLOAT_TYPE = "float";

	private static final String DOUBLE_TYPE = "double";

	private Object dataOwner;

	private Map<String, CompositeMemberMapper> memberMappers;

	private boolean nullObject = false;

	public CompositeMemberInvocationHandler(Object dataOwner, Map<String, CompositeMemberMapper> memberMappers) {
		super();
		this.dataOwner = dataOwner;
		this.memberMappers = memberMappers;
		this.setNullObject(false);
	}

	public CompositeMemberInvocationHandler(Object dataOwner, Map<String, CompositeMemberMapper> memberMappers, boolean nullObject) {
		super();
		this.dataOwner = dataOwner;
		this.memberMappers = memberMappers;
		this.nullObject = nullObject;
	}

	public void setNullObject(boolean nullObject) {
		this.nullObject = nullObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		String accessType = null;
		String fieldName = null;

		// isNull method
		if (IS_NULL.equals(method.getName())) {
			result = nullObject;
		} else {
			// find accessor & fieldName
			Pattern p = Pattern.compile(METHOD_NAME_REGEX);
			Matcher m = p.matcher(method.getName());
			if (m.matches()) {
				accessType = m.group(FIRST_GROUP_INDEX);
				fieldName = m.group(SECOND_GROUP_INDEX);

				p = Pattern.compile(FIRST_UPPER_CASE_REGEX);
				m = p.matcher(fieldName);

				if (m.matches()) {
					fieldName = m.group(FIRST_GROUP_INDEX).toLowerCase() + m.group(SECOND_GROUP_INDEX);
				}
			}

			CompositeMemberMapper memberMapper = memberMappers.get(fieldName);
			if (GETTER.equals(accessType) || BOOLEAN_GETTER.equals(accessType)) {
				result = (nullObject ? null : memberMapper.getMember(dataOwner));
			} else if (SETTER.equals(accessType)) {
				if (!nullObject) {
					memberMapper.setMember(dataOwner, args[FIRST_ARG_INDEX]);
				} else {
					// set any member to null object
					// it will happen nothing
				}
			} else {
				throw new UnsupportedOperationException(method.getDeclaringClass().getName() + DOT + method.getName());
			}
		}

		if (result == null) {
			Class<?> returnType = method.getReturnType();
			if (BOOLEAN_TYPE.equals(returnType.getName())) {
				result = Boolean.FALSE.booleanValue();
			} else if (INTEGER_TYPE.equals(returnType.getName())) {
				result = Integer.MIN_VALUE;
			} else if (LONG_TYPE.equals(returnType.getName())) {
				result = Long.MIN_VALUE;
			} else if (DOUBLE_TYPE.equals(returnType.getName())) {
				result = Double.MIN_VALUE;
			} else if (FLOAT_TYPE.equals(returnType.getName())) {
				result = Float.MIN_VALUE;
			}
		}
		return result;
	}
}
