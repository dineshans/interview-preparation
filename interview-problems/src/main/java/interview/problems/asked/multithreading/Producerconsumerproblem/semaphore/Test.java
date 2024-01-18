package interview.problems.asked.multithreading.Producerconsumerproblem.semaphore;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        ExecutorService producerService = Executors.newFixedThreadPool(5);
        ExecutorService consumerService= Executors.newFixedThreadPool(5);

        ProducerConsumerMessaging messagingQueue = new ProducerConsumerMessagingUsingSemaphoreImpl();

        for (int i = 1; i <= 5; i++) {
            ProducerThread producerThread = new ProducerThread(messagingQueue,i);
            producerService.submit(producerThread);
        }

        for (int i = 1; i <= 5; i++) {
            ConsumerThread consumerThread = new ConsumerThread(messagingQueue,i);
            producerService.submit(consumerThread);
        }
    }
}
