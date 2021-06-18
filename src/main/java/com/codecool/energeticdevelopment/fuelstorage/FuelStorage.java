package com.codecool.energeticdevelopment.fuelstorage;

public abstract class FuelStorage {

    protected Fuel availableFuel;

    FuelStorage ( Fuel availableFuel ) {
        this.availableFuel = availableFuel;
    }


    public FuelStorage useFuel( Fuel useEnergyUnits ){
        this.availableFuel.useFuel(useEnergyUnits.getFuelUnits());
        return this;
    }

    public FuelStorage addFuel( Fuel  addEnergyUnits ){
        this.availableFuel.addFuel(addEnergyUnits.getFuelUnits());
        return this;
    }


    public Fuel getAvailableFuel () {
        return availableFuel;
    }

    public void setAvailableFuel ( Fuel availableEnergy ) {
        this.availableFuel = availableEnergy;
    }

}
