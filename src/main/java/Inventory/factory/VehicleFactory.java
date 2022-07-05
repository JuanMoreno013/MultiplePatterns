package Inventory.factory;

import Inventory.Bus;
import Inventory.car.Car;

public interface VehicleFactory {

    Car createCar();
    Bus createBus();
}
