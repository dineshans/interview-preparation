package interview.problems.asked.multithreading;

public class EvenOddPrintUsing2Threads implements Runnable {
    static int count = 1;

    final Object object;

    public EvenOddPrintUsing2Threads(Object obj) {

        this.object = obj;

    }

    @Override
    public void run() {

        while(count <= 10){

            if(count % 2 == 0 && Thread.currentThread().getName().equals("even")){

                synchronized (object) {

                    System.out.println("Printed By " + Thread.currentThread().getName() + "Value : " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            if(count % 2 != 0 && Thread.currentThread().getName().equals("odd")){

                synchronized (object) {
                    System.out.println("Printed By " + Thread.currentThread().getName() + "Value : " + count);
                    count++;
                    object.notify();
                }
            }

        }
}

    public static void main(String[] args) {

        Object lock = new Object();

        Runnable r1 = new EvenOddPrintUsing2Threads(lock);
        Runnable r2 = new EvenOddPrintUsing2Threads(lock);

        Thread t1 = new Thread(r1,"even");
        Thread t2 = new Thread(r2, "odd");

        t1.start();
        t2.start();


    }
}
