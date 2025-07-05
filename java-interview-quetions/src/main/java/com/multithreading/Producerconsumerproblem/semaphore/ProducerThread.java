package com.multithreading.Producerconsumerproblem.semaphore;

public class ProducerThread implements Runnable {

    private ProducerConsumerMessaging queue;
    private int message;
    public ProducerThread(ProducerConsumerMessaging queue, int message){
        this.queue = queue;
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println("Producing message " + message);
        try {
            this.queue.produce(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
