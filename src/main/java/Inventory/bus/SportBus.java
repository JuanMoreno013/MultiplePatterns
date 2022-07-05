package Inventory.bus;

import Inventory.Bus;

public class SportBus implements Bus {
    @Override
    public void start() {
        System.out.println("Sport Bus started");
    }
}
