package com.codecool.energeticdevelopment.energystorage;

public class Energy {
     protected int energyUnit;

    public Energy ( int energyUnit ) {
        this.energyUnit = energyUnit;
    }

    public Energy useEnergy( int usedEnergyUnits){
        this.energyUnit -= usedEnergyUnits;
        return this;
    }

    public Energy addEnergy( int addedEnergyUnits){
        this.energyUnit += addedEnergyUnits;
        return this;
    }

    public int getEnergyUnits () {
        return energyUnit;
    }

    public Energy setEnergyUnit ( int energyUnit ) {
        this.energyUnit = energyUnit;
        return this;
    }

    @Override
    public String toString () {
        return "Energy{" +
                "energyUnit=" + energyUnit +
                '}';
    }
}
