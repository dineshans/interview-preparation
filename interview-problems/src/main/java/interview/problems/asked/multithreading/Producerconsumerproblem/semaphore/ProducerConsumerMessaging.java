package interview.problems.asked.multithreading.Producerconsumerproblem.semaphore;

public interface ProducerConsumerMessaging {

    void produce(int message) throws InterruptedException;
    int consume() throws InterruptedException;
}
