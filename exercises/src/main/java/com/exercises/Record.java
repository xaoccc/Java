package com.exercises;
// A record:
// Is final and private (immutable) by default
// Is a class type
// Cannot extend another class
// Can implement interface
// Can contain methods

record Car(String type, String make, String model, int mileage) {
    public Car    {
        // Here we can add some conditions for the arguments:
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be less than zero!");
        }

    } 
    // Here we added a method to the record
    public void show() {
        System.out.println("Do something");
    }
}

public class Record {

    public static void main(String[] args) {
        Car car1 = new Car("sedan", "BMW", "530i", 300000);
        Car car2 = new Car("sedan", "BMW", "530i", 300000);
        Car car3 = new Car("sedan", "BMW", "530i", 299000);
        Car car4 = new Car("suv", "Jeep", "Wrangler", 360000);
        Car car5 = new Car("coupe", "Ferrari", "Testarossa", 100000);
        // We can compare the values of 2 records:
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        // We can access the values of different records easily:
        System.out.println(car2.model());
        // We can print the record as values
        System.out.println(car4);
        // and to string
        System.out.println(car4.toString());
    }
}
