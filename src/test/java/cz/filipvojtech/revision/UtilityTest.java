package cz.filipvojtech.revision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void sumDouble_1() {
        assertEquals(20, Utility.sumDouble(5, 5));
    }

    @Test
    void sumDouble_2() {
        assertEquals(12, Utility.sumDouble(7, 5));
    }

    @Test
    void sumDouble_3() {
        assertEquals(0, Utility.sumDouble(0, 0));
    }

    @Test
    void sumDouble_4() {
        assertEquals(0, Utility.sumDouble(-1, 1));
    }

    @Test
    void sumDouble_5() {
        assertEquals(0, Utility.sumDouble(1, -1));
    }

    @Test
    void sumDouble_6() {
        assertEquals(-4, Utility.sumDouble(-1, -1));
    }

    @Test
    void sumDouble_7() {
        assertEquals(12, Utility.sumDouble(3, 3));
    }

    @Test
    void sumDouble_8() {
        assertEquals(0, Utility.sumDouble(-3, 3));
    }

    @Test
    void sumDouble_9() {
        assertEquals(0, Utility.sumDouble(3, -3));
    }

    @Test
    void sumDouble_10() {
        assertEquals(-12, Utility.sumDouble(-3, -3));
    }

    @Test
    void sleepIn_1() {
        assertTrue(Utility.sleepIn(true, true));
    }

    @Test
    void sleepIn_2() {
        assertFalse(Utility.sleepIn(true, false));
    }

    @Test
    void sleepIn_3() {
        assertTrue(Utility.sleepIn(false, true));
    }

    @Test
    void sleepIn_4() {
        assertTrue(Utility.sleepIn(false, false));
    }

    @Test
    void modSleepIn_1() {
        assertEquals(6, Utility.modSleepIn(true, true, true));
    }

    @Test
    void modSleepIn_2() {
        assertEquals(2, Utility.modSleepIn(true, true, false));
    }

    @Test
    void modSleepIn_3() {
        assertEquals(4, Utility.modSleepIn(true, false, true));
    }

    @Test
    void modSleepIn_4() {
        assertEquals(0, Utility.modSleepIn(true, false, false));
    }

    @Test
    void modSleepIn_5() {
        assertEquals(7, Utility.modSleepIn(false, true, true));
    }

    @Test
    void modSleepIn_6() {
        assertEquals(3, Utility.modSleepIn(false, true, false));
    }

    @Test
    void modSleepIn_7() {
        assertEquals(5, Utility.modSleepIn(false, false, true));
    }

    @Test
    void modSleepIn_8() {
        assertEquals(1, Utility.modSleepIn(false, false, false));
    }

    @Test
    void monkeyTrouble_1() {
        assertTrue(Utility.monkeyTrouble(true, true));
    }

    @Test
    void monkeyTrouble_2() {
        assertFalse(Utility.monkeyTrouble(true, false));
    }

    @Test
    void monkeyTrouble_3() {
        assertFalse(Utility.monkeyTrouble(false, true));
    }

    @Test
    void monkeyTrouble_4() {
        assertTrue(Utility.monkeyTrouble(false, false));
    }

    @Test
    void love6_1() {
        assertTrue(Utility.love6(6, 6));
    }

    @Test
    void love6_2() {
        assertTrue(Utility.love6(9, 3));
    }

    @Test
    void love6_3() {
        assertTrue(Utility.love6(3, 3));
    }

    @Test
    void love6_4() {
        assertTrue(Utility.love6(-9, -3));
    }

    @Test
    void love6_5() {
        assertFalse(Utility.love6(3, -12));
    }
}
