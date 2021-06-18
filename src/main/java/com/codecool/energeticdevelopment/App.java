package com.codecool.energeticdevelopment;

public class App {

    public static void main ( String[] args ) {
        TestGenerator tg = new TestGenerator();
        tg.initEnergyPlants();
        tg.printEnergyPlants();
    }

}
