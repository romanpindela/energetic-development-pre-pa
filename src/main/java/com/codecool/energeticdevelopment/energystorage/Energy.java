package com.codecool.energeticdevelopment.energystorage;

import java.util.Optional;

public class Energy {
     protected int energyUnits;

    public Energy ( int energyUnit ) {
        this.energyUnits = energyUnit;
    }

    public Optional<Energy> useEnergy( int neededEnergy){
        if (energyUnits - neededEnergy >= 0){
            this.energyUnits -= neededEnergy;
            return Optional.of(new Energy(neededEnergy));
        } else {
            return Optional.empty();
        }
    }

    public Energy addEnergy( int addedEnergyUnits){
        this.energyUnits += addedEnergyUnits;
        return this;
    }

    public int getEnergyUnits () {
        return energyUnits;
    }

    public Energy setEnergyUnit ( int energyUnit ) {
        this.energyUnits = energyUnit;
        return this;
    }

    @Override
    public String toString () {
        return "Energy{" +
                "energyUnit=" + energyUnits +
                '}';
    }
}
