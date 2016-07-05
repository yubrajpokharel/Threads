package com.yubraj.Wait;

/**
 * Created by yubraj on 7/5/16.
 */
public class Cup {

    private int content;
    private boolean available = false;


    synchronized public int get(){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        available = false;
        notifyAll();
        return content;
    }

    synchronized public void put(int num){
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        available = true;
        content = num;
        notifyAll();

    }


}
