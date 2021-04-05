package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q4 {
    static void pattern(int x){
        for(int i = x; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            pattern(n);
        }
        finally{
            inp.close();
        }
    }
}
