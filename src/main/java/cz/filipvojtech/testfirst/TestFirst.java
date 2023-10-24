package cz.filipvojtech.testfirst;

public class TestFirst {
    public static String checkWeekday(int day) {
        var daysTillFri = 5 - day;
        switch (day) {
            case 1:
                return "Monday - it's the beginning of the week";
            case 2:
                return "Tuesday - only " + daysTillFri + " days till Friday";
            case 3:
                return "Wednesday - only " + daysTillFri + " days till Friday";
            case 4:
                return "Thursday - only " + daysTillFri + " day till Friday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday – it's the weekend";
            case 7:
                return "Sunday – it's the weekend";
            default:
                return "";
        }
    }
}
