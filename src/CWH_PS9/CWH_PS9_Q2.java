//(2f*Math.PI*radius*radius) + (2f*Math.PI*radius*height)
//Math.PI*radius*radius*height

package CWH_PS9;

class area_volume_Cylinder{
    private float height;
    private float radius;

    public void setHeight(float x){
        height = x;
    }
    public void setRadius(float x){
        radius = x;
    }
    public float getHeight(){
        return height;
    }
    public float getRadius(){
        return radius;
    }
    public double get_Surface_Area(){
        return (2f*Math.PI*radius*radius) + (2f*Math.PI*radius*height);
    }
    public double get_Volume(){
        return Math.PI*radius*radius*height;
    }

}

class CWH_PS9_Q2{
    public static void main(String[] args) {
        area_volume_Cylinder cylinder1 = new area_volume_Cylinder();
        cylinder1.setHeight(5);
        cylinder1.setRadius(7);
        System.out.println("Height:\t" + cylinder1.getHeight());
        System.out.println("Radius:\t" + cylinder1.getRadius());
        System.out.println("Surface Area:\t" + cylinder1.get_Surface_Area());
        System.out.println("Volume:\t" + cylinder1.get_Volume());
    }
}