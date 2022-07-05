package Inventory.bus;

import Inventory.Bus;

public class SimpleBus implements Bus {
    @Override
    public void start() {
        System.out.println("Simple Bus started");
    }
}
