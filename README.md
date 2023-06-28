# SqlInjectionValidator

SqlInjectionValidator is a Java class that provides validation for string variables to prevent SQL injection attacks. It implements the ConstraintValidator interface from the javax.validation package, allowing easy integration with validation frameworks.

## Usage

To use the SqlInjectionValidator, follow these steps:

1. Add the `@SqlInjectionValidation` annotation to the target class that contains string variables that need to be validated against SQL injection.

2. Ensure that the target class and the `SqlInjectionValidator` class are on the classpath.

3. Perform validation by invoking the validation mechanism of the chosen validation framework (e.g., Spring's `@Valid` annotation or manual validation).

## Example

Here's an example of how to use the `SqlInjectionValidator` class with the Spring Framework's validation:

```java
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@SqlInjectionValidation
public class User {

    @NotEmpty
    private String username;

    @NotNull
    private String password;

    // Getters and setters...
}

To make the validation work we need to use @Validated and @Valid annotations from javax.validation. Below is the example on sample controller:

```java
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class CustomController {
	
    @PostMapping("/check")
    public ResponseEntity<?> sqlInjectablePostMethod(@Valid @RequestBody User model) {        
        return ResponseEntity.ok("Success");
    }
}
