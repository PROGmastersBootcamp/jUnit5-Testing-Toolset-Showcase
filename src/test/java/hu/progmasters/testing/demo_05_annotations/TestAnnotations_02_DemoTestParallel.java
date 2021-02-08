package hu.progmasters.testing.demo_05_annotations;

import hu.progmasters.testing.Demo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

//TODO Make sure you add the following property to your run configuration:
// -Djunit.jupiter.execution.parallel.enabled=true
// You may also add it as a default, to the template, additionally, you may add the following property
// to also execute each test class concurrently by default
// ****
// NOTE: If a specific ordering is applied, that will override this
// Run all tests parallel:
// -Djunit.jupiter.execution.parallel.enabled=true
// -Djunit.jupiter.execution.parallel.mode.default=concurrent
// ****
// Run test classes parallel:
// -Djunit.jupiter.execution.parallel.enabled=true
// -Djunit.jupiter.execution.parallel.mode.default=same_thread
// -Djunit.jupiter.execution.parallel.mode.classes.default=concurrent
@Execution(ExecutionMode.CONCURRENT)
public class TestAnnotations_02_DemoTestParallel {

    @Test
    public void a() {
        new Demo().methodThatTakesArgSecondsToRun(2);
    }

    @Test
    public void b() {
        new Demo().methodThatTakesArgSecondsToRun(2);
    }

    @Test
    public void c() {
        new Demo().methodThatTakesArgSecondsToRun(2);
    }

}
