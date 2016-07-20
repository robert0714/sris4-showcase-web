package tw.gov.moi.rl.component.xldf.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface XldfKeyMapping {
    
    String name();
    
    String regEx () default ".+";
    
    int length ();
}
