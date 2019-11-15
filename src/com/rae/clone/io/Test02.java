package com.rae.clone.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/13
 * @since 1.0.0
 */
//编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔。
public class Test02 {
    public  void connectWords(File file1, File file2, File file3)throws IOException
    {
        String[] str1 = split(file1, "\n");
        String[] str2 = split(file2, "\n"+"|"+" ");
        try(FileWriter fw = new FileWriter(file3))
        {
            int index = 0;
            while(index != str1.length||index != str2.length)
            {
                if(index < str1.length)
                    fw.write(str1[index]);
                if(index < str2.length)
                    fw.write(str2[index]);
                index ++;
            }
        }
    }

    public String[] split(File f, String regex)throws IOException
    {
        try(FileReader fr = new FileReader(f))
        {
            char[] cbuf = new char[(int)f.length()];
            int hasRead = fr.read(cbuf);
            String str = new String(cbuf, 0, hasRead);
            String[] strArr = str.split(regex);
            return strArr;
        }
    }
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("./a.txt");
        File f2 = new File("./b.txt");
        File f3 = new File("./c.txt");
        Test02 t = new Test02();
        t.connectWords(f1, f2, f3);
    }
}
