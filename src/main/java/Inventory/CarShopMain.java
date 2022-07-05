package Inventory;

public class CarShopMain {
    public static void main(String[] args) {

//        Car sportCar = CarShop.sellCar("SportCar");
        //        Car car = new Car();

//        sportCar.start();

        CarShop carObj = CarShop.getInstance();

        carObj.sellCar("SimpleCar").start();

//        carObj.sellCar();
        carObj.sellCar("FlyingCar").start();
        System.out.println(carObj.getCarSold());

    }
}
