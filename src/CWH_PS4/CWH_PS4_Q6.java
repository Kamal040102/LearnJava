package CWH_PS4;

import java.util.Scanner;

public class CWH_PS4_Q6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Enter the url:\t");
        String url = inp.nextLine();

        if(url.endsWith(".com")){
            System.out.println(url +" is a commercial website.");
        }
        else if(url.endsWith(".org")){
            System.out.println(url + " is an organisation website.");
        }
        else if(url.endsWith(".in")){
            System.out.println(url + " is an indian website.");
        }
        else{
            System.out.println("I do not have that much of knowledge.");
        }
    }
}
