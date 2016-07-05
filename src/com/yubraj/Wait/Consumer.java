package com.yubraj.Wait;

/**
 * Created by yubraj on 7/5/16.
 */
public class Consumer extends Thread {
    private Cup cup;
    private int number;

    public Consumer(Cup cup, int number) {
        this.cup = cup;
        this.number = number;
    }

    public void run(){
        int value = 0;
        for (int i = 0; i<10; i++){
            try {
                sleep((long) (100 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            value = cup.get();
            System.out.println("Consumer : "+ this.number+" get -> "+value);
        }
    }
}
