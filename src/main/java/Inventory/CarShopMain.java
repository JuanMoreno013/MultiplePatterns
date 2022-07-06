package Inventory;

import Inventory.agency.AgenciesRegistry;
import Inventory.agency.Agency;
import Inventory.agency.BrandAgency;
import Inventory.agency.POAgency;
import Inventory.vehicles.Vehicle;
import Inventory.vehicles.bus.Bus;
import Inventory.vehicles.car.Car;
import Inventory.vehicles.factory.FlyingFactory;
import Inventory.vehicles.factory.SimpleFactory;
import Inventory.vehicles.factory.SportFactory;
import Inventory.vehicles.factory.VehicleFactory;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class CarShopMain {

    private static final AgenciesRegistry agenciesRegistry = new AgenciesRegistry();


    Agency agency1NV = new BrandAgency(
            "DeluxeShop",
            4,
            9,
            10
    );
//    Agency agency2NV = new BrandAgency(
//            "Prime Cars",
//            2,
//            4,
//            7
//    );
    Agency agency3NV = new POAgency(
            "Low Cars",
            1,
            2,
            0
    );

//    Agency agency4NV = new POAgency(
//            "Ultimate Vehicles",
//            4,
//            13,
//            5
//    );
     public CarShopMain(){

         Agency brandCarsSimpleAgency = agency1NV.clone();
         Agency brandCarsFlyingAgency = agency1NV.clone();
         Agency brandCarsSportAgency = agency1NV.clone();

         brandCarsSimpleAgency.addAllVehicles(setCreateVehicles(new SimpleFactory()));
         brandCarsFlyingAgency.addAllVehicles(setCreateVehicles(new FlyingFactory()));
         brandCarsSportAgency.addAllVehicles(setCreateVehicles(new SportFactory()));

         agenciesRegistry.addAgency("BrandSimpleAgency", brandCarsSimpleAgency);
         agenciesRegistry.addAgency("BrandAgency", agency1NV);
         agenciesRegistry.addAgency("BrandFlyAgency", brandCarsFlyingAgency);
         agenciesRegistry.addAgency("BrandSportsAgency", brandCarsSportAgency);


         Agency pOCarsSimpleAgency3 = agency3NV.clone();
         Agency pOCarsFlyingAgency3 = agency3NV.clone();
         Agency pOCarsSportAgency3 = agency3NV.clone();

         pOCarsSimpleAgency3.addAllVehicles(setCreateVehicles(new SimpleFactory()));
         pOCarsFlyingAgency3.addAllVehicles(setCreateVehicles(new FlyingFactory()));
         pOCarsSportAgency3.addAllVehicles(setCreateVehicles(new SportFactory()));

         agenciesRegistry.addAgency("PreOwnedSimpleAgency", brandCarsSimpleAgency);
         agenciesRegistry.addAgency("PreOwnedAgency", agency3NV);
         agenciesRegistry.addAgency("PreOwnedFlyAgency", brandCarsFlyingAgency);
         agenciesRegistry.addAgency("PreOwnedSportsAgency", brandCarsSportAgency);

     }

public List<Vehicle> setCreateVehicles(VehicleFactory vehicleFactory){

    Car car = vehicleFactory.createCar();
    Bus bus = vehicleFactory.createBus();

    List<Vehicle> vehicles =  new ArrayList<>();
    vehicles.add(car);
    vehicles.add(bus);

//    return List.of(car, bus);
    return vehicles;
}


    public static void main(String[] args) {
        new CarShopMain();

        CarShop carObj = CarShop.getInstance();
        agenciesRegistry.getAllAgencies().forEach(agency -> {

            System.out.println(agency.getKey());
            Agency agencies = agency.getValue();
            System.out.println(agencies);

           double eachPrice= agencies.getListVehicles().stream()
                            .mapToDouble((Vehicle::getPrice))
                            .reduce(Double::sum).orElse(0);

            carObj.sellCar(agencies, eachPrice);

            System.out.println("\nTotal sell for " + agency.getKey() + " it's $ " + eachPrice);
            System.out.println("All cars sold today: " + carObj.getCarSold() + "\n");
        });

    }


}
