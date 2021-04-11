package CWH_PS9;

class area_volume_Cylinder_constructors{
    private float radius;
    private float height;

    public area_volume_Cylinder_constructors(float setHeignt, float setRadius){
        radius = setRadius;
        height = setHeignt;
    }

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public double getSurfaceArea(){
        return (2f*Math.PI*radius*radius) + (2f*Math.PI*radius*height);
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }

}

public class CWH_PS9_Q3 {
    public static void main(String[] args) {
        System.out.println("All the units entered are in Centimeters (cm)");

        // Cylinder-1
        area_volume_Cylinder_constructors cylinder1 = new area_volume_Cylinder_constructors(75, 5);
        System.out.println("The Height of Cylinder-1 is:\t" + cylinder1.getHeight());
        System.out.println("The Radius of Cylinder-1 is:\t" + cylinder1.getRadius());
        System.out.println("The Surfave Area of Cylinder-1 is:\t" + cylinder1.getSurfaceArea() + " cm^2");
        System.out.println("The volume of Cylinder-1 is:\t" + cylinder1.getVolume() + " cm^3");

        System.out.println("\n\nAll the units entered are in Centimeters (cm)");
        //Cylidner 2
        area_volume_Cylinder_constructors cylinder2 = new area_volume_Cylinder_constructors(12, 3);
        System.out.println("The Height of Cylinder-2 is:\t" + cylinder2.getHeight());
        System.out.println("The Radius of Cylinder-2 is:\t" + cylinder2.getRadius());
        System.out.println("The Surfave Area of Cylinder-2 is:\t" + cylinder2.getSurfaceArea() + " cm^2");
        System.out.println("The volume of Cylinder-2 is:\t" + cylinder2.getVolume() + " cm^3");
    }
}
