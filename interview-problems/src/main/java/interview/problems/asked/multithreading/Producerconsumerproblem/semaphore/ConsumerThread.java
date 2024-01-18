package interview.problems.asked.multithreading.Producerconsumerproblem.semaphore;

public class ConsumerThread implements Runnable {

    private ProducerConsumerMessaging queue;
    private int message;

    public ConsumerThread(ProducerConsumerMessaging queue, int message){
        this.queue = queue;
        this.message = message;
    }

    @Override
    public void run() {

        try {
            int message = this.queue.consume();
            System.out.println("Consume message " + message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
