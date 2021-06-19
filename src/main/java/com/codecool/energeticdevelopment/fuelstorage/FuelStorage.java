package com.codecool.energeticdevelopment.fuelstorage;

import java.util.Optional;

public abstract class FuelStorage {

    protected Fuel availableFuel;
    protected FuelType fuelType;

    public FuelStorage ( Fuel availableFuel, FuelType fuelType) {
        this.availableFuel = availableFuel;
        this.fuelType = fuelType;
    }


    public Optional<Fuel> useFuel( Fuel neededFuel ){
        Optional<Fuel> maybeUsedFuel = availableFuel.useFuel(neededFuel.getFuelUnits());
        if (maybeUsedFuel.isPresent()){
            return Optional.of(neededFuel);
        } else {
            return Optional.empty();
        }
    }

    public FuelStorage addFuel( Fuel  addedEnergyUnits ){
        this.availableFuel.addFuel(addedEnergyUnits.getFuelUnits());
        return this;
    }


    public Fuel getAvailableFuel () {
        return availableFuel;
    }

    public void setAvailableFuel ( Fuel availableEnergy ) {
        this.availableFuel = availableEnergy;
    }

}
