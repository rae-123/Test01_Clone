package com.rae.clone.lock;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class ThreadC  extends Thread {
    private LockBean lockBean;
    public ThreadC(LockBean lockBean){
        this.lockBean=lockBean;
    }

    @Override
    public void run() {
        while (true){
            try {
                lockBean.lock.lock();
                if(!lockBean.flag.equals("C")){
                lockBean.c.await();
                }
                System.out.println("C.......................");
                lockBean.flag="A";
                lockBean.a.signal();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lockBean.lock.unlock();
        }
    }
}
