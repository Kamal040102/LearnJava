import java.util.Scanner;

public class CWH_PS2_Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = 55;

        System.out.println("Enter a integer");
        int userInt = inp.nextInt();
        if(userInt >= a){
            System.out.println("You are Awesooomeeee!!!!!");
        }
        else{
            System.out.println("Your are Ugly");
        }
    }
}
