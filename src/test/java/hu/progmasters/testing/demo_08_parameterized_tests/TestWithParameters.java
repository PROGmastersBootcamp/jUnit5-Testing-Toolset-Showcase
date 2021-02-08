package hu.progmasters.testing.demo_08_parameterized_tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO Talk about:
// - different ways to pass parameters to test classes
public class TestWithParameters {

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("not blank", false)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void testValues(int number) {
        System.out.println(number);
    }

    @ParameterizedTest
    @CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
    public void testCsv(String input, String expected) {
        assertEquals(expected, input.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"},
               delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = input.toLowerCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        Assumptions.assumeTrue(input != null);
        assertEquals(expected, input.isBlank());
    }

    @ParameterizedTest
//    @ParameterizedTest(name = "Currently tested role: {0}")
    @EnumSource(value = Role.class)
    public void test(Role role) {
        System.out.println(role.name());
    }

    private enum Role {
        ROLE_USER,
        ROLE_ADMIN
    }

}
