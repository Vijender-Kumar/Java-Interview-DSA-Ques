package com.example.interviewPractice.Coding.CarfucntionalInterface;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private CarEngine carEngine;

    public void startCar(){
        System.out.println("...Car started...");
        carEngine.startEngine();
    }
}
