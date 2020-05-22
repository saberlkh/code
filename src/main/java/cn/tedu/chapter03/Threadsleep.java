package cn.tedu.chapter03;

/**
 * @Author lkh
 */
public class Threadsleep {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                long startTime=System.currentTimeMillis();
                sleep(2_000L);
                long endtime=System.currentTimeMillis();
                System.out.println(String.format("Total spend %d ms",(endtime-startTime)));
            }
        }).start();
        long startTime=System.currentTimeMillis();
        sleep(3_000L);
        long endtime=System.currentTimeMillis();
        System.out.println(String.format("Main thread total spend %d ms",(endtime-startTime)));
    }
    private static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
