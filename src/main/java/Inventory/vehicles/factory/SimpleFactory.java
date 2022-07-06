package Inventory.vehicles.factory;

import Inventory.vehicles.bus.Bus;
import Inventory.vehicles.bus.SimpleBus;
import Inventory.vehicles.car.Car;
import Inventory.vehicles.car.SimpleCar;

public class SimpleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SimpleCar();
    }

    @Override
    public Bus createBus() {
        return new SimpleBus();
    }
}
