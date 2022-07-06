package Inventory.agency;

import Inventory.vehicles.Vehicle;

import java.util.List;

public interface Agency {

    Agency clone(); //Prototype to clone the agencies

//    int getNumberOfCars();
//    List<Vehicle> getVehicle();
    void addAllVehicles(List<Vehicle> vehicle);
    String deployVehiclesInside();
     int numberOfVehicles();
    List<Vehicle> getListVehicles();




}
