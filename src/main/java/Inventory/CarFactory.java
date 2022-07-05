package Inventory;

import Inventory.car.Car;
import Inventory.car.FlyingCar;
import Inventory.car.SimpleCar;
import Inventory.car.SportCar;

public class CarFactory implements AbstractFactory<Car> {


    @Override
    public Car create(String type) {
        if (type.equalsIgnoreCase("SportCar"))
            return new SportCar();

        else if (type.equalsIgnoreCase("FlyingCar")) {
            return new FlyingCar();
        }

        else if (type.equalsIgnoreCase("SimpleCar")) {
            return new SimpleCar();
        }

        return null;

    }
}
