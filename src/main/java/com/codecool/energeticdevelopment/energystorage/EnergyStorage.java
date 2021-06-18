package com.codecool.energeticdevelopment.energystorage;


public abstract class EnergyStorage {
    protected Energy availableEnergy;

    public EnergyStorage ( Energy availableEnergy ) {
        this.availableEnergy = availableEnergy;
    }


    public EnergyStorage useEnergy( Energy useEnergyUnits ){
        this.availableEnergy.useEnergy(useEnergyUnits.getEnergyUnits());
        return this;
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
}
