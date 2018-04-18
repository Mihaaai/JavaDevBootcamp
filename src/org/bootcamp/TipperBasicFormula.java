package org.bootcamp;

public class TipperBasicFormula implements Formula{

    @Override
    public int calculate(Vehicle vehicle) {
        int insurancyPolicyCost = 300 * vehicle.getAge();
        insurancyPolicyCost += vehicle.getNumberOfMiles() > 80000 ? 700 : 0;

        return insurancyPolicyCost;
    }
}
