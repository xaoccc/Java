package com.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
        // filter() returns a filtered collection of the same type
        List<Car> suvCars = cars.stream().filter(car -> car.type().equals("suv")).toList();
        System.out.println(suvCars);

        // map() returns one value per element:
        List<String> carMakeList = cars.stream().map(car -> car.make()).toList();       
        System.out.println(carMakeList);

        // We can apply filter() to a map() but we should be careful about the data type. Here we have a String:
        List<String> mazdaList = cars.stream().map(car -> car.make()).filter(a -> a.equals("BMW")).toList(); 
        System.out.println(mazdaList.size());

        // We can get make and model for each car, using a List return type from the map() method:
        List<List<String>> makeModeList = cars.stream().map(car -> List.of(car.make(), car.model())).toList();
        System.out.println(makeModeList);

        // We can also return the same data, but without nested lists:
        List<String> makeModelFlatList = cars.stream().flatMap(car -> java.util.stream.Stream.of(car.make(), car.model())).toList();
        System.out.println(makeModelFlatList);

        // count()
        long carsNum  = cars.stream().count();
        System.out.println(carsNum);

        // sort() for objects, like in this case we need to provide a Comparator object, so java knows how to sort. Here we use first make and then model.
        List<Car> carSorted = cars.stream().sorted(Comparator.comparing(Car::make).thenComparing(Car::model)).toList();
        System.out.println(carSorted);

        // distinct() - remove the duplicates
        System.out.println(carMakeList.size());
        List<String> carMakeListDistinct = carMakeList.stream().distinct().toList();
        System.out.println(carMakeListDistinct);
        // We have 25 cars, but 15 different models:
        System.out.println(carMakeListDistinct.size());

        // Collector - it collects data from a collection and turns it into a useful result
        // There are diffeent types of collectors: To List, To Set , Joining, Grouping, Counting, Summing
        // Here we use the Grouping:
        Map<Boolean, List<Car>> sedanCars = cars.stream().collect(Collectors.partitioningBy(car -> car.type().equals("sedan")));
        System.out.println(sedanCars);

        // Complex partitioning:
        // Here we use nested collectors: groupingBy() and toMap() 
        Map<String, Map<String, String>> carsInfo = 
            cars.stream()
                .collect(Collectors.groupingBy(
                    Car::type, 
                    Collectors.toMap(
                        Car::make, 
                        Car::model,
                        (existing, replacement) -> existing
                    )
                ));
        System.out.println(carsInfo);

    }

}
