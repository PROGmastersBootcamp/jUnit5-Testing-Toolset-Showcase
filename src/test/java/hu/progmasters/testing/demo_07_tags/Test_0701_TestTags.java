package hu.progmasters.testing.demo_07_tags;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO Talk about:
// - how to tag tests, and how to use this to your benefit
public class Test_0701_TestTags {

    @Nested
    @Tag("unit-test")
    public class UnitTests {

        @Test
        @Tag("a")
        public void unitTestOne() {
            assertTrue(1 == 1);
        }

        @Test
        @Tag("b")
        public void unitTestTwo() {
            assertTrue(1 == 1);
        }

        @Test
        @Tag("c")
        public void unitTestThree() {
            assertTrue(1 == 1);
        }

    }

    @Nested
    @Tag("integration-test")
    public class IntegrationTests {

        @Test
        @Tag("a")
        public void integrationTestOne() {
            assertTrue(1 == 1);
        }

        @Test
        @Tag("b")
        public void integrationTestTwo() {
            assertTrue(1 == 1);
        }

        @Test
        @Tag("c")
        public void integrationTestThree() {
            assertTrue(1 == 1);
        }

    }

}
