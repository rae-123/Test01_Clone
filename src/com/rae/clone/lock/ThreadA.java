package com.rae.clone.lock;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class ThreadA extends Thread{
    private LockBean lockBean;
    public ThreadA(LockBean lockBean){
        this.lockBean=lockBean;
    }

    @Override
    public void run() {
        while (true){
            try {
                lockBean.lock.lock();
                if(!lockBean.flag.equals("A")){
                    //等待
                    lockBean.a.await();
                }
                System.out.println("A....................");
                lockBean.flag="B";
                //唤醒b
                lockBean.b.signal();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
            lockBean.lock.unlock();
        }
    }

}

