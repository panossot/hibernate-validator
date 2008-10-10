package javax.validation.constraints;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

/**
 * The annotated element must be true.
 * Supported types are <code>boolean</code> and <code>Boolean</code> 
 *
 * Null elements are considered valid
 *
 * @author Emmanuel Bernard
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
public @interface AssertTrue {
	String message() default "{constraint.assertTrue}";
	String[] groups() default {};
}