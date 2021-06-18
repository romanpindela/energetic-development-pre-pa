package com.codecool.energeticdevelopment.energyplants;
import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.energystorage.EnergyStorage;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;

public abstract class EnergyPlant {
    protected final Energy energyDailyProduced;
    protected Energy energyAvailable;
    protected Fuel fuelDailyConsumed;
    protected String plantName;

    protected EnergyPlant ( String plantName, Energy energyDailyProduced, Fuel fuelDailyConsumed) {
        this.plantName = plantName;
        this.energyDailyProduced = energyDailyProduced;
        this.fuelDailyConsumed = fuelDailyConsumed;
    }


    public EnergyPlant getFuel ( FuelStorage fuelStorage ){
        fuelStorage.useFuel(fuelDailyConsumed);
        return this;
    }

    public EnergyPlant storeEnergy( EnergyStorage energyStorage ){
        energyStorage.addEnergy(energyDailyProduced);
        return this;
    }


    public String getPlantName () {
        return plantName;
    }


    @Override
    public String toString () {
        return plantName + ", energyDailyProduced=" + energyDailyProduced +
                ", energyAvailable=" + energyAvailable +
                ", fuelDailyConsumed=" + fuelDailyConsumed;
    }
}
