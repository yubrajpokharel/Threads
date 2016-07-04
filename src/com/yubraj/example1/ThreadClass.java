package com.yubraj.example1;

/**
 * Created by yubraj on 7/4/16.
 */
public class ThreadClass extends Thread {

    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Thread ID: "+ Thread.currentThread().getId() +" Number is :"+ i);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}