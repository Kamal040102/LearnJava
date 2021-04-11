package CWH_PS9;

class sphere{
    private float radius;

    public void setRadius(float y){
        radius = y;
    }

    public float getRadius(){
        return radius;
    }

}

public class CWH_PS9_Q5 {
    public static void main(String[] args) {
        sphere sphere1 = new sphere();
        sphere1.setRadius(17);
        System.out.println(sphere1.getRadius());
    }
}
