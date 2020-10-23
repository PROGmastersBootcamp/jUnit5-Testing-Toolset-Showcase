package hu.progmasters.testing.demo_02_test_fixtures;

import org.junit.jupiter.api.*;

//TODO Talk about:
// - new annotations
// - purpose of these methods
// - try and see it in action
class TestFixtures {

    @BeforeAll
    public static void initClass() {
        System.out.println("-setup for test class...");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("-teardown for test class...");
    }

    @BeforeEach
    public void init() {
        System.out.println("--setup for test method...");
    }

    @Test
    public void testMinNumber() {
        System.out.println("---running test...");
        int calculatedMinimumNumber = Math.min(1, 0);
        Assertions.assertEquals(0, calculatedMinimumNumber);
    }

    @Test
    public void testMinNumberWithNegativeNumbers() {
        System.out.println("---running test...");
        int calculatedMinimumNumber = Math.min(1, -10);
        Assertions.assertEquals(-10, calculatedMinimumNumber);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("--teardown after test method...");
    }

}
