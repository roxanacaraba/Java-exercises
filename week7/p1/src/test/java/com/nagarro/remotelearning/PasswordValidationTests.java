package com.nagarro.remotelearning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTests {
    private PasswordValidation passwordValidation;

    @BeforeEach
    public void setUp() {
        passwordValidation = new PasswordValidation();
    }
    @Test
    public void testPasswordIsValidReturnTrue() {
        // When
        boolean result = passwordValidation.passwordIsValid("PassJaneDoe!");
        // Then
        assertTrue(result);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getArguments")
    public void testPasswordIsValidReturnFalse(String input) {
        assertFalse(passwordValidation.passwordIsValid(input));
    }
    protected static Stream<Arguments> getArguments() {
        return Stream.of(Arguments.of(Named.of("Invalid length", "JaneDoe!")),
                Arguments.of(Named.of("No uppercase character", "passjanedoe!")),
                Arguments.of(Named.of("No lowercase character", "PASSJANEDOE!")),
                Arguments.of(Named.of("No special characters", "PASSJANEDOE"))
                );
    }
}



