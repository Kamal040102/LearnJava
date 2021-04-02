package CWH_PS4;

import java.util.Scanner;

public class CWH_PS4_Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter your Income:\t");
        float income = inp.nextInt();
        float incomeTax;

        if(income < 250000){
            System.out.println("There is no Income Tax on income below 2.5 lacks.");
        }
        else if(income >= 250000 && income < 500000){
            incomeTax = (income * 5)/100;
            System.out.println("You need to pay " + incomeTax + " Tax on your Income.");
        }
        else if(income >= 500000 && income < 1000000){
            incomeTax = (income*20)/100;
            System.out.println("You need to pay " + incomeTax + " Tax on your Income.");
        }
        else{
            incomeTax = (income * 30)/100;
            System.out.println("You need to pay " + incomeTax + " Tax on your Income.");
        }
    }
}
