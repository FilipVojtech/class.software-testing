package cz.filipvojtech.revision;

public class Utility {
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        return a == b ? sum * 2 : sum;
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public static int modSleepIn(boolean weekday, boolean vacation, boolean doIWantTo) {
        return (weekday ? 0 : 1) + (vacation ? 2 : 0) + (doIWantTo ? 4 : 0);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static boolean love6(int a, int b) {
        return a == b || Math.abs(a + b) == 6 || Math.abs(a - b) == 6;
    }
}
