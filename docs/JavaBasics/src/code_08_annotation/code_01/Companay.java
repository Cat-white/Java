package code_08_annotation.code_01;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface Companay {
    public int companyId() default -1;
    public String companayName() default "";
    public String companayAddress() default "";
}
