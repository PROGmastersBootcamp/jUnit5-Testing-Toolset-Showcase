package hu.progmasters.testing.demo_03_assertions;

import hu.progmasters.testing.Demo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

//TODO Talk about:
// - different assertion methods
// assertEquals, True/False, ArrayEquals,
// throws, notThrows,
// timeout, timeoutPreemptively
// assertAll
// nestedAssertions
@Execution(ExecutionMode.CONCURRENT)
public class TestAssertions {

    @Test
    public void testMinNumberGivesCorrectAnswer() {
        Integer calculatedMinimumNumber = Math.min(1, 0);
        assertEquals(0, calculatedMinimumNumber);
        assertEquals(10, calculatedMinimumNumber, "message if test fails");
        Object a = new Object();
        Object b = new Object();
        assertEquals(a, b);

        assertNotNull(calculatedMinimumNumber);
    }

    @Test
    public void testArrayEquals() {
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{3, 2, 1};
        assertArrayEquals(numbersA, numbersB, "message");
    }

    @Test
    public void testArrayEqualsWithSort() {
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{3, 2, 1};
        Arrays.sort(numbersA);
        Arrays.sort(numbersB);
        assertArrayEquals(numbersA, numbersB);
    }

    @Test
    public void testMinNumberRuns() {
        assertDoesNotThrow(() -> {
            Integer calculatedMinimumNumber = Math.min(1, 0);
            Integer min = Collections.min(Arrays.asList(1, 2, 3));
        });
    }

    @Test
    public void testMin_emptyList_throwsException() {
        assertThrows(NoSuchElementException.class, () -> {
            List<Integer> numbers = Arrays.asList();
            Integer min = Collections.min(numbers);
        });
    }

    @Test
    public void testTimeout_itPasses() {
        assertTimeout(Duration.ofSeconds(3), () -> {
            new Demo().methodThatTakesArgSecondsToRun(2);
        });
    }

    @Test
    public void testTimeout_itTimeouts() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            new Demo().methodThatTakesArgSecondsToRun(5);
        });
    }

    @Test
    public void testTimeoutPreemptively_itTimeouts() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            new Demo().methodThatTakesArgSecondsToRun(5);
        });
    }

    @Test
    public void testNestedAssertions() {
        assertAll("nesting assertions",
                  () -> assertAll("testing min",
                                  () -> assertEquals(0, Math.min(1, 5)),
                                  () -> assertEquals(0, Math.min(5, 2))
                  ),
                  () -> assertAll("testing max",
                                  () -> assertEquals(0, Math.max(1, 5)),
                                  () -> assertEquals(0, Math.max(1, 5))
                  )
        );
    }

}
