package com.codecool.energeticdevelopment.fuelstorage;

import java.util.Optional;

public class Fuel {
    protected int fuelUnits;

    protected FuelType fuelType;

    public Fuel ( int fuelUnits, FuelType fuelType) {
        this.fuelType = fuelType;
        this.fuelUnits = fuelUnits;
    }

    public Fuel addFuel( int addedFuel){
        fuelUnits += addedFuel;
        return this;
    }

    public Optional<Fuel> useFuel( int neededFuel){
        if (fuelUnits - neededFuel >= 0){
            fuelUnits -= neededFuel;
            return Optional.of(new Fuel(neededFuel, fuelType));
        }
        return Optional.empty();
    }

    public int getFuelUnits(){
        return fuelUnits;
    }

    public Fuel setFuelUnits(int fuelUnits) { this.fuelUnits = fuelUnits; return this;}

    public FuelType getFuelType () {
        return fuelType;
    }

    public void setFuelType ( FuelType fuelType ) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString () {
        return "Fuel{" +
                "fuelUnits=" + fuelUnits +
                '}';
    }
}
