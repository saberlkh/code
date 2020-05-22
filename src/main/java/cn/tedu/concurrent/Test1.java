package cn.tedu.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        thread.start();
    }

}
