package hu.progmasters.testing.demo_06_lifeCycle_and_nesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO Talk about:
// - new annotations
// - use-cases of PER_CLASS lifecycle
public class TestLifeCycles {

    private int number = 0;

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class PerClassDemo {

        @BeforeAll
        public void init() {
            System.out.println("Do some initializing stuff...");
        }

        @Test
        @Order(1)
        public void testMinNumberGivesCorrectAnswer() {
            number++;
            System.out.println("Per class, first method, numbers value: " + number);
            Integer calculatedMinimumNumber = Math.min(1, 0);
            assertEquals(0, calculatedMinimumNumber);
        }

        @Test
        @Order(2)
        public void testMinNumberGivesCorrectAnswerTwo() {
            number++;
            System.out.println("Per class, second method, numbers value: " + number);
            Integer calculatedMinimumNumber = Math.min(1, 0);
            assertEquals(0, calculatedMinimumNumber);
        }

    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_METHOD)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class PerMethodDemo {

        @Test
        @Order(1)
        public void testMinNumberGivesCorrectAnswer() {
            number++;
            System.out.println("Per method, first method, numbers value: " + number);
            Integer calculatedMinimumNumber = Math.min(1, 0);
            assertEquals(0, calculatedMinimumNumber);
        }

        @Test
        @Order(2)
        public void testMinNumberGivesCorrectAnswerTwo() {
            number++;
            System.out.println("Per method, second method, numbers value: " + number);
            Integer calculatedMinimumNumber = Math.min(1, 0);
            assertEquals(0, calculatedMinimumNumber);
        }

    }

}
