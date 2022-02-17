package hu.progmasters.testing.demo_10_hamcrest;

import hu.progmasters.testing.Person;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class Demo_1002_CustomMatcher extends TypeSafeMatcher<Person> {

    @Factory
    public static Matcher<Person> isBob() {
        return new Demo_1002_CustomMatcher();
    }

    @Override
    protected boolean matchesSafely(Person item) {
        return item.getName().equalsIgnoreCase("bob");
    }

    @Override
    public void describeTo(Description description) {
    }

}
