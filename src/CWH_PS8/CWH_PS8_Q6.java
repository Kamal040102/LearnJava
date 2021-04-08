package CWH_PS8;

import java.util.Scanner;

class circle{
    float radius;
    float height;

    double printAreaOfCircle(){
        return Math.PI * radius * radius * height;
    }

    double printPerimeterOfCircle(){
        return 2* Math.PI * radius * height;
    }

    double printVolumeofCircle(){
        return (4/3) * Math.PI * radius * radius * radius;
    }
}


public class CWH_PS8_Q6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        circle circle1 = new circle();
        try{
            System.out.println("Enter a radius");
            float r = inp.nextFloat();
            System.out.println("Enter height");
            float h = inp.nextFloat();

            circle1.radius = r;
            circle1.height = h;

            System.out.println(circle1.printAreaOfCircle());
            System.out.println(circle1.printVolumeofCircle());
            System.out.println(circle1.printPerimeterOfCircle());
        }
        finally{
            inp.close();
        }
        
    }
}
