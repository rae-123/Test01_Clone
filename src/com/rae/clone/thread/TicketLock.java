package com.rae.clone.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class TicketLock implements Runnable {
    private static int ticket=20;
    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+"张票。。。。。");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        }
    }
}
