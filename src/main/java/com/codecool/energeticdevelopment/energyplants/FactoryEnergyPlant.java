package com.codecool.energeticdevelopment.energyplants;

import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;

public class FactoryEnergyPlant {

    private FactoryEnergyPlant () {
    }

    public static EnergyPlant getInstance(
            String typeEnergyPlant
    ){

        return switch(typeEnergyPlant.toLowerCase()){
            case "annihilationplant" -> new AnnihilationPlant("AnnihilationPlant", new Energy(25000), new Fuel(1, FuelType.ANTIMATTER));
            case "coalplant" -> new CoalPlant("CoalPlant", new Energy(7), new Fuel(100, FuelType.COAL));
            case "fusionplant" -> new FusionPlant("FusionPlant", new Energy(20000), new Fuel(1, FuelType.HELIUM));
            case "nuclearplant" -> new NuclearPlant("NuclearPlant", new Energy(10000), new Fuel(1, FuelType.URANIUM));
            case "solarplant" -> new SolarPlant("SolarPlant", new Energy(2), new Fuel(0, FuelType.NOTHING));
            default -> throw new IllegalStateException("Unexpected value: " + typeEnergyPlant);
        };

    }
}


