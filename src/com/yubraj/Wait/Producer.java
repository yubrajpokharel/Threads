package com.yubraj.Wait;

/**
 * Created by yubraj on 7/5/16.
 */
public class Producer extends Thread {
    private Cup cup;
    private int number;

    public Producer(Cup cup, int number) {
        this.cup = cup;
        this.number = number;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            cup.put(i);
            System.out.println("Producer : " + this.number + " put -> " + i);
            try {
                sleep((long)(100*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
