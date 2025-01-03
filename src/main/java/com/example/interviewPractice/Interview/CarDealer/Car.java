package com.example.interviewPractice.Interview.CarDealer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private Engine engine;

    public void startCar(){
        System.out.println("----CAR Started---");
        engine.startEngine();
    }
}
