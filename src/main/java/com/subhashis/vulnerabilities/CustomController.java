package com.subhashis.vulnerabilities;

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

