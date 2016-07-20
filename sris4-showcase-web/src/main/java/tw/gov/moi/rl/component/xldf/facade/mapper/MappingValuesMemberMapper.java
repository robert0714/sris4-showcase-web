package tw.gov.moi.rl.component.xldf.facade.mapper;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MappingValuesMemberMapper extends SimpleMemberMapper {
    private static final long serialVersionUID = 1L;

    private Map<Object, Object> mappingValues;

    public Map<Object, Object> getMappingValues() {
        return mappingValues;
    }

    public void setMappingValues(Map<Object, Object> mappingValues) {
        this.mappingValues = mappingValues;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.xldf.facade.mapper.SimpleMemberMapper# getMember(java.lang.Object)
     */
    @Override
    public Object getMember(Object dataOwner) throws Throwable {
        Object result = super.getMember(dataOwner);
        return mappingValues.get(result);
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.xldf.facade.mapper.SimpleMemberMapper# setMember(java.lang.Object, java.lang.Object)
     */
    @Override
    public void setMember(Object dataOwner, Object value) throws Throwable {
        Set<Entry<Object, Object>> entrySet = mappingValues.entrySet();
        Iterator<Entry<Object, Object>> iterator = entrySet.iterator();

        Object data = null;
        while (iterator.hasNext()) {
            Entry<Object, Object> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                data = entry.getKey();
            }
        }

        if (data != null) {
            super.setMember(dataOwner, data);
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
