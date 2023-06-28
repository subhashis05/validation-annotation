package com.subhashis.vulnerabilities;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SqlInjectionValidator.class)
@Documented
public @interface SqlInjectionValidation {
    String message() default "String validation failed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

