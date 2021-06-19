package com.codecool.energeticdevelopment.mines;

import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;

public class FactoryMine {

    private FactoryMine () {
    }

    public static Mine getInstance( String mineType){
        return switch(mineType.toLowerCase()){
            case "coalmine" ->
                    new CoalMine("CoalMine", new Fuel(40, FuelType.COAL),
                            FuelType.COAL, new Fuel(0, FuelType.COAL));
            case "hadroncollider" -> new HadronCollider("HadronCollider", new Fuel(1, FuelType.ANTIMATTER),
                    FuelType.ANTIMATTER, new Fuel(0, FuelType.ANTIMATTER));
            case "moonmine" -> new MoonMine("MoonMine", new Fuel(10, FuelType.HELIUM),
                    FuelType.HELIUM, new Fuel(0, FuelType.HELIUM));
            case "uraniummine" -> new UraniumMine("UraniumMine", new Fuel(100,
                    FuelType.URANIUM), FuelType.URANIUM, new Fuel(0, FuelType.URANIUM) );

            default -> throw new IllegalStateException("Unexpected value: " + mineType);
        };
    }
}
