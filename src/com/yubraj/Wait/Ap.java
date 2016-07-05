package com.yubraj.Wait;

/**
 * Created by yubraj on 7/5/16.
 */
public class Ap {

    public static void main(String[] args) {
        Cup cup = new Cup();
        Producer producer = new Producer(cup, 1);
        Consumer consumer = new Consumer(cup, 1);
        //Consumer consumer2 = new Consumer(cup, 2);
        consumer.start();
        //consumer2.start();
        producer.start();
    }
}
