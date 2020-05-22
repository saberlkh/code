package cn.tedu.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lkh
 */
public class ListTest {
    public void foo (List<Integer> list) {
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(16);
        ListTest test=new ListTest();
        test.foo(list);
    }

}
