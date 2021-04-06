package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q7 {
    void pattern_rec2(int x){
        if(x > 0){

            for (int i = x; i >= 1; i--){
                System.out.print("*");
            }
            System.out.println("");

            pattern_rec2(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        CWH_PS7_Q7 obj2 = new CWH_PS7_Q7();

        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            obj2.pattern_rec2(n);
        }
        finally{
            inp.close();
        }
    }
}
