package Inventory.vehicles.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class FlyingCar implements Car {
    private final double price = 34098;
    @Override
    public void start() {
        System.out.println("Flying Car started");
    }
}
