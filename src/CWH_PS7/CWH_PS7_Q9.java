package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q9 {
    static float ctof(Float x){
        return x*9/5 + 32;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter temperature in celcius");
            float n = inp.nextInt();
            System.out.println(ctof(n) + " F");
        }
        finally{
            inp.close();
        }
    }
}
