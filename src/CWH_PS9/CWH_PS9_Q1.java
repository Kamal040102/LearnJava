package CWH_PS9;

class cylinder{
    private float radius;
    private float height;

    public void setHeight(float x){
        height = x;
    }
    public void setRadius(float y){
        radius = y;
    }

    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }

}

public class CWH_PS9_Q1 {
    public static void main(String[] args) {
        cylinder cylinder1 = new cylinder();
        cylinder1.setHeight(12);
        cylinder1.setRadius(17);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getRadius());
    }
}
