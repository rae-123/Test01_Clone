package com.rae.clone.thread;

import jdk.nashorn.internal.ir.FunctionCall;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TicketLock ticketLock=new TicketLock();
        new Thread(ticketLock).start();
        new Thread(ticketLock).start();
        new Thread(ticketLock).start();

    /*   Test myThread=new Test();
       new Thread(myThread).start();
       new Thread(myThread).start();
       new Thread(myThread).start();*/


       /* MyCallable<String> callable=new MyCallable<>();
        FutureTask<String> futureTask=new FutureTask<String>(callable);
        FutureTask<String> futureTask1=new FutureTask<String>(callable);
        FutureTask<String> futureTask2=new FutureTask<String>(callable);
        new Thread(futureTask).start();
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        String result=futureTask.get();
        System.out.println(result);*/
    }
}
