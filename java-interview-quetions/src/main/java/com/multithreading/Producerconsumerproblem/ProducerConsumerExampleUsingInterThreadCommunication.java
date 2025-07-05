package com.multithreading.Producerconsumerproblem;

import java.util.LinkedList;

public class ProducerConsumerExampleUsingInterThreadCommunication {

    public static void main(String[] args) {
        final ProducerConsumer1 producerConsumer = new ProducerConsumer1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run " + Thread.currentThread().getName() );
             try {
                producerConsumer.producer();
            } catch(Exception exception){
                exception.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run " + Thread.currentThread().getName() );
                try {
                    producerConsumer.consumer();
                } catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run " + Thread.currentThread().getName() );
                try {
                    producerConsumer.producer();
                } catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run " + Thread.currentThread().getName() );
                try {
                    producerConsumer.consumer();
                } catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
     }
    static class ProducerConsumer1 {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        public void producer() throws InterruptedException {
            int value = 0;
            while(true){
                synchronized (this) {
                    while(list.size() == capacity)
                        wait();
                    System.out.println("Value added - " + value + " By Thread - " + Thread.currentThread().getName());
                    list.add(value++);
                    notifyAll();
                    Thread.sleep(1000);
                }
            }
        }
        public void consumer() throws InterruptedException {
            while(true){
                synchronized (this) {
                    while (list.size() == 0) {
                        wait();
                    }
                    int value1 = list.removeLast();
                    System.out.println("removed Value1 is - " + value1 + " By Thread - " + Thread.currentThread().getName());
                    notifyAll();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
