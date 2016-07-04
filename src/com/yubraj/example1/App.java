package com.yubraj.example1;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * Created by yubraj on 7/4/16.
 */
public class App {


    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        // Output will be
        //        Number is :0
        //        Number is :1
        //        Number is :2
        //        Number is :3
        //        Number is :4
        //        Number is :5
        //        Number is :6
        //        Number is :7
        //        Number is :8
        //        Number is :9

        // it will run the run the method of thread class but how to know that this is a thread to ensure this let
        // us create another instance of the ThreadClass and then lets run it

        ThreadClass threadClass1 = new ThreadClass();
        threadClass1.start();

        // now the output will be
        //        Number is :0
        //        Number is :0
        //        Number is :1
        //        Number is :1
        //        Number is :2
        //        Number is :3
        //        Number is :4
        //        Number is :5
        //        Number is :6
        //        Number is :7
        //        Number is :8
        //        Number is :9
        //        Number is :2
        //        Number is :3
        //        Number is :4
        //        Number is :5
        //        Number is :6
        //        Number is :7
        //        Number is :8
        //        Number is :9

        // Why this is happening because the threads are running concurrently
        // how to know that which threads are running which tasks for that lets add
        //Thread.currentThread().gerId() in out sysout

        // Now the output will be
        //        Thread ID: 10 Number is :0
        //        Thread ID: 10 Number is :1
        //        Thread ID: 10 Number is :2
        //        Thread ID: 10 Number is :3
        //        Thread ID: 10 Number is :4
        //        Thread ID: 10 Number is :5
        //        Thread ID: 10 Number is :6
        //        Thread ID: 10 Number is :7
        //        Thread ID: 10 Number is :8
        //        Thread ID: 10 Number is :9
        //        Thread ID: 11 Number is :0
        //        Thread ID: 11 Number is :1
        //        Thread ID: 11 Number is :2
        //        Thread ID: 11 Number is :3
        //        Thread ID: 11 Number is :4
        //        Thread ID: 11 Number is :5
        //        Thread ID: 11 Number is :6
        //        Thread ID: 11 Number is :7
        //        Thread ID: 11 Number is :8
        //        Thread ID: 11 Number is :9



    }

}
