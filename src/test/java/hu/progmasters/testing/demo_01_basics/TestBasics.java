package hu.progmasters.testing.demo_01_basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//TODO Talk about:
// - @Test annotation, execution order
// - anatomy of a test method
//      -given -when -then
// - naming conventions
//      - find one, and stick to it
class TestBasics {

    @Test
    void givenTwoUnequalNumbers_calculatingMin_returnsMin() {
        //Given
        int numberA = 1;
        int numberB = 0;
        //When
        int calculatedMinimumNumber = Math.min(numberA, numberB);

        //Then
        Assertions.assertEquals(0, calculatedMinimumNumber);
    }

}
