package Inventory.car;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SportCar implements Car {

    @Override
    public void start() {
        System.out.println("Sport Car started");
    }
}
