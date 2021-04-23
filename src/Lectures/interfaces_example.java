package Lectures;

import java.util.Scanner;

interface MyCamera {
    void takeSnap();

    void recordVideo();

    default void record4Kvideo() {
        System.out.println("Recording video in 4K");
    }
}

interface MyWifi {
    String[] showNetworks();

    void connectToNetwork(String x);
}

class myCellPhone {
    void makeACall(int number) {
        System.out.println("Calling....." + number);
    }

    void endCall() {
        System.out.println("Call Ended");
    }
}

class mySmartPhone extends myCellPhone implements MyCamera, MyWifi {
    @Override
    public String[] showNetworks() {
        // TODO Auto-generated method stub
        System.out.println("Getting list of networks..........\n\nThese are the networks i found");
        String[] listOfNetwork = { "Kamal", "Gulabo", "Movika", "MrAjibSharma" };
        return listOfNetwork;
    }

    @Override
    public void connectToNetwork(String x) {
        // TODO Auto-generated method stub
        System.out.println("Connecting to Network " + x + ".....");
        System.out.println("Connect to network " + x + ".");
    }

    @Override
    public void takeSnap() {
        // TODO Auto-generated method stub
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        // TODO Auto-generated method stub
        System.out.println("Recording Video...");
    }

    @Override
    public void record4Kvideo() {
        // TODO Auto-generated method stub
        System.out.println("Recording 4K video and taking a snap tooo");
    }
}

public class interfaces_example {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            mySmartPhone msp = new mySmartPhone();
            String[] ar = msp.showNetworks();
            for (String item : ar) {
                System.out.println(item);
            }
            System.out.println("\nWhich network you want to connect with?");
            String net = inp.nextLine();
            System.out.println("Connecting to " + net + ".....");
            System.out.println("Connected to " + net + " successfully.");

            msp.takeSnap();
            msp.recordVideo();
            msp.record4Kvideo();
        } finally {
            inp.close();
        }
    }
}
