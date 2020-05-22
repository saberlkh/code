package cn.tedu.chapter03;

import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("Oh, i am be interrupt");
                }
            }
        });
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();
    }

}
