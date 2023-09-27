package cz.filipvojtech.junitexcercises1;

import java.text.MessageFormat;

public class Utility {
    private static final double C_TO_F = 9d / 5d;
    private static final double F_TO_C = 5d / 9d;

    // Write a Java method, multiple {}, to check whether an integer value,
    // passed as a parameter, is a multiple of 3 or 5.
    public static boolean multiple(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

    // Write a Java method, checkLargest {}
    // to check which of 3 integer values,
    // passed as parameters, is the largest.
    public static int checkLargest(int... numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Write a Java method, swap {},
    // to swap the first 2 letters of a 4-letter string,
    // passed as a parameter,
    // with the last 2 e.g. “ABCD” is swapped to “CDAB”.
    public static String swap(String input) {
        if (input.length() != 4) {
            throw new IllegalArgumentException("Argument not of length 4");
        }

        return input.substring(2) + input.substring(0, 2);
    }

    // Write a Java method, tempConvert {},
    // which receives 2 arguments,
    // and integer denoting a temperature and a letter ‘F’ or ‘C’
    //  denoting whether the temperature is in Fahrenheit or Celsius.
    // Your method should return the message
    // “The Celsius/Fahrenheit equivalent of 999 Celsius/Fahrenheit is 999”.
    public static String tempConvert(int temperature, char unit) {
        double convertedTemp;

        switch (unit) {
            case 'C':
            case 'c':
                convertedTemp = C_TO_F * temperature + 32;
                return MessageFormat.format(Messages.celsiusToFahrenheitMessage, temperature, convertedTemp);
            case 'F':
            case 'f':
                convertedTemp = F_TO_C * (temperature - 32);
                return MessageFormat.format(Messages.fahrenheitToCelsiusMessage, temperature, convertedTemp);
            default:
                return Messages.UNSUPPORTED_UNIT;
        }
    }

    // A multi-storey car park charges a €2.00 minimum fee to park for up to 3 hours.
    // The car park charges an additional €0.50 for each hour,
    // or any part of an hour, in excess of 3 hours.
    // The maximum charge for any 24-hour period is €10.00.
    // Write a Java method, which receives a double,
    // representing how many hours the customer has parked, and calculates the required payment.
    public static double calculateParkingFee(double hoursParked) {
        if (hoursParked <= 0) {
            return 0;
        }

        double fee = 0;
        // How many hours did the owner parked the last day or the only day
        double lastDayHoursParked = hoursParked % 24;
        // How many days has the owner parked
        int days = (int) (hoursParked - lastDayHoursParked) / 24;

        // Calculate fee for every day parked
        fee += days * 10;
        // Calculate the base fee
        fee += 2;
        // Remove the three-hour period
        lastDayHoursParked -= 3;

        // If there are remaining hours
        // add the hourly fee for each hour parked
        if (lastDayHoursParked > 0) {
            fee += Math.ceil(lastDayHoursParked) * 0.5d;
        }

        return fee;
    }

    // Write a Java method that accepts an array of integers,
    // representing the student’s marks,
    // calculates the average
    // and returns a message indicating the student’s overall award classification.
    private static String getOverallClassificationMessage(int... marks) {
        int sum = 0, count = marks.length;
        float average;

        for (var mark : marks) {
            sum += mark;
        }
        average = (float) sum / count;

        if (average > .69) {
            return Messages.PASS_1_1;
        } else if (average > .59) {
            return Messages.PASS_2_1;
        } else if (average > .49) {
            return Messages.PASS_2_2;
        } else if (average > .39) {
            return Messages.PASS;
        } else {
            return Messages.FAIL;
        }
    }
}
