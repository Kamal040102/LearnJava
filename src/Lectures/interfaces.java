package Lectures;

interface cycle{
    void cycleName(String cycle_Name);
    void cycleModel(int cycle_ModelNo);
}

class AvonCycles implements cycle{
    String name;
    int model;
    @Override
    public void cycleName(String cycle_Name) {
        this.name = cycle_Name;
        // TODO Auto-generated method stub
        System.out.println("Brand:\t"+cycle_Name);
    }

    @Override
    public void cycleModel(int cycle_ModelNo) {
        this.model = cycle_ModelNo;
        // TODO Auto-generated method stub
        System.out.println("Model:\t" + cycle_ModelNo);
    }


    public AvonCycles(String name, int model) {
        this.name = name;
        this.model = model;
    }

}

public class interfaces{
    public static void main(String[] args) {
       cycle obj = new AvonCycles("Avon", 18);
       obj.cycleName(cycle_Name);
    }
}