package com.exercises;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> cars = new HashMap<>();
        ArrayList<Integer> audiYears = new ArrayList<>();
        audiYears.add(2016);
        audiYears.add(2015);
        cars.put("Audi", audiYears);
        ArrayList<Integer> mercedesYears = new ArrayList<>();
        mercedesYears.add(2012);
        mercedesYears.add(2020);
        mercedesYears.add(2003);
        cars.put("Mercedes", mercedesYears);

        System.out.println(cars);

        System.out.println(cars.get("Audi"));

        System.out.println(cars.containsKey("Audi"));
        ArrayList<Integer> searchYears = new ArrayList<>();
        searchYears.add(2016);
        searchYears.add(2015);
        System.out.println(cars.containsValue(searchYears));

        
    }
}
