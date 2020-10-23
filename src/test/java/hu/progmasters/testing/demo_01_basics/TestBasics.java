package hu.progmasters.testing.demo_01_basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//TODO Talk about:
// - @Test annotation, execution order
// - anatomy of a test method
// - naming conventions
class TestBasics {

    @Test
    void testMathMin() {
        int calculatedMinimumNumber = Math.min(1, 0);
        Assertions.assertEquals(0, calculatedMinimumNumber);
    }

}
