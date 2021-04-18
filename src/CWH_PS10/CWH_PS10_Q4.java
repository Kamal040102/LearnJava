package CWH_PS10;

import java.util.Scanner;

class Q4_rectangle {
    int length;
    int width;
    int height;

    public int getArea_Rectangle() {
        return width * length;
    }

    public int getVolume_Rectangle() {
        return length * width * height;
    }
}

class Q4_cuboid extends Q4_rectangle {
    public int getArea_cuboid() {
        // Area => 2lw+2lh+2hw
        return (2 * length * width) + (2 * length * height) + (2 * height * width);
    }

    public int getVolume_cuboid() {
        // Volume => Length × Width × Height
        return length * width * height;
    }

    public Q4_cuboid(int length, int height, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
}

public class CWH_PS10_Q4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter Length:\t");
            int length = inp.nextInt();
            System.out.print("Enter Width:\t");
            int width = inp.nextInt();
            System.out.print("Enter Height:\t");
            int height = inp.nextInt();
            Q4_cuboid obj = new Q4_cuboid(length, height, width);
            System.out.println("The area of rectangle is " + obj.getArea_Rectangle());
            System.out.println("The area of cuboid is " + obj.getArea_cuboid());
            System.out.println("The volume of rectangle is " + obj.getVolume_Rectangle());
            System.out.println("The volume of cuboid is " + obj.getVolume_cuboid());
        } finally {
            inp.close();
        }
    }
}
