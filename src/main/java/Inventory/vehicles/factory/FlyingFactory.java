package Inventory.vehicles.factory;

import Inventory.vehicles.bus.Bus;
import Inventory.vehicles.bus.FlyingBus;
import Inventory.vehicles.car.Car;
import Inventory.vehicles.car.FlyingCar;

public class FlyingFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new FlyingCar();
    }

    @Override
    public Bus createBus() {
        return new FlyingBus();
    }
}
