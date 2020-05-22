package cn.tedu.chapter03;

/**
 * @Author lkh
 */
public class CurrentThread {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            public void run() {
                System.out.println(Thread.currentThread()==this);
                System.out.println(Thread.currentThread());
            }
        };
        thread.start();
        String name=Thread.currentThread().getName();
        System.out.println("main".equals(name));
    }

}
