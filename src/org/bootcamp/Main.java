package org.bootcamp;

public class Main {

    public static void main(String[] args) {
        final Vehicle joesCar = new Car(5,200000,true, Transmission.manual);

        int joesInsurancyPolicyCost = 100 * joesCar.getAge();
        joesInsurancyPolicyCost += joesCar.isDiesel() ? 500 : 0;
        joesInsurancyPolicyCost += joesCar.getNumberOfMiles() > 200000 ? 500 : 0;
        System.out.println("Joe's policy cost is " + joesInsurancyPolicyCost + " dollars");

        final Vehicle stevesBus = new Bus(3, 10000, true, 33);

        int stevesInsurancyPolicyCost = 200 * stevesBus.getAge();
        stevesInsurancyPolicyCost += stevesBus.isDiesel() ? 1000 : 0;
        if(stevesBus.getNumberOfMiles() > 200000)
        {
            stevesInsurancyPolicyCost += 1000;
        }
        else
        {
            stevesInsurancyPolicyCost += stevesBus.getNumberOfMiles() > 100000 ? 500 : 0;
        }
        System.out.println("Steves's policy cost is " + stevesInsurancyPolicyCost + " dollars");

        final Vehicle petersTipper = new Tipper(6,80000, false, 15);
        int petersInsurancyPolicyCost = 300 * petersTipper.getAge();
        petersInsurancyPolicyCost += stevesBus.getNumberOfMiles() > 80000 ? 700 : 0;
        System.out.println("Steves's policy cost is " + petersInsurancyPolicyCost + " dollars");
    }
}
