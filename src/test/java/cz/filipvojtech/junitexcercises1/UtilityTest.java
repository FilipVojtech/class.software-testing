package cz.filipvojtech.junitexcercises1;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static cz.filipvojtech.junitexcercises1.Utility.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void multiple_1() {
        assertTrue(multiple(12));
    }

    @Test
    void multiple_2() {
        assertTrue(multiple(550));
    }

    @Test
    void multiple_3() {
        assertFalse(multiple(8));
    }

    @Test
    void multiple_4() {
        assertTrue(multiple(0));
    }

    @Test
    void multiple_5() {
        assertFalse(multiple(-13));
    }

    @Test
    void multiple_6() {
        assertTrue(multiple(-3));
    }

    @Test
    void multiple_7() {
        assertTrue(multiple(-5));
    }

    @Test
    void multiple_8() {
        assertTrue(multiple(-15));
    }

    @Test
    void checkLargest_1() {
        assertEquals(10, checkLargest(-10, 7, 10, -1));
    }

    @Test
    void checkLargest_2() {
        assertEquals(9, checkLargest(9, 9, 9));
    }

    @Test
    void checkLargest_3() {
        int[] arr = {0, 0, 0};
        assertEquals(0, checkLargest(arr));
    }

    @Test
    void checkLargest_4() {
        int[] arr = {-999, -3, -1};
        assertEquals(-1, checkLargest(arr));
    }

    @Test
    void checkLargest_5() {
        int[] arr = {-0, -0, -0};
        assertEquals(0, checkLargest(arr));
    }

    @Test
    void checkLargest_6() {
        assertEquals(3, checkLargest(1, 2, 3));
    }

    @Test
    void checkLargest_7() {
        assertEquals(3, checkLargest(1, 3, 2));
    }

    @Test
    void checkLargest_8() {
        assertEquals(3, checkLargest(3, 2, 1));
    }

    @Test
    void swap_1() {
        String str = "ABCD";
        assertEquals("CDAB", swap(str));
    }

    @Test
    void swap_2() {
        String str = "DKIT";
        assertEquals("ITDK", swap(str));
    }

    @Test
    void swap_3() {
        String str = "ABCDE";
        assertThrows(IllegalArgumentException.class, () -> swap(str));
    }

    @Test
    void swap_4() {
        String str = "ABC";
        assertThrows(IllegalArgumentException.class, () -> swap(str));
    }

    @Test
    void tempConvert_1() {
        int originalTemp = -56;
        double supposedConvertedTemp = -68.8;
        String convertedTempMessage = tempConvert(originalTemp, 'C');
        String supposedMessage = MessageFormat.format(Messages.celsiusToFahrenheitMessage, originalTemp, supposedConvertedTemp);

        assertEquals(supposedMessage, convertedTempMessage);
    }

    @Test
    void tempConvert_2() {
        int originalTemp = 451;
        double supposedConvertedTemp = 232.77777778;
        String convertedTempMessage = tempConvert(originalTemp, 'f');
        String supposedMessage = MessageFormat.format(Messages.fahrenheitToCelsiusMessage, originalTemp, supposedConvertedTemp);

        assertEquals(supposedMessage, convertedTempMessage);
    }

    @Test
    void tempConvert_3() {
        int originalTemp = 0;
        String convertedTempMessage = tempConvert(originalTemp, 'K');
        String supposedMessage = Messages.UNSUPPORTED_UNIT;

        assertEquals(supposedMessage, convertedTempMessage);
    }

    @Test
    void tempConvert_4() {
        int originalTemp = 0;
        double supposedConvertedTemp = 32;
        String convertedTempMessage = tempConvert(originalTemp, 'c');
        String supposedMessage = MessageFormat.format(Messages.celsiusToFahrenheitMessage, originalTemp, supposedConvertedTemp);

        assertEquals(supposedMessage, convertedTempMessage);
    }

    @Test
    void tempConvert_5() {
        int originalTemp = 32;
        double supposedConvertedTemp = 0;
        String convertedTempMessage = tempConvert(originalTemp, 'F');
        String supposedMessage = MessageFormat.format(Messages.fahrenheitToCelsiusMessage, originalTemp, supposedConvertedTemp);

        assertEquals(supposedMessage, convertedTempMessage);
    }

    @Test
    void calculateParkingFee_1() {
        assertEquals(2, calculateParkingFee(3));
    }

    @Test
    void calculateParkingFee_2() {
        assertEquals(2.50, calculateParkingFee(4));
    }

    @Test
    void calculateParkingFee_3() {
        assertEquals(12.5, calculateParkingFee(28));
    }

    @Test
    void calculateParkingFee_4() {
        // Three days and 12 hours
        assertEquals(36.5, calculateParkingFee(84));
    }

    @Test
    void calculateParkingFee_5() {
        // Three days 12 hours and 30 minutes
        assertEquals(37, calculateParkingFee(84.5));
    }

    @Test
    void calculateParkingFee_6() {
        assertEquals(0, calculateParkingFee(0));
    }

    @Test
    void calculateParkingFee_7() {
        assertEquals(0, calculateParkingFee(-20));
    }

    @Test
    void calculateParkingFee_8() {
        assertEquals(2, calculateParkingFee(0.5));
    }

    @Test
    void calculateParkingFee_9() {
        assertEquals(10, calculateParkingFee(24));
    }

    @Test
    void calculateParkingFee_10() {
        assertEquals(20, calculateParkingFee(48));
    }

    @Test
    void getOverallClassificationMessage_1() {
        assertEquals(Messages.PASS_1_1, getOverallClassificationMessage(1));
    }
}
