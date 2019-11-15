package com.rae.clone.lock;

import java.util.concurrent.locks.Condition;
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
public class LockBean {
    public String flag="A";
    public Lock lock=new ReentrantLock();
    public Condition a=lock.newCondition();
    public Condition b=lock.newCondition();
    public Condition c=lock.newCondition();
}
