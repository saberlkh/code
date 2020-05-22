package cn.tedu.jdbc;

import java.util.stream.IntStream;

/**
 * @Author lkh
 */
public class ThreadName {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            },"ALEX-"+i).start();
        }
    }

}
