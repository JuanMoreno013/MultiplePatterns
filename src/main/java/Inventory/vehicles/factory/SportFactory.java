package Inventory.vehicles.factory;

import Inventory.vehicles.bus.Bus;
import Inventory.vehicles.bus.SportBus;
import Inventory.vehicles.car.Car;
import Inventory.vehicles.car.SportCar;

public class SportFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Bus createBus() {
        return new SportBus();
    }
}
