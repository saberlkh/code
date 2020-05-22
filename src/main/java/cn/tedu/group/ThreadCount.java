package cn.tedu.group;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author lkh
 */
public class ThreadCount extends Thread {
    final static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        try {
            while (true) {
                new ThreadCount().start();
            }
        } catch (Throwable e) {
            System.out.println("failed at " + counter.get());
        }
    }

    public void run() {
        try {
            System.out.println("the counter" + counter.getAndIncrement() + "thread created");
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
