package com.rae.clone.comparable;

import java.util.Comparator;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class ComparatorDemo implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1==null||o2==null){
            return 0;
        }
        int i=o1.getAge();
        int	j=o2.getAge();
         if(i<j){
            return -1;
        }else if(i>j){
            return 1;
        }else{
            return 0;
        }
    }
}
