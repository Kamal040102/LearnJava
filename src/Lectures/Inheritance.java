package Lectures;

class phone {
    String x = "I am a phone of class phone";
}

class smartphone extends phone {
    String y = "I am a smartphone of class smartphone";
}

public class Inheritance {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        System.out.println(sp.y);
        System.out.println(sp.x);
    }
}