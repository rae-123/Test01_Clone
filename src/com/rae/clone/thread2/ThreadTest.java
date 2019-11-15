package com.rae.clone.thread2;

import com.sun.media.sound.SoftTuning;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
//设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
public class ThreadTest {
    private int i=1;
    //加
    public void add(){
        i++;
        System.out.println(Thread.currentThread().getName()+"加1.........................");
    }
    //减
    public void dec(){
        i--;
        System.out.println(Thread.currentThread().getName()+"减1.。。。。。。。。。。。。。。。");
    }
    //加线程
    class Add implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                add();
            }
        }
    }
    //减线程
    class Dec implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                dec();
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        //通过外部类创建内部类
        Add add=threadTest.new Add();
        Dec dec=threadTest.new Dec();
        //启动四个线程
        for(int i=0;i<2;i++){
            Thread thread1=new Thread(add);
            thread1.start();
            Thread thread2=new Thread(dec);
            thread2.start();
        }
    }
}
