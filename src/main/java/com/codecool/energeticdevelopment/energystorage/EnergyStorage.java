package com.codecool.energeticdevelopment.energystorage;


import java.util.Optional;

public class EnergyStorage {
    protected Energy availableEnergy;

    public EnergyStorage ( Energy availableEnergy ) {
        this.availableEnergy = availableEnergy;
    }


    public Optional<Energy> useEnergy( Energy energyNeeded){
        Optional<Energy> maybeUsedEnergy = availableEnergy.useEnergy(energyNeeded.getEnergyUnits());
        if (maybeUsedEnergy.isPresent()){
            return Optional.of(energyNeeded);
        } else {
            return Optional.empty();
        }
    }

    public EnergyStorage addEnergy( Energy addEnergyUnits ){
        this.availableEnergy.addEnergy(addEnergyUnits.getEnergyUnits());
        return this;
    }


    public Energy getAvailableEnergy () {
        return availableEnergy;
    }

    public void setAvailableEnergy ( Energy availableEnergy ) {
        this.availableEnergy = availableEnergy;
    }

    @Override
    public String toString () {
        return "EnergyStorage{" +
                "availableEnergy=" + availableEnergy +
                '}';
    }
}
