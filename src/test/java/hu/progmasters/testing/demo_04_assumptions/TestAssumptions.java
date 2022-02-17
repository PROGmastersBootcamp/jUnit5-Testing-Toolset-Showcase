package hu.progmasters.testing.demo_04_assumptions;

import hu.progmasters.testing.Demo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

//TODO Talk about:
// - The difference between assert and assume
// - use cases of assumptions

// "They are effectively nothing more than glorified if-statements that serve as a DSL for the reader of the test."
public class TestAssumptions {

    @Test
    public void testMinNumberGivesCorrectAnswer() {
        Demo demo = new Demo();
        assumeFalse(System.getProperty("os.name").contains("Windows"));

        Integer calculatedMinimumNumber = Math.min(1, 0);
        assertEquals(0, calculatedMinimumNumber);
        assertEquals(10, calculatedMinimumNumber, "message if test fails");
        Object a = new Object();
        Object b = new Object();
        assertEquals(a, b);

        assertNotNull(calculatedMinimumNumber);
    }

    @Test
    void assumingThatDemo() {
        assumingThat(true, () -> {
            // Some method what throws a checked exception
        });
    }

}
