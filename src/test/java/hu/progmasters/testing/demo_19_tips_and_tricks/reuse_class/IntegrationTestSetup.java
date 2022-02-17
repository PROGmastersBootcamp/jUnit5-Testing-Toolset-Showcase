package hu.progmasters.testing.demo_19_tips_and_tricks.reuse_class;

import org.junit.jupiter.api.BeforeEach;

public class IntegrationTestSetup extends BaseTest {

    @BeforeEach
    void setUp() {
        System.out.println("Doing integration context setup...");
    }
}
