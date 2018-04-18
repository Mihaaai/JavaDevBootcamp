package org.bootcamp;

public class CarBasicFormula implements Formula {

    @Override
    public int calculate(Vehicle vehicle) {
        int insurancyPolicyCost = 100 * vehicle.getAge();
        insurancyPolicyCost += vehicle.isDiesel() ? 500 : 0;
        insurancyPolicyCost += vehicle.getNumberOfMiles() > 200000 ? 500 : 0;

        return insurancyPolicyCost;

    }
}
