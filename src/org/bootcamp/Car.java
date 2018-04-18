package org.bootcamp;

public final class Car extends Vehicle {
    private Transmission transmission = Transmission.manual;

    public Car(){

    }

    public Car(int age, long numberOfMiles, boolean isDiesel, Transmission transmission) {
        super(age, numberOfMiles, isDiesel);
        this.transmission = transmission;
    }
}
