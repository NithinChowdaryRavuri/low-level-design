package parkinglot;

import parkinglot.vehicletype.Car;
import parkinglot.vehicletype.Motorcycle;
import parkinglot.vehicletype.Truck;
import parkinglot.vehicletype.Vehicle;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 10));
        parkingLot.addLevel(new Level(2, 8));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park vehicles
        System.out.println(parkingLot.parkVehicle(car));
        System.out.println(parkingLot.parkVehicle(truck));
        System.out.println(parkingLot.parkVehicle(motorcycle));

        // Display availability
        parkingLot.displayAvailability();

        // UnPark vehicle
        System.out.println(parkingLot.unParkVehicle(motorcycle));

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
