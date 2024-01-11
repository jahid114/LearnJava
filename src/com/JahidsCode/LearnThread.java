package com.JahidsCode;

class TheadExample1 implements Runnable{

    // This is the method that will be executed during thread running
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class TheadExample2 implements Runnable {

    // This is the method that will be executed during thread running
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Counter{
    int count;

    // 'synchronized' keyword is used to ensure this method is accessed by one thread at a time
    public synchronized void incrementCount(){
        count++;
    }
}

public class LearnThread {
    public static void main(String[] args) throws InterruptedException {
        // Basic Thead implementation
        /*TheadExample1 obj1 = new TheadExample1();

        TheadExample2 obj2 = new TheadExample2();

        Thread t1 = new Thread(obj1,"Thread 1");
        Thread t2 = new Thread(obj2,"Thread 2");

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();*/

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.incrementCount();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.incrementCount();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // 'join' method waits for the termination of the thread
        t1.join();
        t2.join();
        System.out.println("Value is : "+ c.count);
    }
}
