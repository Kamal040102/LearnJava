import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the total marks of each subject");
        Scanner marks = new Scanner(System.in);
        int t_marks = marks.nextInt();
        t_marks = t_marks * 5;

        System.out.print("Enter Your Marks in Subject-1: \t");
        float marksSubject1 = marks.nextFloat();
        System.out.print("Enter Your Marks in Subject-2: \t");
        float marksSubject2 = marks.nextFloat();
        System.out.print("Enter Your Marks in Subject-3: \t");
        float marksSubject3 = marks.nextFloat();
        System.out.print("Enter Your Marks in Subject-4: \t");
        float marksSubject4 = marks.nextFloat();
        System.out.print("Enter Your Marks in Subject-5: \t");
        float marksSubject5 = marks.nextFloat();

        float t_marks_gained = (marksSubject1+marksSubject2+marksSubject3+marksSubject4+marksSubject5);
        float percentageScored = (t_marks_gained / t_marks)*100;
        System.out.println("Total Marks:\t" + t_marks+ " marks.");
        System.out.println("Total Marks Gained:\t" + t_marks_gained +" marks.");
        System.out.println("Percentage Scored:\t" + percentageScored + " %.");
    }
}
