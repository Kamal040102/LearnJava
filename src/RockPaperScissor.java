import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Rock Paper Scissor Game");
        System.out.println("----------------------------------------------------");

        // User Input
        System.out.println("Enter your Move: Rock, Paper or Scissor");
        String userMove = inp.nextLine();
        int userMoveAnalyzer;

        if(userMove == "Scissor"){
            userMoveAnalyzer = 0;
        }
        else if(userMove == "Paper"){
            userMoveAnalyzer = 1;
        }
        else if(userMove == "Rock"){
            userMoveAnalyzer = 2;
        }
        else{
            System.out.println("Invalid User Input Error");
        }


        // Opponent Move Genration
        int randomOpponentMove = rand.nextInt(3);
        // System.out.println(randomOpponentMove);  // Delete this line

        String opponentMove = "";

        if(randomOpponentMove == 0){
            opponentMove = "Scissor";
        }
        else if(randomOpponentMove == 1){
            opponentMove = "Paper";
        }
        else if (randomOpponentMove == 2){
            opponentMove = "Rock";
        }
        else{
            System.out.println("Invalid Random Opponent Move Error.");
        }

        System.out.println("Your Move: " + userMove + "|| My Move: " + opponentMove + ".");
        // Result Generation
        if (userMove == opponentMove){
            
            System.out.println("There is a tie between you and me");
        }
        else{
            System.out.println("Different");
        }

    }
}
