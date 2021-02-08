package hu.progmasters.testing.demo_05_annotations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrdererByMethodNameLength.class)
public class TestAnnotations_03_DemoTestWithCustomOrder {

    @Test
    void shortName() {
        assertEquals(1, 1);
    }

    @Test
    void longerMethodName() {
        assertEquals(1, 1);
    }

    @Test
    void veryLongAndDescriptiveMethodName() {
        assertEquals(1, 1);
    }

}
