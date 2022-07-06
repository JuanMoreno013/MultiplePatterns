package Inventory.vehicles.factory;

import Inventory.vehicles.bus.Bus;
import Inventory.vehicles.car.Car;

public interface VehicleFactory {

    Car createCar();
    Bus createBus();
}
