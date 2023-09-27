package cz.filipvojtech.junitexcercises1;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static cz.filipvojtech.junitexcercises1.Utility.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void multiple_1() {
        assertTrue(multiple(234));
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
    void checkLargest_1() {
        assertEquals(10, checkLargest(5, 7, 10, 0, -1, -10));
    }

    @Test
    void checkLargest_2() {
        assertEquals(9, checkLargest(9, 9, 9, 9, 9, 9, 9));
    }

    @Test
    void checkLargest_3() {
        int[] arr = {0, 0, 0};
        assertEquals(0, checkLargest(arr));
    }

    @Test
    void checkLargest_4() {
        int[] arr = {-5, -1, -999, -3};
        assertEquals(-1, checkLargest(arr));
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
    void tempConvert_1() {
        int originalTemp = 56;
        double supposedConvertedTemp = 132.8;
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
        int originalTemp = 288;
//        double supposedConvertedTemp = 14.85;
        String convertedTempMessage = tempConvert(originalTemp, 'K');
        String supposedMessage = Messages.UNSUPPORTED_UNIT;

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
        // Three days and 12 hours
        assertEquals(37, calculateParkingFee(84.5));
    }
}
