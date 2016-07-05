package com.yubraj.example2;


/**
 * Created by yubraj on 7/5/16.
 */
public class FortuneTeller extends Thread {

    @Override
    public void run() {
        while (true){
            System.out.println("I am your fortune");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
