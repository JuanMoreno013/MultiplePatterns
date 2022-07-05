package Inventory.bus;

import Inventory.Bus;

public class FlyingBus implements Bus {
    @Override
    public void start() {
        System.out.println("Flying Bus started");
    }
}
