package Inventory.car;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FlyingCar implements Car {
    @Override
    public void start() {
        System.out.println("Flying Car started");
    }
}
