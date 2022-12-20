package Group13;

import Group13.Airplane.Airbus;
import Group13.Airplane.Airplane;
import Group13.Car.Mercedes;
import Group13.Ship.Yacht;

public class VehicleObject {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes(1988, "True", "Yes");

        System.out.println(mercedes);

        mercedes.setYear(2023);

        System.out.println(mercedes);

        System.out.println("----------------------------------");

        Airbus airbus = new Airbus(2001,"True","So modern");

        System.out.println(airbus);

        airbus.start();

        System.out.println("----------------------------------");

        Airplane airplane = new Airplane("airbus", 2008,"True");

        System.out.println(airplane);

        airplane.start();
        airplane.stop();

        System.out.println("----------------------------------");

        Yacht yacht = new Yacht(2020,"True",3);

        System.out.println(yacht);

        yacht.luxury();
// not



    }
}
