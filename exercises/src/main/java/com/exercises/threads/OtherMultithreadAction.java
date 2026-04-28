package com.exercises.threads;

public class OtherMultithreadAction extends Thread{
    @Override
    public void run() {
        for (String letter : "ABRAKADABRAEBISIMAIKATA".split("")) {
            try {
                System.out.println(letter);
            Thread.sleep(200);
                
            } catch (InterruptedException e) {
                System.out.println("InterruptedException error!");
            }
            
        }
        
    }
}
