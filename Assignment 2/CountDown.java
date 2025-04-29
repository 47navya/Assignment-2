import java.util.concurrent.*;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);
        ExecutorService executor = Executors.newFixedThreadPool(taskCount);

        for (int i = 1; i <= taskCount; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " completed task");
                latch.countDown();
            });
        }

        latch.await();
        System.out.println("All tasks finished. Proceeding further...");
        executor.shutdown();
    }
}

