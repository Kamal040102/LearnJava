package CWH_PS1;

import java.util.Scanner;

public class CWH_PS_Q5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter a input");
            boolean result = inp.hasNextInt();

            System.out.println("The result is:\t" + result);
        } finally {
            inp.close();
        }
    }
}
