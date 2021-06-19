package com.codecool.energeticdevelopment.energycosumers;

import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.energystorage.EnergyStorage;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;

import java.util.Optional;

interface EnergyConsumer {

    default Optional<Energy> consumeEnergy ( EnergyStorage energyStorage, Energy neededEnergy ){
        Optional<Energy> maybeUsedEnergy = energyStorage.useEnergy(neededEnergy);
        return maybeUsedEnergy;
    }
}
