package com.yubraj.example3;

/**
 * Created by yubraj on 7/5/16.
 */
public class App {
    public static void main(String[] args) {
        Cup cup = new Cup(0);
        Customer yubraj = new Customer(cup);
        Waiter ram = new Waiter(cup);

        yubraj.start();
        ram.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nCoffee : "+ cup.getCoffee());

    }
}
