package Inventory.agency;

import Inventory.vehicles.Vehicle;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class BrandAgency implements Agency{

    private List<Vehicle> vehicle = new ArrayList<>();

    private final String nameAgency;
    private final int numberOfManagers;
    private final int numberOfDealers;
    private final int numberOfMechanics;


//    private int numberOfVehicles;

    public BrandAgency(BrandAgency brandAgency){

        this.nameAgency = brandAgency.getNameAgency();
        this.vehicle = new ArrayList<>(brandAgency.vehicle);
        this.numberOfManagers= brandAgency.getNumberOfManagers();
        this.numberOfDealers=brandAgency.getNumberOfDealers();
        this.numberOfMechanics=brandAgency.getNumberOfMechanics();

    }

    @Override
    public String deployVehiclesInside()
    {
        return vehicle.stream()
                .map(Vehicle::toString)
                .collect(Collectors.joining(",\n"));
    }

    @Override
    public int numberOfVehicles()
    {
        return vehicle.size();
    }

    @Override
    public Agency clone() {
//        Agency agency = (Agency) super.clone();
        return new BrandAgency(this);
    }

    public List<Vehicle> getListVehicles() {
        return vehicle;
    }

    @Override
    public void addAllVehicles(List<Vehicle> vehicle) {
        this.vehicle.addAll(vehicle);
    }

    public String toString() {
        return
                "\n Name Agency: " + getNameAgency() +
                "\n Number of Managers: " + getNumberOfManagers() +
                "\n Number of Dealers: " + getNumberOfDealers() +
                "\n Number of Vehicles: " + numberOfVehicles() +
                "\n Vehicles: " + deployVehiclesInside();
    }
}
