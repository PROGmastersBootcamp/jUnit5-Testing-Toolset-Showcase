package hu.progmasters.testing.demo_10_hamcrest;

import hu.progmasters.testing.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static hu.progmasters.testing.demo_10_hamcrest.Demo_1002_CustomMatcher.isBob;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Demo_1001_HamcrestDemo {


    @Test
    public void test1() {
        Person personObject = new Person();

        String textA = "textA";
        String textB = "textB";
        // Intro - writing fluent assertions
        assertThat("The reason why the test failed", textA, is(equalTo("textA")));
        assertThat("For example: textA shouldn't be equal to textB", textA, is(not(equalTo(textB))));

        assertThat(textA, allOf(containsString("tex"), containsString("xtA")));
        assertThat(textA, allOf(containsString("tex"), containsString("xtA")));

        assertThat(textA, either(equalTo("textA")).or(equalTo("textB")));
        assertThat(textA, both(startsWith("text")).and(containsString("A")));

        // Matching objects/classes
        assertThat(personObject, hasToString(personObject.toString()));
        assertThat(Person.class, typeCompatibleWith(personObject.getClass()));

        // Matching POJO-s
        assertThat(personObject, hasProperty("name"));
        assertThat(personObject, hasProperty("name", equalTo("Mr. Unit")));
        assertThat(personObject, samePropertyValuesAs(personObject));

        assertThat(Arrays.asList("foo", "bar"), hasItem("bar"));
        assertThat("myValue", allOf(startsWith("my"), containsString("Val")));

        // Matching collections
        assertThat(new ArrayList<>(), empty());
        assertThat(Arrays.asList(1, 2, 3, 4), hasSize(4));
        assertThat(Arrays.asList(1, 2, 3, 4), containsInAnyOrder(3, 4, 1, 2));
        assertThat(Arrays.asList(1, 2, 3, 4), hasItem(1));
        assertThat(Arrays.asList(1, 2, 3, 4), not(hasItem(5)));

        Map<String, String> map = new HashMap<>();
        map.put("hamcrest", "is cool");
        assertThat(map, hasKey("hamcrest"));
        assertThat(map, hasValue("is cool"));
        assertThat(map, hasEntry("hamcrest", "is cool"));

        // Matching numbers
        assertThat(1, greaterThan(0));
        assertThat(1, greaterThanOrEqualTo(1));
        assertThat(1.0, closeTo(1.2, 0.5));

        // Custom matchers
        personObject.setName("Bob");
        assertThat(personObject, isBob());
    }

}
