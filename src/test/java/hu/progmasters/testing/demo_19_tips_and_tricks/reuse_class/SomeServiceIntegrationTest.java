package hu.progmasters.testing.demo_19_tips_and_tricks.reuse_class;

import org.junit.jupiter.api.Test;

// Note: Important note, that class-annotations are also inherited!
public class SomeServiceIntegrationTest extends IntegrationTestSetup {

    @Test
    void name() {
        System.out.println("Running integration tests...");
    }

}
