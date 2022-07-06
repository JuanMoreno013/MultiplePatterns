package Inventory;

import Inventory.agency.Agency;
import Inventory.vehicles.factory.FlyingFactory;
import Inventory.vehicles.factory.SimpleFactory;
import Inventory.vehicles.factory.SportFactory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CarShop {

    private static CarShop carShop;
    private int carSold;
    double discount = 0.90;
    private int inventoryVehicle;

    private final SimpleFactory simpleFactory = new SimpleFactory();

    private final FlyingFactory flyingFactory = new FlyingFactory();

    private final SportFactory sportFactory = new SportFactory();


    private CarShop(){
        carSold=0;
    }

    public static CarShop getInstance(){
        if (carShop == null)
            carShop = new CarShop();

        return carShop;
    }


    public double sellCar(Agency agency, double price)
    {
        inventoryVehicle = agency.getListVehicles().size();

        if (inventoryVehicle >3)
        {
         price= price*discount;
        }

        carSold=carSold+inventoryVehicle;
        return price;
    }
}
