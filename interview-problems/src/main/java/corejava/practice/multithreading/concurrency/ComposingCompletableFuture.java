package corejava.practice.multithreading.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComposingCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> futurer1 = CompletableFuture.supplyAsync(() -> "hello Dear");

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World is the best");

        CompletableFuture<String> composeFuture = futurer1.thenCombine(future2,(m1,m2) -> m1 + " " + m2);
        System.out.println("Message from composeFuture1 " + composeFuture.get());
        CompletableFuture<Void> composeFuture1 = CompletableFuture.allOf(futurer1,future2);
        String messageFromAllOf = Stream.of(futurer1,future2).map(CompletableFuture::join).collect(Collectors.joining( " "));
        System.out.println("messageFromAllOf from -  " + messageFromAllOf);




    }
}
