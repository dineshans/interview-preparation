package corejava.practice.multithreading.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
*  This will create a new completatble future object and return
* */

public class CompletableFutureImpl {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture future = CompletableFuture.supplyAsync(() -> {

            return "hello From Completable Future";
        });

        System.out.println(future.get());

    }
}
