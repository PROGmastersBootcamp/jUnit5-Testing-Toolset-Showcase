package hu.progmasters.testing.demo_19_tips_and_tricks.reuse_class;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void init() {
        System.out.println("Doing some generic setup...");
    }

}
