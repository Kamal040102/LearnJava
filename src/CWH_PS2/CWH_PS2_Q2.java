package CWH_PS2;

import java.util.Scanner;

public class CWH_PS2_Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Don't pay attention on Try and finally for now.

        try{                                                     
            System.out.println("Enter your Decrypted Grade:");
            int grade = inp.nextInt() - 8;
            System.out.println("Your grade is:\t" + grade);
        }
        finally{
            inp.close();                   
        }
    }
}
