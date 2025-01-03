package com.example.interviewPractice.InterfaceImplementation.BikeDealerShip;

public class PetrolBike implements BikeEngine{
    @Override
    public void bikeStart() {
        System.out.println("...this Bike have 350 CC...");
    }

    @Override
    public void bikeEngine() {
        System.out.println("...this Bike have PETROL Engine...");
    }
}
