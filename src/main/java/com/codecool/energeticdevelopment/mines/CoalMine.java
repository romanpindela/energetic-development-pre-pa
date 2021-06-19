package com.codecool.energeticdevelopment.mines;

import com.codecool.energeticdevelopment.fuelstorage.Fuel;
import com.codecool.energeticdevelopment.fuelstorage.FuelType;

public class CoalMine extends Mine{


    public CoalMine ( String name, Fuel miningEfficiency, FuelType fuelType, Fuel producedFuel ) {
        super(name, miningEfficiency, fuelType, producedFuel);
    }
}
