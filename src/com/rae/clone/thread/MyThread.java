package com.rae.clone.thread;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/6
 * @since 1.0.0
 */
public class MyThread implements Runnable {
    private static int ticket=20;
    @Override
    public void run() {
        /*while (count>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyThread.class){
                System.out.println(count+"..........."+Thread.currentThread().getName());
                count--;
            }
        }*/
        while (true){
            payTicket();
        }
    }

    //同步方法
    public static synchronized void payTicket() {
        if(ticket>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=====卖出了第"+ticket+"张票。。。");
            ticket--;
        }
    }
}
