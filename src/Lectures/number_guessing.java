package Lectures;

import java.util.Scanner;
import java.util.Random;

class number_guessing_game {
    Random rand = new Random();
    Scanner inp1 = new Scanner(System.in);
    private int r_Number = rand.nextInt(100);
    private int userInput;

    public void gameResult(int x) {
        this.userInput = x;
        int counter = 1;
        do {
            if (this.userInput > r_Number) {
                System.out.println("The number guessed by you is greater than actual number");
                if(this.userInput > (r_Number + 25)){
                    System.out.println("Ṭhe actual number is between " + (r_Number - 25) + " & " + (r_Number + 10) + ".");
                }
                else{
                    if(r_Number % 3 == 0){
                        System.out.println("The actual number is divisible by 2nd Positive Odd Number");
                    }
                    else{
                        System.out.println("Ṭhe actual number is between " + (r_Number - 15) + " & " + (r_Number + 15) + ".");
                    }
                }
            } else if (this.userInput == r_Number) {
                System.out.println("Well done!!! You got the number.");
                break;
            } else {
                System.out.println("The number guessed by you is smaller than the actual number");
                System.out.println("The actual number is between " + (r_Number - 20) + " & " + (r_Number + 20) + ".");
            }
            counter++;
            System.out.println("Enter your guess:\t");
            this.userInput = inp1.nextInt();
        } while (this.userInput != r_Number);
        System.out.println("You got the number in " + counter + " turns.");
    }
}

public class number_guessing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        number_guessing_game obj = new number_guessing_game();

        System.out.print("Enter your guess:\t");
        int x = inp.nextInt();

        obj.gameResult(x);
    }
}
