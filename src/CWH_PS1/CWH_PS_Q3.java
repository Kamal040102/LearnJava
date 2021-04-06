package CWH_PS1;

import java.util.Scanner;

public class CWH_PS_Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter your full name:\t");
            String name = inp.nextLine();
            System.out.print("Hello, " + name + ", have a good day.");
        } finally {
            inp.close();
        }
    }
}
