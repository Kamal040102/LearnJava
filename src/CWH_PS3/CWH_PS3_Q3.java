package CWH_PS3;

import java.util.Scanner;

public class CWH_PS3_Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            String letter = "Hello name, Thanks a lot";
            String name = inp.nextLine();
            System.out.println(letter);
            System.out.println(letter.replace("name", name));
        } finally {
            inp.close();
        }
    }
}
