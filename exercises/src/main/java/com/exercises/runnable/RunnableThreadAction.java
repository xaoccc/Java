package com.exercises.runnable;
// Using interface method of creating threads allows us to extend other class than Thread (if we used the extend Thread method), 
// because we can extend just 1 class, but implement many interfaces, so here we can implement as many interfaces as we want
public class RunnableThreadAction implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                System.out.println(i);
                Thread.sleep(200);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException error!");
            }

        }
    }

}
