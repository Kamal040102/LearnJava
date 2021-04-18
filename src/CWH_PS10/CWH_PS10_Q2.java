package CWH_PS10;

class rectangle{
    public void name(){
        System.out.println("I am a rectangle.");
    }
}

class cuboid extends rectangle{
    @Override   
    public void name(){
        System.out.println("I am a cuboid.");
    }
}

public class CWH_PS10_Q2 {
    public static void main(String[] args) {
        rectangle obj = new cuboid();
        obj.name();
    }
}
