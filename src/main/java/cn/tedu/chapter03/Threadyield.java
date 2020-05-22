package cn.tedu.chapter03;

import java.util.stream.IntStream;

/**
 * @Author lkh
 */
public class Threadyield {
    public static void main(String[] args) {
        IntStream.range(0,2).mapToObj(Threadyield::create).forEach(Thread::start);
    }
    private static Thread create(int index){
        return new Thread(new Runnable() {
            public void run() {
                if (index == 0) {
                    Thread.yield();
                }
                System.out.println(index);
            }
        });
    }

}
