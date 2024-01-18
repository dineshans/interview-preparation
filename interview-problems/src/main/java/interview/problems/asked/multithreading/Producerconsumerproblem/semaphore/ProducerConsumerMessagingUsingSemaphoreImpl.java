package interview.problems.asked.multithreading.Producerconsumerproblem.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ProducerConsumerMessagingUsingSemaphoreImpl implements ProducerConsumerMessaging {

    public List<Integer> list;

    private Semaphore producerSemaphore = new Semaphore(1);
    private Semaphore consumerSemaphore = new Semaphore(0);

    public ProducerConsumerMessagingUsingSemaphoreImpl(){
        this.list = new ArrayList<>();
    }
    @Override
    public void produce(int message) throws InterruptedException {

        System.out.println("Number Of Permits to producer - " + producerSemaphore.availablePermits());
        System.out.println("Producer Thread is waiting to Acquire the lock to produce message!");
        producerSemaphore.acquire();
        System.out.println("Accurired lock of producer");
        list.add(message);

        Thread.sleep(100);
        System.out.println("Release the lock of Consumer");
        consumerSemaphore.release();
    }

    @Override
    public int consume() throws InterruptedException {

        System.out.println("Number Of Permits to producer - " + consumerSemaphore.availablePermits());
        System.out.println("Consumer Thread is waiting to Acquire the lock to produce message!");

        consumerSemaphore.acquire();
        System.out.println("Consumer Thread Acquired the lock!");

        int message = list.remove(0);
        Thread.sleep(100);
        System.out.println("Release the lock of Producer");
        producerSemaphore.release();

        return message;
    }
}
