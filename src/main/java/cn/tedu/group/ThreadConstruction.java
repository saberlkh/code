package cn.tedu.group;

/**
 * @Author lkh
 */
public class ThreadConstruction {
    public static void main(String[] args) {
        Thread t1=new Thread("t1");
        ThreadGroup group=new ThreadGroup("threadgroup");
        Thread t2=new Thread(group,"t2");
        ThreadGroup group2=Thread.currentThread().getThreadGroup();
        System.out.println("main thread belong "+group2.getName());
        System.out.println("t1 and main belong "+(group2==t1.getThreadGroup()));
        System.out.println("t2 and group not belong main "+(group2==t2.getThreadGroup()));
        System.out.println("t2 thread group brlong "+(group==t2.getThreadGroup()));
    }

}
