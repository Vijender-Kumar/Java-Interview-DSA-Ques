package com.example.interviewPractice.InterfaceImplementation.BikeDealerShip;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bike {
    private BikeEngine bikeEngine;

    public void bikeStartWithInfo(){
        System.out.println("---started bike with below info---");
        bikeEngine.bikeStart();
        bikeEngine.bikeEngine();
    }
}
