package CWH_PS2;

import java.util.Scanner;
public class CWH_PS2_Q4 {
    /*
        Eqn :      v^2 - u^2
                  -----------
                     2a5
                  
                =   (v*v - u*u) / (2*a*5)
                =      r  /  (2 * a * 5)
                =      r  /      r1
                =         result
    */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // int v = inp.nextInt();
        // int u = inp.nextInt();
        // int a = inp.nextInt();

        float result = (3*3 - 2*2)/(2*1f*5);
        System.out.println(result);
    }
}
