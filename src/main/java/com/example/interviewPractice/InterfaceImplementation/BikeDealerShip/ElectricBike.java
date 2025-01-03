package com.example.interviewPractice.InterfaceImplementation.BikeDealerShip;

public class ElectricBike implements BikeEngine{
    @Override
    public void bikeStart() {
        System.out.println("...this Bike have 150 CC...");
    }

    @Override
    public void bikeEngine() {
        System.out.println("...this Bike have ELECTRIC Engine...");
    }
}
