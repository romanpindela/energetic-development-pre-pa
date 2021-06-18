package com.codecool.energeticdevelopment;

import com.codecool.energeticdevelopment.energyplants.EnergyPlant;
import com.codecool.energeticdevelopment.energyplants.FactoryEnergyPlant;
import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.energystorage.EnergyStorage;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;
import com.codecool.energeticdevelopment.mines.Mine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestGenerator {

    List<EnergyPlant> energyPlants;
    List<Mine> mines;
    List<Consumer> consumers;
    List<FuelStorage> fuelStorages;
    List<EnergyStorage> energyStorages;

    public void initEnergyPlants(){
        energyPlants = List.of(
                FactoryEnergyPlant.getInstance("AnnihilationPlant"),
                FactoryEnergyPlant.getInstance("CoalPlant"),
                FactoryEnergyPlant.getInstance("FusionPlant"),
                FactoryEnergyPlant.getInstance("NuclearPlant"),
                FactoryEnergyPlant.getInstance("SolarPlant")
                );
    }

    public void printEnergyPlants(){
        System.out.println("Available energy plants: ");
        for(EnergyPlant e : energyPlants){
            System.out.println(e);
        }
    }

}
