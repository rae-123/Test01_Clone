package com.rae.clone.thread;

import java.util.concurrent.Callable;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class MyCallable<String> implements Callable<String> {
    private static int ticket=10;

    @Override
    public String call() throws Exception {
        String result;
        while (ticket>0){
            System.out.println("票还剩余============"+ticket+"========="+Thread.currentThread().getName());
            ticket--;
        }
        result= (String) "票卖光啦！！！！";
        return result;
    }
}
