package cz.filipvojtech.selfassessment;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        final boolean divBy3 = number % 3 == 0;
        final boolean divBy5 = number % 5 == 0;
        String out = "";

        if (!divBy3 && !divBy5) {
            return Integer.toString(number);
        }
        if (divBy3) {
            out += "Fizz";
        }
        if (divBy5) {
            out += "Buzz";
        }

        return out;
    }
}
