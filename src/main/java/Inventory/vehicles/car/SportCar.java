package Inventory.vehicles.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class SportCar implements Car {
    private final double price = 45987;

    @Override
    public void start() {
        System.out.println("Sport Car started");
    }
}
