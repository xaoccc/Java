package com.exercises;

public class Enums2 {

    public static void main(String[] args) {
        // We can also add properties to each enum value (just like in a class). We need a constructor and each value must define the property, as parameter
        enum Transport {
            CAR(150, 1000), 
            SUV(130, 1800), 
            BUS(100, 10000), 
            TRUCK(80, 5000), 
            PLANE(800, 50000), 
            TRAIN(300, 200000);

            int speed;
            int weight;
            Transport(int s, int w) {
                speed = s;
                weight = w;
            }
        }            

        Transport allTransport[] = Transport.values();

        for(Transport t : allTransport) {

            // Order in enum matters, so we can filter by order/index number:
            if (t.ordinal() == 4) {
                System.out.println("It's a bird, It's a plane!");
            } else {
                System.out.println(t.speed);
                System.out.println(t.weight);
            }

        }

        
    }
}
