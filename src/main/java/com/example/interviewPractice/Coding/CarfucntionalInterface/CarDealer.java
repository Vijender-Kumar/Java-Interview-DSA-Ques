package com.example.interviewPractice.Coding.CarfucntionalInterface;

public class CarDealer {
    public static void main(String[] args){
        CarEngine petrol = () -> System.out.println("---Petrol engine---");

        Car car = Car.builder().carEngine(petrol).build();
        car.startCar();

        car.setCarEngine(() -> System.out.println("This is electric"));
        car.startCar();
    }
}
