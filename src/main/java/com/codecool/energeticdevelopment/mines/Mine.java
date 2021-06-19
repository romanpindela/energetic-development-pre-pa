package com.codecool.energeticdevelopment.mines;

import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelStorage;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;

public abstract class Mine {
    protected String name;
    protected Fuel miningEfficiency;
    protected Fuel producedFuel;
    protected FuelType fuelType;

    public Mine ( String name, Fuel miningEfficiency, FuelType fuelType, Fuel producedFuel) {
        this.name = name;
        this.miningEfficiency = miningEfficiency;
        this.fuelType = fuelType;
        this.producedFuel = producedFuel;
    }

    public Fuel produceFuel( FuelStorage fuelStorage ){
        producedFuel.addFuel(miningEfficiency.getFuelUnits());
        fuelStorage.addFuel(miningEfficiency);
        return this.miningEfficiency;
    }


    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Fuel getMiningEfficiency () {
        return miningEfficiency;
    }

    public void setMiningEfficiency ( Fuel miningEfficiency ) {
        this.miningEfficiency = miningEfficiency;
    }

    public FuelType getFuelType () {
        return fuelType;
    }

    public void setFuelType ( FuelType fuelType ) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString () {
        return name + ", miningEfficiency=" + miningEfficiency + ", producedFuel=" + producedFuel + ", fuelType=" + fuelType;
    }
}
