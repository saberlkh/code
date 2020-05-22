package cn.tedu.chapter03;

/**
 * @Author lkh
 */
public class ThreadProproty2 {
    public static void main(String[] args) {
        //定义一个线程组
        ThreadGroup group=new ThreadGroup("test");
        //将线程组的优先级设置为7
        group.setMaxPriority(7);
        //定义一个线程 将线程组加入到group中
        Thread thread=new Thread(group,"test-thread");
        //将线程的优先级设定为10
        thread.setPriority(10);
        System.out.println(thread.getPriority());
    }

}
