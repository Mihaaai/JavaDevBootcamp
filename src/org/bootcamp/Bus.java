package org.bootcamp;

public class Bus extends Vehicle {
    private int numberOfSeats;

    public Bus(){

    }

    public Bus(int age, long numberOfMiles, boolean isDiesel, int numberOfSeats) {
        super(age, numberOfMiles, isDiesel);
        this.numberOfSeats = numberOfSeats;
    }
}
