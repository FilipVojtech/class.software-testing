package cz.filipvojtech.testfirst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static cz.filipvojtech.testfirst.TestFirst.*;

class TestFirstTest {
    @Test
    void checkWeekdayMonday() {
        assertEquals("Monday - it's the beginning of the week", checkWeekday(1));
    }

    @Test
    void checkWeekdayTuesday() {
        assertEquals("Tuesday - only 3 days till Friday", checkWeekday(2));
    }

    @Test
    void checkWeekdayWednesday() {
        assertEquals("Wednesday - only 2 days till Friday", checkWeekday(3));
    }

    @Test
    void checkWeekdayThursday() {
        assertEquals("Thursday - only 1 day till Friday", checkWeekday(4));
    }

    @Test
    void checkWeekdayFriday() {
        assertEquals("Friday", checkWeekday(5));
    }

    @Test
    void checkWeekdaySaturday() {
        assertEquals("Saturday – it's the weekend", checkWeekday(6));
    }

    @Test
    void checkWeekdaySunday() {
        assertEquals("Sunday – it's the weekend", checkWeekday(7));
    }

    @Test
    void checkWeekdayZero() {
        assertEquals("", checkWeekday(0));
    }

    @Test
    void checkWeekdayEight() {
        assertEquals("", checkWeekday(8));
    }

    @Test
    void checkWeekdayNegativeNumber() {
        assertEquals("", checkWeekday(-3));
    }
}
