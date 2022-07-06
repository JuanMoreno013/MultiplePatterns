package Inventory.agency;

import Inventory.vehicles.Vehicle;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public class POAgency implements Agency{

    private final String nameAgency;
    private List<Vehicle> vehicle = new ArrayList<>();
    private final int numberOfManagers;
    private final int numberOfDealers;
    private final int numberOfMechanics;


    public POAgency(POAgency poAgency){
        this.nameAgency = poAgency.getNameAgency();
        this.vehicle = new ArrayList<>(poAgency.vehicle);
        this.numberOfManagers= poAgency.getNumberOfManagers();
        this.numberOfDealers=poAgency.getNumberOfDealers();
        this.numberOfMechanics=poAgency.getNumberOfMechanics();
    }

    public List<Vehicle> getListVehicles() {
        return vehicle;
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
        return new POAgency(this);
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
