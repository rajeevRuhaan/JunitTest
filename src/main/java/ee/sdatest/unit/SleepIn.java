package ee.sdatest.unit;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
