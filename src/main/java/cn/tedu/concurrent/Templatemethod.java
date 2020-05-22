package cn.tedu.concurrent;

/**
 * @Author lkh
 */
public class Templatemethod {
    public final void print(String message){
        System.out.println("**********");
        wrapprint(message);
        System.out.println("**********");
    }
    protected void wrapprint(String message){
        
    }

    public static void main(String[] args) {
        Templatemethod templatemethod1=new Templatemethod(){
            protected void wrapprint(String message) {
                System.out.println(message);
            }
        };
        templatemethod1.print("Hello world");
        Templatemethod templatemethod2=new Templatemethod(){
            protected void wrapprint(String message) {
                System.out.println(message);
            }
        };
        templatemethod2.print("Hello world");
    }

}
