package hu.progmasters.testing.demo_06_lifeCycle_and_nesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//TODO Talk about:
// - new annotations
// - the power and purpose of nesting classes
public class Test_0601_TestNesting {

    private List<Integer> numbers;

    @BeforeEach
    void init() {
        System.out.println("Initializing empty list");
        numbers = new ArrayList<>();
    }

    @Test
    void checkListIsEmpty() {
        System.out.println("checking empty list");
        assertTrue(numbers.isEmpty());
    }

    @Nested
    @DisplayName("with single value ->")
    public class AddItem {

        @BeforeEach
        void init() {
            System.out.println("Adding a single item to list");
            numbers.add(216);
        }

        @Test
        public void hasOneElement() {
            System.out.println("nested class -> hasOneElement");
            assertEquals(1, numbers.size());
        }

        @Test
        public void valuesMatch() {
            System.out.println("nested class -> valuesMatch");
            assumeTrue(!numbers.isEmpty());
            assertEquals(216, numbers.get(0));
        }

    }


    @Nested
    @DisplayName("with removing value ->")
    public class RemoveItem {

        @BeforeEach
        void init() {
            System.out.println("Adding a single item to list");
            numbers.add(216);
        }

        @Test
        public void valuesMatch() {
            System.out.println("nested class -> removing value");
            numbers.clear();
            assumeTrue(numbers.isEmpty());
        }

    }

}
