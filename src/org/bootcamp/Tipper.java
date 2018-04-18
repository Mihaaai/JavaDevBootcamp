package org.bootcamp;

public class Tipper extends Vehicle {
    float capacityInTons;

    public Tipper(int age, long numberOfMiles, boolean isDiesel, float capacityInTons) {
        super(age, numberOfMiles, isDiesel);
        this.capacityInTons = capacityInTons;
    }
}
