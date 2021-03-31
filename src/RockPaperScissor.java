import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to this Rock, Paper, Scissor Game");

        System.out.println("Developed By: Kamal Sharma");
        System.out.println("------------------------------------------------------");

        int i = 1;
        while (i <= 3) {
            // User Side

            System.out.println("Enter your input: Scissor, Paper or Rock");
            String userMove = inp.nextLine();

            int userMoveAnalyzer = -1;

            if (userMove.equals("Scissor")) {
                userMoveAnalyzer = 0;
            } else if (userMove.equals("Paper")) {
                userMoveAnalyzer = 1;
            } else if (userMove.equals("Rock")) {
                userMoveAnalyzer = 2;
            } else {
                System.out.println("Invalid User Input");
            }

            // Opponent Side

            int opponentMove = rand.nextInt(3);

            String opponentMoveAnalyzer = "";

            if (opponentMove == 0) {
                opponentMoveAnalyzer = "Scissor";
            } else if (opponentMove == 1) {
                opponentMoveAnalyzer = "Paper";
            } else if (opponentMove == 2) {
                opponentMoveAnalyzer = "Rock";
            } else {
                System.out.println("Invalid Opponent Move");
            }

            // Printing Moves
            System.out.println("Your Move: " + userMove);
            System.out.println("My Move: " + opponentMoveAnalyzer);

            // Result Side
            String result = "";
            System.out.println("");
            System.out.println("");
            if (userMoveAnalyzer == opponentMove) {
                // System.out.println("There is tie between us.");
                result = "There is tie between us";
            } else if (userMoveAnalyzer == 0 && opponentMove == 1) {
                // System.out.println("Congratulations!!!, You won");
                result = "Congratulations!!!, You won";
            } else if (userMoveAnalyzer == 0 && opponentMove == 2) {
                // System.out.println("Alas!!!, You Lost. Better Luck Next Time.");
                result = "Alas!!!, You Lost. Better Luck Next Time.";
            } else if (userMoveAnalyzer == 1 && opponentMove == 2) {
                // System.out.println("Congratulations!!!, You won");
                result = "Congratulations!!!, You won";
            } else if (userMoveAnalyzer == 1 && opponentMove == 0) {
                // System.out.println("Alas!!!, You Lost. Better Luck Next Time.");
                result = "Alas!!!, You Lost. Better Luck Next Time.";
            } else if (userMoveAnalyzer == 2 && opponentMove == 0) {
                // System.out.println("Congratulations!!!, You won");
                result = "Congratulations!!!, You won";
            } else if (userMoveAnalyzer == 2 && opponentMove == 1) {
                // System.out.println("Alas!!!, You Lost. Better Luck Next Time.");
                result = "Alas!!!, You Lost. Better Luck Next Time.";
            } else {
                // System.out.println("Error 404: Can't generate Result.");
                result = "Error 404: Can't generate Result.";
            }

            System.out.println("Result:\t" + result.toUpperCase());
            i++;
            System.out.println("");
            System.out.println("");
        }
    }
}