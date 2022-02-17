package hu.progmasters.testing.demo_08_parameterized_tests;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO
//  - Miért ez, és nem parameterized? Ez része a JUnit5-nek, a másik nem
//  - Egyébként felcserélhető a dolog, és meg lehet oldani oda-vissza
//  - "Unlike DynamicTest, ParameterizedTest is not part of the core junit-jupiter-api but is in a separate artifact
//  named junit-jupiter-params. This is because one of the core principles for JUnit 5
//  is to "prefer extension points over features ... In short, the idea is to first release core
//  extension points via "low-level" APIs (e.g. dynamic containers/tests) and then create and encourage 3rd parties
//  to create extensions that leverage them (e.g. parameterized tests)."
public class Test_0802_DynamicTests {

    @TestFactory
    public Stream<DynamicTest> translateDynamicTestsFromStream() {
        List<String> inputs = Arrays.asList("a", "b", "c");

        return inputs.stream()
                .map(word -> DynamicTest.dynamicTest("Test translate " + word, () -> {
                    // Do custom logic in test, then custom assertion
                    assertEquals(word, word);
                }));
    }

}
