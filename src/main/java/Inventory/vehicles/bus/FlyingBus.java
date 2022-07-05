package Inventory.vehicles.bus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FlyingBus implements Bus {
    private final double price = 23980;
    @Override
    public void start() {
        System.out.println("Flying Bus started");
    }
}
