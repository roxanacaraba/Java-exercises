package com.nagarro.remotelearning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testClassWithValidChildClass() {
        String className = "Aircraft";
        assertTrue(Validator.validate(className));
    }

    @Test
    public void testClassWithValidParentClass() {
        String className = "Vehicle";
        assertTrue(Validator.validate(className));
    }

    @Test
    public void testClassWithInvalidClass() {
        String className = "InvalidChild";
        assertFalse(Validator.validate(className));
    }
}
