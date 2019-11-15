package com.rae.clone;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

    Map map=new HashMap();


       /* Test thread=new Test();
        new Thread(thread).start();
        new Thread(thread).start();*/
       //线程池
       /* ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.submit(new Test());
        executor.submit(new Test());
        executor.submit(new Test());
        executor.submit(new Test());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1111111);
            }
        });
        //销毁，不建议使用
        executor.shutdown();
*/
    }
       /* //冒泡排序
        int[] arr={1,4,2,9,5,0};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp=0;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //选择排序
        int[] arr2={3,6,1,9,0,};
        for(int i=0;i<arr2.length-1;i++){
            for(int j=i+1;j<arr2.length;j++){
                int temp=0;
                if(arr2[i]<arr2[j]){
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));

        //快速排序
        int[] arr3={1,5,3,7,0,2,8,9,4};
        System.out.println(quickSort(arr3,0,arr3.length-1));

    }
    private static String quickSort(int[] arr,int low,int high){
        if(low>high){
          return Arrays.toString(arr);
        }
        int i=low;
        int j=high;
        int temp=arr[i];
        int t=0;
        while (i<j){
            while (arr[j]>=temp && i<j){
                j--; //先看右边，依次往左递减，直到找到小于基准数的数字
            }
            while (arr[i]<=temp && i<j){
                i++; //再看左边，依次往右递减，直到找到大于基准数的数字
            }
            if(i<j) { //交换两个数的位置
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        //最终将基准数归位
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
        return Arrays.toString(arr);
    }
*/
    /*private static String quickSort(int[] arr, int low, int high) {

        if(low > high) {
            return Arrays.toString(arr);
        }

        int tmp = arr[low];
        int i = low;
        int j = high;

        while(i < j) {
            //先看右边，依次往左递减，直到找到小于基准数的数字
            while(arr[j] >= tmp && i < j) {
                j--;
            }
            //比基准小的记录移到低端
            arr[i] = arr[j];

            //后看左边，依次往右递增，直到找到大于基准数的数字
            while(arr[i] <= tmp && i < j) {
                i++;
            }
            //比基准大的记录移到高端
            arr[j] = arr[i];
        }

        //记录基准
        arr[i] = tmp;

        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);

        return Arrays.toString(arr);
    }*/

}
