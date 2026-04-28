package com.exercises.runnable;


public class Main {
    public static void main(String[] args) {
        System.out.println("Runnable Threads init!");
        RunnableThreadAction runnableAction = new RunnableThreadAction();
        AnotherRunnableThreadAction anotherRunnableAction = new AnotherRunnableThreadAction();

        // This does not happen in multiple threads !
        // runnableAction.run();
        // Instead we use start() and when using Runnable interface, we should create Thread objects for each of the threads:
        Thread myThread = new Thread(runnableAction);
        Thread myOtherThread = new Thread(anotherRunnableAction);
        myThread.start();
        myOtherThread.start();
        
    }

}
