package cn.tedu.daemon;

/**
 * @Author lkh
 */
public class DeamonThread {
    public static void main(String[] args) throws InterruptedException {
        //main线程开始
        Thread thread=new Thread(()->{
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //将thread设置为守护线程
        thread.setDaemon(true);
        thread.start(); //启动start线程
        Thread.sleep(2_000L);
        System.out.println("Main thread finished lifecycle");
    }

}
