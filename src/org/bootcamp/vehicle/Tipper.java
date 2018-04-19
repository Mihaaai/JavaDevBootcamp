package org.bootcamp.vehicle;

public class Tipper extends Vehicle {
    float capacityInTons;

    public Tipper(int age, long numberOfMiles, boolean isDiesel, float capacityInTons) {
        super(age, numberOfMiles, isDiesel);
        this.capacityInTons = capacityInTons;
    }

    public Tipper(int age, long numberOfMiles, boolean isDiesel) {
        super(age, numberOfMiles, isDiesel);
    }

    public float getCapacityInTons() {
        return capacityInTons;
    }
}
