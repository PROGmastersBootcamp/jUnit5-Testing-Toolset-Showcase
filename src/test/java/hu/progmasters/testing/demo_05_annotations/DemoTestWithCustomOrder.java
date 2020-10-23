package hu.progmasters.testing.demo_05_annotations;

import hu.progmasters.testing.Demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrdererByMethodNameLength.class)
public class DemoTestWithCustomOrder {

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
