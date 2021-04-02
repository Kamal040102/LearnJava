package CWH_PS1;

import java.util.Scanner;

public class CWH_PS_Q4 {
    //KM to Mile
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter distance in Kilometers:\t");
        float km = inp.nextFloat();
        double distMile = km * 0.621371;
        System.out.print("The distance in miles is:\t" + distMile + " miles.");
    }
}
