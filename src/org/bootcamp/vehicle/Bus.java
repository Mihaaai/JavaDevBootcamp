package org.bootcamp.vehicle;

public class Bus extends Vehicle {
    private int numberOfSeats;

    public Bus(){

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Bus(int age, long numberOfMiles, boolean isDiesel, int numberOfSeats) {
        super(age, numberOfMiles, isDiesel);
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(int age, long numberOfMiles, boolean isDiesel) {
        super(age, numberOfMiles, isDiesel);
    }
}
