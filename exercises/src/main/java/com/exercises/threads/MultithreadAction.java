package com.exercises.threads;

public class MultithreadAction extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<50; i++) {
            try {
                System.out.println(i);
                Thread.sleep(200);
                
            } catch (InterruptedException e) {
                System.out.println("InterruptedException error!");
            }
            
        }
    }

}
