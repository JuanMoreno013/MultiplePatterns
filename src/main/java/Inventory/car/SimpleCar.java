package Inventory.car;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SimpleCar implements Car {
    @Override
    public void start() {
        System.out.println("Simple Car started");

    }
}
