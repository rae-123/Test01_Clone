package com.rae.clone.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        User u1=new User("jack",10);
        User u2=new User("rae",18);
        User u3=new User("tom",16);
        User u4=new User("tom",16);
        System.out.println(u3.compareTo(u4)==0);
        List<User> users=new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        //排序之前
        users.forEach((user -> System.out.println(user)));
        Collections.sort(users);
        //排序之后
        users.forEach((user -> System.out.println(user)));
        //comparator排序
        ComparatorDemo comparator=new ComparatorDemo();
        int i=comparator.compare(u1,u2);
        System.out.println(i); //-1
    }
}
