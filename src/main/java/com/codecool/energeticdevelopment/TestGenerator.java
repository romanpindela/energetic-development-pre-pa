package com.codecool.energeticdevelopment;

import com.codecool.energeticdevelopment.energyplants.EnergyPlant;
import com.codecool.energeticdevelopment.energyplants.FactoryEnergyPlant;
import com.codecool.energeticdevelopment.energystorage.Energy;
import com.codecool.energeticdevelopment.energystorage.EnergyStorage;
import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;
import com.codecool.energeticdevelopment.fuelstorage.HeliumStorage;
import com.codecool.energeticdevelopment.mines.FactoryMine;
import com.codecool.energeticdevelopment.mines.Mine;
import com.codecool.energeticdevelopment.util.MessageBroker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestGenerator {

    List<EnergyPlant> energyPlants;
    List<Mine> mines;

    FuelStorage HeliumStorage = new HeliumStorage(new Fuel(0, FuelType.HELIUM), FuelType.HELIUM);

    EnergyStorage energyStorage = new EnergyStorage(new Energy(0));

    public void testingEnergyFlow(){
        MessageBroker.print("\n\nStart state");
        MessageBroker.print(energyStorage.toString());

        MessageBroker.print("\n\nAfter state - step 1:");
        energyPlants.get(0).storeEnergy(energyStorage);
        MessageBroker.print(energyStorage.toString());



    }

    public void initEnergyPlants(){
        energyPlants = List.of(
                FactoryEnergyPlant.getInstance("FusionPlant"),
                FactoryEnergyPlant.getInstance("AnnihilationPlant"),
                FactoryEnergyPlant.getInstance("CoalPlant"),
                FactoryEnergyPlant.getInstance("NuclearPlant"),
                FactoryEnergyPlant.getInstance("SolarPlant")
                );
    }

    public void initMines(){
        mines = List.of(
                FactoryMine.getInstance("MoonMine"),
                FactoryMine.getInstance("CoalMine"),
                FactoryMine.getInstance("HadronCollider"),
                FactoryMine.getInstance("UraniumMine")
        );
    }



    public void printEnergyPlants(){
        System.out.println("Available energy plants: ");
        for(EnergyPlant e : energyPlants){
            MessageBroker.print(e.toString());
        }
    }


    public void printMines(){
        System.out.println("Available mines: ");
        for(Mine m : mines){
            MessageBroker.print(m.toString());
        }
    }

}
