package com.yubraj.example3;

import com.yubraj.example1.ThreadClass;

/**
 * Created by yubraj on 7/5/16.
 */
public class Cup {

    private int coffee;

    public Cup(int coffee) {
        this.coffee = coffee;
    }

    public synchronized void drink(){
        int localCoffee = coffee;
        localCoffee--;
        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(" Drink ");
        coffee = localCoffee;
    }

    public synchronized void pour(){
        int localCoffee = coffee;
        localCoffee++;
        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(" Pour ");
        coffee = localCoffee;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
}
