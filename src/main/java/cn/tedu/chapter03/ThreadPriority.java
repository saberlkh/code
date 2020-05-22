package cn.tedu.chapter03;

/**
 * @Author lkh
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("t1");
                }
            }
        });
        t1.setPriority(3);
        Thread t2=new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("t2");
                }
            }
        });
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

}
