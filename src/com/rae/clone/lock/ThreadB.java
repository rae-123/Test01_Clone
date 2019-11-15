package com.rae.clone.lock;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class ThreadB  extends Thread{
    private LockBean lockBean;
    public ThreadB(LockBean lockBean){
        this.lockBean=lockBean;
    }

    @Override
    public void run() {
        while (true){
            try {
                lockBean.lock.lock();
                if(!lockBean.flag.equals("B")){
                lockBean.b.await();
                }
                System.out.println("B...................");
                lockBean.flag="C";
                lockBean.c.signal();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lockBean.lock.unlock();
        }
    }
}
