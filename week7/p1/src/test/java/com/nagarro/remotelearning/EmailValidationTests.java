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

public class EmailValidationTests {
    private EmailValidation emailValidation;

    @BeforeEach
    public void setUp() {
        emailValidation = new EmailValidation();
    }
    @Test
    public void testEmailIsValidReturnTrue() {
        // When
        boolean result = emailValidation.emailIsValid("Jane_Doe@facebook.com");
        // Then
        assertTrue(result);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getArguments")
    public void testEmailIsValidReturnFalse(String input) {
        assertFalse(emailValidation.emailIsValid(input));
    }
    protected static Stream<Arguments> getArguments() {
        return Stream.of(Arguments.of(Named.of("Invalid email section ", "Jane@Doe@facebook.com")),
                Arguments.of(Named.of("Invalid app section", "Jane_Doe@facebo@ok.com")),
                Arguments.of(Named.of("Invalid domain section", "Jane_Doe@facebook.coma"))
        );
    }
}
