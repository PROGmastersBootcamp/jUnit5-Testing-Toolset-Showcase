package hu.progmasters.testing;

public class Person {

    private String name = "Mr. Unit";

    // Note: Module-10-Hamcrest - hasProperty() matcher won't work without the getter()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
