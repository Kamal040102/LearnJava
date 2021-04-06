package Lectures;

import java.util.Scanner;

public class CWH_PS_Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Marks obtained in Subject-1");
            float marks1 = inp.nextFloat();
            System.out.println("Marks obtained in Subject-2");
            float marks2 = inp.nextFloat();
            System.out.println("Marks obtained in Subject-3");
            float marks3 = inp.nextFloat();

            float t_marks_obtained = marks1 + marks2 + marks3;
            float cgpa = t_marks_obtained / 30;
            System.out.print("Total marks obtained:\t" + t_marks_obtained);
            System.out.print("CGPA:\t" + cgpa);
        } finally {
            inp.close();
        }
    }
}
