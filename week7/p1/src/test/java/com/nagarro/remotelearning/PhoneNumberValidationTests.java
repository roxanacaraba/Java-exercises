package com.nagarro.remotelearning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberValidationTests {
    private PhoneNumberValidation phoneNumberValidation;

    @BeforeEach
    public void setUp() {
        phoneNumberValidation = new PhoneNumberValidation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"0751677094", "+40751677094", "0040751677094"})
    public void testPhoneIsValidReturnTrue(String input) {
        assertTrue(phoneNumberValidation.phoneIsValid(input));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getArguments")
    public void testPhoneNumberIsValidReturnFalse(String input) {
        assertFalse(phoneNumberValidation.phoneIsValid(input));
    }
    protected static Stream<Arguments> getArguments() {
        return Stream.of(Arguments.of(Named.of("Invalid length", "075167709412")),
                Arguments.of(Named.of("Invalid first digit", "9751677094")),
                Arguments.of(Named.of("InvalidCharacters", "0751a77094"))
        );
    }
}

