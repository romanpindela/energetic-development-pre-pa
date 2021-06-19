package com.codecool.energeticdevelopment.energycosumers;

import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;

public class Poland implements EnergyConsumer{
    protected Energy consumedEnergyTotal;
    protected Energy consumedDaily;
    protected FuelType consumedFuelType;

    public Poland ( Energy consumedEnergyTotal, Energy consumedDaily, FuelType consumedFuelType ) {
        this.consumedEnergyTotal = consumedEnergyTotal;
        this.consumedDaily = consumedDaily;
        this.consumedFuelType = consumedFuelType;
    }
}
