package org.bootcamp.vehicle;

public final class Car extends Vehicle {
    private Transmission transmission = Transmission.manual;

    public Car(){

    }

    public Car(int age, long numberOfMiles, boolean isDiesel, Transmission transmission) {
        super(age, numberOfMiles, isDiesel);
        this.transmission = transmission;
    }

    public Car(int age, long numberOfMiles, boolean isDiesel) {
        super(age, numberOfMiles, isDiesel);
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
