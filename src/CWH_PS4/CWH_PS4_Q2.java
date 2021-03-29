import java.util.Scanner;

public class CWH_PS4_Q2 {
    public static void main(String[] args) {

        /*
        MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ   MUST READ
        ------------------------------------------------------------------------------------------------------------------------------------
        This is the programme which will generate the result according to the marks entered by the user:

            Result-1: If the user is passed in all the subjects then only user will be considered "Pass" in the exam. For this, user has to score more than or equal to 33% in each subject "and" 40% of the total marks.
            
            Result-2: If the user is failed in any of the subject i.e. if the marks are less than 33% in any of the subject then user will be considered "Fail" in exam.

            Result-3: If the user is pass in all exam but the total marks scored by the user is less than 40% of the total marks then user will be considered "Fail" in the exam.
        ------------------------------------------------------------------------------------------------------------------------------------
        */
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter total marks of each subject");
        byte totalMarksOfEachSubject = inp.nextByte();
        int totalMarksofAllSubject = totalMarksOfEachSubject * 3;


        float passingMarksOfEachSubject = (totalMarksOfEachSubject * 33) / 100F;
        float passingMarksOfAllSubject = (totalMarksofAllSubject * 40) / 100F;

        System.out.print("Enter your marks of subject 1:\t");
        float marksOfSubject1 = inp.nextFloat();
        System.out.print("Enter your marks of subject 2:\t");
        float marksOfSubject2 = inp.nextFloat();
        System.out.print("Enter your marks of subject 3:\t");
        float marksOfSubject3= inp.nextFloat();

        float totalMarksScored = marksOfSubject1 + marksOfSubject2 + marksOfSubject3;

        boolean failedInAnySubject;

        if(marksOfSubject1 < passingMarksOfEachSubject || marksOfSubject2 < passingMarksOfEachSubject || marksOfSubject3 < passingMarksOfEachSubject){
            System.out.println(" ");
            System.out.println("Subject-wise Result: You are fail in any one of the subject.");
            failedInAnySubject = true;
        }
        else{
            System.out.println(" ");
            System.out.println("Subject-wise Result: You are pass in all Subjects");
            failedInAnySubject = false;
        }

        System.out.println(" ");
        System.out.println("Maximum marks can be scored in Each Subject:\t" + totalMarksOfEachSubject);
        System.out.println("Maximum marks can be scored including all SubjecT:\t" + totalMarksofAllSubject);
        System.out.println("Passing marks of Each Subject are:\t" + passingMarksOfEachSubject);
        System.out.println("Total marks to be Scored for consider \"Pass\": \t" + passingMarksOfAllSubject);
        System.out.println("Total marks Scored by You:\t" + totalMarksScored);
        System.out.println(" ");

        if(failedInAnySubject == true || totalMarksScored < passingMarksOfAllSubject){
            System.out.println("Result: Sorry, you havent cleared the exam, Better Luck next Time.");
        }
        else if (failedInAnySubject == false && totalMarksScored >= passingMarksOfAllSubject){
            System.out.println("Result: Congratulations, You have cleared the Exam.");
        }
        else{
            System.out.println("Result: Sorry, you havent cleared the Exam, Better Luck next Time.");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Thank You for using my Java Code.");
    }
}
