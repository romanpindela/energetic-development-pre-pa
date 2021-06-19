package com.codecool.energeticdevelopment;

import com.codecool.energeticdevelopment.util.MessageBroker;

public class App {

    public static void main ( String[] args ) {
        TestGenerator tg = new TestGenerator();
        MessageBroker.print("Initialization phase..");
        tg.initEnergyPlants();
        tg.printEnergyPlants();
        tg.initMines();
        tg.printMines();
        tg.testingEnergyFlow();

        MessageBroker.print("\n\nTesting phase..");


    }

}
