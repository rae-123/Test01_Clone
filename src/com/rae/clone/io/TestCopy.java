package com.rae.clone.io;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/14
 * @since 1.0.0
 */
//编写一个程序，将d:\java目录下的所有.java文件复制到d:\jad目录下，并将原来文件的扩展名从.java改为.jad。
public class TestCopy {
    public static void main(String[] args) throws Exception {
        /*File file=new File("D:\\\\java");
        //判断目录是否存在
        if(!(file.exists()&&file.isDirectory())){
            throw new Exception("该目录不存在");
        }
        // 找到文件夹下面的 .java 文件*/
        String content = "这是啥2321zhe又是撒";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < content.length(); i++){
            char c = content.charAt(i);
            Integer num = (Integer) map.get(c);
            if (num == null)
                num = 1; //不存在，则为1
            else
                num = num + 1;
            map.put(c, num); //存在，则加1
        }
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
