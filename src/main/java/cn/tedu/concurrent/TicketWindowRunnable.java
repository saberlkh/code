package cn.tedu.concurrent;

/**
 * @Author lkh
 */
public class TicketWindowRunnable implements Runnable{
    private int index=1;
    private static final int MAX=50;
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread()+"的号码是:"+(index++));
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        final TicketWindowRunnable task=new TicketWindowRunnable();
        Thread window1=new Thread(task,"1号窗口");
        Thread window2=new Thread(task,"2号窗口");
        Thread window3=new Thread(task,"3号窗口");
        Thread window4=new Thread(task,"4号窗口");
        window1.start();
        window2.start();
        window3.start();
        window4.start();
    }
}
