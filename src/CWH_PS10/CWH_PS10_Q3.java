package CWH_PS10;

class Q3_circle{
    int radius;
    int height;
    public double area_circle(){
        return Math.PI*radius*radius;
    }
    public double volume_circle(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
}

class Q3_cylinder extends Q3_circle{
    public double area_cylinder(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double volume_cylinder(){
        return Math.PI*radius*radius*height;
    }


    public Q3_cylinder(int r, int h) {
        radius = r;
        height = h;
    }
    public Q3_cylinder(int r){
        radius = r;
    }
}

public class CWH_PS10_Q3 {
    public static void main(String[] args) {
        Q3_cylinder obj = new Q3_cylinder(8, 9);
        System.out.println("The area of circle is "+obj.area_circle());
        System.out.println("The area of cylinder is "+obj.area_cylinder());
        System.out.println("The volume of circle is "+obj.volume_circle());
        System.out.println("The volume of cylidner is "+obj.volume_cylinder());
    }
}
