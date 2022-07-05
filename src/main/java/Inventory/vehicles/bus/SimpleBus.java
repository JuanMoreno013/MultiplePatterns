package Inventory.vehicles.bus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SimpleBus implements Bus {
    private final double price = 19023;
    @Override
    public void start() {
        System.out.println("Simple Bus started");
    }
}
