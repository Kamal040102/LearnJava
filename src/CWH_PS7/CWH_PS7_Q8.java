package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q8{
    void pattern_rec(int x){
        if(x > 0){
            pattern_rec(x - 1);

            for(int i = 1; i <= x; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        CWH_PS7_Q8 obj1 = new CWH_PS7_Q8();

        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            obj1.pattern_rec(n);
        }
        finally
        {
            inp.close();
        }
    }
}