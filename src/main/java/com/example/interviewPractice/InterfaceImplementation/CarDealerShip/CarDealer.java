package com.example.interviewPractice.InterfaceImplementation.CarDealerShip;

public class CarDealer {
    public static void main(String[] args){
        CarEngine petrol = () -> System.out.println("..Petrol engine...");
        CarEngine electric = () -> System.out.println("---Electric engine---");

        Car car = Car.builder().carEngine(petrol).build();
        Car car1 = Car.builder().carEngine(electric).build();
        car.startCar();
        car1.startCar();
    }
}
