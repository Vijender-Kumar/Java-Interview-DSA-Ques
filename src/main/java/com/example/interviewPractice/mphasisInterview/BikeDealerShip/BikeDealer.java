package com.example.interviewPractice.mphasisInterview.BikeDealerShip;

public class BikeDealer {
    public static void main(String[] args){
        Bike bike = Bike.builder()
                .bikeEngine(new PetrolBike()).build();
        bike.startBike();
        Bike bike1 = Bike.builder().bikeEngine(new ElectricBike()).build();
        bike1.startBike();
    }
}
