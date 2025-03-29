package no.bugs.homework5.task4;

import static no.bugs.homework5.task4.VehicleType.BIKE;
import static no.bugs.homework5.task4.VehicleType.CAR;

public class VehicleFactory {


    public static Vehicle createVehicle(VehicleType type) {
        return switch (type) {
            case CAR -> new Car();
            case BIKE -> new Bike();
        };
    }

    public static void main(String[] args) {
        createVehicle(CAR).drive();
        createVehicle(BIKE).drive();

    }

}

