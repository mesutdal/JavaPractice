package Group13.Ship;

import Group13.Vehicle;

public class Yacht extends Ship {

    private int skipper;

    public Yacht(int year, String engine, int skipper) {
        super("Yacht", year, engine);
        this.skipper = skipper;
    }

    public void luxury(){
        System.out.println(sayMyName()+" is laying");
    }

    @Override
    public String toString() {
        return super.toString()+" sailing like butter on the sea";
    }

}
