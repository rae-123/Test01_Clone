package com.rae.clone;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/5
 * @since 1.0.0
 */
public class AnimalImpl implements Animal{
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    public void shut(){
        System.out.println("汪汪。。。");
    }
}
