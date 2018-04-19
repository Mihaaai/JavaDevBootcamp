package org.bootcamp;

import org.bootcamp.calculator.InsurancePolicyCalculator;
import org.bootcamp.formula.Formula;
import org.bootcamp.formula.Formula;

import org.bootcamp.vehicle.*;

public class Main {

    public static void main(String[] args) {
        final Vehicle joesCar = new Car(5,200000,true, Transmission.manual);
        final Vehicle stevesBus = new Bus(3, 10000, true, 33);
        final Vehicle petersTipper = new Tipper(6,80000, false, 15);

        InsurancePolicyCalculator calculator = InsurancePolicyCalculator.INSTANCE;

        System.out.println("Joe's policy cost is " + calculator.calculate(joesCar, Formula.CAR_BASIC_FORMULA) + " dollars");
        System.out.println("Steves's policy cost is " + calculator.calculate(stevesBus,Formula.BUS_BASIC_FORMULA) + " dollars");
        System.out.println("Steves's policy cost is " + calculator.calculate(petersTipper,Formula.TIPPER_BASIC_FORMULA) + " dollars");
    }
}
