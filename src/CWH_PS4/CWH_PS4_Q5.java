package CWH_PS4;

import java.util.Scanner;

public class CWH_PS4_Q5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the year in format \"YYYY\":\t");
            short year = inp.nextShort();

            if (year % 4 == 0) {
                System.out.println("Yes, " + year + " is a Leap Year.");
            } else {
                System.out.println("No, " + year + " isn't a Leap Year.");
            }
        } finally {
            inp.close();
        }
    }
}
