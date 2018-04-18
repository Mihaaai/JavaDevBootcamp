package org.bootcamp.formula;

import org.bootcamp.vehicle.Vehicle;

public class BusBasicFormula implements Formula{
    @Override
    public int calculate(Vehicle vehicle) {
        int insurancyPolicyCost = 200 * vehicle.getAge();
        insurancyPolicyCost += vehicle.isDiesel() ? 1000 : 0;
        if(vehicle.getNumberOfMiles() > 200000)
        {
            insurancyPolicyCost += 1000;
        }
        else
        {
            insurancyPolicyCost += vehicle.getNumberOfMiles() > 100000 ? 500 : 0;
        }
        return insurancyPolicyCost;
    }
}
