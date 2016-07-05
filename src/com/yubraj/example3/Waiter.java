package com.yubraj.example3;

/**
 * Created by yubraj on 7/5/16.
 */
public class Waiter extends Thread{
    private Cup cup;

    public Waiter(Cup cup) {
        this.cup = cup;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public void run(){
        for (int i =0; i<10; i++)
            cup.pour();
    }
}
