package Inventory.vehicles.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class SimpleCar implements Car {
    private final double price = 39087;
    @Override
    public void start() {
        System.out.println("Simple Car started");

    }
}
