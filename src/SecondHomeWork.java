/**
 * Lesson 2. HomeWork
 *
 * @author SotnikovVS
 * @version 04.11.2021
 *
 */
public class SecondHomeWork {
    public static void main (String[] args) {
        System.out.println("*** Task 1 ***");
        System.out.println();
        System.out.println("a = 5, b = 1, result = "+checkSum(5,1));
        System.out.println("a = 5, b = 5, result = "+checkSum(5,5));
        System.out.println("a = 10, b = 5, result = "+checkSum(10,5));
        System.out.println("a = 10, b = 10, result = "+checkSum(10,10));
        System.out.println("a = 15, b = 12, result = "+checkSum(15,12));
        System.out.println();

        System.out.println("*** Task 2 ***");
        System.out.println();
        System.out.print("\"-2\" ");
        checkNumSign(-2);
        System.out.print("\"0\" ");
        checkNumSign(0);
        System.out.print("\"2\" ");
        checkNumSign(2);
        System.out.println();

        System.out.println("*** Task 3 ***");
        System.out.println();
        System.out.println("number \"-3\" "+checkNumBool(-3));
        System.out.println("number \"0\" "+checkNumBool(0));
        System.out.println("number \"3\" "+checkNumBool(3));
        System.out.println();

        System.out.println("*** Task 4 ***");
        System.out.println();
        printString("street",5);
        System.out.println();

        System.out.println("*** Task 5 ***");
        System.out.println();
        System.out.println("Year \"1600\" "+checkLeapYear(1600));
        System.out.println("Year \"1650\" "+checkLeapYear(1650));
        System.out.println("Year \"1700\" "+checkLeapYear(1700));
        System.out.println("Year \"2000\" "+checkLeapYear(2000));
        System.out.println("Year \"2100\" "+checkLeapYear(2100));
        System.out.println("Year \"2021\" "+checkLeapYear(2021));
        System.out.println("Year \"2024\" "+checkLeapYear(2024));
        System.out.println();

    }

public static Boolean checkSum (int a, int b) {
            int sum = a + b;
        if (sum >= 10 && sum<=20)
            return true;
        else
            return false;
}

public static void checkNumSign (int a) {
            String answer = "unknown";
        if (a >=0)
            answer = "Positive number";
        else
            answer = "Negative number";
        System.out.println(answer);
}

public static boolean checkNumBool (int a) {
        if (a >= 0)
            return true;
        else
            return false;
}

public static void printString (String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
}

public static boolean checkLeapYear (int year) {
        if ((year % 4) == 0 && ((year % 100) != 0) || (year % 400) == 0)
            return true;
        else
            return false;
}
}
