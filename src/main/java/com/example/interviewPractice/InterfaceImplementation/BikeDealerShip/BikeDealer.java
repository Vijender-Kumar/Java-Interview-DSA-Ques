package com.example.interviewPractice.InterfaceImplementation.BikeDealerShip;

public class BikeDealer {
    public static void main(String[] arsg){
        Bike bike = Bike.builder().bikeEngine(new PetrolBike()).build();
        Bike bike1 = Bike.builder().bikeEngine(new ElectricBike()).build();
        bike.bikeStartWithInfo();
        bike1.bikeStartWithInfo();
    }
}
