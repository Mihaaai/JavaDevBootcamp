package org.bootcamp.formula;

import org.bootcamp.vehicle.*;

public enum Formula {
    CAR_BASIC_FORMULA{
        public int calculate(Vehicle vehicle)
        {
            int insurancyPolicyCost = 100 * vehicle.getAge();
            insurancyPolicyCost += vehicle.isDiesel() ? 500 : 0;
            insurancyPolicyCost += vehicle.getNumberOfMiles() > 200000 ? 500 : 0;

            return insurancyPolicyCost;
        }
    },

    BUS_BASIC_FORMULA{
        @Override
        public int calculate(Vehicle vehicle)
        {
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
    },

    TIPPER_BASIC_FORMULA{
        @Override
        public int calculate(Vehicle vehicle)
        {
            int insurancyPolicyCost = 300 * vehicle.getAge();
            insurancyPolicyCost += vehicle.getNumberOfMiles() > 80000 ? 700 : 0;

            return insurancyPolicyCost;
        }
    };

    public abstract int calculate(Vehicle vehicle);
}
