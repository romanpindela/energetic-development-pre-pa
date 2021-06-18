package com.codecool.energeticdevelopment.energyplants;

import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;

public class SolarPlant extends EnergyPlant{
    protected SolarPlant ( String plantName, Energy energyDailyProduced, Fuel fuelDailyConsumed ) {
        super(plantName, energyDailyProduced, fuelDailyConsumed);
    }
}
