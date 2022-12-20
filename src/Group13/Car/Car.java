package Group13.Car;

import Group13.Vehicle;

public class Car extends Vehicle {

    public Car(String model, int year, String engine) {
        super("Car", model, year, engine);
    }



    @Override
    public void move() {
        System.out.println(sayMyName()+" is driving");
    }

    @Override
    public String toString() {
        return super.toString()+" sayMyName";
    }


}
