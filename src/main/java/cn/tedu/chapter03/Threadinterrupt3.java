package cn.tedu.chapter03;

import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class Threadinterrupt3 {
    public static void main(String[] args) {
        //判断线程是否被中断
        System.out.println("main thread is interrupt?"+Thread.interrupted());
        //中断当前线程
        Thread.currentThread().interrupt();
        //判断当前线程是否被中断
        System.out.println("main thread is interrupt?"+Thread.currentThread().isInterrupted());
        try {
            //当前线程执行可中断方法
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            //捕获中断信号
            System.out.println("I will be interrupted still");
        }
    }

}
