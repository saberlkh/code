package cn.tedu.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class Tryconcurrent {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(Tryconcurrent::news);
        thread.start();
        music();
    }
    private static void news(){
        for (; ; ){
            System.out.println("good new");
            sleep(1);
        }
    }
    private static void music(){
        for (; ; ){
            System.out.println("good music");
            sleep(1);
        }
    }
    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}