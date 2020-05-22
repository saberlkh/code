package cn.tedu.chapter03;

/**
 * @Author lkh
 */
public class ThreadProproty3 {
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println("t1:"+t1.getPriority());
        Thread t2=new Thread(new Runnable() {
            public void run() {
                Thread t3=new Thread();
                System.out.println("t3:"+t3.getPriority());
            }
        });
        t2.setPriority(6);
        t2.start();
        System.out.println("t2:"+t2.getPriority());
        System.out.println(t2.getId());
    }

}
