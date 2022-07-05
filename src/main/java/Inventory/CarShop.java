package Inventory;

import Inventory.car.Car;
import lombok.Getter;

@Getter
public class CarShop {

    private static CarShop carShop;
    private int carSold;
    private final CarFactory carFactory = new CarFactory();

    private CarShop(){
        carSold=0;
    }

    public static CarShop getInstance(){
        if (carShop == null)
            carShop = new CarShop();

        return carShop;
    }

    public Car sellCar(String carType){
        carSold++;
        return carFactory.create(carType);
//        return new Car();
    }
}
