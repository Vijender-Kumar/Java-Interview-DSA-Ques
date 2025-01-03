package com.example.interviewPractice.InterfaceImplementation.CarDealerShip;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private CarEngine carEngine;

    public void startCar(){
        System.out.println("...Car is started with below Engine...");
        carEngine.startEngine();
    }
}
