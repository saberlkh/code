package cn.tedu.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Author lkh
 */
public class Flyingquerytask extends Thread implements Flyingquery{
    private final String origin;
    private final String destination;
    private final List<String> flinglist=new ArrayList<>();
    public Flyingquerytask(String airplane,String origin, String destination) {
        super("["+airplane+"]");
        this.origin = origin;
        this.destination = destination;
    }
    public void run() {
        System.out.printf("%s-query from %s to %s \n",getName(),origin,destination);
        int randomval= ThreadLocalRandom.current().nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(randomval);
            this.flinglist.add(getName()+"-"+randomval);
            System.out.printf("the fight :%s list query successful\n",getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public List<String> get() {
        return this.flinglist;
    }
}
