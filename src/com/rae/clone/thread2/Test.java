package com.rae.clone.thread2;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
//子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，接着再回到主线程又循环100，如此循环50次，请写出程序。
public class Test {
    public static void main(String[] args) {
        final MyThread thread=new MyThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<50;i++){
                    thread.sonThread();
                }
            }
        }).start();
        for(int i=0;i<100;i++){
            thread.mainThread();
        }
    }
    //线程类
    static class MyThread{
        //子线程是否调用
        boolean flag=true;
        //子线程
        public synchronized void sonThread(){
            if(!flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int j=1;j<=10;j++){
                System.out.println(Thread.currentThread().getName()+"======"+j);
            }
            flag=false;//运行完毕
            this.notify(); //唤醒主线程
        }
        //主线程
        public synchronized void mainThread(){
            if(flag){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int j=1;j<=100;j++){
                System.out.println(Thread.currentThread().getName()+"***********"+j);
            }
            flag=true; //主线程执行完毕
            this.notify(); //唤醒子线程
        }
    }
}
