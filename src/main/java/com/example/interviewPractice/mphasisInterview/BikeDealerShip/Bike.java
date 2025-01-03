package com.example.interviewPractice.mphasisInterview.BikeDealerShip;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bike {
    private BikeEngine bikeEngine;

    public void startBike(){
        System.out.println(".....Bike is started...");
        bikeEngine.startEngine();
    }
}
