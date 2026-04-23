package com.exercises.interfaces;

public class Main {

    public static void main(String[] args) {
        ByTwos test = new ByTwos();
        ByThrees test1 = new ByThrees();
        ByFives test2 = new ByFives();
        for (int i=0; i<5; i++) {
            System.out.println(test.getNext());
            System.out.println(test1.getNext());
        }
        System.out.println();
        // But we can do this using the interface
        Series ob;
        MoreSeries ob1;
        
        for (int j=0; j<5; j++) {
            ob = test;
            System.out.println(ob.getNext());
            ob = test1;
            System.out.println(ob.getNext());
            // Here we use the extended interface MoreSeries and the class ByFives that implements it!
            ob1 = test2;
            System.out.println(ob1.getMore());
        }

        test2.printHello();


    }    

}

