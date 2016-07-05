package com.yubraj.example2;

import java.util.Scanner;

/**
 * Created by yubraj on 7/5/16.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FortuneTeller fortuneTeller = new FortuneTeller();
        fortuneTeller.setDaemon(true);
        fortuneTeller.start();


        System.out.println("Enter the text");
        scanner.next();
        System.out.println("Input is taken!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I Slept for 2 Seconds");
    }
}
