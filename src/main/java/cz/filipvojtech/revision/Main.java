package cz.filipvojtech.revision;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the numbers is " + Utility.sumDouble(5, 5));
        System.out.println("The sum of the numbers is " + Utility.sumDouble(7, 5));
        System.out.println("The sum of the numbers is " + Utility.sumDouble(0, 0));
        System.out.println("The sum of the numbers is " + Utility.sumDouble(-1, 1));
        System.out.println("The sum of the numbers is " + Utility.sumDouble(1, -1));
        System.out.println("The sum of the numbers is " + Utility.sumDouble(-1, -1));
        System.out.println();

        System.out.println(MessageFormat.format("You {0} sleep in.", Utility.sleepIn(true, true) ? "can" : "cannot"));
        System.out.println(MessageFormat.format("You {0} sleep in.", Utility.sleepIn(true, false) ? "can" : "cannot"));
        System.out.println(MessageFormat.format("You {0} sleep in.", Utility.sleepIn(false, true) ? "can" : "cannot"));
        System.out.println(MessageFormat.format("You {0} sleep in.", Utility.sleepIn(false, false) ? "can" : "cannot"));
        System.out.println();

        System.out.println(MessageFormat.format("We {0} in trouble.", Utility.monkeyTrouble(true, true) ? "are" : "aren't"));
        System.out.println(MessageFormat.format("We {0} in trouble.", Utility.monkeyTrouble(true, false) ? "are" : "aren't"));
        System.out.println(MessageFormat.format("We {0} in trouble.", Utility.monkeyTrouble(false, true) ? "are" : "aren't"));
        System.out.println(MessageFormat.format("We {0} in trouble.", Utility.monkeyTrouble(false, false) ? "are" : "aren't"));
        System.out.println();

        int sleepInCode = Utility.modSleepIn(true, true, false);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(true, false, false);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(false, true, false);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(false, false, false);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(true, true, true);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(true, false, true);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(false, true, true);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        sleepInCode = Utility.modSleepIn(false, false, true);
        System.out.println(MessageFormat.format("You {0} sleep in. Code {1}", sleepInCode > 0 ? "can" : "cannot", sleepInCode));
        System.out.println();

        System.out.println(MessageFormat.format("We {0}.", Utility.love6(6, 6) ? "love" : "hate"));
        System.out.println(MessageFormat.format("We {0}.", Utility.love6(9, 3) ? "love" : "hate"));
        System.out.println(MessageFormat.format("We {0}.", Utility.love6(3, 3) ? "love" : "hate"));
        System.out.println(MessageFormat.format("We {0}.", Utility.love6(-9, -3) ? "love" : "hate"));
        System.out.println(MessageFormat.format("We {0}.", Utility.love6(3, -12) ? "love" : "hate"));
        System.out.println();
    }
}
