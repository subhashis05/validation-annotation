package com.subhashis.vulnerabilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqlInjectionValidatorTest {

    @Test
    void testIsValidWithNullValue() {
        SqlInjectionValidator validator = new SqlInjectionValidator();
        assertTrue(validator.isValid(null, null));
    }

    @Test
    void testIsValidWithNonNullString() {
        SqlInjectionValidator validator = new SqlInjectionValidator();
        TestObject testObject = new TestObject();
        testObject.setStringValue("Hello");
        assertTrue(validator.isValid(testObject, null));
    }

    @Test
    void testIsValidWithEmptyString() {
        SqlInjectionValidator validator = new SqlInjectionValidator();
        TestObject testObject = new TestObject();
        testObject.setStringValue("");
        assertTrue(validator.isValid(testObject, null));
    }

    @Test
    void testIsValidWithValidValue() {
        SqlInjectionValidator validator = new SqlInjectionValidator();
        TestObject testObject = new TestObject();
        testObject.setStringValue("Valid value");
        assertTrue(validator.isValid(testObject, null));
    }

    @Test
    void testIsValidWithSqlInjection() {
        SqlInjectionValidator validator = new SqlInjectionValidator();
        TestObject testObject = new TestObject();
        testObject.setStringValue("SELECT * FROM Users;");
        assertFalse(validator.isValid(testObject, null));
    }

    private static class TestObject {
        private String stringValue;

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }
    }
}

