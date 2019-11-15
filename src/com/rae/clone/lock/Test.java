package com.rae.clone.lock;

import com.rae.clone.Main;

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
        LockBean lockBean=new LockBean();
        ThreadA threadA=new ThreadA(lockBean);
        ThreadB threadB=new ThreadB(lockBean);
        ThreadC threadC=new ThreadC(lockBean);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
