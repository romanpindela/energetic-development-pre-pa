package com.codecool.energeticdevelopment.energyplants;
import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.energystorage.EnergyStorage;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;

import java.util.Optional;

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


    public Optional<Fuel>  useFuel ( FuelStorage fuelStorage ){
        Optional<Fuel> maybeUsedFuel = fuelStorage.useFuel(fuelDailyConsumed);
        if (maybeUsedFuel.isEmpty()){
            // should be procedure to close Energy Plant or to change used fuelStorage it uses.
            return Optional.empty();
        } else {
            return Optional.of(fuelDailyConsumed);
        }

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
