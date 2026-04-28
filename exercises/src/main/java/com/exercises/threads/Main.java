package com.exercises.threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Threads init!");
        OtherMultithreadAction otherAction = new OtherMultithreadAction();        
        MultithreadAction someAction = new MultithreadAction();

        // This does not happen in multiple threads !
        // someAction.run();
        // Instead we use start() :
        someAction.start();
        otherAction.start();
        
    }
}
