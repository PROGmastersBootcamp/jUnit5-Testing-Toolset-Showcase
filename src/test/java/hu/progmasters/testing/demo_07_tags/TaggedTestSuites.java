package hu.progmasters.testing.demo_07_tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("hu.progmasters")
//@IncludeTags("unit-test")
//@IncludeTags("integration-test")
//@IncludeTags("a")
//@IncludeTags({"unit-test", "integration-test"})
//@IncludeClassNamePatterns({"^.*Tags?$"})
public interface TaggedTestSuites {

}

