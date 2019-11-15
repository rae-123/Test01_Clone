package com.rae.clone.io;

import java.io.*;
import java.nio.Buffer;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author 11718
 * @create 2019/11/7
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //项目根路径
       String path=System.getProperty("user.dir")+"\\src";
       System.out.println(path);
       //新建文件
        File file=new File(path+"\\test.txt");
        //file.createNewFile();
        //字节输出流
        //第二个参数为true时，不覆盖之前的数据，false则反之
       /* FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        for(int i=0;i<3;i++){
            fileOutputStream.write("Hello World!!!".getBytes());
        }
        fileOutputStream.close();*/
      //字节输入流，读
        /*FileInputStream fileInputStream=new FileInputStream(file);
        byte[] bytes=new byte[1024];
        int length;
        StringBuilder sb=new StringBuilder();
        while ((length=fileInputStream.read(bytes))!=-1){
            String str=new String(bytes);
            sb.append(str);
        }
        System.out.println(sb.toString().trim());
        fileInputStream.close();*/
        //字节流复制文件
      /*  InputStream inputStream=new FileInputStream("test.txt");
        OutputStream outputStream=new FileOutputStream("copy.txt");
        byte[] bytes=new byte[1024];
        int length=-1;
        while((length=inputStream.read(bytes))!=-1){
            //将bs数组写入文件中，下标从0开始，写入长度temp
            outputStream.write(bytes,0,length);
        }
        outputStream.close();
        inputStream.close();*/
    }


}
