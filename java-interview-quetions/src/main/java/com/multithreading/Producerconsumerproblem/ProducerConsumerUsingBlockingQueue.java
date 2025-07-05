package com.multithreading.Producerconsumerproblem;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        Thread t1 = new Thread(new Producer(blockingQueue));
        Thread t2 = new Thread(new Consumer(blockingQueue));

        t1.start();
        t2.start();

    }
}

class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    public  Producer(BlockingQueue<Integer> queue){
       this.queue = queue;

    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
                System.out.println("Putting values in queue - " + i);
            try {
                queue.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                System.out.println("Consumer using value " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
