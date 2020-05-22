package cn.tedu.group;

/**
 * @Author lkh
 */
public class ThreadConstruction2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("please enter the stack size");
            System.exit(1);
        }
        ThreadGroup group=new ThreadGroup("testgroup");
        Runnable runnable=new Runnable() {
            final int MAX=Integer.MAX_VALUE;
            public void run() {
                int i=0;
                recurse(i);
            }
            private void recurse(int i){
                System.out.println(i);
                if (i < MAX) {
                    recurse(i);
                }
            }
        };
        Thread thread=new Thread(group,runnable,"Test",Integer.parseInt(args[0]));
        thread.start();
    }

}
