package cn.tedu.chapter03;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(){
            public void run() {
                while (true) {
                    //do nothing
                    try {
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.printf("I am be interrupted ? %s\n",isInterrupted());
                    }
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("Thread is interrupt ? %s\n",thread.isInterrupted());
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("Thread is interrupt ? %s\n",thread.isInterrupted());
    }

}
