package hu.progmasters.testing;

public class Demo {

    public void methodThatTakesArgSecondsToRun(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String returnSomeStuff() {
        return "someStuff";
    }

}

