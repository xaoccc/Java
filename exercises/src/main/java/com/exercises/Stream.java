package com.exercises;

import java.util.List;
// Stream is a way of working easily with collections, like List. It can use methods like filter(), map(), etc.

record Car(String type, String make, String model, int mileage) {

}

public class Stream {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530i", 300000),
                new Car("sedan", "BMW", "530i", 300000),
                new Car("sedan", "BMW", "530i", 299000),
                new Car("suv", "Jeep", "Wrangler", 360000),
                new Car("coupe", "Ferrari", "Testarossa", 100000),
                new Car("sedan", "Audi", "A6", 250000),
                new Car("sedan", "Mercedes-Benz", "E-Class", 270000),
                new Car("sedan", "Toyota", "Camry", 180000),
                new Car("sedan", "Honda", "Accord", 170000),
                new Car("suv", "Toyota", "RAV4", 220000),
                new Car("suv", "Honda", "CR-V", 210000),
                new Car("suv", "BMW", "X5", 350000),
                new Car("suv", "Audi", "Q7", 330000),
                new Car("coupe", "Porsche", "911", 120000),
                new Car("coupe", "Audi", "TT", 140000),
                new Car("coupe", "BMW", "M4", 160000),
                new Car("hatchback", "Volkswagen", "Golf", 150000),
                new Car("hatchback", "Ford", "Focus", 140000),
                new Car("hatchback", "Hyundai", "i30", 130000),
                new Car("truck", "Ford", "F-150", 400000),
                new Car("truck", "Chevrolet", "Silverado", 390000),
                new Car("electric", "Tesla", "Model 3", 80000),
                new Car("electric", "Tesla", "Model S", 90000),
                new Car("electric", "Nissan", "Leaf", 100000),
                new Car("convertible", "Mazda", "MX-5", 110000)
        );

        List<Car> sedanCars = cars.stream().filter(car -> car.type().equals("suv")).toList();
        System.out.println(sedanCars);

    }

}
