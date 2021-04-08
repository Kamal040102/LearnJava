package CWH_PS8;

class smartPhone{
    void ringing(){
        System.out.println("ringing.........");
    }

    void vibrating(){
        System.out.println("vibrating........");
    }

    void playing(){
        System.out.println("playing........");
    }

    void call(String name){
        System.out.printf("Calling %s..........\n", name);
    }
}

public class CWH_PS8_Q2 {
    public static void main(String[] args) {
        smartPhone realme = new smartPhone();
        realme.call("Gulabo");
        realme.ringing();
        realme.vibrating();
        realme.playing();
    }
}
