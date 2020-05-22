package cn.tedu.chapter03;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author lkh
 */
public class Threadjoin {
    public static void main(String[] args) throws InterruptedException {
        //定义两个线程，保存在threads中
        List<Thread> threads= IntStream.range(1,3).mapToObj(Threadjoin::create).collect(Collectors.toList());
        //启动这两个线程
        threads.forEach(Thread::start);
        //执行这两个线程的join方法
        for (Thread thread:threads){
            thread.join();
        }
        //main线程输出
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"#"+i);
            shortsleep();
        }
    }
    //构造一个简单的线程，每个线程只是简单的循环输出
    private static Thread create(int seq){
        return new Thread(new Runnable() {
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"#"+i);
                    shortsleep();
                }
            }
        },String.valueOf(seq));
    }
    private static void shortsleep(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
