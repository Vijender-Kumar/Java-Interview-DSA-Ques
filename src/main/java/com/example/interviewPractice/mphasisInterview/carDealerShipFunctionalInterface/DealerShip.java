package com.example.interviewPractice.mphasisInterview.carDealerShipFunctionalInterface;

public class DealerShip {
    public static void main(String[] args) {
        Engine petrolEngine = () -> System.out.println("Petrol engine started.");
        Engine dieselEngine = () -> System.out.println("Diesel engine Started.");

        Car car = Car.builder().engine(petrolEngine).build();
        car.startCar();

        Car car1 = Car.builder().engine(dieselEngine).build();
        car1.startCar();
    }
}
