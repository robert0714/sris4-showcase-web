package tw.gov.moi.rl.component.xldf.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RldfMappingEntity {
    Class<?> value();
    
    String entityDsName();
    
    Class<?> xldfEntityClass();

    XldfKeyMapping[] keys ();
    
    boolean updateFlag () default true;
}
