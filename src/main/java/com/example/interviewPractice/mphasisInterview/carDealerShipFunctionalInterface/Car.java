package com.example.interviewPractice.mphasisInterview.carDealerShipFunctionalInterface;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private Engine engine;

    public void startCar(){
        System.out.print("Car is starting.....");
        engine.startEngine();
    }
}
