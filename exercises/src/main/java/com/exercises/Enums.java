package com.exercises;

public class Enums {

    public static void main(String[] args) {
        enum Transport {
            CAR, SUV, BUS, TRUCK, PLANE, TRAIN
        }

        Transport t = Transport.BUS;
        // t is not a String!!! System.out.println(t) internally calls t.toString() !!!
        System.out.println(t);

        // Create a list from all the enum's values
        Transport transportTypes [] = Transport.values();
        // Iterate the list:
        for (Transport tr : transportTypes) {
            System.out.println(tr);
        }

    }

}
