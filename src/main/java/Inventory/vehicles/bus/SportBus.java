package Inventory.vehicles.bus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SportBus implements Bus {
    private final double price = 19078;
    @Override
    public void start() {
        System.out.println("Sport Bus started");
    }
}
