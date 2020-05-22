package cn.tedu.chapter03;

import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class ThreadInterrupt2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(){
            public void run() {
                while (true) {
                    System.out.println(Thread.interrupted());
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();
    }

}
