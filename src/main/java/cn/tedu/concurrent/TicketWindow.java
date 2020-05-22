package cn.tedu.concurrent;

/**
 * @Author lkh
 */
public class TicketWindow extends Thread{
    //柜台名称
    private final String name;
    //最多受理50笔业务
    private static final int MAX=50;
    private static int index=1;
    public TicketWindow(String name){
        this.name=name;
    }
    public void run() {
        while (index <= MAX) {
            System.out.println("柜台:"+name+"当前的号码是："+(index++));
        }
    }
    public static void main(String[] args) {
        TicketWindow window1=new TicketWindow("1号出号机");
        window1.start();
        TicketWindow window2=new TicketWindow("2号出号机");
        window2.start();
        TicketWindow window3=new TicketWindow("3号出号机");
        window3.start();
        TicketWindow window4=new TicketWindow("4号出号机");
        window4.start();
    }
}
