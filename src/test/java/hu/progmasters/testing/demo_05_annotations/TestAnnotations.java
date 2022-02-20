package hu.progmasters.testing.demo_05_annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

//TODO Talk about:
// - different annotations
// --- to disable/enable tests
// --- to add descriptive display names
// --- to order methods (and why its a bad practice)
// --- custom ordering method (DemoTestWithCustomOrder class)
// --- running tests parallel (DemoTestParallel class)
@DisplayName("This is a custom name for our Test Class")
@EnabledOnJre(JRE.JAVA_11)
//@DisabledOnJre(JRE.OTHER)
//@EnabledOnOs({OS.LINUX, OS.WINDOWS})
//@DisabledOnOs(OS.OTHER)
//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class TestAnnotations {

    @Test
    @DisplayName("Some fancy, more descriptive name for our test method")
    public void testMinNumberGivesCorrectAnswer() {
        Integer calculatedMinimumNumber = Math.min(1, 0);
        assertEquals(0, calculatedMinimumNumber);
    }

    @Test
    public void testArrayEquals() {
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{3, 2, 1};
        Arrays.sort(numbersA);
        Arrays.sort(numbersB);
        assertArrayEquals(numbersA, numbersB, "message");
    }

    @RepeatedTest(value = 20,
            name = "Current iteration {currentRepetition} of {totalRepetitions}")
    public void testArrayEqualsWithSort() {
        int randomNumber = new Random().nextInt(10);
        assertTrue(randomNumber < 9);
    }

    @RepeatedTest(value = 20,
            name = "Current iteration {currentRepetition} of {totalRepetitions}")
    public void testArrayEqualsWithSort(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition());
        int randomNumber = new Random().nextInt(10);
        assertTrue(randomNumber < 9);
    }

}
