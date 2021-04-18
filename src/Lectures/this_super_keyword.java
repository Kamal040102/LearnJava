package Lectures;

class Ekclass {
    int x;

    public int getX() {
        return x;
    }

    public Ekclass(int x) {
        this.x = x;
    }
}

class dusriClass extends Ekclass{
    public dusriClass(int c) {
        super(c);
    }
}

public class this_super_keyword {
    public static void main(String[] args) {
        Ekclass obj = new Ekclass(77);
        dusriClass obj1 = new dusriClass(5);
        System.out.println(obj.getX());
        System.out.println(obj1.getX());
    }
}
