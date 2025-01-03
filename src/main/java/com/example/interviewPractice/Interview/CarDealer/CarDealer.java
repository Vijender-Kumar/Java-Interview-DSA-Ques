package com.example.interviewPractice.Interview.CarDealer;

public class CarDealer {
    public static void main(String[] args){
        Engine petrol = () -> System.out.println("...Petrol Engine...");
        Engine electric = () -> System.out.println(".----Electric Engine---...");

        Car car = Car.builder().engine(petrol).build();
        car.startCar();

        Car car1 = Car.builder().engine(electric).build();
        car1.startCar();
    }
}
