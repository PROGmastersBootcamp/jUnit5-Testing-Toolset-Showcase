package hu.progmasters.testing.demo_07_tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("hu.progmasters.testing")
//@IncludeTags("unit-test")
//@IncludeTags("integration-test")
//@IncludeTags("a")
//@IncludeTags({"unit-test", "integration-test"})
//@IncludeClassNamePatterns({"^.*Basics?$"})
/*
    The following annotation must be included to run such tests:

        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-runner</artifactId>
            <version>1.7.0</version>
            <scope>test</scope>
        </dependency>

 */
public interface Test_0702_TaggedTestSuites {

}
